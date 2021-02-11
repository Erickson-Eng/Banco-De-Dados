package Campeonato;

public class PartidaDeBasquete {
    private Integer idPartida;
    private Integer idTimeCasa;
    private Integer idTimeFora;
    private String modalidade;
    private String dataJogo;

    public PartidaDeBasquete(Integer idPartida, Integer idTimeCasa, Integer idTimeFora, String modalidade, String dataJogo) {
        this.setIdPartida(idPartida);
        this.setIdTimeCasa(idTimeCasa);
        this.setIdTimeFora(idTimeFora);
        this.setModalidade(modalidade);
        this.setDataJogo(dataJogo);
    }

    public PartidaDeBasquete(Integer idPartida, Integer idTimeCasa, Integer idTimeFora, String modalidade) {
        this.setIdPartida(idPartida);
        this.setIdTimeCasa(idTimeCasa);
        this.setIdTimeFora(idTimeFora);
        this.setModalidade(modalidade);
    }

    public PartidaDeBasquete(Integer idPartida, Integer idTimeCasa, Integer idTimeFora) {
        this.setIdPartida(idPartida);
        this.setIdTimeCasa(idTimeCasa);
        this.setIdTimeFora(idTimeFora);
    }


    public void setModalidade(String modalidade) {
        Integer valorControle = Integer.parseInt(modalidade);

        switch (valorControle)
        {
            case 1:
                this.modalidade = "3x3";
                break;

            case 2:
                this.modalidade= "5x5";
                break;
        }



    }

    @Override
    public String toString() {
        return "PartidaBasquete{" +
                "idPartida='" + getIdPartida() + '\'' +
                ", idTimeCasa='" + getIdTimeCasa() + '\'' +
                ", idTimeFora='" + getIdTimeFora() + '\'' +
                ", modalidade='" + getModalidade() + '\'' +
                '}';
    }

    public Integer getIdPartida() {
        return idPartida;
    }

    public void setIdPartida(Integer idPartida) {
        this.idPartida = idPartida;
    }

    public Integer getIdTimeCasa() {
        return idTimeCasa;
    }

    public void setIdTimeCasa(Integer idTimeCasa) {
        this.idTimeCasa = idTimeCasa;
    }

    public Integer getIdTimeFora() {
        return idTimeFora;
    }

    public void setIdTimeFora(Integer idTimeFora) {
        this.idTimeFora = idTimeFora;
    }

    public String getModalidade() {
        return modalidade;
    }

    public String getDataJogo() {
        return dataJogo;
    }

    public void setDataJogo(String dataJogo) {

        String[] data = dataJogo.split("/");
        String novaData= data[2] +"/"+data[1]+"/"+data[0];
        this.dataJogo = novaData;
    }
}
