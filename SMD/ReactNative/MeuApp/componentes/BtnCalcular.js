import { TouchableHighlight, View, Text, StyleSheet } from "react-native";

export default props => {
    return (
        <View style={estilos.bloco}>
            <TouchableHighlight style={estilos.btn} onPress={props.aoPressionar}>    
                <Text style={estilos.txtBtn}>calcular</Text>
            </TouchableHighlight>
        </View>
    );
}

const estilos = StyleSheet.create({
  bloco: {
    marginBottom: 10
  },
  txtBtn: {
    textTransform: 'uppercase',
    color: 'white',
    fontSize: 20
  },
  btn: {
    backgroundColor: 'blue',
    justifyContent: 'center',
    alignItems: 'center',
    borderRadius: 7,
    padding: '5%',
    width: '100%'
  }
});