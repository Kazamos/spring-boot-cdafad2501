package com.adrar.cdafad.exception;

public class ManufacturerEmpty extends RuntimeException {
    public ManufacturerEmpty() {
        super("La liste des fabricants est vide.");
    }
}
