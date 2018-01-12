package br.com.gincanaid.view.login;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import br.com.gincanaid.app.Login;
import br.com.gincanaid.dao.UsuarioDAO;
import br.com.gincanaid.model.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;

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
		
		UsuarioDAO dao = new UsuarioDAO();
		String login = txtNome.getText();
		String senha = psSenha.getText();
		List<Usuario> usuarios =dao.pesquisaPorLogin(login);
		
		if(!usuarios.isEmpty()) {
			for (Usuario usuario : usuarios) {
				if(usuario.getSenha().equals(senha)) {
					lbErroLogin.setText("logado!");
					break;
				}else {
					lbErroLogin.setText("Senha incorreta, verifique os valores!");
				}
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