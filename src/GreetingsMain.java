import java.util.Scanner;


public class GreetingsMain {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] names = new String[5];

        int i = 0;

        while (i<names.length){
            System.out.println("Podaj Imię");
            String name = input.nextLine();
            names[i] = name;
            i++;
        }
        int j = 0;
        int k = 1;
        while (j < names.length){
            System.out.println("Cześć " + names[names.length-k]);
           j++;
           k++;

        }



    }

}
