package com.example.ms_productos.Exception;

import jakarta.annotation.Resource;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String mensaje){
        super(mensaje);
    }
}
