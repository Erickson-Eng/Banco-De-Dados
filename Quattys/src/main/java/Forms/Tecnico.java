package Forms;

public class Tecnico extends UserPF{
    private String eformado = null;
    private String formacao = null;


    public Tecnico(Integer userID, String email, String nome, String sobreNome, String cpf, String dataDeNascimento, String eformado, String formacao) {
        super(userID, email, nome, sobreNome, cpf, dataDeNascimento);
        this.setEformado(eformado);
        this.setFormacao(formacao);
    }

    public Tecnico(Integer userID, String email, String nome, String sobreNome, String cpf, String dataDeNascimento, String eformado) {
        super(userID, email, nome, sobreNome, cpf, dataDeNascimento);
        this.eformado = eformado;
    }

    public String getEformado() {
        return eformado;
    }

    public void setEformado(String eformado) {
        this.eformado = eformado;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "eformado='" + eformado + '\'' +
                ", formacao='" + formacao + '\'' +
                "} " + super.toString();
    }
}
