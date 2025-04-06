import { StyleSheet, Text, View, Button} from 'react-native'
import React, { useState } from 'react'

export default function Usestate() {
    const [sayac, setsayac]=useState(0)

  return (
    <View>
        <View style={{alignItems:"center"}}>
            <Text style={styles.metin}>Usestate Kullanımı</Text>
        </View>
        <Button title='Artır' onPress={()=>{
            setsayac(sayac+1)
        }}/>
        <Button title='Azalt' onPress={()=>{
            setsayac(sayac-1)
        }}/>
      <View style={{alignItems:"center"}}>
            <Text style={styles.metin}>Sayı={sayac}</Text>
        </View>

    </View>
  )
}

const styles = StyleSheet.create({
    metin:{
        fontSize:24,
        margin:15
    }
})