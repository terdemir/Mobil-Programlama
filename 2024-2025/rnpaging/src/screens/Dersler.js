import { StyleSheet, Text, View, Button } from 'react-native'
import React from 'react'

export default function Dersler({navigation, route}) {
    const {ders1, ders2}=route.params;
  return (
    <View>
      <View style={{alignItems:"center"}}><Text style={{fontSize:24, color:"red"}}>Dersler Listesi</Text></View>
      <Text style={styles.dersler}>{ders1}</Text>
      <Text style={styles.dersler}>{ders2}</Text>
      <Button title='Geri Dön' onPress={()=>navigation.goBack()}/>
    </View>
  )
}

const styles = StyleSheet.create({
    dersler:{
        fontSize:18,
        color:"grey",
        margin:5
    }
})