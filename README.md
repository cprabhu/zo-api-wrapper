# zo-api-wrapper
This is a Spring-Boot based wrapper library built to be able to use Zomato APIs. The current version supports common APIs mentioned on the Zomato API documentation here - https://developers.zomato.com/api/documentation

## Usage
To be able to use the wrapper library, please generate an API key for yourself or your product from Zomato's website, and replace the **<Insert your own Zomato API key here>** text in src/main/resources/application.yaml with your generated key. ZoApiService should be injected into your application via autowiring (in Spring) and you can start using the services with parameters required. There is enough documentation locally, as well as on their API page above.
