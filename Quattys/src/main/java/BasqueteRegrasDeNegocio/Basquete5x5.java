package BasqueteRegrasDeNegocio;

public class Basquete5x5 extends Basquete{

    private Integer arremessos3Convertidos;
    private Integer arremessos3NaoConvertidos;


    public Basquete5x5(Integer arremessosConvertidos, Integer lancesLivresConvertidos, Integer arremessosNaoConvertidos, Integer lancesLivresNaoConvertidos, Integer arremessos3Convertidos, Integer arremessos3NaoConvertidos) {
        super(arremessosConvertidos, lancesLivresConvertidos, arremessosNaoConvertidos, lancesLivresNaoConvertidos);
        this.arremessos3Convertidos = arremessos3Convertidos;
        this.arremessos3NaoConvertidos = arremessos3NaoConvertidos;
    }

    public Basquete5x5(Integer arremessosConvertidos, Integer lancesLivresConvertidos, Integer numeroDeFaltas, Integer numeroDeTocos, Integer numeroDeAssitencias, Integer numeroDeRebotes, Integer arremessosNaoConvertidos, Integer lancesLivresNaoConvertidos, Integer arremessos3Convertidos, Integer arremessos3NaoConvertidos) {
        super(arremessosConvertidos, lancesLivresConvertidos, numeroDeFaltas, numeroDeTocos, numeroDeAssitencias, numeroDeRebotes, arremessosNaoConvertidos, lancesLivresNaoConvertidos);
        this.arremessos3Convertidos = arremessos3Convertidos;
        this.arremessos3NaoConvertidos = arremessos3NaoConvertidos;
    }

    public Integer getArremessos3Convertidos() {
        return arremessos3Convertidos;
    }

    public void setArremessos3Convertidos(Integer arremessos3Convertidos) {
        this.arremessos3Convertidos = arremessos3Convertidos;
    }

    public Integer getArremessos3NaoConvertidos() {
        return arremessos3NaoConvertidos;
    }

    public void setArremessos3NaoConvertidos(Integer arremessos3NaoConvertidos) {
        this.arremessos3NaoConvertidos = arremessos3NaoConvertidos;
    }


    @Override
    public void setTotalPoints() {
        Integer a,b,c;
        a = getArremessosConvertidos();
        b = getArremessos3Convertidos();
        c = getLancesLivresConvertidos();
        super.totalPontos = ((a*2)+ (b*3)+ c);
    }

    @Override
    public String toString() {
        return "Basquete5x5{" +
                "totalPontos=" + getTotalPontos() +
                ", arremessosConvertidos=" + getArremessosConvertidos() +
                ", lancesLivresConvertidos=" + getLancesLivresConvertidos() +
                ", numeroDeFaltas=" + getNumeroDeFaltas() +
                ", numeroDeTocos=" + getNumeroDeTocos() +
                ", numeroDeAssitencias=" + getNumeroDeAssitencias() +
                ", numeroDeRebotes=" + getNumeroDeRebotes() +
                ", arremessosNaoConvertidos=" + getArremessosNaoConvertidos() +
                ", lancesLivresNaoConvertidos=" + getLancesLivresNaoConvertidos() +
                "totalPontos=" + getTotalPontos() +
                ", arremessos3Convertidos=" + arremessos3Convertidos +
                ", arremessos3NaoConvertidos=" + arremessos3NaoConvertidos +
                '}';
    }
}
