import { TextInput, View, Text, StyleSheet } from "react-native";

export default props => {
    return (
        <View style={estilos.bloco}>
            <Text style={estilos.texto}>Digite o valor da Gasolina:</Text>
            <TextInput style={estilos.txt} placeholder="R$ 00,0" keyboardType="numeric" onChangeText={text => props.aoModificar(text)}>
            </TextInput>
        </View>
    );
}

const estilos = StyleSheet.create({
  bloco: {
    marginBottom: 10
  },
  txt: {
    borderColor: 'red',
    borderWidth: 2,
    borderRadius: 7,
    padding: '2%'
  },
  texto: {
    fontSize: 30
  }
});