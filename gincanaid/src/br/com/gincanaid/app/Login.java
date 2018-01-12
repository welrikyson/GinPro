package br.com.gincanaid.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Login extends Application{
	public static Stage palco;
	private Scene cena;
	private AnchorPane page;
    
	public static void main(String[] args) {
		Application.launch(Login.class, (java.lang.String[]) null);

	}

	@Override
	public void start(final Stage palco) throws Exception {
		this.palco = palco;
		page = FXMLLoader.load(Login.class.getResource("../view/login/login.fxml"));
		cena = new Scene(page);
		
		
		palco.initStyle(StageStyle.UNDECORATED);
        palco.setScene(cena);
        palco.show();
	}

}
