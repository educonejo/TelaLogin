/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eduardoconejo.core.dao;

import com.eduardoconejo.core.dao.conexao.ConexaoJDBC;
import com.eduardoconejo.core.entity.Usuario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class UsuarioDAO {

    public void inserir(Usuario usuario) {
        String sql = "INSERT INTO USUARIO(NOME, LOGIN, SENHA, EMAIL) VALUES (?,?,?,?)";

        PreparedStatement ps;

        try {
            ps = ConexaoJDBC.getConexao().prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getLogin());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getEmail());

            ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Usuario buscarUsuarioPorLoginSenha(String username, String password) throws Exception {
        String query = "SELECT id, nome, login, senha, email from usuario where login = ? and senha = ?";       //``````
        Connection connection = ConexaoJDBC.getConexao();
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet resultSet = pstmt.executeQuery();
            Usuario usuario = null;
            if (resultSet != null) {
                while (resultSet.next()) {
                    usuario = new Usuario();
                    usuario.setId(resultSet.getLong("id"));
                    usuario.setNome(resultSet.getString("nome"));
                    usuario.setLogin(resultSet.getString("login"));
                    usuario.setSenha(resultSet.getString("senha"));
                    usuario.setEmail(resultSet.getString("email"));
                }
            }
            return usuario;
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }
    }
}
