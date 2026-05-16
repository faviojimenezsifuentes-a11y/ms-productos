package com.example.ms_productos.Service;
import com.example.ms_productos.Dto.ProductoRequestDTO;
import com.example.ms_productos.Entity.Producto;
import java.util.List;
public interface ProductoService {
    Producto crearProducto(ProductoRequestDTO dto);
    List<Producto> listarProductos();
    Producto obtenerProductoPorId(Long id);
    Producto actualizarProducto(Long id, ProductoRequestDTO dto);
    void eliminarProducto(Long id);

}
