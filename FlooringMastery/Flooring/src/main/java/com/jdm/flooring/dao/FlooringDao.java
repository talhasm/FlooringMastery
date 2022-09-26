package com.jdm.flooring.dao;

import com.jdm.flooring.dto.Order;
import com.jdm.flooring.dto.Product;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


public interface FlooringDao {

    public List<Order> getAllOrders();
    
    public List<Order> getOrdersByDate(LocalDate date);
    
    public void importOrderData() throws FlooringDaoException;
    
    public void importProductData() throws FlooringDaoException;
    
    public void importTaxData() throws FlooringDaoException;
    
    public Order createOrder(String date, String customerName, String state, String productType, BigDecimal area);

    public int addOrder(Order newOrder);

    public boolean checkTaxCode(String state);

    public List<Product> getProducts();

    public boolean checkProductType(String productType);

    public Order getOrderByNameDate(String date, String customerName);

    public void updateOrder(Order order) throws FlooringDaoException;

    public void recalculateOrder(Order order);

    public Order getOrderByOrderNumberDate(String orderNumber, String date);

    public void removeOrder(Order order);

    public void exportOrderData() throws FlooringDaoException;

    public void exportBackupOrderData()  throws FlooringDaoException;

}
