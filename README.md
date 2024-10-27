## Actividad 8 - Interfaz de texto y serializacion

Este programa es una versión de la [actividad 7](https://github.com/KhalidCEU/actividad7), pero en modo **CLI** / Interfaz de texto.


### Uso

Primero compile el programa con el comando :

```
make
```

Lance el programa :

```
./a.out
```

El CLI se lanzará y leerá automaticamente los datos.

### Comandos

  ```add provincia``` : Para **añadir una provincia**.

  ```add municipio``` : Para **añadir un municipio** y asociarla a una provincia

  ```add localidad``` : Para **añadir una localidad**, su número de habitantes y asociarlo a un municipio

  ```list```: para **listar todos los datos**.

  ```exit```: para **salir** del CLI / programa.


### Ejemplo

Para ver un ejemplo de input / output , acceda a **[este fichero](docs/ejemplo_IO)**.

### Nota

Este programa no está hecho con el fin de uso en producción. Hay varias cosas mejorables como una gestion de errores mas estricta etc, se hizo simplemente como ejercicio para mostrar el funcionamiento básico de una interfaz de texto con sus comandos principales y el uso de persistencia de datos en Java.