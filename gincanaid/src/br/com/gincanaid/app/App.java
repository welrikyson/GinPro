package br.com.gincanaid.app;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class App extends Application {
	public static Stage palco;
	private static Scene cena;
	private static AnchorPane page;

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(final Stage primaryStage) {
		try {
			palco = primaryStage;
			page = FXMLLoader.load(App.class.getResource("../view/app/app.fxml"));
			cena = new Scene(page);
			primaryStage.initStyle(StageStyle.UNDECORATED);
			primaryStage.getIcons().addAll(new Image(Login.class.getResourceAsStream("../view/login/icone.png")));
			primaryStage.setScene(cena);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
