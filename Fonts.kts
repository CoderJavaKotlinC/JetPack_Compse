override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            // Enter each layout function here to see their UI effect

            Annotation()


        }
//Checkout the below functions by adding them between the setContent {}




    }
    @Composable
    fun Fontss(){
        val fonts = FontFamily(
            Font(R.font.pacifico_regular, FontWeight.Thin)
            // continue to add fonts
        )


        Box(modifier= Modifier
            .fillMaxSize()
            .background(androidx.compose.ui.graphics.Color.Gray)) {

            Text(
                text = "Doraly's",
                color = androidx.compose.ui.graphics.Color.White,
                fontSize = 50.sp,
                fontFamily = fonts,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                textDecoration = TextDecoration.Underline
            )
        }

    }


    @Composable
    fun Annotation(){
        val fonts = FontFamily(
            Font(R.font.pacifico_regular, FontWeight.Thin)
            // continue to add fonts
        )


        Box(modifier= Modifier
            .fillMaxSize()
            .background(androidx.compose.ui.graphics.Color.Black)) {

            Text(
                text = buildAnnotatedString {
                                            withStyle(
                                                style = SpanStyle(
                                                    color = androidx.compose.ui.graphics.Color.Green,
                                                    fontSize = 50.sp,
                                                )
                                            ){
                                                append("D")
                                            }
                    append("oral'y")
                },

                color = androidx.compose.ui.graphics.Color.White,
                fontSize = 50.sp,
                fontFamily = fonts,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                textDecoration = TextDecoration.Underline
            )
        }

    }
