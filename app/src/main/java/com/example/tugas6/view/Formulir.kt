@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.tugas6.view

import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun FormIsian(
    jenisK:List<String> = listOf("Laki-laki", "Perempuan")
    OnSubmitBtnClick : () -> Unit
){
    Scaffold (
        modifier = Modifier,
        topBar = {
            TopAppBar(

            )
        }
    ){  }
}

