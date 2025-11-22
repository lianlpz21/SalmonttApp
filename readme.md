# PROYECTO SALMONTT – LECTURA DE ARCHIVOS Y MANEJO DE COLECCIONES

Este proyecto representa una primera aproximación al sistema de gestión de centros de cultivo de la empresa salmonera **Salmontt**, aplicando principios básicos de Programación Orientada a Objetos y manejo de colecciones en Java.  
El objetivo principal es **leer datos desde un archivo .txt**, crear objetos en base a esta información y almacenarlos en un `ArrayList` para luego recorrerlos y filtrarlos.

---

## ESTRUCTURA DEL PROYECTO

El proyecto está dividido en tres paquetes principales:

- **model**: contiene la clase `CentroCultivo`, que representa cada registro del archivo.
- **data**: incluye la clase `GestorDatos`, encargada de leer el archivo y cargar los datos.
- **ui**: contiene la clase `Main`, donde se utiliza la colección y se ejecuta el programa.

Adicionalmente, el archivo `centros.txt` se encuentra en la carpeta **resources**, fuera de `src`.

---

## DESCRIPCIÓN DE LAS CLASES

### **CentroCultivo (model)**
Representa un centro de cultivo e incluye:
- Nombre
- Comuna
- Producción (en kg)

Incluye getters, setters y un método `toString()` para mostrar la información formateada.  
Es la clase base que modela los datos del archivo externo.

---

### **GestorDatos (data)**
Clase encargada de:
- Abrir y leer el archivo `centros.txt` línea por línea.
- Separar los datos usando `split(";")`.
- Convertir los valores numéricos.
- Crear objetos `CentroCultivo`.
- Guardarlos en un `ArrayList<CentroCultivo>`.

Esta clase encapsula toda la funcionalidad de lectura y carga de datos.

---

### **Main (ui)**
Desde esta clase se:
1. Llaman los métodos del `GestorDatos` para cargar la lista de centros.
2. Muestra en consola toda la lista completa.
3. Aplica un filtro (producción mayor a 1000 kg).
4. Imprime los resultados filtrados.

---

## ARCHIVO DE DATOS (centros.txt)

El archivo contiene los centros separados por “;”:

