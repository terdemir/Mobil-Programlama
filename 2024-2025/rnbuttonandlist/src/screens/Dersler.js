import { StyleSheet, Text, View, FlatList } from 'react-native'
import React from 'react'

export default function Dersler() {
    const dersler = [
        { id: 1, name: "Python" },
        { id: 2, name: "React" },
        { id: 3, name: "React Native" },
        { id: 3, name: "Java" },
        { id: 4, name: "C#" },
    ]

    return (
        <View>
            <View style={{ alignItems: "center" }}>
                <Text style={{ fontSize: 24 }}>Dersler Listesi</Text>
            </View>
            <FlatList
                data={dersler}
                renderItem={({ item }) => {
                    return <Text style={styles.dersler}>{item.id}-{item.name}</Text>
                }}
                keyExtractor={item => item.id}
            />

        </View>
    )
}

const styles = StyleSheet.create({
    dersler: {
        fontSize: 18,
        color: "white",
        backgroundColor: "red",
        margin: 5,
        padding:5
    }
})