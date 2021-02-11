package BasqueteRegrasDeNegocio;

public class Basquete {
    protected Integer totalPontos;
    private Integer arremessosConvertidos;
    private Integer lancesLivresConvertidos;
    private Integer numeroDeFaltas;
    private Integer numeroDeTocos;
    private Integer numeroDeAssitencias;
    private Integer numeroDeRebotes;
    // numeros nao convertidos
    private Integer arremessosNaoConvertidos;
    private Integer lancesLivresNaoConvertidos;


    public Basquete(Integer arremessosConvertidos, Integer lancesLivresConvertidos, Integer arremessosNaoConvertidos, Integer lancesLivresNaoConvertidos) {
        this.setArremessosConvertidos(arremessosConvertidos);
        this.setLancesLivresConvertidos(lancesLivresConvertidos);
        this.setArremessosNaoConvertidos(arremessosNaoConvertidos);
        this.setLancesLivresNaoConvertidos(lancesLivresNaoConvertidos);
    }

    public Basquete(Integer arremessosConvertidos, Integer lancesLivresConvertidos, Integer numeroDeFaltas, Integer numeroDeTocos, Integer numeroDeAssitencias, Integer numeroDeRebotes, Integer arremessosNaoConvertidos, Integer lancesLivresNaoConvertidos) {
        this.arremessosConvertidos = arremessosConvertidos;
        this.lancesLivresConvertidos = lancesLivresConvertidos;
        this.numeroDeFaltas = numeroDeFaltas;
        this.numeroDeTocos = numeroDeTocos;
        this.numeroDeAssitencias = numeroDeAssitencias;
        this.numeroDeRebotes = numeroDeRebotes;
        this.arremessosNaoConvertidos = arremessosNaoConvertidos;
        this.lancesLivresNaoConvertidos = lancesLivresNaoConvertidos;
    }

    public Integer getTotalPontos() {
        return totalPontos;
    }

    public void setTotalPoints(){
        Integer a,b;
        a = getArremessosConvertidos();
        b = getLancesLivresConvertidos();
        this.totalPontos = ((a*2)+b);
    }

    public Integer getArremessosConvertidos() {
        return arremessosConvertidos;
    }

    public void setArremessosConvertidos(Integer arremessosConvertidos) {
        this.arremessosConvertidos = arremessosConvertidos;
    }

    public Integer getLancesLivresConvertidos() {
        return lancesLivresConvertidos;
    }

    public void setLancesLivresConvertidos(Integer lancesLivresConvertidos) {
        this.lancesLivresConvertidos = lancesLivresConvertidos;
    }

    public Integer getNumeroDeFaltas() {
        return numeroDeFaltas;
    }

    public void setNumeroDeFaltas(Integer numeroDeFaltas) {
        this.numeroDeFaltas = numeroDeFaltas;
    }

    public Integer getNumeroDeTocos() {
        return numeroDeTocos;
    }

    public void setNumeroDeTocos(Integer numeroDeTocos) {
        this.numeroDeTocos = numeroDeTocos;
    }

    public Integer getNumeroDeAssitencias() {
        return numeroDeAssitencias;
    }

    public void setNumeroDeAssitencias(Integer numeroDeAssitencias) {
        this.numeroDeAssitencias = numeroDeAssitencias;
    }

    public Integer getNumeroDeRebotes() {
        return numeroDeRebotes;
    }

    public void setNumeroDeRebotes(Integer numeroDeRebotes) {
        this.numeroDeRebotes = numeroDeRebotes;
    }

    public Integer getArremessosNaoConvertidos() {
        return arremessosNaoConvertidos;
    }

    public void setArremessosNaoConvertidos(Integer arremessosNaoConvertidos) {
        this.arremessosNaoConvertidos = arremessosNaoConvertidos;
    }

    public Integer getLancesLivresNaoConvertidos() {
        return lancesLivresNaoConvertidos;
    }

    public void setLancesLivresNaoConvertidos(Integer lancesLivresNaoConvertidos) {
        this.lancesLivresNaoConvertidos = lancesLivresNaoConvertidos;
    }

    @Override
    public String toString() {
        return "Basquete{" +
                "totalPontos=" + getTotalPontos() +
                ", arremessosConvertidos=" + getArremessosConvertidos() +
                ", lancesLivresConvertidos=" + getLancesLivresConvertidos() +
                ", numeroDeFaltas=" + getNumeroDeFaltas() +
                ", numeroDeTocos=" + getNumeroDeTocos() +
                ", numeroDeAssitencias=" + getNumeroDeAssitencias() +
                ", numeroDeRebotes=" + getNumeroDeRebotes() +
                ", arremessosNaoConvertidos=" + getArremessosNaoConvertidos() +
                ", lancesLivresNaoConvertidos=" + getLancesLivresNaoConvertidos() +
                '}';
    }

    public void setTotalPontos(Integer totalPontos) {
        this.totalPontos = totalPontos;
    }


}
