package main;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
//	@Override
//	public void start(Stage primaryStage) {
//		try {
//			GridPane root = (GridPane)FXMLLoader.load(getClass().getResource("ErstelleWaffe.fxml"));
//			Scene scene = new Scene(root,1600,900);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			primaryStage.setScene(scene);
//			primaryStage.show();
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	@Override
//	public void start(Stage primaryStage) {
//		try {
//			GridPane root = (GridPane)FXMLLoader.load(getClass().getResource("ErstelleRuestung.fxml"));
//			Scene scene = new Scene(root,1600,900);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			primaryStage.setScene(scene);
//			primaryStage.show();
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane root = (GridPane)FXMLLoader.load(getClass().getResource("ErstelleVerbrauchsgegenstaende.fxml"));
			Scene scene = new Scene(root,1600,900);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
