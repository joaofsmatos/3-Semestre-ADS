import React from 'react';
import { StyleSheet, Text, TextInput, View } from 'react-native';
import Comp1 from './componentes/comp1';

export default function App() {
  return(
    <View style={estilos.view}>
      <Comp1 nome="J. Francisco"/>
    </View>
  );
}

const estilos = StyleSheet.create({
  view: {
    backgroundColor: '#444',
    alignItems: 'center',
    width: '80%',
    height: '90%',
    marginTop: '10%',
    marginLeft: '10%',
  },  
});