package com.helloboot.controller;

import com.helloboot.model.DateTestDao;
import com.helloboot.model.DateTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author lujianhao
 * @date 2018/12/16
 */
@RestController
@RequestMapping("/date")
public class DateTestController {
    @Autowired
    private DateTestDao dateTestDao;

    @GetMapping("/get")
    public String post() {
        DateTest dateTest = new DateTest();
        dateTest.setDate(LocalDate.now());
        dateTest.setTime(LocalTime.now());
        dateTest.setTimestamp(LocalDateTime.now());
        dateTest.setDatetime(LocalDateTime.now());
        dateTestDao.save(dateTest);
        return "success";
    }
}
