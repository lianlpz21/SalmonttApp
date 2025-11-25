# SalmonttApp

El proyecto está organizado en cuatro paquetes:

- model
- service
- util
- app

En **model** está la clase CentroCultivo.
Aquí solo defino los datos de cada centro: nombre, comuna y producción en kilos.

En **util** está la clase Validador.
Se usa para revisar que los datos del archivo tengan el formato correcto.

En **service** está la clase GestorDatos.
Esta clase lee el archivo centros.txt, separa cada línea con split(";"), valida los campos
y crea los objetos CentroCultivo. Todos los centros válidos se guardan en una lista.

En **app** está la clase Main.
Aquí se ejecuta el programa, se muestra el menú y se hacen los filtros y búsquedas.

------------------------------------

# Ejecución del sistema

Al iniciar, el programa carga automáticamente los datos desde centros.txt.
Si hay líneas vacías o inválidas, se ignoran.

Luego se muestra el menú:

1. Mostrar todos los centros
2. Ver centros con producción mayor a 1000
3. Buscar centros por comuna
4. Salir

Opción 1 → muestra toda la lista
Opción 2 → aplica un filtro y muestra solo los de más de 1000 kg
Opción 3 → pide la comuna y muestra los centros de esa comuna
------------------------------------

# Archivo centros.txt (ejemplo)

1. Centro A;Puerto Montt;1500
2. Centro B;Calbuco;900
3. Centro C;Castro;2000
