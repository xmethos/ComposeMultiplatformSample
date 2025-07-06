package net.ecorp.samples.multimodule

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform