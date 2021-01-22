package bo.custom;

import bo.SuperBO;
import dto.CustomerDTO;

import java.util.ArrayList;

public interface CustomerBO extends SuperBO {
    public  ArrayList<CustomerDTO> getAll() throws Exception;

    ArrayList<CustomerDTO> getAllCustomers() throws Exception;
}
