# user-service-jaxrs project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .



## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

Command- 

./mvnw quarkus:dev

Database- Postgres

REST API endpoints and JSON Request Body Sample-

Port- 8000

Rest API endpoints - 

Read Opeartion - GET
Url - http://localhost:8000/user/{user_id} 
Ex -http://localhost:8000/user/1001

POST-
http://localhost:8000/user
Content-Type : application/json

{
    "userId": "1004",
    "userName": "GLIndia",
    "userDetails": "Software"
}

PUT-
http://localhost:8000/user
Content-Type : application/json

{
    "userId": "1004",
    "userName": "GLIndia",
    "userDetails": "Software"
}


```

## Packaging and running the application

The application is packageable using `./mvnw package`.
It produces the executable `user-service-jaxrs-1.0.0-SNAPSHOT-runner.jar` file in `/target` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/lib` directory.

The application is now runnable using `java -jar target/user-service-jaxrs-1.0.0-SNAPSHOT-runner.jar`.

## Creating a native executable

You can create a native executable using: `./mvnw package -Pnative`.

Or you can use Docker to build the native executable using: `./mvnw package -Pnative -Dquarkus.native.container-build=true`.

You can then execute your binary: `./target/user-service-jaxrs-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/building-native-image-guide .