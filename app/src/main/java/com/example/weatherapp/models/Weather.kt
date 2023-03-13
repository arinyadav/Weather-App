package com.weatherapp.models

import java.io.Serializable

data class Weather(
    val lon: Double,
    val lat: Double
) : Serializable