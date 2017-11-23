package com.jk.service.impl;

import com.jk.dao.SalesRepository;
import com.jk.model.Sales;
import com.jk.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zy on 2017/11/16.
 */
@Service
public class SalesServiceImpl implements SalesService {

    @Autowired
    private SalesRepository salesRepository;
    @Override
    public List<Sales> findAll() {
        return salesRepository.findAll();
    }

    @Override
    public void save(Sales user) {
        salesRepository.save(user);
    }
}
