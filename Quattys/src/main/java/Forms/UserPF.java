package Forms;

public class UserPF extends User {
    private String nome;
    private String sobreNome;
    private String cpf;
    private String dataDeNascimento;

    public UserPF(Integer userID, String email, String nome, String sobreNome, String cpf, String dataDeNascimento) {
        super(userID, email);
        this.setNome(nome);
        this.setSobreNome(sobreNome);
        this.setCpf(cpf);
        this.setDataDeNascimento(dataDeNascimento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {

        String[] data = dataDeNascimento.split("/");
        String novaData= data[2] +"/"+data[1]+"/"+data[0];
        this.dataDeNascimento = novaData;
    }
}
