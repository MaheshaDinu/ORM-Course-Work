package org.example.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class PaymentFormController {

    @FXML
    private TableColumn<?, ?> colAmount;

    @FXML
    private TableColumn<?, ?> colDate;

    @FXML
    private TableColumn<?, ?> colId;

    @FXML
    private TableColumn<?, ?> colStudentName;

    @FXML
    private TableView<?> tblPayment;

    @FXML
    void btnAddPaymentOnAction(ActionEvent event) {

    }

    @FXML
    void btnPaymentRemoveOnAction(ActionEvent event) {

    }

}

