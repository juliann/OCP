/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.jfx;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 *
 * @author tlubowiecki
 */
public class FXMLMainScreenController implements Initializable {
    
    private List<Benutzer> benutzer = new ArrayList<>();
    
    @FXML
    private TextField txtVorname;
    
    @FXML
    private TextField txtNachname;
    
    @FXML
    private Button btnSpeichern;
    
    @FXML
    private TableView<Benutzer> tblBenutzer;
    
    @FXML
    private Label alert;
    
    @FXML
    private void speichernAction(ActionEvent event) {
        benutzer.add(new Benutzer(txtVorname.getText(), txtNachname.getText()));
        txtVorname.setText("");
        txtNachname.setText("");
        alert.setText("Benutzer wurde gespeichert.");
        updateTable();
    }

    private void updateTable() {
        ObservableList<Benutzer> list = FXCollections.observableList(benutzer);
        tblBenutzer.setItems(list);
        //tblBenutzer.refresh();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
