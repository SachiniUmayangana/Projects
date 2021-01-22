package controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


import java.io.IOException;

public class LoginFormController {
    public JFXTextField txtUserName;
    public JFXPasswordField txtPassword;

    public AnchorPane root;

    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {

        String userName=txtUserName.getText();
        String password=txtPassword.getText();

        if(userName.length()>0 && password.length()>0){
            if (userName.equals("sachini")
                    && password.equals("1234")){

                Stage window = (Stage) this.root.getScene().getWindow();
                window.setScene(new Scene(FXMLLoader.load(this.getClass()
                        .getResource("/view/DashBoardForm.fxml"))));
                window.centerOnScreen();

            }else{
                new Alert(Alert.AlertType.WARNING,"Try Again", ButtonType.OK).show();
                
            }

        }
    }
}
