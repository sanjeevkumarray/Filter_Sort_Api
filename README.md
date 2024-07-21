# Filter and Sort API with Spring Boot and MongoDB

## Overview

This Spring Boot application provides a RESTful API to filter and sort products stored in a MongoDB database.

## API Endpoint

- **GET /products**: Retrieve filtered and sorted products.

### Query Parameters

- `category` (optional): Filter by category.
- `minPrice` and `maxPrice` (optional): Filter by price range.
- `inStock` (optional): Filter by stock availability.
- `sortField` (optional): Field to sort by (`price`, `rating`, `createdAt`).
- `sortOrder` (optional): Sort order (`asc` or `desc`). Default is `asc`.

### Example Request

```http
GET /products?category=electronics&minPrice=100&maxPrice=1000&inStock=true&sortField=price&sortOrder=asc

Setup
Prerequisites
Java 11+
MongoDB
Maven or Gradle
Running the Application
Clone the repository:

git clone https://github.com/your-username/filter-sort-api.git
cd filter-sort-api

Configure MongoDB:
Ensure MongoDB is running locally.

Update application.properties:
spring.data.mongodb.uri=mongodb://localhost:27017/productdb

Build and run the application:
./mvnw spring-boot:run

Testing the API
Using cURL:
curl -X GET "http://localhost:8080/products?category=electronics&minPrice=100&maxPrice=1000&inStock=true&sortField=price&sortOrder=asc" -H "accept: application/json"

License
This project is licensed under the MIT License.


Replace `"https://github.com/your-username/filter-sort-api.git"` with your actual repository URL. This file combines setup instructions, code snippets, and API details into a single, readable document for GitHub.

