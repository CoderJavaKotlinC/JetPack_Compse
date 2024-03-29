    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Enter each layout function here to see their UI effect
            Title("Hello", "World")

        }
    }
//Checkout the below functions by adding them between the setContent {}

    @Composable
  fun Title(title1: String, title2: String){
      Column(
          modifier = Modifier
              .background(androidx.compose.ui.graphics.Color.Green)
              .fillMaxHeight(0.5f) // fills max width or covers the percentage of the UI
              .fillMaxWidth() // fills max width or up to certain percent
              .width(300.dp) // specifies space needed
             // .requiredWidth(600.dp) // sets the total required space.
              .padding(top = 50.dp)
              .border(5.dp, androidx.compose.ui.graphics.Color.Magenta) // adding borders
              // adding layers of boarders
              .padding(5.dp)
              .border(5.dp, androidx.compose.ui.graphics.Color.Blue)
              .padding(5.dp)
              .border(10.dp, androidx.compose.ui.graphics.Color.Red)
              .padding(10.dp)


      ) {
          //Example of how you edit text. see how it appears on the ui 
          Text(text = title1, modifier = Modifier.border(5.dp, androidx.compose.ui.graphics.Color.Yellow)
              .padding(5.dp)
              .offset(20.dp)
              .border(10.dp, androidx.compose.ui.graphics.Color.Black)
              .padding(10.dp))

          Spacer(modifier = Modifier.height(50.dp)) // spaces the text from each other
          Text(text = title2)
      }


  }
