package com.jdm.flooring.service;

import com.jdm.flooring.dao.FlooringDaoException;
import com.jdm.flooring.dto.Order;
import com.jdm.flooring.dto.Product;
import java.util.List;

public interface FlooringServiceLayer {

    public List<Order> getOrdersByDate(String date) throws InvalidInputException, FlooringDaoException;
    
    public Order createOrder(String date, String customerName, String state, String productType, String area)  throws DateAlreadyPassedException, 
            InvalidInputException, TaxCodeViolationException, FlooringDaoException;
    
    public int submitOrder(Order order) throws FlooringDaoException;
    
    public List<Product> getProducts() throws FlooringDaoException;
    
    public void importAllData() throws FlooringDaoException;

    public Order getOrderToEdit(String date, String customerName) throws InvalidInputException, NoSuchItemException, FlooringDaoException;

    public Order editOrder(Order order, String customerName, String state, String productType, String area) throws InvalidInputException, TaxCodeViolationException, FlooringDaoException;

    public void changeOrder(Order order) throws FlooringDaoException;

    public Order getOrderToRemove(String date, String orderNumber) throws InvalidInputException, NoSuchItemException, FlooringDaoException;

    public void removeOrder(Order order) throws FlooringDaoException;

    public void exportAllData() throws FlooringDaoException;

    public void exportBackupData() throws FlooringDaoException;
    
}
