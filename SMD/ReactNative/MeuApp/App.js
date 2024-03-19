import React, { useState } from 'react';
import { StyleSheet, SafeAreaView } from 'react-native';
import Gasolina from './componentes/Gasolina';
import Etanol from './componentes/Etanol';
import BtnCalcular from './componentes/BtnCalcular';
import Resultado from './componentes/Resultado';
import ImgResultado from './componentes/ImgResultado';

export default function () {

  const [gasolina, setGasolina] = useState(0);
  const [etanol, setEtanol] = useState(0);
  const [resultado, setResultado] = useState('');

  const calcular = () => {
    if(!gasolina) {
      alert('Informe o preço da gasolina!');
      return
    }
    if(!etanol) {
      alert('Informe o preço do etanol!');
      return
    }
    let result;
    if(((etanol/gasolina)*100).toFixed(1) > 70) {
      result = 'Gasolina';
    } else {
      result = 'Etanol';
    }
    setResultado(result);
  }

  const limpar = () => {
    setResultado('');
  }

  const setarGasosa = (v) => {
    limpar();
    setGasolina(v);
  } 

  const setarEtanois = (v) => {
    limpar();
    setEtanol(v);
  } 

  return(
    <SafeAreaView style={estilos.principal}>
      <Gasolina aoModificar={setarGasosa}></Gasolina>
      <Etanol aoModificar={setarEtanois}></Etanol>
      <BtnCalcular aoPressionar={calcular}></BtnCalcular>
      <Resultado resultado={resultado}></Resultado>
      <ImgResultado comb={resultado.charAt(0)}></ImgResultado>
    </SafeAreaView>
  );
}

const estilos = StyleSheet.create({
  principal: {
    marginTop: '10%',
    padding: 10
  }
});