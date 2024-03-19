import { View, Image, StyleSheet } from "react-native";

export default props => {
    return (
        <View style={estilos.bloco}>
          {
            props.comb == '' ?
              <Image source={require('../assets/combustivel.png')} style={estilos.bomba}></Image>
            :  
            props.comb == 'G' ?
                <Image source={require('../assets/gasosa.png')} style={estilos.bomba}></Image>
            :
              <Image source={require('../assets/etainois.png')} style={estilos.bomba}></Image>
          }
        </View>
    );
}

const estilos = StyleSheet.create({
  bloco: {
    marginBottom: 10,
    justifyContent: 'center',
    alignItems: 'center'
  },
  bomba: {
    resizeMode: 'stretch'
  }
});