package com.company.entities;

import java.io.Serializable;

//POJO
//Plain Old Java Object
public class Persona implements Serializable {
    private static final long serialVersionUID = 3L;
    private long id;
    private String nombre;
    private String apellidos;

    public Persona() {
        super();
    }

    public Persona(long id, String nombre,String apellidos) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.apellidos=apellidos;
    }

    public Persona(Object[] resultado) {
        this((long)resultado[0], (String) resultado[1], (String) resultado[2]);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        long result = 1;
        result = prime * result + id;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        return (int) result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (id != other.id)
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Persona [id=" + id + ", nombre=" + nombre + "]";
    }

}
