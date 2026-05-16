package com.example.ms_productos.Controller;
import com.example.ms_productos.Dto.ProductoRequestDTO;
import com.example.ms_productos.Entity.Producto;
import com.example.ms_productos.Service.ProductoService;

import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    private final ProductoService service;
    public ProductoController(ProductoService service){
        this.service=service;
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Producto crearProducto(@Valid @RequestBody ProductoRequestDTO dto){
        return service.crearProducto(dto);
    }
    @GetMapping
    public List<Producto> listarProductos(){
        return service.listarProductos();
    }
    @GetMapping("/{id}")
    public Producto obtenerProductoPorId(@PathVariable Long id) {
        return service.obtenerProductoPorId(id);
    }

    @PutMapping("/{id}")
    public Producto actualizarProducto(
            @PathVariable Long id,
            @Valid @RequestBody ProductoRequestDTO dto) {

        return service.actualizarProducto(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminarProducto(@PathVariable Long id) {
        service.eliminarProducto(id);
    }

}
