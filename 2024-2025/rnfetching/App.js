import { StatusBar } from 'expo-status-bar';
import { useEffect, useState } from 'react';
import { FlatList, StyleSheet, Text, View } from 'react-native';

export default function App() {

  const [veri, setveri]=useState(null)
  useEffect(()=>{
    fetch("https://jsonplaceholder.typicode.com/comments")
    .then(Response=>Response.json())
    .then(veri=>{setveri(veri)})
    .catch(error=>{
      alert("Veriler Çekilemedi")
    })
  })
  return (
    <View style={styles.container}>
      <FlatList data={veri}
      renderItem={({item})=>(
        <Text style={{fontSize:20}}>{item.id}-{item.name}</Text>
      )}
      />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
