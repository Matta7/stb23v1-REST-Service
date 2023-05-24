-- Création de la table STB (Software Technical Brief)
-- Création de la table Client
CREATE TABLE Client (
    id INT PRIMARY KEY AUTO_INCREMENT,
    entite VARCHAR(100),
    nom VARCHAR(100),
    genre VARCHAR(100),
    prenom VARCHAR(100),
    CONSTRAINT unique_client UNIQUE (entite, nom, genre, prenom)
);

-- Création de la table Email (pour stocker les adresses email)
CREATE TABLE Email (
    id INT PRIMARY KEY AUTO_INCREMENT,
    client_id INT,
    email VARCHAR(255),
    FOREIGN KEY (client_id) REFERENCES Client(id)
);

CREATE TABLE Tel (
    id INT PRIMARY KEY AUTO_INCREMENT,
    client_id INT,
    tel VARCHAR(255),
    FOREIGN KEY (client_id) REFERENCES Client(id)
);

-- Création de la table Telephone (pour stocker les numéros de téléphone)
CREATE TABLE Telephone (
    id INT PRIMARY KEY AUTO_INCREMENT,
    client_id INT,
    telephone VARCHAR(255),
    FOREIGN KEY (client_id) REFERENCES Client(id)
);

-- Création de la table Equipe
CREATE TABLE Equipe (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(255)
);

CREATE TABLE STB (
    id INT PRIMARY KEY AUTO_INCREMENT,
    titre VARCHAR(255),
    version DECIMAL(10, 2),
    date VARCHAR(255),
    description TEXT,
    client_id INT,
    equipe_id INT,
    FOREIGN KEY (client_id) REFERENCES Client(id),
    FOREIGN KEY (equipe_id) REFERENCES Equipe(id)
);

-- Création de la table Membre
CREATE TABLE Membre (
    id INT PRIMARY KEY AUTO_INCREMENT,
    equipe_id INT,
    nom VARCHAR(255),
    genre VARCHAR(255),
    prenom VARCHAR(255),
    FOREIGN KEY (equipe_id) REFERENCES Equipe(id)
);

-- Création de la table Function
CREATE TABLE Fonction (
    id INT PRIMARY KEY AUTO_INCREMENT,
    member_id INT,
    description VARCHAR(255),
    CONSTRAINT fk_member_id FOREIGN KEY (member_id) REFERENCES Membre (id)
);

-- Création de la table FeatureList (liste des fonctionnalités)
CREATE TABLE FeatureList (
    id INT PRIMARY KEY AUTO_INCREMENT,
    stb_id INT,
    FOREIGN KEY (stb_id) REFERENCES STB(id)
);

-- Création de la table Feature (fonctionnalité)
CREATE TABLE Feature (
    id INT PRIMARY KEY AUTO_INCREMENT,
    feature_list_id INT,
    nombre INT,
    section VARCHAR(255),
    nom VARCHAR(255),
    description TEXT,
    priorite INT CHECK (priorite BETWEEN 0 AND 10),
    date_livraison DATE,
    commentaires TEXT,
    FOREIGN KEY (feature_list_id) REFERENCES FeatureList(id)
);
