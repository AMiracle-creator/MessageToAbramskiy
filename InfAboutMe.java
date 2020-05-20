package ToAbr;

import java.util.Scanner;

public class InfAboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the command to get information");
        String s = scanner.next();
        switch (s) {
            case "!name": {
                System.out.println("Amir");
                break;
            }
            case "!surname": {
                System.out.println("Gaynullin");
                break;
            }
            case  "!age": {
                System.out.println("18");
                break;
            }
            case "!moreInfo": {
                System.out.println("Born in Kazan, studying at ITIS as a programmer");
                break;
            }
            case "!commands": {
                System.out.println("!name | !surname | !age | !moreInfo | !commands");
                break;
            }
            default: {
                System.out.println("This command does not exist. Enter (!commands) to see all possible commands");
            }
        }
    }
}
