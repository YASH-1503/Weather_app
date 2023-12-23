//package com.example.weather
//
//import ApiInterface
//import androidx.lifecycle.LiveData
//import androidx.lifecycle.MutableLiveData
//import androidx.lifecycle.ViewModel
//import retrofit2.Call
//import retrofit2.Callback
//import retrofit2.Response
//import retrofit2.Retrofit
//import retrofit2.converter.gson.GsonConverterFactory
//
//class WeatherViewModel : ViewModel() {
//
//    private val _weatherData = MutableLiveData<WeatherApp>()
//    val weatherData: LiveData<WeatherApp>
//        get() = _weatherData
//
//    fun fetchWeatherData(cityName: String) {
//        val retrofit = Retrofit.Builder()
//            .addConverterFactory(GsonConverterFactory.create())
//            .baseUrl("https://api.openweathermap.org/data/2.5/")
//            .build()
//            .create(ApiInterface::class.java)
//
//        val response = retrofit.getWeatherData(cityName, "your_api_key", "metric")
//        response.enqueue(object : Callback<WeatherApp> {
//            override fun onResponse(call: Call<WeatherApp>, response: Response<WeatherApp>) {
//                val responseBody = response.body()
//
//                if (response.isSuccessful && responseBody != null) {
//                    _weatherData.value = responseBody // Assign the response body to LiveData
//                }
//            }
//
//            override fun onFailure(call: Call<WeatherApp>, t: Throwable) {
//                // Handle failure case
//            }
//        })
//    }
//}