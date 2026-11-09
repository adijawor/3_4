import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbe cakowitą nieujemną do obliczenia silni: ");
        int n = scanner.nextInt(); 

        if (n < 0) {
             System.out.println("Bląd: Silnia jest zdefinowana tylko dla liczbb nieujemnych.");
        } else {
          long silnia = 1;  
            for (int i = 0; i <= n; i++) {
                silnia*= i;
            }

            System.out.println(n + "! = " + silnia);
            }

        scanner.close();
        }

       
                     
    }
