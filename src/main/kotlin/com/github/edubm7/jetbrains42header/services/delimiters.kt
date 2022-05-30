package com.github.edubm7.jetbrains42header.services

val slashes = listOf("/* ", " */")

val languageDelimiters = mapOf(
        ".c" to slashes,
        ".cc" to slashes,
        ".cpp" to slashes,
        ".h" to slashes,
        ".hh" to slashes,
        ".hpp" to slashes,
)