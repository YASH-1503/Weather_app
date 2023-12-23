import com.example.weather.WeatherApp
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    @GET("weather")
    fun getWeatherData(
        @Query("q") city: String,
        @Query("appid") appid: String,
        @Query("units") unit: String
    ): Call<WeatherApp> // Assuming WeatherApp is the correct class for weather data
}
