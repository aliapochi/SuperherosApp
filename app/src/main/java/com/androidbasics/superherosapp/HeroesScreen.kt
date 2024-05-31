package com.androidbasics.superherosapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.androidbasics.superherosapp.model.Hero

@Composable
fun HeroItem(
    hero: Hero,
    modifier: Modifier = Modifier

){
    Card(
        modifier = Modifier
            .padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 16.dp)
            .clip(MaterialTheme.shapes.large)
    ){
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 8.dp, end = 8.dp, top = 8.dp, bottom = 8.dp)
        ){
            Row(modifier = Modifier
                .height(72.dp)
            ){
                Column{
                    Text(//Name of hero
                        text = stringResource(hero.nameRes),
                        style = MaterialTheme.typography.displayMedium
                    )
                    Text(//Description of hero
                        text = stringResource(hero.descriptionRes),
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
                //Spacer(modifier = Modifier.width(16.dp))
                Spacer(Modifier.weight(1f))
                Image(//Superhero Image
                    modifier = Modifier.clip(MaterialTheme.shapes.small),
                    painter = painterResource(hero.imageRes),
                    contentDescription = null
                )
            }
        }
    }
}