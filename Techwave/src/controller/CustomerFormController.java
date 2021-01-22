package controller;

import bo.BOFactory;
import bo.custom.CustomerBO;
import com.jfoenix.controls.JFXComboBox;
import dto.CustomerDTO;

import java.util.ArrayList;

public class CustomerFormController {

    CustomerBO bo= (CustomerBO) BOFactory.getInstance().getBO(BOFactory.BOType.CUSTOMER);

    public JFXComboBox cmbAllCustomers;

    public void initialize() throws Exception {
        loadAllCustomers();
    }

    private void loadAllCustomers() throws Exception {
        ArrayList<CustomerDTO> customerDTOS=getAllCustomers();
        for (CustomerDTO dto:customerDTOS) {
            cmbAllCustomers.getItems().addAll(dto.getCustId());
        }
    }

    private ArrayList<CustomerDTO> getAllCustomers() throws Exception {
        return bo.getAllCustomers();

    }



}
