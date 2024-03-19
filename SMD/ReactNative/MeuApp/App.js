import React, { useState } from 'react';
<<<<<<< HEAD
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
=======
import { View, TouchableOpacity, Text, StyleSheet } from 'react-native';

export default function App() {
  const [numero, setNumero] = useState('');
  const [conta, setConta] = useState('');

  const imprimirNumero = (numero) => {
    if (numero == 'C') {
      setConta('');
    } else if (numero == '<') {
      const novaConta = conta.slice(0, -1); // Remover o último caractere da conta
      setConta(novaConta);
    } else {
      const novaConta = conta + numero + ' ';
      setConta(novaConta);
    }
  };
  

  return (
    <View style={styles.container}>
      <Text style={styles.buttonText}>{conta}</Text>
      <Text style={styles.buttonText}></Text>
      <Text style={styles.buttonText}></Text>
      <View style={styles.row}>
      <TouchableOpacity style={styles.button} onPress={() => imprimirNumero('<')}>
          <Text style={styles.buttonText}>&#x25C0;</Text>
        </TouchableOpacity>
        <TouchableOpacity style={styles.button} onPress={() => imprimirNumero('C')}>
          <Text style={styles.buttonText}>C</Text>
        </TouchableOpacity>
        <TouchableOpacity style={styles.button} onPress={() => imprimirNumero('+')}>
          <Text style={styles.buttonText}>+</Text>
        </TouchableOpacity>
        <TouchableOpacity style={styles.button} onPress={() => imprimirNumero('-')}>
          <Text style={styles.buttonText}>-</Text>
        </TouchableOpacity>
        <TouchableOpacity style={styles.button} onPress={() => imprimirNumero('x')}>
          <Text style={styles.buttonText}>x</Text>
        </TouchableOpacity>
        <TouchableOpacity style={styles.button} onPress={() => imprimirNumero('/')}>
          <Text style={styles.buttonText}>/</Text>
        </TouchableOpacity>
      </View>
      <View style={styles.row}>
        <TouchableOpacity style={styles.button} onPress={() => imprimirNumero(1)}>
          <Text style={styles.buttonText}>1</Text>
        </TouchableOpacity>
        <TouchableOpacity style={styles.button} onPress={() => imprimirNumero(2)}>
          <Text style={styles.buttonText}>2</Text>
        </TouchableOpacity>
        <TouchableOpacity style={styles.button} onPress={() => imprimirNumero(3)}>
          <Text style={styles.buttonText}>3</Text>
        </TouchableOpacity>
      </View>
      <View style={styles.row}>
        <TouchableOpacity style={styles.button} onPress={() => imprimirNumero(4)}>
          <Text style={styles.buttonText}>4</Text>
        </TouchableOpacity>
        <TouchableOpacity style={styles.button} onPress={() => imprimirNumero(5)}>
          <Text style={styles.buttonText}>5</Text>
        </TouchableOpacity>
        <TouchableOpacity style={styles.button} onPress={() => imprimirNumero(6)}>
          <Text style={styles.buttonText}>6</Text>
        </TouchableOpacity>
      </View>
      <View style={styles.row}>
        <TouchableOpacity style={styles.button} onPress={() => imprimirNumero(7)}>
          <Text style={styles.buttonText}>7</Text>
        </TouchableOpacity>
        <TouchableOpacity style={styles.button} onPress={() => imprimirNumero(8)}>
          <Text style={styles.buttonText}>8</Text>
        </TouchableOpacity>
        <TouchableOpacity style={styles.button} onPress={() => imprimirNumero(9)}>
          <Text style={styles.buttonText}>9</Text>
        </TouchableOpacity>
      </View>
      <View style={styles.row}>
        <TouchableOpacity style={styles.button} onPress={() => imprimirNumero(0)}>
          <Text style={styles.buttonText}>0</Text>
        </TouchableOpacity>
      </View>
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
  row: {
    flexDirection: 'row',
    marginBottom: 10,
  },
  button: {
    flex: 1,
    backgroundColor: '#DDDDDD',
    padding: 20,
    marginHorizontal: 5,
    borderRadius: 10,
    alignItems: 'center',
    justifyContent: 'center',
  },
  buttonText: {
    fontSize: 20,
  },
>>>>>>> 70cdd773dd1a5db718572d930ed60297d8a4fdf4
});