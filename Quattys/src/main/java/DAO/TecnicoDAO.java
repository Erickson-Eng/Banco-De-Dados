package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import Connection.ConnectionFactory;
import Forms.AtletaBasquete;
import Forms.Tecnico;

public class TecnicoDAO {


    public static int ultimoIDTecnico(){
        int cont = 0;
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try{
            stmt = con.prepareStatement("SELECT max(idTecnico) from Tecnico");
            rs = stmt.executeQuery();
            while (rs.next()){
                if (cont < rs.getInt(1))
                    cont = rs.getInt(1);

            }

            return cont;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cont;
    }
    public void createTecnico(Tecnico a) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO tecnico(idTecnico,email, nome, sobreNome, cpf,dataDeNascimento,eformado)values(?,?,?,?,?,?,?)");
            stmt.setInt(1, a.getUserID());
            stmt.setString(2, a.getEmail());
            stmt.setString(3, a.getNome());
            stmt.setString(4, a.getSobreNome());
            stmt.setString(5, a.getCpf());
            stmt.setString(6, a.getDataDeNascimento());
            stmt.setString(7, a.getEformado());



            stmt.executeUpdate();


        } catch (SQLException ex) {

            Logger.getLogger(TecnicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

}
