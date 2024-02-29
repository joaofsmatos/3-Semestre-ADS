import React, { useState } from 'react';
import { View, Text, TextInput, Button, StyleSheet } from 'react-native';

export default function () {
  const [getNum1, setNum1] = useState('');
  const [getNum2, setNum2] = useState('');
  const [getSoma, setSoma] = useState('');

  const somarDoisValores = () => {
    const resultado = parseFloat(getNum1) + parseFloat(getNum2);
    setSoma(resultado.toString());
  };

  return (
    <View style={styles.container}>
      <Text style={styles.texto}>Digite o primeiro número:</Text>
      <TextInput
        style={styles.entrada}
        onChangeText={entrada => setNum1(entrada)}
        value={getNum1}
        keyboardType="numeric"
      />
      <Text style={styles.texto}>Digite o segundo número:</Text>
      <TextInput
        style={styles.entrada}
        onChangeText={text => setNum2(text)}
        value={getNum2}
        keyboardType="numeric"
      />
      <Button title="Somar" onPress={somarDoisValores} />
      <Text style={styles.resultado}>A soma é: {getSoma}</Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    padding: 20,
  },
  texto: {
    fontSize: 18,
    marginBottom: 10,
  },
  entrada: {
    width: '100%',
    height: 40,
    borderColor: 'gray',
    borderWidth: 1,
    marginBottom: 20,
    paddingHorizontal: 10,
  },
  resultado: {
    fontSize: 20,
    marginTop: 20,
  },
});