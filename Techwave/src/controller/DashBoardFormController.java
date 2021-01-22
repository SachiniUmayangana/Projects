package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DashBoardFormController {
    public JFXTextField txtDate;
    public AnchorPane context;

    public void initialize() throws IOException {
        loadDefault();
        getTime();

    }

    private void loadDefault() throws IOException {
        setUi("DefaultForm");
    }

    private void setUi(String location) throws IOException {
        context.getChildren().clear();
        context.getChildren().add(FXMLLoader.
                load(this.getClass().
                        getResource("/view/" + location + ".fxml")));
    }


    private void getTime() {
        Date date = new Date();
        String strDateFormat = "hh:mm:ss a";
        DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
        String formattedDate = ((SimpleDateFormat) dateFormat).format(date);
        txtDate.setText(formattedDate);

        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd ");
        txtDate.setText(sdf.format(d));
    }

    public void btnAdminOnAction(ActionEvent actionEvent) throws IOException {
        setUi("AdminForm");
    }



    public void btnProductsOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ProductForm");
    }

    public void btnCustomerOnAction(ActionEvent actionEvent) throws IOException {
        setUi("CustomerForm");
    }
}
