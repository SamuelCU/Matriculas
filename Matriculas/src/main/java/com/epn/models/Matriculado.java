package com.epn.models;

public class Matriculado {
    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private String Telefono;
    private int edad;
    private byte[] imagen;


    public Matriculado(String cedula, String nombre, String apellido, String direccion, String telefono, int edad, byte[] imagen) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        Telefono = telefono;
        this.edad = edad;
        this.imagen = imagen;
    }

}
