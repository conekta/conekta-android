package io.conekta

object BaseTest {
    var host: String = System.getenv("BASE_PATH") ?: "http://localhost:3000"
}