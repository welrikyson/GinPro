package br.com.gincanaid.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.text.Text;

public class DashBoardController implements Initializable{

    @FXML
    private Text lblEqAzulPontos;

    @FXML
    private TableView<?> tblEquipes;

    @FXML
    private Text lblEqVermelhaPontos;
    
    @FXML
    private TableColumn<?, String> tbColNome;

    @FXML
    private TableColumn<?, Integer> tbColPonto;
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
//		tbColNome.setCellValueFactory(new PropertyValueFactory<Equipe,String>("nome"));
//		tbColPonto.setCellValueFactory(new PropertyValueFactory<Equipe,Integer>("ponto"));
		
//		ObservableList<Equipe> equipesobs = FXCollections.observableArrayList(dao.findAll());
//		tblEquipes.setItems(equipesobs);
	}
	
}
