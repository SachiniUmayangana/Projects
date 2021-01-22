package dao.custom.impl;

import Entity.Customer;
import dao.CrudUtil;
import dao.custom.CustomerDAO;

import java.sql.ResultSet;
import java.util.ArrayList;

public class CustomerDAOImpl implements CustomerDAO {
    @Override
    public boolean add(Customer customer) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String s) throws Exception {
        return false;
    }

    @Override
    public boolean update(Customer customer) throws Exception {
        return false;
    }

    @Override
    public Customer search(String s) throws Exception {
        return null;
    }

    @Override
    public ArrayList<Customer> getAll() throws Exception {
        String sql = "select * from Customer";
        ResultSet rst = CrudUtil.executeQuery(sql);
        ArrayList<Customer> allCustomers = new ArrayList<>();
        while (rst.next()) {
            allCustomers.add(new Customer(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4)));
        }
        return allCustomers;
    }
}
