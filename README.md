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


License
This project is licensed under the MIT License.


Replace `"https://github.com/your-username/filter-sort-api.git"` with your actual repository URL. This file combines setup instructions, code snippets, and API details into a single, readable document for GitHub.

