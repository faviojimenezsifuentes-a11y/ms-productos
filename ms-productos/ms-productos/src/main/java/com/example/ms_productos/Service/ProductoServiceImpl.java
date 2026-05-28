package com.example.ms_productos.Service;
import com.example.ms_productos.Dto.ProductoRequestDTO;
import com.example.ms_productos.Entity.Producto;
import com.example.ms_productos.Repository.ProdutoRepository;
import com.example.ms_productos.Exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;
@Service
public class ProductoServiceImpl implements ProductoService {
    private final ProdutoRepository repository;
    public ProductoServiceImpl(ProdutoRepository repository){
        this.repository=repository;
    }
    @Override
    public Producto crearProducto(ProductoRequestDTO dto) {

        Producto producto = Producto.builder()
                .nombre(dto.getNombre())
                .descripcion(dto.getDescripcion())
                .precio(dto.getPrecio())
                .stock(dto.getStock())
                .estado(dto.getEstado())
                .fechaCreacion(LocalDateTime.now())
                .imagenUrl(dto.getImagenUrl())
                .build();

        return repository.save(producto);
    }
    @Override
    public List<Producto> listarProductos() {
        return repository.findAll();
    }

    @Override
    public Producto obtenerProductoPorId(Long id) {

        return repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Producto no encontrado con ID: " + id));
    }

    @Override
    public Producto actualizarProducto(Long id, ProductoRequestDTO dto) {

        Producto producto = obtenerProductoPorId(id);
        producto.setImagenUrl(dto.getImagenUrl());
        producto.setNombre(dto.getNombre());
        producto.setDescripcion(dto.getDescripcion());
        producto.setPrecio(dto.getPrecio());
        producto.setStock(dto.getStock());
        producto.setEstado(dto.getEstado());

        return repository.save(producto);
    }

    @Override
    public void eliminarProducto(Long id) {

        Producto producto = obtenerProductoPorId(id);

        repository.delete(producto);
    }

}
