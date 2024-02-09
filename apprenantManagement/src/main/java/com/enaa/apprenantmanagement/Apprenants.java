package com.enaa.apprenantmanagement;

import java.util.List;
import java.util.Scanner;

public class Apprenants {

    // Attributs
    private String nom;
    private String prenom;
    private String dateNaissance;
    private String adresse;
    private String numeroTelephone;
    private int numeroClasse;

    // Constructeur
    public Apprenants(String nom, String prenom, String dateNaissance, String adresse, String numeroTelephone, int numeroClasse) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.numeroTelephone = numeroTelephone;
        this.numeroClasse = numeroClasse;
    }

    // Méthodes d'accès et de modification des attributs
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public int getNumeroClasse() {
        return numeroClasse;
    }

    public void setNumeroClasse(int numeroClasse) {
        this.numeroClasse = numeroClasse;
    }

    // Méthode pour ajouter un nouvel apprenant
    public static void ajouterApprenant(List<Apprenants> apprenants, Scanner scanner) {
        System.out.println("Ajout d'un nouvel apprenant :");

        System.out.print("Nom : ");
        String nom = scanner.nextLine();

        System.out.print("Prénom : ");
        String prenom = scanner.nextLine();

        System.out.print("Date de naissance (jj/mm/aaaa) : ");
        String dateNaissance = scanner.nextLine();

        System.out.print("Adresse : ");
        String adresse = scanner.nextLine();

        System.out.print("Numéro de téléphone : ");
        String numeroTelephone = scanner.nextLine();

        System.out.print("Numéro de classe : ");
        int numeroClasse = scanner.nextInt();
        scanner.nextLine(); // Pour consommer la nouvelle ligne après le numéro de classe

        // Créer un nouvel apprenant
        Apprenants nouvelApprenant = new Apprenants(nom, prenom, dateNaissance, adresse, numeroTelephone, numeroClasse);
        // Ajouter l'apprenant à la liste des apprenants
        apprenants.add(nouvelApprenant);

        System.out.println("Nouvel apprenant ajouté avec succès !");
    }
}
