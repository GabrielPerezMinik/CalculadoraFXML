package calculadora;


import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	private static Scene scene;
	
//	@Override
	/*
	 * public void start(Stage primaryStage) throws Exception {
	 * 
	 * // CalculadoraController controlador = new CalculadoraController();
	 * 
	 * Scene scene = new Scene(controlador.getView(), 300, 250);
	 * 
	 * primaryStage.setScene(scene); primaryStage.setTitle("Calculadora.fxml");
	 * primaryStage.show();
	 * 
	 * }
	 */
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("Calculadora"), 300, 250);
        stage.setScene(scene);
        stage.show();
    }
	 static void setRoot(String fxml) throws IOException {
	        scene.setRoot(loadFXML(fxml));
	    }

	    private static Parent loadFXML(String fxml) throws IOException {
	        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
	        return fxmlLoader.load();
	    }
	
	public static void main(String[] args) {
		launch(args);

	}



}
