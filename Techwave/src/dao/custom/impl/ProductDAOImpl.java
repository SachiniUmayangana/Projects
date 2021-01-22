package dao.custom.impl;

import Entity.Product;
import dao.custom.ProductDAO;

import java.util.ArrayList;

public class ProductDAOImpl implements ProductDAO {
    @Override
    public boolean add(Product product) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String s) throws Exception {
        return false;
    }

    @Override
    public boolean update(Product product) throws Exception {
        return false;
    }

    @Override
    public Product search(String s) throws Exception {
        return null;
    }

    @Override
    public ArrayList<Product> getAll() throws Exception {
        return null;
    }
}
