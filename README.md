# dio-cities-api
# API de cidades do Brasil

Este projeto é uma API Rest de consulta de cidades do Brasil com dados comparativos. Foi desenvolvido durante
o curso **Construindo uma API Rest de consulta de cidades do Brasil do zero até a produção**, ministrado
pelo professor <a href="https://www.linkedin.com/in/andreluisgomes/" target="_blank">André Gomes</a>.

O projeto original implementado pelo professor você pode encontrar
<a href="https://github.com/andrelugomes/digital-innovation-one/tree/master/cities-api" target="_blank">clicando aqui.</a>

## Minhas implementações no projeto:
* Documentação utilizando Swagger, um framework para descrição, consumo e visualização de serviços RESTful

## Tecnologias utilizadas

* Linux
* Git
* Java 8
* Docker
* PostgreSQL
* IntelliJ Community
* Heroku CLI
* Swagger

## Spring Boot

* [https://start.spring.io/](https://start.spring.io/)

+ Java 8
+ Gradle Project
+ Jar
+ Spring Web
+ Spring Data JPA
+ PostgreSQL Driver

## DataBase

### Postgres

* [Postgres Docker Hub](https://hub.docker.com/_/postgres)
* Comando para baixar e criar o container do Postgres para o projeto:

```shell script
docker run --name cities-db -d -p 5432:5432 -e POSTGRES_USER=postgres_user_city -e POSTGRES_PASSWORD=super_password -e POSTGRES_DB=cities postgres
```

### Configuração e importação das querys dentro do container Postgres:

* [data](https://github.com/chinnonsantos/sql-paises-estados-cidades/tree/master/PostgreSQL)

```shell script
git clone https://github.com/chinnonsantos/sql-paises-estados-cidades.git

cd sql-paises-estados-cidades/PostgreSQL

docker start cities-db

docker run -it --rm --net=host -v $PWD:/tmp postgres /bin/bash

psql -h localhost -U postgres_user_city cities -f /tmp/pais.sql
psql -h localhost -U postgres_user_city cities -f /tmp/estado.sql
psql -h localhost -U postgres_user_city cities -f /tmp/cidade.sql

psql -h localhost -U postgres_user_city cities

CREATE EXTENSION cube; 
CREATE EXTENSION earthdistance;
```
## Swagger 

* Acesse a Documentação da API hospedada no Heroku: <br>
  -  https://floating-brushlands-95276.herokuapp.com/swagger-ui.html#/ <br>
  -  https://floating-brushlands-95276.herokuapp.com/v2/api-docs  <br> <br>

## Consumindo API no Postman
    + Países:  https://rocky-temple-79094.herokuapp.com/countries <br>
    + Estados do Brasil:  https://rocky-temple-79094.herokuapp.com/staties <br>
    + Cidades do Brasil:  https://rocky-temple-79094.herokuapp.com/cities <br>
    + Distância em milhas: https://rocky-temple-79094.herokuapp.com/distances/by-points?from=4929&to=5254
