package com.example.ms_productos.Repository;
import com.example.ms_productos.Entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProdutoRepository extends JpaRepository<Producto, Long> {

}
