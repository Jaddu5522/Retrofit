object RetrofitClient {
  private val retrofit = Retrofit.Builder()
      .baseUrl("https://raw.githubusercontent.com/Jaddu5522/Kabadi_Image/main/COMPUTER")
      .addConverterFactory(GsonConverterFactory.create())
      .build()

  val apiService: ApiService = retrofit.create(ApiService::class.java)
}
