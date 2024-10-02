import java.util.Scanner;
public class exercicio1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome ;
        do {
            System.out.println("insira seu nome ou s para sair");
            nome =sc.nextLine();
                if (nome.equals("s")){
                    System.out.println("fim do programa");}
            System.out.println("seu nome é: "+ nome);



        }while (!nome.equals("s"));




    }
}