
package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

/**
 * TP0 - RMI et Services Web SOAP
 * ---------------------------------------------
 * Ce fichier présente un exemple de service web SOAP en Java utilisant JAX-WS et RMI.
 * 
 * Explications sur les concepts :
 * - Web Service : service web accessible via un protocole de communication (ex: SOAP, REST)
 * - URL : Uniform Resource Locator : adresse d'un service web
 * - URN : Uniform Resource Name : nom unique d'un service web
 * - URI : Uniform Resource Identifier : identifiant unique d'une ressource
 *   (URL + URN = URI)
 *   Exemple : http://example.com/services/MyService (URL), urn:MyService (URN), http://example.com/services/MyService (URI)
 * - SOAP : Simple Object Access Protocol : protocole de communication entre applications
 * - RMI : Remote Method Invocation : protocole de communication entre applications Java
 * - JAX-WS : Java API for XML Web Services : API Java pour créer des services web SOAP
 *   Utilisation de l'annotation @WebService pour exposer les méthodes via SOAP.
 * - JAXB : Java Architecture for XML Binding : sérialisation/désérialisation des objets Java en XML et vice versa, utilisé avec JAX-WS pour échanger des données entre le client et le service web SOAP.
 *
 * Relation entre RMI et SOAP :
 * RMI peut être utilisé pour implémenter des services web SOAP en Java et utiliser JAX-WS pour exposer les méthodes RMI en tant que services web SOAP.
 *
 * Les méthodes annotées avec @WebMethod sont exposées via SOAP.
 * Le service est publié dans Application.java.
 */
@WebService(targetNamespace = "https://www.polytech.fr")
public class MonServiceWeb {

    /**
     * Convertit une valeur selon un taux
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
        // Ici, on retourne un étudiant fictif pour l'exemple (pas de bdd pour ce tp0)
        return new Etudiant(1, "Amine", 18);
    }
}
