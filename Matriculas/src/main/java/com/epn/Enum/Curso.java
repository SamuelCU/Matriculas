package com.epn.Enum;

public enum Curso {
    BASE_DE_DATOS("Base de Datos"),
    REDES_I("Redes I"),
    FUNDAMENTOS_DE_PROGRAMACION("Fundamentos de Programación");

    private final String nombre;

    Curso(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
