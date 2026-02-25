package com.adrar.cdafad.exception;

public class ManufacturerNotFound extends RuntimeException {
    public ManufacturerNotFound(Integer id) {
        super("Le fabricant avec l'ID " + id + " n'existe pas.");
    }
}