package br.com.gincanaid.controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import br.com.gincanaid.dao.EquipeDAO;
import br.com.gincanaid.model.Equipe;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

public class DashBoardController implements Initializable{

    @FXML
    private Text lblEqAzulPontos;

    @FXML
    private TableView<Equipe> tblEquipes;

    @FXML
    private Text lblEqVermelhaPontos;
    
    @FXML
    private TableColumn<Equipe, String> tbColNome;

    @FXML
    private TableColumn<Equipe, Integer> tbColPonto;
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		EquipeDAO dao = new EquipeDAO();
		List<Equipe> equipes = dao.findAll();
		lblEqAzulPontos.setText(String.valueOf(equipes.get(0).getPonto()));
		lblEqVermelhaPontos.setText(String.valueOf(equipes.get(1).getPonto()));
		
		
		tbColNome.setCellValueFactory(new PropertyValueFactory<Equipe,String>("nome"));
		tbColPonto.setCellValueFactory(new PropertyValueFactory<Equipe,Integer>("ponto"));
		
		ObservableList<Equipe> equipesobs = FXCollections.observableArrayList(dao.findAll());
		tblEquipes.setItems(equipesobs);
			
		 
	}
	
}
