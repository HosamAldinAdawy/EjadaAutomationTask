Feature: API Methods
  Scenario: Retrieve all books
    Given the API endpoint is "https://simple-books-api.glitch.me/books"
    When a GET request is sent
    Then the response status code should be 200
    And the response body should contain a list of books

  Scenario: Remove a book
    Given the API endpoint is "https://simple-books-api.glitch.me/books/3"
    When a DELETE request is sent
    Then the response status code should be 204
