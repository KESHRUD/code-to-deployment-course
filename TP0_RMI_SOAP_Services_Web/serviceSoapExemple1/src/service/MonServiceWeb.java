
package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

/**
 * Exemple de service web SOAP en Java utilisant JAX-WS et RMI.
 * Les méthodes annotées avec @WebMethod sont exposées via SOAP.
 * Le service est publié dans Application.java.
 */
@WebService(targetNamespace = "https://www.polytech.fr")
public class MonServiceWeb {

    /**
     * Convertit une valeur selon un taux (exemple : conversion de devise)
     * @param r valeur à convertir
     * @return valeur convertie
     */
    @WebMethod(operationName = "convertir")
    public double conversion(double r) {
        return r * 0.9;
    }

    /**
     * Additionne deux nombres
     * @param a premier nombre
     * @param b second nombre
     * @return somme des deux nombres
     */
    @WebMethod(operationName = "additionner")
    public double somme(
        @WebParam(name = "parametre1") double a,
        @WebParam(name = "parametre2") double b) {
        return a + b;
    }

    /**
     * Crée un étudiant fictif (exemple de sérialisation d'objet)
     * @param id identifiant de l'étudiant
     * @return un objet Etudiant
     */
    @WebMethod(operationName = "creerEtudiant")
    public Etudiant getEtudiant(@WebParam(name = "id") int id) {
        // Ici, on retourne un étudiant fictif pour l'exemple
        return new Etudiant(id, "Amine", 18);
    }
}
