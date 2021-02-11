package Forms;

public class TimeDoAtleta {
    private Integer idAtleta;
    private Integer idTime;
    private String nomeTime;

    public TimeDoAtleta(Integer idAtleta, Integer idTime, String nomeTime) {
        this.setIdAtleta(idAtleta);
        this.setIdTime(idTime);
        this.setNomeTime(nomeTime);
    }

    public TimeDoAtleta(Integer idAtleta, Integer idTime) {
        this.idAtleta = idAtleta;
        this.idTime = idTime;
    }

    public Integer getIdAtleta() {
        return idAtleta;
    }

    public void setIdAtleta(Integer idAtleta) {
        this.idAtleta = idAtleta;
    }

    public Integer getIdTime() {
        return idTime;
    }

    public void setIdTime(Integer idTime) {
        this.idTime = idTime;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    @Override
    public String toString() {
        return "TimeDoAtleta{" +
                "idAtleta=" + idAtleta +
                ", idTime=" + idTime +
                ", nomeTime='" + nomeTime + '\'' +
                '}';
    }
}
