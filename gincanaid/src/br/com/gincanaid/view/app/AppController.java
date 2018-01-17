package br.com.gincanaid.view.app;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import br.com.gincanaid.app.App;
import br.com.gincanaid.app.Login;
import br.com.gincanaid.util.Resize;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AppController implements Initializable{
	@FXML
	private AnchorPane boxConteudo;

	@FXML
	void menuSair(ActionEvent event) {
		App.palco.close();
		new Login().start(new Stage());
	}

	@FXML
	void menuDashBoard(MouseEvent event) throws IOException {
		AnchorPane page = FXMLLoader.load(App.class.getResource("../views/DashBoard.fxml"));
		boxConteudo.getChildren().add(page);
		Resize.margin(page, 0);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		try {
			AnchorPane page;
			page = FXMLLoader.load(App.class.getResource("../views/DashBoard.fxml"));
			boxConteudo.getChildren().add(page);
			Resize.margin(page, 0);		
		} catch (IOException e) { 
			e.printStackTrace();
		}
	}
}
