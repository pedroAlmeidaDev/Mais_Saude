
package Model;

import Model.*;
import Controller.*;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PessoaDao {
    
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = "";
    
    public void salvar(Pessoa p) {
		con = Conexao.conectaBanco();
		sql = "insert into pessoa(nome, idade, altura, peso, imc) values (?, ?, ?, ?, ?);";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, p.getNome());
			ps.setInt(2, p.getIdade());
                        ps.setDouble(3, p.getAltura());
                        ps.setInt(4, p.getPeso());
                        ps.setInt(5, p.getImc());
			ps.execute();
			JOptionPane.showMessageDialog(null, "Salvo com Sucesso!!");
		}catch (HeadlessException | SQLException erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
    }
    
    public Pessoa pesquisarId(Integer id) {
		con = Conexao.conectaBanco();
		sql = "select * from pessoa where id = "+id+";";
		
		Pessoa pessoa=null;
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				pessoa = new Pessoa();
				pessoa.setId(rs.getInt("id"));
                                pessoa.setNome(rs.getString("nome"));
                                pessoa.setIdade(rs.getInt("idade"));
                                pessoa.setAltura(rs.getDouble("altura"));
                                pessoa.setPeso(rs.getInt("peso"));
                                pessoa.setImc(rs.getInt("imc"));
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao Listar !!");
		}
		return pessoa;
	}
    
    public List<Pessoa> listar(String nome) throws SQLException{
        List<Pessoa> pessoas = new ArrayList<>();
        con = Conexao.conectaBanco();
        String comando = "SELECT * FROM pessoa where nome like '"+nome+"%' limit 10";
        ps = con.prepareStatement(comando);
        rs = ps.executeQuery();
        while (rs.next()) {            
            Pessoa pessoa = new Pessoa();
            pessoa.setId(rs.getInt("id"));
            pessoa.setNome(rs.getString("nome"));
            pessoa.setIdade(rs.getInt("idade"));
            pessoa.setAltura(rs.getDouble("altura"));
            pessoa.setPeso(rs.getInt("peso"));
            pessoa.setImc(rs.getInt("imc"));
            pessoas.add(pessoa);
        }
        return pessoas;
    
    }
    
    public void alterar(Pessoa p) {
		con = Conexao.conectaBanco();
		sql = "update pessoa set nome = ?, idade = ?, altura = ?, peso = ?, imc = ? where id = ?;";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, p.getNome());
			ps.setInt(2, p.getIdade());
                        ps.setDouble(3, p.getAltura());
                        ps.setInt(4, p.getPeso());
                        ps.setInt(5, p.getImc());
                        ps.setInt(6, p.getId());
			ps.execute();
			JOptionPane.showMessageDialog(null, "Alterado com Sucesso!!");
		}catch (HeadlessException | SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao Salvar!!");
		}
    }
    
    public void excluir(Pessoa p) {
		con = Conexao.conectaBanco();
		sql = "delete from pessoa where id = ?;";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, p.getId());
			ps.execute();
			JOptionPane.showMessageDialog(null, "Excluido com Sucesso!!");
		} catch (HeadlessException | SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao excluir !!");
		}
	}
}
