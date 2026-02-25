package com.adrar.cdafad.exception;

public class ManufacturerExist extends RuntimeException{
    public ManufacturerExist(String name) {
        super("Le fabricant '" + name + "' existe déjà.");
    }
}