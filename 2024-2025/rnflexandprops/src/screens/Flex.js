import { StyleSheet, Text, TouchableHighlight, View } from 'react-native'
import React from 'react'

export default function Flex({navigation}) {
    return (
        <View style={styles.boxes}>
          
            <View style={[styles.box, styles.box1]}>
                <TouchableHighlight onPress={()=>navigation.navigate("Dersler")}>
                    <Text style={{fontSize:20, color:"white"}}>Dersleri görüntülemek için tıklayınız.</Text>
                </TouchableHighlight>
            </View>
            <View style={[styles.box, styles.box2]}>
                <Text>Kutu 2</Text>
            </View>
            <View style={styles.box3}>
           
                <View style={styles.box4}>
                <Text>Kutu 4</Text>
                </View>
                <View style={styles.box5}>
                <Text>Kutu 5</Text>
                </View>
            </View>
        </View>
    )
}

const styles = StyleSheet.create({
    boxes:{
        flex:1,
        backgroundColor:"white",
    },
    box:{
        padding:20,
        margin:10,
        justifyContent:"center",
        alignItems:"center"
    },
    box1:{
        flex:1,
        backgroundColor:"blue"
    },
    box2:{
        flex:1,
        backgroundColor:"grey"
    },
    box3:{
        flex:1,
        backgroundColor:"white",
        flexDirection:"row",
        margin:10,
    },
    box4:{
         flex:2,
        backgroundColor:"green"
    },
    box5:{
        flex:1,
       backgroundColor:"purple"
   }


})