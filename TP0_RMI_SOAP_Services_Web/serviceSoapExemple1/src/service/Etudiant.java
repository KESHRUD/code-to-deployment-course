
package service;

import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Représente un étudiant échangé entre le client et le service web SOAP.
 * Au lieu d'envoyer des valeurs simples (réels), on envoie des objets Etudiant
 * qui contiennent des informations structurées sur l'étudiant (id, nom, moyenne).
 * Cela permet de mieux organiser les données échangées et de tester la sérialisation/désérialisation
 * des objets Java en XML via JAXB.
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
