import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';

export default function App() {
  return (
    <View style={styles.container}>
      <Text style={styles.baslik}>Merhaba React Native</Text>
      <Text style={{fontSize:18, color:"blue"}}> React Native Derslerimize Hoşgeldiniz. </Text>
      <StatusBar style="auto" />
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
  baslik:{
    fontSize:24,
    color:"red"
  }
});
