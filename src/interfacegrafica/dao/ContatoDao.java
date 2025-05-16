/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacegrafica.dao;

import java.sql.Connection;
/**
 *
 * @author User
 */
public class ContatoDao {
        private final Connection conexao;

    public ContatoDao(){
        this.conexao = new ConexaoBD().getConnection();
    }
    public void adicionaContato(Contato contato) {
        String sql = "INSERT INTO Contato" + "(nome,telefone,email,dataNascimento,login,"
                
       
    }
}
