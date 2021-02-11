package View;

import Campeonato.PartidaDeBasquete;
import DAO.AtletaDAO;
import DAO.PartidaDAO;
import DAO.TecnicoDAO;
import DAO.TimeDAO;
import Forms.*;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class TextualGUI {


    public static void interfaceGrafica(){
        Integer sair = 0;
        while (sair!=9){
            String email,nome, sobreNome, cpf,data,posicao;
            String eformado,formacao, cnpj;
            Double peso,altura;
            Integer idUser;
            Integer idTime;


            System.out.println("Escolha uma das opções a baixo de acordo com numero informado");
            System.out.println();
            System.out.println("--------------------------------------------------------------");
            System.out.println("1 - Cadastro de Atleta");
            System.out.println("2 - Cadastro de Time");
            System.out.println("3 - Cadastro de Técnico");
            System.out.println("4 - Atribuir time a um Atleta");
            System.out.println("5 - Atualizar Técnico do time");
            System.out.println("6 - Cria uma partida de basquete");
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Informe o valor desejado: ");
            sair = Integer.parseInt(scanner.nextLine());
            GeradorID novoGerador = new GeradorID();
            switch (sair){

                case 1:


                    try {
                        AtletaBasquete atletaBasquete;
                        System.out.printf("Informe seu nome: ");
                        nome = scanner.nextLine();
                        System.out.printf("Informe seu sobreNome: ");
                        sobreNome = scanner.nextLine();
                        System.out.printf("Informe seu email: ");
                        email = scanner.nextLine();
                        System.out.printf("Informe seu CPF: ");
                        cpf = scanner.nextLine();
                        System.out.printf("Informe seu Data de Nascimento: ");
                        data = scanner.nextLine();
                        System.out.printf("Informe seu Altura: ");
                        altura = Double.parseDouble(scanner.nextLine());
                        System.out.printf("Informe seu Peso: ");
                        peso = Double.parseDouble(scanner.nextLine());
                        System.out.println("Insira o numero de sua posição:  1-Armador, 2-Ala Armador, 3-Ala, 4-Ala Pivo, 5-Pivo");
                        System.out.printf("Informe seu Posicao: ");

                        posicao = scanner.nextLine();

                        atletaBasquete = new AtletaBasquete(novoGerador.setIDUSERAtleta(),email,nome,sobreNome,cpf,data,posicao,altura,peso);
                        AtletaDAO atletaDAO = new AtletaDAO();
                        atletaDAO.createAtletav2(atletaBasquete);
                        break;

                    }
                    catch (IllegalStateException e){
                        e.printStackTrace();
                    }catch ( NumberFormatException numberFormatException){
                        numberFormatException.printStackTrace();
                        System.err.println("Use o ponto final como separador");

                    }




                case 2:

                    try {
                        System.out.printf("Informe nome do time: ");
                        nome = scanner.nextLine();
                        System.out.printf("Informe email do time: ");
                        email = scanner.nextLine();
                        System.out.printf("Informe seu CNPJ: ");
                        cnpj = scanner.nextLine();

                        Time timeBasquete = new Time(novoGerador.setIDUSERTime(), email,nome,cnpj);
                        TimeDAO timeDAO = new TimeDAO();
                        timeDAO.createTimeV1(timeBasquete);
                        break;
                    }
                    catch (NoSuchElementException e){
                        e.printStackTrace();

                    }


                case 3:
                    try{
                        System.out.println("3 - Cadastro de Tecnico");

                        System.out.printf("Informe seu nome: ");
                        nome = scanner.nextLine();
                        System.out.printf("Informe seu sobrenome: ");
                        sobreNome= scanner.nextLine();
                        System.out.printf("Informe seu email: ");
                        email= scanner.nextLine();
                        System.out.printf("Informe seu CPF: ");
                        cpf= scanner.nextLine();
                        System.out.printf("Informe seu Data de Nascimento: ");
                        data = scanner.nextLine();
                        System.out.printf("Informe se você é formado com sim ou não: ");
                        eformado = scanner.nextLine();
                        Tecnico tecnico = new Tecnico(novoGerador.setIDUSERTecnico(),email,nome,sobreNome,cpf,data,eformado);
                        TecnicoDAO tecnicoDAO = new TecnicoDAO();


                        tecnicoDAO.createTecnico(tecnico);
                        break;
                    }
                    catch (NoSuchElementException e){
                        e.printStackTrace();
                    }





                case 4:
                    try {
                        System.out.println();
                        System.out.println("4 - Atribuir time a um Atleta");
                        AtletaDAO atletaDAO = new AtletaDAO();
                        System.out.printf("Informe id do atleta que deseja atualizar: ");
                        idUser = Integer.parseInt(scanner.nextLine());
                        System.out.printf("Informe id do time que deseja incluir: ");
                        idTime = Integer.parseInt(scanner.nextLine());
                        System.out.printf("Informe nome do time para atualizar: ");
                        nome = scanner.nextLine();
                        TimeDoAtleta timeDoAtleta = new TimeDoAtleta(idUser, idTime, nome);
                        atletaDAO.updateTime(timeDoAtleta);
                        break;
                    }
                    catch (NoSuchElementException e){
                        e.printStackTrace();
                    }

                case 5:

                    try {
                        System.out.println();

                        TimeDAO timeDAO1 = new TimeDAO();

                        System.out.println("5 - Atualizar Técnico do time");

                        System.out.printf("Informe id do time que deseja atualizar: ");
                        idTime = Integer.parseInt(scanner.nextLine());
                        System.out.printf("Informe id do Tecnico que deseja incluir: ");
                        idUser = Integer.parseInt(scanner.nextLine());
                        System.out.printf("Informe nome do Tecnico para atualizar: ");
                        nome = scanner.nextLine();
                        TecnicoDoTime tecnicoDoTime = new TecnicoDoTime(idTime, idUser, nome);
                        timeDAO1.updateTimeTecnico(tecnicoDoTime);
                        break;
                    }
                    catch (NoSuchElementException e){
                        e.printStackTrace();
                    }

                case 6:
                    try {
                        PartidaDAO partidaDAO = new PartidaDAO();

                        System.out.println("Insira os dados da partida");

                        System.out.printf("Informe id do Time de casa:  ");
                        idTime = Integer.parseInt(scanner.nextLine());
                        System.out.printf("Informe id do Time visitante: ");
                        idUser = Integer.parseInt(scanner.nextLine());
                        System.out.printf("Informe a modalidade, sendo 1 para 3x3 e 2 para 5x5: ");
                        nome = scanner.nextLine();
                        System.out.printf("Informe a data do jogo separado por '/' :");
                        data = scanner.nextLine();
                        PartidaDeBasquete partida = new PartidaDeBasquete(novoGerador.setIDPARTIDA(), idTime, idUser, nome, data);
                        partidaDAO.createPartida(partida);
                        break;
                    }
                    catch (NoSuchElementException e){
                        e.printStackTrace();
                    }
            }

        }

    }
}