package br.com.gincanaid.controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import br.com.gincanaid.dao.EquipeDAO;
import br.com.gincanaid.model.Equipe;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class DashBoardController implements Initializable{

	
    @FXML
    private Label lblEq1;

    @FXML
    private Text lblEq1Pontos;

    @FXML
    private Label lblEq2;

    @FXML
    private Text lblEq2Pontos;
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		EquipeDAO dao = new EquipeDAO();
		
		List<Equipe> equipes = dao.findAll();
		 lblEq1.setText(equipes.get(1).getNome()); 
		 lblEq2.setText(equipes.get(2).getNome());
		 
	}
	
}
