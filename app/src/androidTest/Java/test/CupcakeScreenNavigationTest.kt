package com.example.cupcake.ui

@get: Rule
val composeTestRule = creatAndroidComposableRule<ComponentActivity>()
private lateinit var navController: TestNavHostController

@Before
fun setupCupcakeNavHost(){
    composeTestRule.setContent{
        navController = TestNavHostController(LocalContext.current).apply{
            navigatorProvider.addNavigator(ComposeNavigator())
        }
        CupCakeApp(navController = navController)}


}

class CupcakeScreenNavigationTest {

}