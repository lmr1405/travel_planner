# Travel Planner - Frontend

Frontend de la aplicación Travel Planner, desarrollado con React, TypeScript y Vite.

## Descripción

La aplicación permite visualizar y gestionar viajes desde una interfaz web sencilla.

El frontend se comunica con una API REST desarrollada en Spring Boot para obtener y enviar la información de los viajes.

## Tecnologías

- React
- TypeScript
- Vite
- CSS

## Estructura principal

```text
src/
├── api/
│   └── tripApi.ts
├── assets/
├── components/
├── pages/
├── styles/
├── types/
├── App.tsx
└── main.tsx
```

La carpeta `src` contiene el código principal del frontend:

- `api/`: funciones para comunicarse con el backend.
- `assets/`: recursos utilizados por la aplicación.
- `components/`: componentes reutilizables.
- `pages/`: páginas principales de la aplicación.
- `styles/`: archivos CSS.
- `types/`: tipos TypeScript utilizados en el proyecto.

## Instalación

Para instalar las dependencias del frontend:

```bash
npm install
```

## Ejecución

Para ejecutar la aplicación en modo desarrollo:

```bash
npm run dev
```

La aplicación se ejecuta por defecto en:

```text
http://localhost:5173
```

## Scripts

Comandos principales del proyecto:

```bash
npm run dev
npm run build
npm run preview
```

## Comunicación con el backend

El frontend realiza peticiones a la API REST del backend de Travel Planner.

Endpoint principal utilizado:

```text
http://localhost:8080/api/trips
```

Es necesario tener el backend en ejecución para que el frontend pueda obtener, crear, actualizar o eliminar viajes.

## Estado del frontend

Frontend en desarrollo.

Actualmente se está implementando la interfaz básica para gestionar viajes y probar la integración con el backend.

## Autor

Luis Menéndez Ramos