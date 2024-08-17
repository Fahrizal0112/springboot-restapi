package com.example.springboot_restapi.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class proyek_lokasi {
    @ManyToOne
    @JoinColumn(name = "proyek_id", nullable = false)
    private Proyek Proyek;

    @ManyToOne
    @JoinColumn(name = "lokasi_id", nullable = false)
    private Lokasi Lokasi;

}
