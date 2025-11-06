package com.example.tugas6

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

enum class Navigasi {
    Formulirku,

    Detail
}

@Composable
fun DataApp(
    navController : NavHostController = rememberNavController(),
    modifier: Modifier
){
    Scaffold { isiRuang ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.Formulirku.name,
            modifier = Modifier.padding(paddingValues = isiRuang)
        ) {
            composable(route = Navigasi.Formulirku.name) {
                FormIsian(
                    // pilihanJK = JenisK.map { id -> resources.getString(id) }
                    OnSubmitBtnClick = {
                        navController.navigate(route = Navigasi.Detail.name)
                    }
                )
            }
        }
    }


}