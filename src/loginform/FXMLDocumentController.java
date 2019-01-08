/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform;

import com.jfoenix.controls.JFXTextField;
import com.jfoenix.validation.RequiredFieldValidator;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 *
 * @author TURNKEY
 */
public class FXMLDocumentController implements Initializable {
    
      @FXML
    private JFXTextField name;

    @FXML
    private JFXTextField password;


    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        RequiredFieldValidator validator = new RequiredFieldValidator();
        name.getValidators().add(validator);
        validator.setMessage("User name blank");
        
        name.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                if (!newValue)
                {
                    name.validate();
                }
            }
        });
        
       password.getValidators().add(validator);
       validator.setMessage("password field blank");
       
       password.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
              if (!newValue)
                  password.validate();
            }
        });    }    
    
}
