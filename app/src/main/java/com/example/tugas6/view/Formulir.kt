@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.tugas6.view

import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource


@Composable
fun FormIsian(
    jenisK:List<String> = listOf("Laki-laki", "Perempuan")
    OnSubmitBtnClick : () -> Unit
){
    Scaffold (
        modifier = Modifier,
        topBar = {
            TopAppBar(
                title = {text(stringResource(id=R.string.home),
                    color = Color.White)},
                colors = TopAppBarDefaults.topAppBarColors
                    (containerColor = colorResource(id = R.color.teal_700))
            )
        }
    ){  }
}

