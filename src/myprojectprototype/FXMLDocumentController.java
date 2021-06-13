/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myprojectprototype;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;

/**
 *
 * @author Onyekachukwu
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TableView<DataModel> tableView;

    @FXML
    private TableColumn<DataModel, String> name;

    @FXML
    private TableColumn addRemove;

    private ObservableList<DataModel> data;

    private void addSomethingToTable() {
        data = FXCollections.observableArrayList(
                new DataModel("Jesus Culture"),
                new DataModel("Hillsong"),
                new DataModel("Chris Delvan"),
                new DataModel("Sinach")
        );

        tableView.setItems(data);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // display data to table view
        addSomethingToTable();

        //setting columns
        name.setCellValueFactory(new PropertyValueFactory<>("Name"));
        addRemove.setCellFactory(cellFactory);
    }

    Callback<TableColumn<DataModel, String>, TableCell<DataModel, String>> cellFactory = (param) -> {

        // setting a cell to accept button
        final TableCell<DataModel, String> cell = new TableCell<DataModel, String>() {
            
            @Override
            public void updateItem(String item, boolean empty){
                super.updateItem(item, empty);
                
                if (empty) {
                    setGraphic(null);
                    setText(null);
                }else{
                    
                    final Button button = new Button("+");
                    button.setOnAction(e->{
                        data.add(getIndex()+1,new DataModel("Bob"));
//                        data.remove(getIndex());
                        tableView.setItems(data);
                    });
                    
                    setGraphic(button);
                    setText(null);
                }
            }
        };

        return cell;
    };

}
