import { StyleSheet, Text, View, Button, TouchableHighlight, TouchableOpacity, TouchableWithoutFeedback } from 'react-native'
import React from 'react'

export default function Anasayfa({navigation}) {


    return (
        <View>
            <Button
                onPress={() => navigation.navigate("Dersler")}
                title="Dersler Sayfası"
            />

            <TouchableHighlight
                activeOpacity={0.9}
                underlayColor="#DDDDDD"
                onPress={() => alert('Buton 2 ye tıkladınız')}>
                <Text> Buton 2 ye Tıkla</Text>
            </TouchableHighlight>

            <TouchableOpacity style={styles.button} onPress={() => alert('Buton 3 e tıkladınız')}>
                <Text>Buton 3 e tıkla</Text>
            </TouchableOpacity>

            <TouchableWithoutFeedback onPress={() => alert('Buton 4 e tıkladınız')}>
                <View style={styles.button}>
                    <Text>Buton 4 e Tıkla</Text>
                </View>
            </TouchableWithoutFeedback>


        </View>
    )
}

const styles = StyleSheet.create({
    button: {
        fontSize: 14,
        color: "blue",
        fontWeight: "400",
        marginTop: 5
    }
})