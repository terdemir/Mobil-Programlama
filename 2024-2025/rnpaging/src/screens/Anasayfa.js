import { StyleSheet, Text, View, Button } from 'react-native'
import React from 'react'

export default function Anasayfa({navigation}) {
  return (
    <View style={styles.baslikalani}>
      <Text style={styles.baslik}>Seçenekler</Text>
      <Button title='Dersler Listesi' onPress={()=>navigation.navigate("Dersler",{
        ders1:"Mobil Uygulamalar ve Programlama",
        ders2:"Python Programlama"
      } )} />
    </View>
  )
}

const styles = StyleSheet.create({
    baslik:{
        fontSize:30,
        color:"red"
    },
    baslikalani:{
        alignItems:"center",
    }
})