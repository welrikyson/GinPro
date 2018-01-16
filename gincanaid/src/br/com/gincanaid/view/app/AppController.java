package br.com.gincanaid.view.app;

import br.com.gincanaid.app.App;
import br.com.gincanaid.app.Login;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class AppController {
	@FXML
	void menuSair(ActionEvent event) {
		App.palco.close();
		new Login().start(new Stage());
	}
}
