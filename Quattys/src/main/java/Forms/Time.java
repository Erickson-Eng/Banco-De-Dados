package Forms;

public class Time extends User{
    private String nome;
    private String cnpj;
    private String qtdAtletas;

    public Time(Integer userID, String email, String nome, String cnpj, String qtdAtletas) {
        super(userID, email);
        this.setNome(nome);
        this.setCnpj(cnpj);
        this.setQtdAtletas(qtdAtletas);
    }

    public Time(Integer userID, String email, String nome, String cnpj) {
        super(userID, email);
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getQtdAtletas() {
        return qtdAtletas;
    }

    public void setQtdAtletas(String qtdAtletas) {
        this.qtdAtletas = qtdAtletas;
    }
}
