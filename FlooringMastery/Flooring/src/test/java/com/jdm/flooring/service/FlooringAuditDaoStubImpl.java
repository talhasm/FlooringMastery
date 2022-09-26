package com.jdm.flooring.service;

import com.jdm.flooring.dao.FlooringAuditDao;
import com.jdm.flooring.dao.FlooringDaoException;

public class FlooringAuditDaoStubImpl implements FlooringAuditDao {

    @Override
    public void writeAuditEntry(String entry) throws FlooringDaoException {
    }

}
