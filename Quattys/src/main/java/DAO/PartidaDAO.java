package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import Campeonato.PartidaDeBasquete;
import Connection.ConnectionFactory;

public class PartidaDAO {

    public static int ultimoIDPartida() {
        int cont = 0;
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement("SELECT max(idPartida) from partida");
            rs = stmt.executeQuery();
            while (rs.next()) {
                if (cont < rs.getInt(1))
                    cont = rs.getInt(1);

            }

            return cont;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cont;
    }


    public void createPartida(PartidaDeBasquete p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        PreparedStatement stmt2 = null;
        PreparedStatement stmt3 = null;

        try {
            stmt = con.prepareStatement("INSERT INTO Partida(idPartida, modalidade, chaveE_idTimeCasa, chaveE_idTimeVisitante, dataJogo)values(?,?,?,?,?)");
            stmt.setInt(1, p.getIdPartida());
            stmt.setString(2, p.getModalidade());
            stmt.setInt(3, p.getIdTimeCasa());
            stmt.setInt(4, p.getIdTimeFora());
            stmt.setString(5,p.getDataJogo());


            stmt.executeUpdate();
//            stmt2 = con.prepareStatement("UPDATE Partida SET nomeTimeCasa = (SELECT nomeTime FROM TIME ) where (SELECT idTime from TIME ) = chaveE_idTimeCasa");
//            stmt3 = con.prepareStatement("UPDATE Partida SET nomeTimeCasa = (SELECT nomeTime FROM TIME ) where (SELECT idTime from TIME ) = chaveE_idTimeVisitante");
//            stmt2.executeUpdate();
//            stmt3.executeUpdate();

        } catch (SQLException ex) {

            Logger.getLogger(AtletaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }


    }



}

