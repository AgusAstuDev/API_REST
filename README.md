# API REST - Inicial

## Descripción

Este proyecto consiste en una API REST desarrollada en Java utilizando Spring Boot como framework principal. La API permite la creación, lectura, actualización y eliminación (CRUD) de entidades, empleando Hibernate como ORM para la persistencia de datos en una base de datos H2 (en memoria o en disco, según la configuración). Además, Lombok se utiliza para simplificar el código y reducir el boilerplate.
## Tecnologías Utilizadas

- **H2**: Base de datos en memoria y en disco.
- **Hibernate**: ORM (Object-Relational Mapping) para Java.
- **Lombok**: Biblioteca para reducir el código boilerplate en Java.
- **Java**: Lenguaje de programación utilizado para el desarrollo del proyecto.
- **SpringBoot**: Framework de desarrollo de aplicaciones Java.
## Características

- Relaciones entre entidades: `OneToMany`, `ManyToMany`, `OneToOne`.
- Uso de Lombok para reducir el código boilerplate.
## Instrucciones de Uso

1. Clonar o descargar el repositorio: [Descargar API_REST.zip](https://github.com/AgusAstuDev/API_REST/archive/refs/heads/main.zip)
2. Compilar y ejecutar el Proyecto: Inicial1Application
<pre><code>-----------------------
API_REST_1 funcionando
-----------------------
</code></pre>
3. Verificar la Base de Datos: http://localhost:8080/h2-console
4. Probar endpoints con swagger: http://localhost:8080/swagger-ui/index.html

