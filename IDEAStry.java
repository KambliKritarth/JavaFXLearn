package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.awt.Component;
import javax.swing.JOptionPane;

import java.io.*;

import javax.swing.plaf.ToolBarUI;

public class IDEAStry extends Application {
    private TextArea textArea;
    private TextArea textArea2;
    private File currentFile;
    private String storagePath = "D:/KritarthJavaInDepth/javafxCalci/EditorFiles";
	    
    private int noOfUntitleds = 0;

    @Override
    public void start(Stage primaryStage) {
        // Create TextArea for editing text
        textArea = new TextArea();
	textArea2 = new TextArea();

        // Create MenuBar
        MenuBar menuBar = createMenuBar();
        ToolBar toolBar = createToolBar();
        TabPane tabPane = createTabPane("Untitled.txt");
        // Create BorderPane layout
        BorderPane root = new BorderPane();
        GridPane gp = new GridPane();
        
        gp.add(menuBar, 0, 1);
        gp.add(toolBar, 0, 2);
        gp.add(tabPane, 0, 3);
        root.setTop(gp);
	//event handle selecting a tab to switch textAreas
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
      	Button tabBtn = new Button("Ctrl + T");
      	
    	ToolBar toolBar = new ToolBar();
	toolBar.getItems().addAll(newBtn, opnBtn);

	return toolBar;
    }
    private void createTabPane(String... args) {
	//Declaring tabpane
	TabPane tabPane = new TabPane();
	Tab newTab; 	      	
	//Declaring new tab
	if(args.length == 0)
		newTab = new Tab("*Untitled.txt");
	else
		newTab = new Tab(args[0]);
	
	tabPane.getTabs().add(newTab);
	System.out.println(tabPane);
	//return tabPane;
    }
    private TabPane createTabPane(String args) {
	//Declaring tabpane
	TabPane tabPane = new TabPane();
	Tab newTab; 	      	
	//Declaring new tab
	if(args.length() == 0)
		newTab = new Tab("*Untitled.txt");
	else
		newTab = new Tab(args);
	
	tabPane.getTabs().add(newTab);
	System.out.println(tabPane);
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
        MenuItem newItem = new MenuItem("New File");
	newItem.setOnAction(event -> newFile());
        MenuItem newTab = new MenuItem("New Tab");
	newTab.setOnAction(event -> createTabPane("Trial.txt"));
        fileMenu.getItems().addAll(openItem, saveItem, saveAsItem, newItem, newTab);

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
    //private void newFile(String args, Component parentComponent) {
    private void newFile(){
	    	//To create a new tab
		try{
			File newFile = new File(storagePath.concat(".txt"));			
			JOptionPane jop;
			if(newFile.createNewFile()){
				//jop = new JOptionPane("File is created!",INFORMATION_MESSAGE);
				System.out.println("File created!");
			}
			else{
				//jop = new JOptionPane("File already exists.",INFORMATION_MESSAGE);
				System.out.println("File already created!");
			}
			//jop.showMessageDialog();
		}
		catch(IOException e){
			System.out.println("File could not be created!");
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
