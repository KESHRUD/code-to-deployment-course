package service;

import jakarta.xml.ws.Endpoint;

// utiliser "http://localhost:8080/? wsdl" pour accéder au WSDL une fois le service démarré
public class Application {
    public static void main(String[] args) {
        System.out.println("Démarrage du déploiement du service web SOAP...");
        String url = "http://localhost:8080/";
        // Publication du service web SOAP à l'URL spécifiée
        Endpoint.publish(url, new MonServiceWeb());
        System.out.println("Service web déployé à l'adresse : " + url);
        System.out.println("Accédez au WSDL via : " + url + "?wsdl");
        System.out.println("Accédez au XSD via : " + url + "?xsd");
    }
}
    /**
     * Classe principale pour démarrer le serveur SOAP avec JAX-WS.
     * Le service sera accessible à l'adresse http://localhost:8080/
     * Pour obtenir le WSDL : http://localhost:8080/?wsdl
     */
