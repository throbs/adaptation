# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.ap.client.*;
import com.ap.client.auth.*;
import com.ap.client.model.*;
import com.ap.client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        
        DefaultApi apiInstance = new DefaultApi();
        String username = "username_example"; // String | The nfvi username
        String password = "password_example"; // String | The nfvi password
        try {
            Per result = apiInstance.nmPerf1dayGet(username, password);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#nmPerf1dayGet");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://10.221.2.247/nfvi*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**nmPerf1dayGet**](docs/DefaultApi.md#nmPerf1dayGet) | **GET** /nm_perf/1day | Get 1 day nm_perf data
*DefaultApi* | [**nmPerf2hourGet**](docs/DefaultApi.md#nmPerf2hourGet) | **GET** /nm_perf/2hour | Get 2 hour nm_perf data
*DefaultApi* | [**nmPerf30minGet**](docs/DefaultApi.md#nmPerf30minGet) | **GET** /nm_perf/30min | Get 30 minutes nm_perf data
*DefaultApi* | [**nmPerf5minGet**](docs/DefaultApi.md#nmPerf5minGet) | **GET** /nm_perf/5min | Get 5 minutes nm_perf data
*DefaultApi* | [**nmPerfsGet**](docs/DefaultApi.md#nmPerfsGet) | **GET** /nm_perfs | Get all performance info.


## Documentation for Models

 - [Per](docs/Per.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author



