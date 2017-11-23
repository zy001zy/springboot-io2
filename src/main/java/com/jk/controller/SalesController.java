package com.jk.controller;

import com.jk.dao.SalesRepository;
import com.jk.model.Sales;
import com.jk.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zy on 2017/11/16.
 */
@Controller
public class SalesController {

    @Autowired
    private SalesRepository salesRepository;
    @Resource
    SalesService salesService;

    @RequestMapping("/")
    public String index() {
        return "redirect:/salesList";
    }

    @RequestMapping("/salesList")
    public String salesList(Model model){
        List<Sales> salesList=salesService.findAll();
        model.addAttribute("salesList",salesList);
        return "user/list";
    }

    @RequestMapping("/toAdd")
    public String toAdd() {
        return "user/userAdd";
    }
    @RequestMapping("/add")
    public String add(Sales user) {
        salesService.save(user);
        return "redirect:/salesList";


    }
    @RequestMapping("/getUser")
    @Cacheable(value="sales-key")
    public Sales getUser() {

        Sales user=salesRepository.findBySalesName("aa");
        System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
        return user;
    }
}
