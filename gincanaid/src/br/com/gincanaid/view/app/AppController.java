package br.com.gincanaid.view.app;

import java.io.IOException;

import br.com.gincanaid.app.App;
import br.com.gincanaid.app.Login;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AppController {
	@FXML
	private AnchorPane boxConteudo;

	@FXML
	void menuSair(ActionEvent event) {
		App.palco.close();
		new Login().start(new Stage());
	}

	@FXML
	void menuDashBoard(MouseEvent event) throws IOException {
		
	}
}
