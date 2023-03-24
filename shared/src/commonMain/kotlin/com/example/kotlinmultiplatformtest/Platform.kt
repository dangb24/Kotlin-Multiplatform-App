package com.example.kotlinmultiplatformtest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform