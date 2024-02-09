package com.enaa.apprenantmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Apprenants> listeApprenants = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            afficherMenu();
            System.out.print("Choix : ");
            int choix = scanner.nextInt();
            scanner.nextLine(); // Pour consommer la ligne vide

            switch (choix) {
                case 1:
                    ajouterApprenant(listeApprenants, scanner);
                    break;
                case 2:
                    modifierApprenants(listeApprenants, scanner);
                    break;
                case 3:
                    supprimerApprenant(listeApprenants, scanner);
                    break;
                case 4:
                    consulterListeApprenants(listeApprenants);
                    break;
                case 5:
                    rechercherApprenant(listeApprenants, scanner);
                    break;
                case 6:
                    System.out.println("Fin du programme.");
                    return;
                default:
                    System.out.println("Choix invalide. Veuillez choisir une option valide.");
            }
        }
    }

    public static void afficherMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Ajouter un nouvel apprenant");
        System.out.println("2. Modifier les informations d'un apprenant existant");
        System.out.println("3. Supprimer un apprenant existant");
        System.out.println("4. Consulter la liste des apprenants");
        System.out.println("5. Rechercher un apprenant par nom et prénom");
        System.out.println("6. Quitter");
    }

    public static void ajouterApprenant(List<Apprenants> listeApprenants, Scanner scanner) {
        System.out.println("Ajout d'un nouvel apprenant :");

        System.out.print("Nom : ");
        String nom = scanner.nextLine();

        System.out.print("Prénom : ");
        String prenom = scanner.nextLine();

        System.out.print("Date de naissance (jj/mm/aaaa) : ");
        String dateNaissanceStr = scanner.nextLine();

        System.out.print("Adresse : ");
        String adresse = scanner.nextLine();

        System.out.print("Numéro de téléphone : ");
        String telephone = scanner.nextLine();

        System.out.print("Numéro de classe : ");
        int numeroClasse = scanner.nextInt();
        scanner.nextLine(); // Pour consommer la nouvelle ligne après le numéro de classe

        // Créer un nouvel apprenant
        Apprenants nouvelApprenant = new Apprenants(nom, prenom, dateNaissanceStr, adresse, telephone, numeroClasse);

        // Ajouter l'apprenant à la liste des apprenants
        listeApprenants.add(nouvelApprenant);

        System.out.println("Nouvel apprenant ajouté avec succès !");
    }

}