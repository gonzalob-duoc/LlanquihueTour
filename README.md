![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)

# 🧳 Evaluación Sumativa – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto

* **Nombre completo:** Gonzalo Bravo Alliende
* **Sección:** Desarrollo Orientado a Objetos I
* **Carrera:** Analista Programador
* **Sede:** Duoc ONLINE

---

## 📘 Descripción general del sistema

Este proyecto corresponde a una actividad sumativa de la asignatura **Desarrollo Orientado a Objetos I**.

La solución desarrollada modela parte de las operaciones de la agencia turística **Llanquihue Tour**, empresa ubicada en la Región de Los Lagos que ofrece rutas gastronómicas, paseos lacustres, excursiones culturales y tours personalizados.

El objetivo principal es representar mediante Programación Orientada a Objetos a las personas vinculadas con la organización, aplicando conceptos fundamentales como:

* Encapsulamiento.
* Herencia.
* Composición.
* Constructores.
* Métodos de acceso (getters y setters).
* Sobrescritura del método `toString()`.
* Organización modular mediante paquetes.

El sistema constituye una base para futuras ampliaciones que permitan digitalizar los procesos internos de la agencia.

---

## 🧱 Estructura general del proyecto

```plaintext
📁 src/
├── app/
│   └── Main.java
│
└── model/
    ├── Direccion.java
    ├── Persona.java
    └── GuiaTuristico.java
```

### Descripción de las clases

#### 📍 Direccion

Representa la dirección asociada a una persona.

**Atributos:**

* calle
* ciudad
* region

#### 👤 Persona

Clase base que representa a una persona relacionada con la agencia.

**Atributos:**

* nombre
* rut
* direccion

**Relación implementada:**

* Composición con la clase `Direccion`.

#### 🧭 GuiaTuristico

Clase derivada que hereda de `Persona`.

**Atributo adicional:**

* especialidad

**Relación implementada:**

* Herencia desde la clase `Persona`.

#### 🚀 Main

Clase principal encargada de crear instancias de los objetos y mostrar la información por consola.

---

## 🔄 Relaciones implementadas

### Composición

La clase `Persona` contiene un objeto de tipo `Direccion`.

```java
private Direccion direccion;
```

Esto permite reutilizar la información de dirección y representar una relación lógica entre ambas clases.

### Herencia

La clase `GuiaTuristico` extiende la clase `Persona`.

```java
public class GuiaTuristico extends Persona
```

Esto permite reutilizar atributos y comportamientos comunes de una persona.

---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

### 1. Clonar el repositorio

```bash
git clone https://github.com/gonzalob-duoc/LlanquihueTour.git
```

### 2. Abrir el proyecto

Abrir el proyecto utilizando IntelliJ IDEA.

### 3. Verificar la estructura

Comprobar que los paquetes `model` y `app` estén correctamente organizados dentro de la carpeta `src`.

### 4. Ejecutar el programa

Ejecutar la clase:

```plaintext
app/Main.java
```

### 5. Resultado esperado

La consola mostrará la información de las personas y del guía turístico creados en el sistema utilizando el método `toString()`.

---

## 💻 Tecnologías utilizadas

* Java
* IntelliJ IDEA
* Git
* GitHub

---

## 🎯 Conceptos de Programación Orientada a Objetos Aplicados

✅ Encapsulamiento

✅ Herencia

✅ Composición

✅ Constructores

✅ Getters y Setters

✅ Sobrescritura de métodos (`toString()`)

✅ Organización mediante paquetes

---

## 📂 Repositorio GitHub

https://github.com/gonzalob-duoc/LlanquihueTour
---

## 📅 Fecha de entrega

[08/06/2026]

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Desarrollo Orientado a Objetos I
