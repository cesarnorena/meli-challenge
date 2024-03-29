# Meli test project
![checks](https://github.com/cesarnorena/meli/workflows/Checks/badge.svg?branch=main)

Android app developed using the [public API](https://api.mercadolibre.com/) of Mercado Libre (Meli) to search products and get some extra details.

## Architecture

MVVM (Model View ViewModel) in the presentation layer with LiveData and Coroutines + Clean Architecture.

Big flows or features are meant to belong to an Android module, but since this is a small flow, I didn't create a independient module for it. Multi-module apps also require common libraries or modules, an example of it would be the `StatefulViewModel` and `StafeulActivity` classes.

![Architecture diagram](./.images/meli_architecture.png)

## Linter
Kotlin code style uses the default rules of ktlint project.

Running ktlint check:
```
./gradlew ktlintCheck
```

Running ktlint format
```
./gradlew ktlintFormat
```

## Tests

Running unit tests:
```
./gradlew test
``` 

Running instrumented tests:
```
./gradlew connectedAndroidTest
```
