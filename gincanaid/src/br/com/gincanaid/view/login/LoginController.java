package br.com.gincanaid.view.login;

import java.net.URL;
import java.util.ResourceBundle;

import br.com.gincanaid.app.App;
import br.com.gincanaid.app.Login;
import br.com.gincanaid.dao.UsuarioDAO;
import br.com.gincanaid.model.Usuario;
import br.com.gincanaid.util.Campo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class LoginController implements Initializable {

	@FXML
	private TextField txtNome;

	@FXML
	private PasswordField psSenha;

	@FXML
	private Button btnAcessar;
	
	@FXML
	private Label lbErroLogin;

	@FXML
	void logar(ActionEvent event) {
		
		String login = txtNome.getText();
		String senha = psSenha.getText();
		
		Usuario usuario =new UsuarioDAO().pesquisaPorLogin(login);
		
		if(!usuario.equals(null)) {
				if(usuario.getSenha().equals(senha)) {
					//Verificar qual usuario esta logado
					new App().start(new Stage());
					Login.palco.close();
					System.out.println("Logado!");
				}else {
					lbErroLogin.setText("Senha incorreta, verifique os valores!");
					Campo.erroLogin(psSenha);
				}
			
		}else {
			lbErroLogin.setText("Usuario nao existe ou inativo!");
		}
	}

	@FXML
	void fechar(ActionEvent event) {
		Login.palco.close();
	}

	@FXML
	void minimizar(ActionEvent event) {
		Login.palco.setIconified(true);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		psSenha.setOnKeyPressed(k -> {
			if (k.getCode() == KeyCode.ENTER)
				logar(null);
		});

	}

}