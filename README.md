# Systemes-Distribues-TP3
TP3 : Gestion des Patients avec Spring MVC, Thymeleaf et Spring Data JPA

Ce TP vise à créer une application Web JEE pour la gestion des patients en utilisant les technologies Spring MVC, Thymeleaf et Spring Data JPA. 

# *Partie 1:*
Dans cette partie, nous mettons en place l'infrastructure de base de l'application.  Voici un aperçu des fonctionnalités principales :

<h2>Affichage de la liste des patients:</h2>

![Capture d'écran 2024-04-27 142847](https://github.com/ACHRAF-TALHAOUI/Systemes-Distribues-TP3/assets/137435554/ce45e997-9cf3-4721-a15d-01b9b94a877f)

<h2>Pagination pour gérer efficacement une grande quantité de données:</h2>

![Capture d'écran 2024-04-27 143435](https://github.com/ACHRAF-TALHAOUI/Systemes-Distribues-TP3/assets/137435554/4fb1731b-d080-4ca7-a96c-5b05ada4174a)

<h2>Recherche de patients:</h2>

![Capture d'écran 2024-04-27 143959](https://github.com/ACHRAF-TALHAOUI/Systemes-Distribues-TP3/assets/137435554/73e90fb0-b631-4471-a212-45fdf093f103)

<h2>Suppression d'un patient:</h2>

![Capture d'écran 2024-04-27 144246](https://github.com/ACHRAF-TALHAOUI/Systemes-Distribues-TP3/assets/137435554/e291ea83-9b11-43b4-960c-e86230ff534f)

<h2>des améliorations supplémentaires selon les besoins:</h2>

![Capture d'écran 2024-04-27 144417](https://github.com/ACHRAF-TALHAOUI/Systemes-Distribues-TP3/assets/137435554/d424b997-807b-475a-a9e6-8a88ba854274)


# *Partie 2:*
Cette partie se concentre sur l'amélioration de l'expérience utilisateur en ajoutant des fonctionnalités de template et de validation des formulaires. Voici ce que nous faisons :

<h2>Création d'une page de template pour une meilleure présentation des données:</h2>

![Capture d'écran 2024-04-27 150531](https://github.com/ACHRAF-TALHAOUI/Systemes-Distribues-TP3/assets/137435554/5caef86e-4a85-4916-ab81-b8930ec85b29)

<h2>Implémentation de la validation des formulaires:</h2>
<h3>Ajouter un patient :</h3>

![Capture d'écran 2024-04-27 151036](https://github.com/ACHRAF-TALHAOUI/Systemes-Distribues-TP3/assets/137435554/83aa0c60-c015-4ea6-8b6b-91afe79c389c)

<h3> Modifier un patient:</h3>

![Capture d'écran 2024-04-27 151545](https://github.com/ACHRAF-TALHAOUI/Systemes-Distribues-TP3/assets/137435554/acbfefd3-8d0b-4c0e-87f6-844a6c9fceca)

# *Partie 3 - Sécurité avec Spring Security*
Dans cette dernière partie, nous sécurisons notre application en utilisant Spring Security. Avec différentes méthodes d'authentification :

![Capture d'écran 2024-04-22 160546](https://github.com/ACHRAF-TALHAOUI/Systemes-Distribues-TP3/assets/137435554/9274557c-7f04-4bbb-9d9c-279cc6c1f430)

<h2>InMemory Authentication</h2>

![Capture d'écran 2024-04-25 015351](https://github.com/ACHRAF-TALHAOUI/Systemes-Distribues-TP3/assets/137435554/e887e8e0-7935-476d-b0f7-78373ae9f2e3)

<h3>si User essayer de faire des actions d'Admin :</h3>

![Capture d'écran 2024-04-25 015159](https://github.com/ACHRAF-TALHAOUI/Systemes-Distribues-TP3/assets/137435554/00f193fa-4cf3-463d-b7fd-7e37c74ca490)

<h3>Les Fonctionnalités d'Admin et  d'User :</h3>

![Capture d'écran 2024-04-27 152727](https://github.com/ACHRAF-TALHAOUI/Systemes-Distribues-TP3/assets/137435554/c16ccabe-9430-417b-9f01-b3401f66df11)

<h2>JDBC Authentication</h2>
<h3>creation des tables (Users et Authorities) </h3>

![Capture d'écran 2024-04-26 174121](https://github.com/ACHRAF-TALHAOUI/Systemes-Distribues-TP3/assets/137435554/017b4be0-f396-4249-884e-f3ae1dd35677)

<h3>JDBC Method</h3>

![Capture d'écran 2024-04-27 153713](https://github.com/ACHRAF-TALHAOUI/Systemes-Distribues-TP3/assets/137435554/829feb0f-cc48-40bd-ac27-beb5dec65f1c)

<h3>Création des rôles et des Users, puis attribution des rôles aux Users , Pour le JDBC Authentication</h3>

![Capture d'écran 2024-04-27 174932](https://github.com/ACHRAF-TALHAOUI/Systemes-Distribues-TP3/assets/137435554/00405992-ccba-4f4c-9a41-1c303038fb5b)

<h2>UserDetails Service</h2>
<h3>Package Security</h3>

![image](https://github.com/ACHRAF-TALHAOUI/Systemes-Distribues-TP3/assets/137435554/fb9f7abd-599c-4c7c-9408-1bfbd1fa734c)

<h3>Tables des Roles ,Users, Authorithies, et Roles_Users...</h3>

![Capture d'écran 2024-04-26 235358](https://github.com/ACHRAF-TALHAOUI/Systemes-Distribues-TP3/assets/137435554/976f2431-5224-482d-99c2-751de12c9a00)


<h3>Création des rôles et des Users, puis attribution des rôles aux Users , Pour le UserDetailsService </h3>

![image](https://github.com/ACHRAF-TALHAOUI/Systemes-Distribues-TP3/assets/137435554/39aa4918-cf50-4c25-a77d-cb6197942ba5)

<h3>Donner a "User1" le role d'Admin </h3>

![Capture d'écran 2024-04-27 012412](https://github.com/ACHRAF-TALHAOUI/Systemes-Distribues-TP3/assets/137435554/75c36b89-d57b-4339-9bae-1819643117c6)



# Ressources :
<ul>Part 1 : https://www.youtube.com/watch?v=jDm-q-jEbiA</ul>

<ul>Part 2 : https://www.youtube.com/watch?v=eoBE745lDE0</ul>

<ul>Part 3 :
         <li>InMemomy Authentication: https://www.youtube.com/watch?v=7VqpC8UD1zM</li>    
         <li>JDBC Authentication : https://www.youtube.com/watch?v=Haz3wLiQ5-0</li>
         <li>UserDetails Service : https://www.youtube.com/watch?v=RTiS9ygyYs4</li>

</ul>
