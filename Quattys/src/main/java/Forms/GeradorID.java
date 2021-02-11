package Forms;

import DAO.AtletaDAO;
import DAO.PartidaDAO;
import DAO.TecnicoDAO;
import DAO.TimeDAO;

public class GeradorID {
    private static Integer IDUSER = 2130000;
    private static Integer IDTTECNICO = 2120000;
    private static Integer IDTIME = 2110000;
    private static Integer IDPARTIDA = 216100;


    public Integer setIDUSERAtleta(){

        Integer iduser = IDUSER++;
        if (iduser <= AtletaDAO.ultimoIDAtleta()) {
            iduser = AtletaDAO.ultimoIDAtleta();
            iduser++;
        }
        return iduser;
    }
    public Integer setIDUSERTecnico(){
        Integer idTecnico = IDTTECNICO++;
        if (idTecnico <= TecnicoDAO.ultimoIDTecnico()){
            idTecnico = TecnicoDAO.ultimoIDTecnico();
            idTecnico++;
        }
        return idTecnico;
    }

    public Integer setIDUSERTime(){
        Integer idTime =IDTIME++;
        if (idTime <= TimeDAO.ultimoIDTime()){
            idTime = TimeDAO.ultimoIDTime();
            idTime++;
        }

        return idTime;
    }

    public Integer setIDPARTIDA(){
        Integer idPartida = IDPARTIDA++;
        if (idPartida <= PartidaDAO.ultimoIDPartida()){
            idPartida= PartidaDAO.ultimoIDPartida();
            idPartida++;
        }

        return idPartida;
    }
}
