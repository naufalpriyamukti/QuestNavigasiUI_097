@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.tugas6.view

import android.R.attr.text
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.tugas6.R


@Composable
fun FormIsian(
    jenisK:List<String> = listOf("Laki-laki", "Perempuan")
    OnSubmitBtnClick : () -> Unit
){
    Scaffold (
        modifier = Modifier,
        topBar = {
            TopAppBar(
                title = {text(stringResource(id= R.string.home),
                    color = Color.White)},
                colors = TopAppBarDefaults.topAppBarColors
                    (containerColor = colorResource(id = R.color.teal_700))
            )
        }
    ){
        Column (modifier = Modifier.padding(isiRuang),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally)
        {
            OutlinedTextField(
                value = " ",
                singleLine = true,
                modifier = Modifier
                    .padding(top = 20.dp)
                    .width()
            )
        }
    }
}

