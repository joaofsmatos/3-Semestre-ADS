import React, { useState } from "react";
import { StyleSheet, View, Text, TouchableHighlight } from "react-native";
import EntradaAltura from "./componentes/entradaAltura";
import EntradaPeso from "./componentes/entradaPeso";
import SaidaIMC from "./componentes/saidaIMC";

export default function () {
  const [getImc, setImc] = useState('');
  const [getAltura, setAltura] = useState(0);
  const [getPeso, setPeso] = useState(0);

  const calcularIMC = () => {
    if (!getAltura) {
      alert("Informe a altura");
      return;
    } if (!getAltura) {
      alert("Informe a altura");
      return;
    }
    setImc((getPeso / (getAltura * getAltura)).toFixed(2));
  }

  return (
    <View style={estilos.principal}>
      <View style={estilos.comp}>
        <EntradaAltura altura={setAltura}></EntradaAltura>
      </View>
      <View style={estilos.comp}>
        <EntradaPeso kg={setPeso}></EntradaPeso>
      </View>
      <View style={estilos.comp}>
        <TouchableHighlight onPress={calcularIMC}>
          <Text style={estilos.calcular}>CALCULAR</Text>
        </TouchableHighlight>
      </View>
      <View style={estilos.comp}>
        <SaidaIMC imc={getImc}></SaidaIMC>
      </View>
    </View>
  );
}

const estilos = StyleSheet.create({
  principal: {
    marginTop: '10%',
    padding: 10
  },
  calcular: {
    borderColor: 'blue',
    borderWidth: 2,
    borderRadius: 7,
    padding: '2%',
    color: 'white',
    backgroundColor: 'blue',
    justifyContent: 'center',
    textAlign: 'center'
  },
  comp: {
    marginBottom: 10,
  }
});
