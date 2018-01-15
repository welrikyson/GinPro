package br.com.gincanaid.util;

import javafx.scene.Node;
import javafx.scene.input.MouseEvent;

public class Campo {
	public static void erroLogin(Node no) {
        no.setStyle("-fx-border-color: #ff8b8b;");
        no.setOnMouseClicked((MouseEvent me) -> {
            no.setStyle("-fx-border-color: transparent transparent #e8e8e8 transparent;");
        });
    }
}
