# 🚗 Application Android de Location de Voitures

## Description

Cette application Android a été développée dans le cadre du Master **Systèmes d'Information Décisionnel et Imagerie (SIDI)**.

Elle permet à un utilisateur de créer un compte, de se connecter, de consulter les différentes marques et modèles de voitures disponibles, puis d'effectuer une réservation de manière simple et intuitive.

L'application utilise une base de données SQLite pour gérer l'authentification des utilisateurs.

---

## Fonctionnalités

- 🔐 Inscription d'un nouvel utilisateur
- 🔑 Authentification (connexion)
- 👁️ Affichage/Masquage du mot de passe
- 🚘 Consultation des marques de voitures
- 📋 Liste des véhicules disponibles
- 📄 Consultation des détails d'un véhicule
- 📅 Réservation d'une voiture
- 💾 Stockage des données avec SQLite

---

## 📱 Interfaces de l'application

L'application comprend les interfaces suivantes :

- Connexion (Login)
- Inscription (Register)
- Choix de la marque
- Liste des voitures
- Détails d'une voiture
- Réservation

---

## 🛠️ Technologies utilisées

- Java
- Android Studio
- XML
- SQLite
- Android SDK

---

## 🗂️ Structure du projet

```
location-voitures-android
│
├── AndroidManifest.xml
├── code java/
│   ├── MainActivity.java
│   ├── RegisterActivity.java
│   ├── DBHelper.java
│   ├── TypeVoiture.java
│   ├── Listevoitures.java
│   ├── Detailvoiture.java
│   └── reserver_voiture.java
│
├── code xml/
│   ├── activity_main.xml
│   ├── activity_register.xml
│   ├── activity_type_voiture.xml
│   ├── liste_voiture.xml
│   ├── detail_des_voiture.xml
│   └── activity_reserver_voiture.xml
│
└── Younes MOURABIT.pdf
```

---

## 🔄 Fonctionnement de l'application

1. Création d'un compte utilisateur.
2. Connexion avec les identifiants enregistrés.
3. Sélection d'une marque de voiture.
4. Consultation des modèles disponibles.
5. Affichage des détails du véhicule.
6. Réservation avec les informations personnelles et les dates de location.
7. Confirmation de la réservation.

---

## 🗄️ Base de données

L'application utilise SQLite pour :

- enregistrer les utilisateurs ;
- vérifier les informations d'authentification ;
- gérer les opérations de connexion.

---

## 👨‍🎓 Auteur

**Younes MOURABIT**

Master Systèmes d'Information Décisionnel et Imagerie (SIDI)

Année universitaire : **2024-2025**

---

## 📄 Documentation

Le rapport complet du projet est disponible dans le fichier :

**Younes MOURABIT.pdf**
