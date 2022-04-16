
package Model;

import Controller.Conexao;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ExercicioDao {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = "";
    
    public void salvar(Exercicio ex) {
		con = Conexao.conectaBanco();
		sql = "insert into exercicio(nome, partcorpo, repet, serie) values (?, ?, ?, ?);";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, ex.getNome());
			ps.setString(2, ex.getPartCorpo());
                        ps.setInt(3, ex.getRepet());
                        ps.setInt(4, ex.getSerie());
			ps.execute();
			JOptionPane.showMessageDialog(null, "Salvo com Sucesso!!");
		}catch (HeadlessException | SQLException erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
    }
    
    public Exercicio pesquisarId(Integer id) {
		con = Conexao.conectaBanco();
		sql = "select * from exercicio where id = "+id+";";
		
		Exercicio exercicio=null;
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				exercicio = new Exercicio();
				exercicio.setId(rs.getInt("id"));
                                exercicio.setNome(rs.getString("nome"));
                                exercicio.setPartCorpo(rs.getString("partcorpo"));
                                exercicio.setRepet(rs.getInt("repet"));
                                exercicio.setSerie(rs.getInt("serie"));
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao Listar !!");
		}
		return exercicio;
	}
    
    public void alterar(Exercicio ex) {
		con = Conexao.conectaBanco();
		sql = "update exercicio set nome = ?, partcorpo = ?, repet = ?; serie = ?;";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, ex.getNome());
			ps.setString(2, ex.getPartCorpo());
                        ps.setInt(3, ex.getRepet());
                        ps.setInt(4, ex.getSerie());
			ps.execute();
			JOptionPane.showMessageDialog(null, "Alterado com Sucesso!!");
		}catch (HeadlessException | SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao Salvar!!");
		}
    }
    
    public void excluir(Exercicio ex) {
		con = Conexao.conectaBanco();
		sql = "delete from exercicio where id = ?;";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, ex.getId());
			ps.execute();
			JOptionPane.showMessageDialog(null, "Excluido com Sucesso!!");
		} catch (HeadlessException | SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao excluir !!");
		}
	}
    
    public List<Exercicio> listar(String nome) throws SQLException{
        List<Exercicio> exercicios = new ArrayList<>();
        con = Conexao.conectaBanco();
        String comando = "SELECT * FROM exercicio where nome like '"+nome+"%' limit 10";
        ps = con.prepareStatement(comando);
        rs = ps.executeQuery();
        while (rs.next()) {            
            Exercicio exercicio = new Exercicio();
            exercicio.setId(rs.getInt("id"));
            exercicio.setNome(rs.getString("nome"));
            exercicio.setPartCorpo(rs.getString("partcorpo"));
            exercicio.setRepet(rs.getInt("repet"));
            exercicio.setSerie(rs.getInt("serie"));
            exercicios.add(exercicio);
        }
        return exercicios;  
    }
}
