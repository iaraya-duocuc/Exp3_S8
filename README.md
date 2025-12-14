![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# Actividad Sumativa 3: Interfaces e integración con colecciones genéricas


## Autor del proyecto
- **Nombre completo:** Ignacio Araya
- **Sección:** PRY2202-003A
- **Carrera:** Analista Programador Computacional
- **Sede:** Online

---

## Descripción general del sistema
El proyecto consiste en una aplicación Java orientada a la gestión polimórfica de entidades de una empresa del rubro acuícola.
El sistema modela distintos tipos de entidades, tales como centros de cultivo, plantas de proceso, proveedores y empleados, utilizando principios de programación orientada a objetos, específicamente herencia, interfaces, clases abstractas y polimorfismo.

La aplicación organiza las entidades a través de colecciones (List) y permite su creación y visualización mediante una interfaz gráfica simple basada en JOptionPane.
La arquitectura del proyecto está separada en capas (model, data, ui), lo que favorece la claridad del diseño, la reutilización del código y su mantenimiento.

Los datos se cargan inicialmente en memoria desde la capa de datos.

---

## Estructura general del proyecto

```plaintext
src/
├── ui/          # Interfaz gráfica y punto de entrada de la aplicación (Main, MenuGUI)
├── data/        # Clases gestoras de carga inicial de entidades (GestorEntidades, GestorUnidades)
├── model/       # Modelo de dominio: interfaces, clases abstractas y entidades concretas
│   ├── Registrable
│   ├── UnidadOperativa
│   ├── Entidad
│   ├── CentroCultivo
│   ├── PlantaProceso
│   ├── Proveedor
│   └── Empleado
````

---

## Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/iaraya-duocuc/Exp3_S8.git
```

2. Abre el proyecto en IntelliJ IDEA.

3. Ejecuta el archivo `Main.java` desde el paquete `ui`.

---

**Repositorio GitHub:** https://github.com/iaraya-duocuc/Exp3_S8

**Fecha de entrega:** 15/12/2025

---

© Duoc UC | Escuela de Informática y Telecomunicaciones 



