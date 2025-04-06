import { ScrollView, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import Dersler from '../../components/Dersler'

export default function Props() {
  return (
   <ScrollView>
    <Dersler
        imgsrc={require("../../images/rn.jpeg")}
        baslik="React Native Dersleri"
        aciklama="Detaylı React Native Kursu İçeriği"
    />
    <Dersler
        imgsrc={require("../../images/an.png")}
        baslik="Angular Dersleri"
        aciklama="Detaylı Angular Kursu İçeriği"
    />
    <Dersler
        imgsrc={require("../../images/py.webp")}
        baslik="Python Dersleri"
        aciklama="Detaylı Python Kursu İçeriği"
    />
   </ScrollView>
  )
}

const styles = StyleSheet.create({})