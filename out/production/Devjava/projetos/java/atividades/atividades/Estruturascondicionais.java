package projetos.java.atividades;

import java.util.Scanner;
public class Estruturascondicionais {
    public static void main(String[] args) {


        //Usar Switch e variavel condicional
        //so usado quando for char, int , byte, enum , String
        //Vou utilizar tbm o scanner uma classe que le dados



        Scanner sc = new Scanner(System.in);
        System.out.println("qual dia voce escolhe:");
        int dia = sc.nextInt();
        switch (dia) {

            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("sabado");
                break;
            case 3:
                System.out.println("seg");
                break;
            case 4:
                System.out.println("terc");
                break;
            case 5:
                System.out.println("quat");
                break;
            case 6:
                System.out.println("quint");
                break;
            case 7:
                System.out.println("sext");
                break;
            default:
                System.out.println("erro");
        }
    }
}