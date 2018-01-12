package br.com.gincanaid.app;

import java.io.IOException;

import br.com.gincanaid.connection.Connection;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Login extends Application {
	public static Stage palco;
	private Scene cena;
	private AnchorPane page;

	@Override
	public void start(final Stage stage) {
		try {
			palco = stage;
			page = FXMLLoader.load(Login.class.getResource("../view/login/login.fxml"));
			cena = new Scene(page);

			stage.initStyle(StageStyle.UNDECORATED);

			stage.setScene(cena);
			stage.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Connection();
		Application.launch(Login.class, (java.lang.String[]) null);

	}

}
