package com.example.spring1;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyApi {
    public static ArrayList<Etudiant> liste = new ArrayList<>();

    static {
        liste.add(new Etudiant(1, "AMINE", 17));
        liste.add(new Etudiant(2, "BOUCHER", 12));
        liste.add(new Etudiant(3, "DUPONT", 14));
        liste.add(new Etudiant(4, "MARTIN", 16));
    }

    @GetMapping(value = "/bnj")
    public String bonjour(){
        return "Bonjour !";
    }

    @GetMapping(value = "/bns")
    public String bonsoir(){
        return "Bonsoir !";
    }

    @GetMapping(value = "/etudiant")
    public Etudiant getEtudiant(){
        return new Etudiant(1, "AMINE", 17);
    }


    @GetMapping(value = "/somme")
    public double somme(double a, double b){
        return a + b;
    }

    @GetMapping(value = "/liste")
    public ArrayList<Etudiant> getAllEtudiant() {
        return (ArrayList<Etudiant>) liste;
    }

    @GetMapping(value = "/getEtudiantById")
    public Etudiant getEtudiantById(int id) {
        return liste.get(id);
    }

    @PostMapping(value = "/ajouterEtudiant")
    public Etudiant addEtudiant(Etudiant e) {
        liste.add(e);
        return e;
    }

    @DeleteMapping(value = "/supprimerEtudiant")
    public Etudiant supprimerEtudiant(int id){
        return liste.remove(id);
    }

    @PutMapping(value = "/modifierEtudiant")
    public Etudiant modifierEtudiant(int id, String nom){
        liste.get(id).setNom(nom);
        return liste.get(id);
    }
}
