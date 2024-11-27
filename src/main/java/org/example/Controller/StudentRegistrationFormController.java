package org.example.Controller;

import com.jfoenix.controls.JFXComboBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class StudentRegistrationFormController {

    @FXML
    private JFXComboBox<?> cmbProgram;

    @FXML
    private Label lblContactNoErrorMsg;

    @FXML
    private Label lblDateErrorMsg;

    @FXML
    private Label lblNICErrorMsg;

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtContactNo;

    @FXML
    private TextField txtDOB;

    @FXML
    private TextField txtFirstName;

    @FXML
    private TextField txtInitialPayment;

    @FXML
    private TextField txtLastName;

    @FXML
    private TextField txtNIC;

    @FXML
    void btnRegisterOnAction(ActionEvent event) {

    }

    @FXML
    void cmbProgramOnAction(ActionEvent event) {

    }

    @FXML
    void txtContactNoKeyReleasedOnAction(KeyEvent event) {

    }

    @FXML
    void txtDOBReleasedOnAction(KeyEvent event) {

    }

    @FXML
    void txtInitialPaymentReleaseOnAction(KeyEvent event) {

    }

    @FXML
    void txtNICReleasedOnAction(KeyEvent event) {

    }

}

