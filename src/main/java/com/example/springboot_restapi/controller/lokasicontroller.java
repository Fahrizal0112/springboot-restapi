package com.example.springboot_restapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot_restapi.model.Lokasi;
import com.example.springboot_restapi.repository.lokasirepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/lokasi")
public class lokasicontroller {

    @Autowired
    private lokasirepository lokasirepository;

    @PostMapping
    public Lokasi PostLokasi(@RequestBody Lokasi lokasi) {
        return lokasirepository.save(lokasi);
    }

    @GetMapping
    public List<Lokasi> GetLokasi() {
        return lokasirepository.findAll();
    }

    @PutMapping("/{id}")
    public Lokasi updateLokasi(@PathVariable Long id, @RequestBody Lokasi lokasiDetails) {
        Optional<Lokasi> lokasiOptional = lokasirepository.findById(id);

        if (lokasiOptional.isPresent()) {
            Lokasi lokasi = lokasiOptional.get();
            lokasi.setNamaLokasi(lokasiDetails.getNamaLokasi());
            lokasi.setNegara(lokasiDetails.getNegara());
            lokasi.setProvinsi(lokasiDetails.getProvinsi());
            lokasi.setKota(lokasiDetails.getKota());
            return lokasirepository.save(lokasi);
        }

        return null;
    }

    
    

}
