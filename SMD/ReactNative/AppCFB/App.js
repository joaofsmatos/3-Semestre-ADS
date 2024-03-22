import React, { useState } from 'react';
import { View, Text, StyleSheet, TouchableOpacity } from 'react-native';

// Componente de função responsivo
const ResponsiveComponent = () => {
  return (
    <View style={styles.content}>
      <Text style={styles.text}>Componente de Função</Text>
    </View>
  );
};

// Componente de classe
class ClassComponent extends React.Component {
  render() {
    return (
      <View style={styles.content}>
        <Text style={styles.text}>Componente de Classe</Text>
      </View>
    );
  }
}

// Componente principal do aplicativo
const App = () => {
  const [currentComponent, setCurrentComponent] = useState(true);

  // Função para alternar a visibilidade do componente
  const toggleComponent = () => {
    setCurrentComponent(!currentComponent);
  };

  return (
    <View style={styles.container}>
      {/* Renderização condicional baseada no estado currentComponent */}
      {currentComponent ? <ResponsiveComponent /> : <ClassComponent />}
      {/* Botão personalizado para alternar o componente */}
      <TouchableOpacity style={styles.button} onPress={toggleComponent}>
        <Text style={styles.buttonText}>Alternar </Text>
      </TouchableOpacity>
    </View>
  );
};

// Estilos do aplicativo
const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: 'blue', // Alterando a cor de fundo para azul
  },
  content: {
    backgroundColor: 'white', // Alterando a cor de fundo do conteúdo para branco
    borderRadius: 20, // Arredondando as bordas do conteúdo
    padding: 20,
    marginBottom: 20,
  },
  text: {
    fontSize: 20,
  },
  button: {
    backgroundColor: 'white', // Alterando a cor de fundo do botão para branco
    paddingVertical: 10,
    paddingHorizontal: 20,
    borderRadius: 20, // Arredondando as bordas do botão
  },
  buttonText: {
    color: 'blue', // Alterando a cor do texto do botão para azul
    fontSize: 16,
  },
});

export default App;