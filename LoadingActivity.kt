class LoadingActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      
    }
    
  }
  
}

@Composable
fun ProductImage(imageUrl: String) {
  Image(
    painter = rememberAsyncImagePainter(imageUrl),
    contentDescription = "Product Image",
    modifier = Modifier
          .size(200.dp)
  )
}
