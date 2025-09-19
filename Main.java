
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        afficherMenuPrincipal();
    }



    private static void afficherMenuPrincipal() {
        boolean quitter = false;

        while (!quitter) {
            System.out.println("\n===== FinBank - Menu Principal =====");
            System.out.println("1. Se connecter en tant que Client");
            System.out.println("2. Se connecter en tant que Gestionnaire");
            System.out.println("0. Quitter");
            System.out.print("Choisissez une option : ");

            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    menuClient();
                    break;
                case 2:
                    menuGestionnaire();
                    break;
                case 0:
                    quitter = true;
                    System.out.println("Merci d'avoir utilisé FinBank. Au revoir !");
                    break;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        }
    }

    private static void menuClient() {
        boolean retour = false;

        while (!retour) {
            System.out.println("\n===== Menu Client =====");
            System.out.println("1. Consulter le solde");
            System.out.println("2. Effectuer un dépôt");
            System.out.println("3. Effectuer un retrait");
            System.out.println("4. Réaliser un virement");
            System.out.println("5. Consulter un relevé bancaire");
            System.out.println("0. Retour au menu principal");
            System.out.print("Choisissez une option : ");

            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 0:
                    retour = true;
                    break;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        }
    }

    private static void menuGestionnaire() {
        boolean retour = false;

        while (!retour) {
            System.out.println("\n===== Menu Gestionnaire =====");
            System.out.println("1. Créer un compte client");
            System.out.println("2. Modifier un compte");
            System.out.println("3. Clôturer un compte");
            System.out.println("4. Modifier un client");
            System.out.println("0. Retour au menu principal");
            System.out.print("Choisissez une option : ");

            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 0:
                    retour = true;
                    break;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        }
    }





}
