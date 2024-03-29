override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Enter each layout function here to see their UI effect 
        }
    }
//Checkout the below functions by adding them between the setContent {}
    @Composable
    fun TitleColumn(title1: String, title2: String){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(androidx.compose.ui.graphics.Color.Green) ,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround


        ){
            Text(text = title1)
            Text(text = title2)
            Text(text = title2)
        }
    }

    @Composable
    fun TitleRow(title1: String, title2: String){
        Row(
            modifier = Modifier
                .fillMaxSize()
                .background(androidx.compose.ui.graphics.Color.Green) ,
            horizontalArrangement = Arrangement.SpaceAround ,
            verticalAlignment = Alignment.CenterVertically

        ){
            Text(text = title1)
            Text(text = title2)
            Text(text = title2)
        }
    }

    @Composable
    fun TitleColumnFillPortion(title1: String, title2: String){
        Column(
            modifier = Modifier
                .width(300.dp)
                .height(300.dp)
                .fillMaxHeight(.7f)
                //   .fillMaxSize(0.5f) // fills to a percentage of screen
                .background(androidx.compose.ui.graphics.Color.Green) ,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround


        ){
            Text(text = title1)
            Text(text = title2)
            Text(text = title2)
        }
    }

