# Dockerfile MySQL Simple et Complet

FROM mysql:8

# Variables d'environnement
ENV MYSQL_DATABASE=persistance_test

# Copier le script d'initialisation
COPY init.sql /docker-entrypoint-initdb.d/

# Port exposé
EXPOSE 3306

# Volume pour la persistance
VOLUME /var/lib/mysql