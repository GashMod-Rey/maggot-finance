# MagFin Project
### This project is made using Android Studio and Java-XML Programming Language to fulfill the community service project for UMN and our final term examination of Mobile Application Programming.

#### Features
<ol>
  <li>Users can register theirselves on application or by contacting local trash manager.</li>
  <li>Users can login theirselves to the application</li>
  <li>Users can check their data and balance on the apps</li>
  <li>Users can check their transaction and export it into .xls file</li>
  <li>Users can input their transaction with shop and get the invoice</li>
  <li>Users can accept or reject notifications of their withdrawal</li>
  <li>Trash manager can login theirselves to the application</li>
  <li>Trash manager can check their users and shops data on the apps</li>
  <li>Trash manager can delete users and shops data on the apps</li>
  <li>Trash manager can input new users and shops data on the apps</li>
  <li>Trash manager can check their transaction and export it into .xls file</li>
  <li>Trash manager can buy the users maggot (and give them balance)</li>
  <li>Trash manager can process the users or shops withdrawal</li>
  <li>Trash manager can accept or reject of users registration on their trash manager area</li>
  <li>Shops can login theirselves to the application</li>
  <li>Shops can check their data and balance on the apps</li>
  <li>Shops can check their transaction and export it into .xls file</li>
  <li>Shops can accept or reject notifications of their withdrawal</li>
  <li>All the users level can logout themselves from the application</li>
</ol>

#### Future Development Features
<ol>
  <li>Using custom push notification for handling notification</li>
  <li>Improve the application's UI/UX design</li>
  <li>Working on cross trash manager transaction (users can spend their balance not only to their trash manager's shop but also other trash manager's)</li>
</ol>

#### Cloning Projects
<ol>
  <li>git clone https://github.com/atras30/maggot-project-server.git</li>
  <li>Copy .env.example in /server folder and rename it to .env</li>
  <li>Go to /server folder (cd ./maggot-project-server)</li>
  <li>In terminal, type 'composer install' to install all laravel dependencies</li>
  <li>In terminal, type 'php artisan key:generate' to install key for .env file</li>
  <li>In PHPMyAdmin, create a "maggot_server" database</li>
  <li>In terminal, type 'php artisan migrate:fresh --seed' to migrate all database schemas</li>
  <li>In terminal, type 'php artisan serve' to run the server</li>
</ol>

#### Rest API Documentation
Open README.md in server folder.
