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
        String sql = "INSERT INTO Contato" + "(nome,telefone,email,dataNascimento,login,senha)" + "VALUES (\,\,\,\,\,\,)";
        
        
     try{
         PreparedStatement ps = conexao.prepareStatement(sql);
         ps.setString(1,contato.getNome());
         ps.setString(2,contato.getTelefone());
         ps.setString(3,contato.getEmail());
         ps.setString(4,contato.getDataNascimento());
         ps.setString(5,contato.getLogin());
         ps.setString(6,contato.getSenha());
         ps.execute();
         ps.close();
     }
     catch (SQLException e){
         throw new RuntimeException(e);
         
     }
       
    }
}
