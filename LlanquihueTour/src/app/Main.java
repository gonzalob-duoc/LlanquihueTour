package app;

import model.Direccion;
import model.Persona;
import model.GuiaTuristico;

public class Main {

    public static void main(String[] args) {

        Direccion dir1 = new Direccion(
                "Av. Costanera 123",
                "Llanquihue",
                "Los Lagos");

        Direccion dir2 = new Direccion(
                "Ruta 5 Sur 450",
                "Puerto Varas",
                "Los Lagos");

        Direccion dir3 = new Direccion(
                "Calle del Lago 89",
                "Frutillar",
                "Los Lagos");

        Persona cliente = new Persona(
                "María González",
                "12.345.678-9",
                dir1);

        Persona proveedor = new Persona(
                "Pedro Soto",
                "11.111.111-1",
                dir2);

        GuiaTuristico guia = new GuiaTuristico(
                "Juan Pérez",
                "22.222.222-2",
                dir3,
                "Turismo Cultural");

        System.out.println("=== SISTEMA LLANQUIHUE TOUR ===");
        System.out.println();

        System.out.println(cliente);
        System.out.println();

        System.out.println(proveedor);
        System.out.println();

        System.out.println(guia);
    }
}