package com.example.registroalumnos;

public class Alumno {
    private String nombre,cuenta;
    private int imgAlumno, id;

    public Alumno() {
    }

    public Alumno(String nombre, String cuenta, int imgAlumno, int id) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.imgAlumno = imgAlumno;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public int getImgAlumno() {
        return imgAlumno;
    }

    public void setImgAlumno(int imgAlumno) {
        this.imgAlumno = imgAlumno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
