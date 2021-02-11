package DAO;

import Forms.TecnicoDoTime;
import Forms.Time;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Connection.ConnectionFactory;
import Connection.ConnectionFactory;
import Forms.TimeDoAtleta;

public class TimeDAO {

    public void createTimeV1(Time a) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO Time(idTime,email, nomeTime,cnpj)values(?,?,?,?)");
            stmt.setInt(1, a.getUserID());
            stmt.setString(2, a.getEmail());
            stmt.setString(3, a.getNome());
            stmt.setString(4, a.getCnpj());


            stmt.executeUpdate();


        } catch (SQLException ex) {

            Logger.getLogger(AtletaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public static int ultimoIDTime() {
        int cont = 0;
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement("SELECT max(idTime) from Time");
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


    public void updateTimeTecnico(TecnicoDoTime t) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
// é necessario fazer sobrecarga do metodo para inibir de colocar um nome de time diferente
        try {
            stmt = con.prepareStatement("UPDATE Time SET tecnicoTime= ?, chaveE_Tecnico = ? where idTime = ?;");
            stmt.setInt(3, t.getIdTime());
            stmt.setString(1, t.getNomeTecnico());
            stmt.setInt(2, t.getIdTecnico());


            stmt.executeUpdate();


        } catch (SQLException ex) {

            Logger.getLogger(AtletaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
