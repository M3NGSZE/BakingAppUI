package com.example.bankingapp

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AttachMoney
import androidx.compose.material.icons.rounded.CurrencyExchange
import androidx.compose.material.icons.rounded.CurrencyPound
import androidx.compose.material.icons.rounded.CurrencyYen
import androidx.compose.material.icons.rounded.CurrencyYuan
import androidx.compose.material.icons.rounded.Euro
import androidx.compose.material.icons.rounded.KeyboardArrowDown
import androidx.compose.material.icons.rounded.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bankingapp.data.Currency

val currency = listOf(
    Currency(
        name = "USD",
        buy = 23.35f,
        sell = 23.25f,
        icon = Icons.Rounded.AttachMoney
    ),
    Currency(
        name = "EUR",
        buy = 13.35f,
        sell = 13.25f,
        icon = Icons.Rounded.Euro
    ),
    Currency(
        name = "JPY",
        buy = 26.35f,
        sell = 26.25f,
        icon = Icons.Rounded.CurrencyYen
    ),
    Currency(
        name = "GBP",
        buy = 15.75f,
        sell = 15.60f,
        icon = Icons.Rounded.CurrencyPound
    ),
    Currency(
        name = "AUD",
        buy = 16.25f,
        sell = 16.10f,
        icon = Icons.Rounded.CurrencyExchange
    ),
    Currency(
        name = "CAD",
        buy = 17.05f,
        sell = 16.90f,
        icon = Icons.Rounded.CurrencyExchange
    ),
    Currency(
        name = "CHF",
        buy = 18.45f,
        sell = 18.30f,
        icon = Icons.Rounded.CurrencyExchange
    ),
    Currency(
        name = "CNY",
        buy = 3.65f,
        sell = 3.55f,
        icon = Icons.Rounded.CurrencyYuan
    ),
    Currency(
        name = "KRW",
        buy = 0.021f,
        sell = 0.020f,
        icon = Icons.Rounded.CurrencyExchange
    ),
    Currency(
        name = "KHR",
        buy = 4100f,
        sell = 4000f,
        icon = Icons.Rounded.CurrencyExchange
    )
)

@Preview
@Composable
fun CurrencySection(){
    var isVisible by remember {
        mutableStateOf(false)
    }
    var iconState by remember {
        mutableStateOf(Icons.Rounded.KeyboardArrowUp)
    }
    Column (
        modifier = Modifier
            .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
            .background(MaterialTheme.colorScheme.inverseOnSurface)
            .animateContentSize()
    ){
        Row (
            modifier = Modifier
                .padding(16.dp)
                .animateContentSize()
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ){
            Box(
                modifier = Modifier
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.secondary)
                    .clickable{
                        isVisible = !isVisible
                        if (isVisible) {
                            iconState = Icons.Rounded.KeyboardArrowUp
                        } else{
                            iconState = Icons.Rounded.KeyboardArrowDown
                        }
                    }
            ){
                Icon(
                    modifier = Modifier.size(25.dp),
                    imageVector = iconState,
                    contentDescription = "Currency",
                    tint = MaterialTheme.colorScheme.onSecondary
                )
            }

            Spacer(modifier = Modifier.width(20.dp))

            Text(
                text = "Currencies",
                fontSize = 20.sp,
                color = MaterialTheme.colorScheme.onSecondaryContainer,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier
            .height(1.dp)
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.secondaryContainer)
        )

    }
}

