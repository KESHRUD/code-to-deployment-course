
package service;

import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Classe représentant un étudiant pour le service web SOAP.
 * Utilisée pour illustrer la sérialisation/désérialisation avec JAXB.
 * Les objets Etudiant sont échangés entre le client et le service web.
 */
@XmlRootElement // Permet la conversion automatique en XML via JAXB
public class Etudiant implements Serializable {
    private int id;
    private String nom;
    private double moyenne;

    /**
     * Constructeur sans argument requis pour JAXB
     */
    public Etudiant() {
    }

    /**
     * Constructeur principal
     * @param id identifiant de l'étudiant
     * @param nom nom de l'étudiant
     * @param moyenne moyenne de l'étudiant
     */
    public Etudiant(int id, String nom, double moyenne) {
        this.id = id;
        this.nom = nom;
        this.moyenne = moyenne;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public double getMoyenne() {
        return moyenne;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }
}
