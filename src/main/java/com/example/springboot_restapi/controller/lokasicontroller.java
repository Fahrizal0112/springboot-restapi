package com.example.springboot_restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot_restapi.model.lokasi;
import com.example.springboot_restapi.repository.lokasirepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/lokasi")
public class lokasicontroller {

    @Autowired
    private lokasirepository lokasirepository;

    @PostMapping
    public lokasi PostLokasi(@RequestBody lokasi lokasi) {
        return lokasirepository.save(lokasi);
    }
    

}
