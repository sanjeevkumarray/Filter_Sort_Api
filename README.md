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



