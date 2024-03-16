import React, { useState } from 'react';
import { View, Text, TextInput, Button, StyleSheet } from 'react-native';

export default function () {
  const [valorNum1, alterarNum1] = useState('');
  const [valorNum2, alterarNum2] = useState('');
  const [valorSoma, alterarSoma] = useState('');

  const somarDoisValores = () => {
    const resultado = parseFloat(valorNum1) + parseFloat(valorNum2);
    alterarSoma(resultado.toString());
  };

  return (
    <View style={styles.container}>
      <Text style={styles.texto}>Digite o primeiro número:</Text>
      <TextInput
        style={styles.entrada}
        onChangeText={entrada => alterarNum1(entrada)}
        value={valorNum1}
        keyboardType="numeric"
      />
      <Text style={styles.texto}>Digite o segundo número:</Text>
      <TextInput
        style={styles.entrada}
        onChangeText={text => alterarNum2(text)}
        value={valorNum2}
        keyboardType="numeric"
      />
      <Button title="Somar" onPress={somarDoisValores} />
      <Text style={styles.resultado}>A soma é: {valorSoma}</Text>
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