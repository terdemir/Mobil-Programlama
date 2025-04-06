import { StyleSheet, Text, View, Image } from 'react-native'
import React from 'react'

export default function Dersler({imgsrc,baslik,aciklama}) {
  return (
    <View>
      <Image style={styles.img} source={imgsrc}/>
      <View style={styles.metinler}>
        <Text style={styles.baslik}>{baslik}</Text>
        <Text style={styles.aciklama}>{aciklama}</Text>
      </View>
    </View>
  )
}

const styles = StyleSheet.create({
    img:{
        width:"100%",
        height:'300',
    },
    metinler:{
        alignItems:"center"
    },
    baslik:{
        fontSize:30
    },
    aciklama:{
        fontSize:20
    }
})