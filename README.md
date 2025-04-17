# Actividad 2 - Proyecto Java Maven

## Descripción
Este proyecto fue desarrollado como parte de la **Actividad 2** en la asignatura de **Programación de Vanguardia**. Utiliza **Java**, **Maven** y varias librerías para crear una pequeña aplicación de consola que interactúa con el usuario.

La aplicación muestra un saludo personalizado al usuario, recibiendo su nombre como parámetro de línea de comandos.

---

## Requisitos
- **Java 24.0.1 o superior**.
- **Apache Maven**.
- **Log4j** para registros y seguimiento.
- **Commons-cli** para gestionar la entrada de parámetros desde la línea de comandos.

---

## Librerías Utilizadas

1. **Commons-cli**:  
   Esta librería permite gestionar los parámetros que se pasan al ejecutar la aplicación desde la línea de comandos.

2. **Log4j**:  
   Log4j se usa para gestionar los registros (logs) del programa, permitiendo registrar eventos importantes como el inicio o la salida de la aplicación.

---

## Instrucciones de Uso

### Ejecución de la Aplicación

1. Para ejecutar la aplicación, primero asegúrate de tener **Java** y **Maven** instalados en tu sistema.

2. Abre una terminal y navega hasta la carpeta del proyecto.

3. Ejecuta el siguiente comando para construir el archivo **JAR**:

   ```bash
   mvn clean package
Una vez que el JAR esté generado, ejecuta el siguiente comando en la terminal:

 ```bashbash
  java -jar target/Actividad2-1.0-SNAPSHOT-jar-with-dependencies.jar --name=TuNombre
```
Esto te mostrará un saludo personalizado con el nombre que pases como parámetro:

##Desarrollo del Proyecto

Estructura de Maven:
El proyecto fue configurado como un proyecto Maven, lo que facilita la gestión de dependencias y la construcción del artefacto JAR.

Dependencias:
Se incluyeron las siguientes librerías:

commons-cli para procesar los parámetros de línea de comandos.

log4j para la creación de logs de la aplicación.

Funcionalidad:
La aplicación toma el parámetro --name desde la línea de comandos, lo procesa y muestra un mensaje como:

  ```text
Hola, [TuNombre]!
```
Consideraciones
Asegúrate de que tu entorno de desarrollo esté correctamente configurado con Java 24.0.1 y Maven.

Si deseas modificar el comportamiento de los registros, puedes editar el archivo log4j.properties.

Autores
Omar Almirón
