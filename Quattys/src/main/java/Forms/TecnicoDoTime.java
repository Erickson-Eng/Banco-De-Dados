package Forms;

public class TecnicoDoTime {
    private Integer idTime;
    private Integer idTecnico;
    private String nomeTecnico;

    public TecnicoDoTime(Integer idTime, Integer idTecnico, String nomeTecnico) {
        this.setIdTime(idTime);
        this.setIdTecnico(idTecnico);
        this.setNomeTecnico(nomeTecnico);
    }


    public Integer getIdTime() {
        return idTime;
    }

    public void setIdTime(Integer idTime) {
        this.idTime = idTime;
    }

    public Integer getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(Integer idTecnico) {
        this.idTecnico = idTecnico;
    }

    public String getNomeTecnico() {
        return nomeTecnico;
    }

    public void setNomeTecnico(String nomeTecnico) {
        this.nomeTecnico = nomeTecnico;
    }
}
