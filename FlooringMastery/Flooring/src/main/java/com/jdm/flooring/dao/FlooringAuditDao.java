package com.jdm.flooring.dao;


public interface FlooringAuditDao {
    
    public void writeAuditEntry(String entry) throws FlooringDaoException;
}
