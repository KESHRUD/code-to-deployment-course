# Image Python
FROM python:3.12-slim

# Rép de travail
WORKDIR /app

# installation flask
RUN pip install Flask

# on copie app.py dans l'image
COPY app.py .

# On expose le port 5000
EXPOSE 5000

# On définit la commande qui démarre l'app
CMD ["python", "app.py"]