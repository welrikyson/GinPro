package br.com.gincanaid.controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import br.com.gincanaid.dao.EquipeDAO;
import br.com.gincanaid.model.Equipe;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

public class DashBoardController implements Initializable{

    @FXML
    private Text lblEqAzulPontos;


    @FXML
    private Text lblEqVermelhaPontos;
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		EquipeDAO dao = new EquipeDAO();
		
		List<Equipe> equipes = dao.findAll();
		lblEqAzulPontos.setText(String.valueOf(equipes.get(0).getPonto()));
		lblEqVermelhaPontos.setText(String.valueOf(equipes.get(1).getPonto()));
		 
	}
	
}
