# Currency Converter

Simple Spring Boot app that converts an amount by a given rate.

## Run
```
./mvnw spring-boot:run
```
or from IDE, run `CurrencyConverterApplication`.

## Endpoint
```
GET /convert?amount=100&rate=4.2
```
Response:
```json
{
  "originalAmount": 100.00,
  "rate": 4.2,
  "convertedAmount": 420.00
}
```
