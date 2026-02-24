package com.adrar.cdafad.service;

import com.adrar.cdafad.entity.Manufacturer;
import com.adrar.cdafad.repository.ManufacturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ManufacturerService {

    private final ManufacturerRepository manufacturerRepository;

    @Autowired
    public ManufacturerService(ManufacturerRepository manufacturerRepository) {
        this.manufacturerRepository = manufacturerRepository;
    }

    public Manufacturer createManufacturer(Manufacturer manufacturer) {
        if (manufacturer == null) {
            throw new IllegalArgumentException("Le fabricant ne peut pas être nul.");
        }
        return manufacturerRepository.save(manufacturer);
    }

    public Optional<Manufacturer> getManufacturerById(Integer id) {
        if (id == null) {
            throw new IllegalArgumentException("L'ID ne peut pas être nul.");
        }
        return manufacturerRepository.findById(id);
    }

    public Iterable<Manufacturer> getAllManufacturers() {
        return manufacturerRepository.findAll();
    }
}