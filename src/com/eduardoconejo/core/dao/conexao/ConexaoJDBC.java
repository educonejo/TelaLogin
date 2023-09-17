/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eduardoconejo.core.dao.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoJDBC {

    private static final String URL = "jdbc:mysql://localhost:3306/mapa";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    private static Connection conn;

    public static Connection getConexao() {
        try {
            if (conn == null) {
                conn = DriverManager.getConnection(URL, USER, PASSWORD);
                return conn;
            } else {
                return conn;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Houve um erro ao conectar o Banco de Dados");
            return null;
        }
    }

    public static void closeConnection(Connection conn, PreparedStatement stmt) {

    }
}
