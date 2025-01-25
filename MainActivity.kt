class MainActivity : AppCompatActivity() {
  private lateinit var apiInterface: ApiInterface
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    getApiInterface()
    getExampleData()
}

  private fun getApiInterface() {
    apiInterface = RetrofitInstance.getInstance().create(ApiInterface::class.java)
  }

  private fun getExampleData(){
    val call = apiInterface.getExampleData()
    call.enqueue(object: Callback<ExampleResponse>){
      override fun onResponse(call: Call<ExampleResonse>, response: Response<ExampleResponse>){
        if (response.isSuccessful && response.body()!= null){
              // TODO: Process Data
        }
      }
        override fun onFailure(call: Call<ExampleResponse>, t: Throwable){
          t.printStackTrace()
        }
    }
  }
}
