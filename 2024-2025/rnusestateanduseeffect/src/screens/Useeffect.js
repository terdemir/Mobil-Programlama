import { Button, StyleSheet, Text, View } from 'react-native'
import React, { useEffect, useState } from 'react'

export default function Useeffect() {
    const [sayac, setsayac] = useState(0)
    const [aktif, setaktif] = useState(true)
    useEffect(() => {
        if (!aktif) return;
        const intervalid = setInterval(() => {
            setsayac(sayac + 1)
        }, 1000)
        return () => { clearInterval(intervalid), [aktif] }
    })
    return (
        <View style={styles.container}>
            <View style={{ alignItems: "center" }}>
                <Text style={styles.metin}>Useeffect Kullanımı</Text>
            </View>
            <Button title={aktif ? "Durdur" : "Başlat"} onPress={() => aktif ? setaktif(false) : setaktif(true)} />
            <Button title='Sıfırla' onPress={() => setsayac(0)} />
                <View style={{alignItems:"center"}}>
                    <Text style={styles.metin}> {sayac}</Text>
                    </View>
            
        </View>
    )
}

const styles = StyleSheet.create({
    metin: {
        fontSize: 24
    },

})