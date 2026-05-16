package com.example.ms_productos.Dto;
import jakarta.validation.constraints.*;
import lombok.*;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductoRequestDTO {
    @NotBlank(message = "El nombre no puede estar vacio")
    private String nombre;
    @NotBlank(message = "La descripcion no puede estar vacia")
    private String descripcion;
    @NotNull(message = "El precio es Obligatorio")
    @Positive(message = "El precio debe ser mayor que cero")
    private BigDecimal precio;
    @NotNull(message = "El stock es Obligatorio")
    @PositiveOrZero(message = "El stock no puede estar en negativo")
    private Integer stock;
    @NotNull(message = "El estado es obligatorio")
    private Boolean estado;

}
