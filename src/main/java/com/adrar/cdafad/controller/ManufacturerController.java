package com.adrar.cdafad.controller;

import com.adrar.cdafad.entity.Manufacturer;
import com.adrar.cdafad.service.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ManufacturerController {

    private final ManufacturerService manufacturerService;

    @Autowired
    public ManufacturerController(ManufacturerService manufacturerService) {
        this.manufacturerService = manufacturerService;
    }

    @PostMapping("/manufacturer")
    public ResponseEntity<Manufacturer> addManufacturer(@RequestBody Manufacturer manufacturer) {
        try {
            Manufacturer createdManufacturer = manufacturerService.createManufacturer(manufacturer);
            return ResponseEntity.ok(createdManufacturer);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/manufacturers")
    public ResponseEntity<Iterable<Manufacturer>> getManufacturers() {
        return ResponseEntity.ok(manufacturerService.getAllManufacturers());
    }
}