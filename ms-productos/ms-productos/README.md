# ms-productos

Microservicio desarrollado con Spring Boot para la gestión de productos.

---

# Descripción

Este microservicio permite administrar productos mediante una API REST.

Funciones principales:

- Registrar productos
- Listar productos
- Buscar productos por ID
- Actualizar productos
- Eliminar productos

Cada producto contiene:

- Nombre
- Descripción
- Precio
- Stock
- Estado
- Fecha de creación

---

# Tecnologías utilizadas

- Java 17
- Spring Boot 3
- Spring Web
- Spring Data JPA
- PostgreSQL
- Neon Database
- Docker
- Render
- Maven

---

# Arquitectura del proyecto

```txt
src/main/java/com/example/ms_productos
├── Controller
├── Service
├── Repository
├── Entity
├── Dto
└── Exception
Endpoints disponibles
Crear producto
POST /api/productos
Ejemplo JSON
{
  "nombre": "Laptop Lenovo",
  "descripcion": "Laptop para desarrollo",
  "precio": 3500,
  "stock": 10,
  "estado": true
}
Listar productos
GET /api/productos
Buscar producto por ID
GET /api/productos/{id}
Actualizar producto
PUT /api/productos/{id}
Eliminar producto
DELETE /api/productos/{id}
Variables de entorno
DB_URL=
DB_USERNAME=
DB_PASSWORD=
PORT=8080
Configuración de base de datos

El proyecto utiliza PostgreSQL en Neon Database.

La configuración se realiza mediante variables de entorno para evitar exponer credenciales sensibles.

Ejecución local
Clonar repositorio
git clone URL_DEL_REPOSITORIO
Ingresar al proyecto
cd ms-productos
Ejecutar aplicación
mvn spring-boot:run

La aplicación iniciará en:

http://localhost:8080
Docker
Construir imagen Docker
docker build -t ms-productos .
Ejecutar contenedor
docker run -p 8080:8080 ms-productos
Despliegue en Render

Microservicio desplegado usando Render.

URL pública: https://ms-productos-c2k3.onrender.com/api/productos