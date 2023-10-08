# Empezando

### Documentación de Referencia
Para referencia adicional, por favor considera las siguientes secciones:
* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.4/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.4/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.1.4/reference/htmlsingle/index.html#web)

### Guías

Los siguientes guías ilustran cómo usar algunas características de manera concreta:
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

## Configuración del Entorno

Asegúrate de tener Java 17 instalado en tu sistema. Puedes descargarlo desde [el sitio web oficial de OpenJDK](https://openjdk.java.net/17/).

## Configuración en IntelliJ IDEA

1. Abre IntelliJ IDEA y navega a la configuración del proyecto.
2. En "Project SDK", selecciona "17" como la versión de Java.

## Iniciar el proyecto

1. Ingresar a la /src/main/java/com/examen/bisa/DemoApplication
2. click derecho en el archivo Demoapplication y seleccionar "RUN"

## Carga de Datos de Prueba

1. Ingresar al siguiente URL
2. http://localhost:8080/data "Importante para cargar los datos y realizar las pruebas "

## APIs REST

1. Crear Persona POST - http://localhost:8080/persona
2. Crear Cliente POST - http://localhost:8080/cliente
3. Añadir referencia personal para un cliente  POST - http://localhost:8080/referencia/
4. Eliminar referencia personal de un cliente  DELETE - http://localhost:8080/cliente/[id_cliente]
5. Lista clientes por accesibilidad GET - http://localhost:8080/cliente




