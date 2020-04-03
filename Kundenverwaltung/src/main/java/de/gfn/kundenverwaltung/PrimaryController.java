package de.gfn.kundenverwaltung;

import java.io.IOException;
import java.util.List;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;

public class PrimaryController {

    @FXML
    private TextField txtFirstName;
    @FXML
    private TextField txtLastName;
    @FXML
    private TextField txtEmail;

    @FXML
    private TextArea txtOutput;

    private CustomerProvider provider = new CustomerProvider();

    @FXML
    private void save(ActionEvent e) {
        Customer c = new Customer(txtFirstName.getText(), txtLastName.getText(), txtEmail.getText());
        provider.add(c);
        updateOutput();
        clearField(txtFirstName,txtLastName, txtEmail);
        

    }

    public void updateOutput() {
        StringBuilder output = new StringBuilder();
        for (Customer c : provider.getAll()) {
            output.append(c).append("\n");

        }
        txtOutput.setText(output.toString());
    }

    private void clearField(TextInputControl... fields) {
        for (TextInputControl c : fields) {
            c.clear();
        }
    }
}
