### ACTIVITE PRATIQUE N3 COMPTE  RENDU ###
Ce projet consiste à concevoir une application basée sur une architecture micro-service, permettant de gérer un système de facturation associant clients, produits et factures. L'objectif est de mettre en œuvre une architecture distribuée, hautement scalable et modulaire, en exploitant les technologies modernes telles que Spring Boot, Spring Cloud, et Eureka.

### L'application se compose des services suivants : ###

Customer Service : Micro-service pour la gestion des clients.
Inventory Service : Micro-service pour la gestion des produits.
Billing Service : Micro-service pour la gestion des factures.
Gateway Service : Implémentation d'une passerelle Spring Cloud Gateway avec configuration statique et dynamique des routes.
Discovery Service : Annuaire Eureka Discovery Service pour enregistrer et localiser dynamiquement les services.
Configuration Service : Serveur de configuration centralisé pour gérer les configurations des micro-services.
Chaque service est intégré avec des outils avancés comme OpenFeign pour faciliter la communication entre micro-services, tout en respectant les bonnes pratiques d'architecture. Ce projet inclut également l'utilisation d'une base de données pour persister les données de manière fiable et l'intégration avec Spring Data pour simplifier l'accès aux données.

### Fonctionnalités Implémentées
Customer Service :

Gestion des informations des clients avec des fonctionnalités CRUD exposées via Spring Data REST.
Initialisation des données clients par défaut.
Inventory Service :

Gestion des produits avec un modèle d'entités simple.
Initialisation des produits disponibles.
Billing Service :

Génération de factures en intégrant les informations des clients et des produits via OpenFeign.
Persistance des factures et des détails associés (produits facturés).
Discovery Service :

Annuaire centralisé utilisant Eureka pour enregistrer les services et permettre leur découverte dynamique.
Gateway Service :

Configuration statique et dynamique des routes pour rediriger les requêtes vers les micro-services appropriés.
Configuration Service :

Gestion centralisée des configurations des micro-services avec Spring Cloud Config.
### Technologies Utilisées
Spring Boot pour la création des micro-services.
Spring Cloud pour l'intégration des composants distribués.
Eureka Discovery Service pour la découverte dynamique des services.
Spring Cloud Gateway pour la gestion des routes.
Spring Data JPA pour la persistance des données.
OpenFeign pour la communication entre les micro-services.
H2 Database pour la base de données en mémoire.

![image](https://github.com/user-attachments/assets/fca01574-99a1-43ce-b494-e43c2a5566c4)
![image](https://github.com/user-attachments/assets/e060be34-1418-4f5e-a37f-1eb1a5d52720)
![image](https://github.com/user-attachments/assets/6e21825b-2d4f-479b-9dd4-f8c4b2d689c3)
![image](https://github.com/user-attachments/assets/af3a5336-2ba4-4c67-987f-8d0efebb8884)





