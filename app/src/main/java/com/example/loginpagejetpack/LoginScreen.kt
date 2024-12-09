package com.example.loginpagejetpack

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen(){

    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.jetpack), contentDescription = "Login Image",
            modifier = Modifier.size(200.dp))

        Text(text = "Welcome Back", fontSize = 25.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(5.dp))
        
        Text(text = "Login to Your Account")
        
        Spacer(modifier = Modifier.height(5.dp))
        
        OutlinedTextField(value = email, onValueChange = {email = it}, label = {
            Text(text = "Email Address")
        })

        Spacer(modifier = Modifier.height(5.dp))
        OutlinedTextField(value = password, onValueChange ={password = it}, label =  {
            Text(text = "Password")
        }, visualTransformation = PasswordVisualTransformation())
        
        Spacer(modifier = Modifier.height(5.dp))
        
        Button(onClick = {
            Log.i("Credential","Email : $email Password : $password")
        }) {
            Text(text = "Login")
        }
        
        Spacer(modifier = Modifier.height(10.dp))

        TextButton(onClick = { }) {
            Text(text = "Forgot Password?")
        }
        // we can also make any text clickable by doing like the above or below function
        /*
               Text(text = "Forgot Password?", modifier = Modifier.clickable {  })
         */
        
        Spacer(modifier = Modifier.height(7.dp))
        Text(text = "Or Sign In with")
        
        Spacer(modifier = Modifier.height(8.dp))

        Row {
            Image(painter = painterResource(id = R.drawable.google), contentDescription = "Google",
                modifier = Modifier
                    .size(30.dp)
                    .clickable {
                        // google clicked
                    }
            )

            Spacer(modifier = Modifier.size(15.dp))
            
            Image(painter = painterResource(id = R.drawable.facebook), contentDescription = "Facebook",
                modifier = Modifier
                    .size(30.dp)
                    .clickable {
                        // facebook clicked
                    }
            )

            Spacer(modifier = Modifier.size(15.dp))

            Image(painter = painterResource(id = R.drawable.x), contentDescription = "Twitter",
                modifier = Modifier
                    .size(30.dp)
                    .clickable {
                        // twitter clicked
                    }
            )
        }


    }

}