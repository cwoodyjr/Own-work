import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static void  main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("How many characters would you like the password to be?");
            int passwordLength = scanner.nextInt();
            String randomPassword = "";

            

            for(int i = 0; i < passwordLength; i++){
                randomPassword += generatePassword();
            }
            System.out.println(randomPassword);
        }

        
        
    }

    private static char generatePassword(){
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = upper.toLowerCase();
        String digits = "1234567890";
        String characters = "<>,./?#!$^&*~@";
        String combinedCharacters = upper+lower+digits+characters;

        Random random = new Random();

        char randomChar = combinedCharacters.charAt(random.nextInt(combinedCharacters.length()));

        return randomChar;
    }
}