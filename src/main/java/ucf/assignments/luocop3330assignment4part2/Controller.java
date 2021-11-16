/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Amos Luo
 */

package ucf.assignments.luocop3330assignment4part2;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.time.LocalDate;

public class Controller {
    @FXML
    private ListView<String> completedList;

    @FXML
    private CheckBox completedCheck;

    @FXML
    private DatePicker datePicker;

    @FXML
    private TextField descInput;

    @FXML
    private ListView<String> listOfItems;

    @FXML
    private TextField taskInput;

    @FXML
    void addItem(MouseEvent event) {
        String task;
        String description;
        String date;
        String result;
        String completed;
        task = taskInput.getText();
        description = descInput.getText();
        LocalDate taskDate = datePicker.getValue();
        date = taskDate.toString();

        result = String.join("    |    ", task, date, description);
        listOfItems.getItems().add(result);
    }

    @FXML
    void updateTask(MouseEvent event) {
        String task;
        String description;
        String date;
        String result;
        String completed;

        String selected = listOfItems.getSelectionModel().getSelectedItem();

        task = taskInput.getText();
        description = descInput.getText();
        LocalDate taskDate = datePicker.getValue();
        date = taskDate.toString();

        result = String.join("    |    ", task, date, description);
        listOfItems.getItems().add(result);
        listOfItems.getItems().remove(selected);
    }

    @FXML
    void completed(MouseEvent event) {
        String selected = listOfItems.getSelectionModel().getSelectedItem();
        listOfItems.getItems().remove(selected);
        completedList.getItems().add(selected);
    }

    @FXML
    void deleteAll(MouseEvent event) {
        listOfItems.getItems().clear();
        completedList.getItems().clear();
    }

    @FXML
    void deleteItem(MouseEvent event) {
        int ID = listOfItems.getSelectionModel().getSelectedIndex();
        listOfItems.getItems().remove(ID);
    }

}