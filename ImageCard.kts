 override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Enter each layout function here to see their UI effect

            Box(modifier = Modifier
                .fillMaxSize(.5f)
                .padding(16.dp)) {
                val painter = painterResource(id = R.drawable.img)
                val description = "Mens Shirt"
                val title = "Mens "
                val price = "19.99"

                ImageCard(painter, description, title, price)
            }

        }
    }
//Checkout the below functions by adding them between the setContent {}



}

@Composable
fun ImageCard(
    painter: Painter, // allows you to use your image
    contentDescription: String,
    title: String,
    price: String,
    modifier: Modifier = Modifier
){
    Card(
        modifier = modifier.fillMaxWidth(), shape = RoundedCornerShape(15.dp))
    {

        Box(modifier = Modifier.height(200.dp) ){
            // anything entered into this block will be stacked on each other as a stack

            Image(
                modifier = Modifier.fillMaxSize().clickable {
                                 // enter click function
                },
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop

            )

            Box(modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            androidx.compose.ui.graphics.Color.Transparent,
                            androidx.compose.ui.graphics.Color.Black

                        ),
                        startY = 100f
                    )
                )
            )

            Box(modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
           contentAlignment = Alignment.BottomStart){
                Row {
                    Text(title, style = TextStyle(color = androidx.compose.ui.graphics.Color.White, fontSize = 16.sp))
                    Spacer(modifier = Modifier.width(10.dp))
                    Text("$$price", style = TextStyle(color = androidx.compose.ui.graphics.Color.Green, fontSize = 16.sp))


                }
            }



        }
    }
}
