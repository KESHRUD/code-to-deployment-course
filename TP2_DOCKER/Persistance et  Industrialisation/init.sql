-- init.sql
-- Crée la base de données
CREATE DATABASE IF NOT EXISTS persistance_test;
USE persistance_test;

-- Crée la table
CREATE TABLE produits (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(100),
    prix DECIMAL(10, 2)
);

-- Insère des données initiales
INSERT INTO produits (nom, prix) VALUES 
    ('Clavier', 59.99),
    ('Souris', 25.50),
    ('Écran', 199.99),
    ('Casque', 89.99),
    ('Webcam', 49.99);