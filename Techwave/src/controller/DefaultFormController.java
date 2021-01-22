package controller;

import db.DBConnection;
import javafx.scene.control.Label;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DefaultFormController {
    public Label txtProducts;
    public Label txtCustomers;
    public Label txtOrders;
    public Label txtSuppliers;
    public Label txtEmployees;


    public void initialize() throws SQLException, ClassNotFoundException {
        custCount(); // ALT + ENTER
        productCount();
        orderCount();
        supplierCount();
        employeeCount();
    }

    private void employeeCount() throws SQLException, ClassNotFoundException {
        String sql = "SELECT COUNT(eId) FROM Employee";
        // Start load Customer Count-----------------
        ResultSet set = DBConnection.getInstance().
                getConnection().
                prepareStatement
                        (sql)
                .executeQuery();
        if (set.next()) {
            int customerCount = set.getInt(1);
            txtEmployees.setText(String.valueOf(customerCount));
        }
    }

    private void supplierCount() throws SQLException, ClassNotFoundException {
        String sql = "SELECT COUNT(supId) FROM Supplier";
        // Start load Customer Count-----------------
        ResultSet set = DBConnection.getInstance().
                getConnection().
                prepareStatement
                        (sql)
                .executeQuery();
        if (set.next()) {
            int customerCount = set.getInt(1);
            txtSuppliers.setText(String.valueOf(customerCount));
        }
    }

    private void orderCount() throws SQLException, ClassNotFoundException {
        String sql = "SELECT COUNT(orderId) FROM Orders";
        // Start load Customer Count-----------------
        ResultSet set = DBConnection.getInstance().
                getConnection().
                prepareStatement
                        (sql)
                .executeQuery();
        if (set.next()) {
            int customerCount = set.getInt(1);
            txtOrders.setText(String.valueOf(customerCount));
        }
    }

    private void productCount() throws SQLException, ClassNotFoundException {
        String sql = "SELECT COUNT(code) FROM Product";
        // Start load Customer Count-----------------
        ResultSet set = DBConnection.getInstance().
                getConnection().
                prepareStatement
                        (sql)
                .executeQuery();
        if (set.next()) {
            int customerCount = set.getInt(1);
            txtProducts.setText(String.valueOf(customerCount));
        }
    }

    private void custCount() throws SQLException, ClassNotFoundException {
        String sql = "SELECT COUNT(custId) FROM Customer";
        // Start load Customer Count-----------------
        ResultSet set = DBConnection.getInstance().
                getConnection().
                prepareStatement
                        (sql)
                .executeQuery();
        if (set.next()) {
            int customerCount = set.getInt(1);
            txtCustomers.setText(String.valueOf(customerCount));
        }
        // End load Customer Count-----------------
    }
}