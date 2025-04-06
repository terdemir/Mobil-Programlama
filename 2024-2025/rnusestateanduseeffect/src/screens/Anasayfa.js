import { Button, StyleSheet, Text, View } from 'react-native'
import React from 'react'

export default function Anasayfa({navigation}) {
  return (
    <View>
      <Button title='UseState Örnek' onPress={()=>navigation.navigate("Usestate")}/>
      <Button title='UseEffect Örnek' onPress={()=>navigation.navigate("Useeffect")}/>
    </View>
  )
}

const styles = StyleSheet.create({})