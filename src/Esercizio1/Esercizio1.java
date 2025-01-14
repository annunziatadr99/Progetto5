package Esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Esercizio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il numero di parole da inserire:");
        int N = scanner.nextInt();
        scanner.nextLine();

        Set<String> parole = new HashSet<>();
        Set<String> paroleDuplicate= new HashSet<>();

        System.out.println("Inserisci" + " " + N + " "+"Parole: ");
        for (int i = 0; i < N; i++) {
            String parola = scanner.nextLine();
            if (!parole.add(parola)) {
                paroleDuplicate.add(parola);
            }
        }

        System.out.println("Parole duplicate");
        for (String parola : paroleDuplicate){
            System.out.println(parola);
        }
        System.out.println("Numero di parole: " + parole.size());
        System.out.println("Elenco delle parole :");
        for (String parola : parole);{
            System.out.println(parole);
        }
        scanner.close();

    }
}
