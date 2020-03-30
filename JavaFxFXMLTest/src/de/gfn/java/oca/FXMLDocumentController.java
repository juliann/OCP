/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.java.oca;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Julian
 */
public class FXMLDocumentController implements Initializable {

   
    @FXML
    private TextField txtFeld;
    @FXML
    private Button btnSave;



    @FXML
    private void saveContent(ActionEvent event) {
     String s = txtFeld.getText();
     btnSave.setText(s);
     txtFeld.clear();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
