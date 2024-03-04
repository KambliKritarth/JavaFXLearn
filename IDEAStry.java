package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

import java.io.*;

import javax.swing.plaf.ToolBarUI;

public class IDEAStry extends Application {
    private TextArea textArea;
    private File currentFile;

    @Override
    public void start(Stage primaryStage) {
        // Create TextArea for editing text
        textArea = new TextArea();

        // Create MenuBar
        MenuBar menuBar = createMenuBar();
        ToolBar toolBar = createToolBar();
        TabPane tabPane = createTabPane();
        // Create BorderPane layout
        BorderPane root = new BorderPane();
        GridPane gp = new GridPane();
        
        gp.add(menuBar, 0, 1);
        gp.add(toolBar, 0, 2);
        gp.add(tabPane, 0, 3);
        root.setTop(gp);
        root.setCenter(textArea);

        // Create Scene
        Scene scene = new Scene(root, 1600, 900);

        // Set Stage title and Scene
        primaryStage.setTitle("Text Editor");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private ToolBar createToolBar() {
	//Declaring buttons for a toolbar
	Button newBtn = new Button("Ctrl + N");
      	Button opnBtn = new Button("Ctrl + O");
      	
    	ToolBar toolBar = new ToolBar();
	toolBar.getItems().addAll(newBtn, opnBtn);

	return toolBar;
    }
    private Tab createNewTab(String fileName){
	return new Tab(fileName);
    }
    private TabPane createTabPane(String... args) {
	//Declaring tabpane
	TabPane tabPane = new TabPane();
	Tab newTab; 	      	
	//Declaring new tab
	if(args.length == 0)
		newTab = new Tab("*Untitled.txt");
	else
		newTab = new Tab(args[0]);
	
	tabPane.getTabs().add(newTab);

	return tabPane;
    }
    private MenuBar createMenuBar() {
        // Create File menu
        Menu fileMenu = new Menu("File");
        MenuItem openItem = new MenuItem("Open");
        openItem.setOnAction(event -> openFile());
        MenuItem saveItem = new MenuItem("Save");
        saveItem.setOnAction(event -> saveFile());
        MenuItem saveAsItem = new MenuItem("Save As...");
        saveItem.setOnAction(event -> saveFile());
        fileMenu.getItems().addAll(openItem, saveItem, saveAsItem);

        Menu editMenu = new Menu("Edit");
        MenuItem undoItem = new MenuItem("Undo");
        undoItem.setOnAction(event -> undoText());
        MenuItem redoItem = new MenuItem("Redo");
        redoItem.setOnAction(event -> redoText());
        editMenu.getItems().addAll(undoItem, redoItem);

        // Create MenuBar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu, editMenu);

        return menuBar;
    }
    private void openFile() {
      FileChooser fileChooser = new FileChooser();
      fileChooser.setTitle("Open Text File");
      File selectedFile = fileChooser.showOpenDialog(null);
      if (selectedFile != null) {
        currentFile = selectedFile;
        try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
          StringBuilder content = new StringBuilder();
          String line;
          while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");
          }
          textArea.setText(content.toString());
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
    private void newFile(String... args, Component parentComponent) {
	    	//To create a new tab
		try{
			File newFile = new File(args[0].concat(."txt"));
			JOptionPane jop;
			if(newFile.createNewFile())
				jop = new JOPtionPane("File is created!",INFORMATION_MESSAGE);
			else
				jop = new JOPtionPane("File already exists.",INFORMATION_MESSAGE);
			jop.showMessageDialog();
		}
		catch(IOException e){
			JOptionPane jop = new JOPtionPane("File cannot be created!",ERROR_MESSAGE);
		}
    }
    private void undoText() {
    }
    private void redoText() {
    }
    private void openDefaultEditor() {
    }
    private void saveFile() {
        if (currentFile != null) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(currentFile))) {
                writer.write(textArea.getText());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Save Text File");
            File selectedFile = fileChooser.showSaveDialog(null);
            if (selectedFile != null) {
                currentFile = selectedFile;
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(selectedFile))) {
                    writer.write(textArea.getText());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
