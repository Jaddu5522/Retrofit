class LoginAcitivity: Activity() {

  private lateinit var loginViewModel: LoginViewModel
  override fun onCreate(savedInstanceState: Bundle?){
    super.onCreate(savedInstanceState)

    val retrofit = Retrofit.Builder()
                .baseUrl("https://example.com")
                .build()
                .create(LoginService::class.java)

    val remoteDataSource = UserRemoteDataSource(retrofit)
    val localDataSource = UserLocalDataSource()

    val userRepository = UserRepository(localDataSource, remoteDataSource)

    loginViewModel = LoginViewModel(userRepository)
    
  }
}
