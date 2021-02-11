package Forms;

public class AtletaBasquete extends UserPF {
    private String posicao;
    private Double altura;
    private Double peso;
    private Integer idTime;
    private String nomeTime;


    public AtletaBasquete(Integer userID, String email, String nome, String sobreNome, String cpf, String dataDeNascimento, String posicao, Double altura, Double peso) {
        super(userID, email, nome, sobreNome, cpf, dataDeNascimento);
        this.setPosicao(posicao);
        this.setAltura(altura);
        this.setPeso(peso);
    }




    public String getPosicao() {
        return posicao;
    }

    public Double getAltura() {
        return altura;
    }

    public Double getPeso() {
        return peso;
    }

    public Integer getIdTime() {
        return idTime;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setIdTime(Integer idTime) {
        this.idTime = idTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    @Override
    public String toString() {
        return "AtletaBasquete{" +
                "posicao='" + posicao + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                ", idTime=" + idTime +
                ", nomeTime='" + nomeTime + '\'' +
                "} " + super.toString();
    }
}
