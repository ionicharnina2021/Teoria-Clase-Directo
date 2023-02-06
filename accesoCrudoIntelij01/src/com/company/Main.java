package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
        String URL_BASEDATOS = "jdbc:mysql://localhost:3306/ejemplo";
        try {
            Class.forName(CONTROLADOR);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection conexion = null;
        try {
            conexion= DriverManager.getConnection(URL_BASEDATOS,"root","");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        //Creamos un Statement que sirve para enviar sqls
        Statement instruccion = null;
        ResultSet conjuntoResultados=null;
        try {
            instruccion=conexion.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            conjuntoResultados=instruccion.executeQuery("SELECT * FROM Materias");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        //A lo primero que quiero acceder es a lso metadatos
        ResultSetMetaData metaDatos = null;
        try {
            metaDatos = conjuntoResultados.getMetaData();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        int numeroDeColumnas=0;
        try {
            numeroDeColumnas=metaDatos.getColumnCount();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        //escribiendo los metadatos de la columna
        for (int i = 1; i <= numeroDeColumnas; i++) {
            try {
                System.out.printf("%-8s\t", metaDatos.getColumnName(i));
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        //Acceder a los datos crudos
        System.out.println();
        try {
            while(conjuntoResultados.next()) {
                for (int i = 1; i <= numeroDeColumnas; i++) {
                    //como no sabe lo que hay en cada campo lo lleva a Object
                    System.out.printf("%-8s\t", conjuntoResultados.getObject(i));
                }
                System.out.println();
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
