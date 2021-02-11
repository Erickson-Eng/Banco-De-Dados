package DAO;

import Forms.AtletaBasquete;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Connection.ConnectionFactory;
import Forms.TimeDoAtleta;

public class AtletaDAO {


    public void createAtletav1(AtletaBasquete a) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO Atleta(idAtleta, nome, sobreNome, email, posicao)values(?,?,?,?,?)");
            stmt.setInt(1, a.getUserID());
            stmt.setString(2, a.getEmail());
            stmt.setString(3, a.getNome());
            stmt.setString(4, a.getSobreNome());
            stmt.setString(5, a.getPosicao());

            stmt.executeUpdate();


        } catch (SQLException ex) {

            Logger.getLogger(AtletaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public void createAtletav2(AtletaBasquete a) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO Atleta(idAtleta,email, nome, sobreNome, cpf,dataDeNascimento,peso,altura, posicao)values(?,?,?,?,?,?,?,?,?)");
            stmt.setInt(1, a.getUserID());
            stmt.setString(2, a.getEmail());
            stmt.setString(3, a.getNome());
            stmt.setString(4, a.getSobreNome());
            stmt.setString(5, a.getCpf());

            stmt.setString(6, a.getDataDeNascimento());
            stmt.setDouble(7, a.getPeso());
            stmt.setDouble(8, a.getAltura());
            stmt.setString(9, a.getPosicao());

            stmt.executeUpdate();


        } catch (SQLException ex) {

            Logger.getLogger(AtletaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public void updateTime(TimeDoAtleta t) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
// é necessario fazer sobrecarga do metodo para inibir de colocar um nome de time diferente
        try {
            stmt = con.prepareStatement("UPDATE Atleta SET idTime= ?, nomeTime = ? where idAtleta = ?;");
            stmt.setInt(1, t.getIdTime());
            stmt.setString(2,t.getNomeTime());
            stmt.setInt(3,t.getIdAtleta() );



            stmt.executeUpdate();


        } catch (SQLException ex) {

            Logger.getLogger(AtletaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }


    public static int ultimoIDAtleta(){
        int cont = 0;
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try{
            stmt = con.prepareStatement("SELECT max(idAtleta) from Atleta");
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
}

