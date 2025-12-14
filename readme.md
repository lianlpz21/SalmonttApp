# SalmonttApp – Semana 8

Aplicación desarrollada en Java para la empresa ficticia Salmontt, donde se aplican conceptos de Programación Orientada a Objetos como interfaces, herencia, polimorfismo y uso de instanceof, junto a una interfaz gráfica básica con JOptionPane.

## Descripción del sistema:

El sistema permite ingresar y visualizar información de distintas entidades de la empresa salmonera, como empleados, proveedores, centros de cultivo y plantas de proceso.
Todas las entidades implementan una interfaz común y son gestionadas desde una colección polimórfica.

## Estructura del proyecto:
1. model 
- Registrable (interfaz común)
- UnidadOperativa (clase abstracta)
- CentroCultivo 
- PlantaProceso
- Empleado
- Proveedor

2. data 
- GestorEntidades: administra una colección ArrayList<Registrable> y utiliza instanceof para diferenciar tipos.

3. ui 
- Main: interfaz gráfica simple implementada con JOptionPane.

## Ejecución del programa

1. Abrir el proyecto en IntelliJ IDEA.
2. Ejecutar la clase ui.Main.
3. Utilizar el menú para ingresar y visualizar los registros desde la interfaz gráfica.