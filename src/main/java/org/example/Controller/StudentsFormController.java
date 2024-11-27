package org.example.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class StudentsFormController {

    @FXML
    private TableColumn<?, ?> colId;

    @FXML
    private TableColumn<?, ?> colNIC;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colProfile;

    @FXML
    private TableColumn<?, ?> colProgram;

    @FXML
    private TableView<?> tblStudentTable;

    @FXML
    void btnStudentEditOnAction(ActionEvent event) {

    }

    @FXML
    void btnStudentRegisterOnAction(ActionEvent event) {

    }

    @FXML
    void btnStudentRemoveOnAction(ActionEvent event) {

    }

}

