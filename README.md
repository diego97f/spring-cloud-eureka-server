# Spring Cloud Eureka Server

This project implements a Eureka Server for service discovery in a Spring Cloud microservices architecture. It enables automatic detection and registration of microservices within your distributed system.

## Technology Stack

- Java 21
- Spring Boot 3.4.5
- Spring Cloud 2024.0.1
- Maven 3.9.9

## Features

- Service Registry and Discovery
- Integration with Spring Cloud Config Server
- Spring Boot Actuator for monitoring and metrics
- Secure configuration with externalized credentials

## Prerequisites

- JDK 21 or later
- Maven 3.9.x or later
- Spring Cloud Config Server running (default: http://localhost:8888)

## Configuration

The application is configured to use the following properties in `application.yml`:

```yaml
spring:
  profiles:
    active: dev
  application:
    name: eureka-server
  config:
    import: configserver:http://localhost:8888
  cloud:
    config:
      username: ${CONFIG_SERVER_USERNAME:configadmin}
      password: ${CONFIG_SERVER_PASSWORD:secretpassword}
```

### Environment Variables

The following environment variables can be configured:

- `CONFIG_SERVER_USERNAME`: Username for Config Server authentication (default: configadmin)
- `CONFIG_SERVER_PASSWORD`: Password for Config Server authentication (default: secretpassword)

## Building the Application

To build the application, run:

```bash
./mvnw clean install
```

## Running the Application

To start the application, run:

```bash
./mvnw spring-boot:run
```

The Eureka Server will be available at `http://localhost:8761` by default.

## API Documentation

The following endpoints are available:

- Eureka Dashboard: `http://localhost:8761`
- Actuator endpoints:
  - Health check: `http://localhost:8761/actuator/health`
  - Info: `http://localhost:8761/actuator/info`
  - Metrics: `http://localhost:8761/actuator/metrics`

## Dependencies

Main dependencies included in the project:

- spring-cloud-starter-netflix-eureka-server
- spring-cloud-starter-config
- spring-boot-starter-actuator

## Development

The project uses the standard Maven project structure:

```
src/
  ├── main/
  │   ├── java/
  │   │   └── com/github/springcloud/eurekaserver/
  │   │       └── SpringCloudEurekaServerApplication.java
  │   └── resources/
  │       └── application.yml
  └── test/
      └── java/
```

## IDE Support

The project includes configuration files for:
- IntelliJ IDEA
- Eclipse
- Visual Studio Code

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## Author

Diego Fernández