package com.example.springboot_restapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot_restapi.model.Proyek;
import com.example.springboot_restapi.repository.proyekrepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/proyek")
public class ProyekController {

    @Autowired
    private proyekrepository proyekrepository;

    @PostMapping
    public Proyek PostProyek(@RequestBody Proyek proyek) {
        return proyekrepository.save(proyek);
    }

    @GetMapping
    public List<Proyek> GetProyek() {
        return proyekrepository.findAll();
    }
    
    @PutMapping("/{id}")
    public Proyek UpdateProyek(@PathVariable Long id, @RequestBody Proyek proyekDetails) {
        Optional<Proyek> proyekOptional = proyekrepository.findById(id);

        if(proyekOptional.isPresent()) {
            Proyek proyek = proyekOptional.get();
            proyek.setNamaProyek(proyekDetails.getNamaProyek());
            proyek.setClient(proyekDetails.getClient());
            proyek.setTglMulai(proyekDetails.getTglMulai());
            proyek.setTglSelesai(proyekDetails.getTglSelesai());
            proyek.setPimpinan(proyekDetails.getPimpinan());
            proyek.setKeterangan(proyekDetails.getKeterangan());
            return proyekrepository.save(proyek);
        }

        return null;
    }
    
    @DeleteMapping("/{id}")
    public void deleteProyek(@PathVariable Long id) {
        proyekrepository.deleteById(id);
    }
}
