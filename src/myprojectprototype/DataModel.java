/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myprojectprototype;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

/**
 *
 * @author Onyekachukwu
 */
public class DataModel {
    
    private String Name;

    public void setName(String Name) {
        this.Name = Name;
    }

    public DataModel(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }
    
    
}
