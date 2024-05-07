#!/usr/bin/env bash

cd ./docker && docker build . && docker images --all &

### Note that the -p flag must be supplied to expose and map the internal port
# docker run -e POSTGRES_PASSWORD=<testpw> -p 5432:5432 -d <500737752944>
# docker run -e POSTGRES_PASSWORD=testpassword -p 5432:5432 -d <500737752944>

### Get the CONTAINER ID <aa9f01c38d04>
# docker stats

### Get host/ip address for CONTAINER
# docker inspect <aa9f01c38d04>

### Connect to the CONTAINER
## -U designates the database
# docker exec -it <aa9f01c38d04> psql -U <postgres>

### Cleanup
# docker stop <aa9f01c38d04>
# docker system prune --volumes

sleep 10 && cd server && mvn clean && mvn spring-boot:run &

wait