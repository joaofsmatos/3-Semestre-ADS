import { View, Text, StyleSheet } from "react-native";

export default props => {
    return (
        <View style={estilos.bloco}>
            <Text style={estilos.txt}>Melhor combustível: {props.resultado}</Text>
        </View>
    );
}

const estilos = StyleSheet.create({
  bloco: {
    marginBottom: 10
  },
  txt: {
    fontSize: 30
  }
});