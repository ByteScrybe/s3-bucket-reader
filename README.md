# AWS S3 Avro File Reader

This Spring Boot application reads Avro files stored in an AWS S3 bucket and prints their content to the console.

## Build Status

![Build badge](https://github.com/ByteScrybe/s3-bucket-reader/actions/workflows/github-actions.yml/badge.svg)

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

- JDK 11 or later
- Gradle 6.3 or later
- AWS Account with S3 access

### Installation

1. Clone the repository
    ```
    git clone https://github.com/username/aws-s3-avro-file-reader.git
    ```
2. Navigate to the project directory
    ```
    cd aws-s3-avro-file-reader
    ```
3. Build the project
    ```
    ./gradlew build
    ```
4. Run the project
    ```
    ./gradlew bootRun
    ```

### Configuration

The AWS credentials and region are configured in the `application.yml` file:

```yaml
aws:
  accessKeyId: YOUR_ACCESS_KEY
  secretKey: YOUR_SECRET_KEY
```

## Built With

* [Spring Boot](https://spring.io/projects/spring-boot) - The framework used for building the microservice
* [AWS SDK for Java v2](https://docs.aws.amazon.com/sdk-for-java/latest/developer-guide/home.html) - Used to interact with Amazon S3
* [Avro](https://avro.apache.org/) - Used for Avro file processing

## License

This project is licensed under the MIT License

