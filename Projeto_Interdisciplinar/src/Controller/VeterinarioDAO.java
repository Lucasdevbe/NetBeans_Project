/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;








import java.sql.*;
import java.sql.SQLException;
import java.sql.PreparedStatement;

import model.Produtos;

/**
 *
 * @author silva
 */
public class VeterinarioDAO {
    
    public void Cadastro(Produtos Produtos) throws SQLException{
        
        String sql="insert into tbl_produto(produto,estoque,categoria,descricao,preco) values(?,?,?,?,?)";
        
        PreparedStatement st = null;
        
        
        Connection con=null;
        
        
         con=(Connection) new Conexao().getConnection();
        
       
        try {
            st=con.prepareStatement(sql);
            st.setString(1,Produtos.getProduto());
            st.setInt(2, Produtos.getEstoque());
            st.setString(3, Produtos.getCategoria());
            st.setString(4, Produtos.getDescricao());
            st.setDouble(5, Produtos.getPreco());
            st.execute();
            
        } catch (Exception e) {
            
                System.err.println("errrroooooo"+e);
        } finally {
            if(st!=null){
            st.close();
        }if(con!=null){
            st.close();
        }
        }
        
        
       
        
        
        
    }

   
}
