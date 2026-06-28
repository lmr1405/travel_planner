# Travel Planner

Travel Planner es una aplicación web para organizar viajes y preparar todo lo necesario antes de salir.

La idea es centralizar en un único sitio la información básica de cada viaje: destino, fechas, descripción, tareas previas y listas de preparación. De esta forma, la organización del viaje no depende de notas sueltas, capturas, correos o mensajes repartidos en distintas aplicaciones.

El proyecto está planteado como una aplicación full stack, con backend en Java Spring Boot, base de datos PostgreSQL y frontend web consumiendo una API REST.

## MVP

El MVP se centra en la organización básica de viajes.

La primera versión permitirá:

- Crear viajes con destino, fechas y descripción.
- Consultar el listado de viajes guardados.
- Ver el detalle de un viaje concreto.
- Editar la información básica de un viaje.
- Eliminar viajes.
- Añadir tareas previas asociadas a un viaje.
- Marcar tareas como completadas.
- Crear listas de preparación para cada viaje.
- Marcar elementos de la lista como preparados.

## Tecnologías

### Backend

- Java 17
- Spring Boot
- Maven
- Spring Web
- Spring Data JPA
- PostgreSQL
- Bean Validation

### Frontend

- HTML
- CSS
- JavaScript
- JSON

### Herramientas

- Eclipse
- PostgreSQL / pgAdmin
- Git

## Estructura del proyecto

```text
travel-planner/
│
├── backend/
│   ├── src/
│   ├── pom.xml
│   ├── mvnw
│   └── mvnw.cmd
│
├── frontend/
│
├── .gitignore
├── .gitattributes
└── README.md