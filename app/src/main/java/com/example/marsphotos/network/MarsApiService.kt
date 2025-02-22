import retrofit2.http.GET

private const val BASE_URL =
    "https://android-kotlin-fun-mars-server.appspot.com"

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory


private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()


interface MarsApiService {
    @GET("photos")
    fun getPhotos(): String
}



