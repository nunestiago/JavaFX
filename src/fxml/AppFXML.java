package fxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Objects;

public class AppFXML extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		String arquivoCSS = Objects.requireNonNull(getClass().getResource("/fxml/Login.css")).toExternalForm();
		URL arquivoFXML = getClass().getResource("/fxml/Login.fxml");
		assert arquivoFXML != null;
		GridPane raiz = FXMLLoader.load(arquivoFXML);
		
		Scene cena = new Scene(raiz, 350, 350);
		cena.getStylesheets().add(arquivoCSS);
		
		primaryStage.setResizable(false);
		primaryStage.setTitle("Tela de Login");
		primaryStage.setScene(cena);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
