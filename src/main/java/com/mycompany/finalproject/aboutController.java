package com.mycompany.finalproject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;


public class aboutController implements Initializable {

    ObservableList list = FXCollections.observableArrayList();
    
    @FXML
    private ListView<String> listView;

    @Override
    public void initialize(URL location, ResourceBundle rb) {
        listView.setMaxSize(200, 160);
        loadData();
    }

    private void loadData() {
        list.removeAll(list);
        String a = "Watching Anime";
        String b = "Playing badminton";
        String c = "Reading books";
        String d = "Spending time with family";
        String e = "Playing vollyball";
        

        list.addAll(a, b, c, d, e);
        listView.getItems().addAll(list);
    }
}