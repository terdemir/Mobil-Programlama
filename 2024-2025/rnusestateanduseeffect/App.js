// In App.js in a new project

import * as React from 'react';
import { View, Text } from 'react-native';
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';
import Anasayfa from './src/screens/Anasayfa';
import Usestate from './src/screens/Usestate';
import Useeffect from './src/screens/Useeffect';



const Stack = createNativeStackNavigator();

function RootStack() {
  return (
    <Stack.Navigator initialRouteName='Anasayfa'>
      <Stack.Screen name="Anasayfa" component={Anasayfa} />
      <Stack.Screen name="Usestate" component={Usestate} />
      <Stack.Screen name="Useeffect" component={Useeffect} />
    </Stack.Navigator>
  );
}

export default function App() {
  return (
    <NavigationContainer>
      <RootStack />
    </NavigationContainer>
  );
}