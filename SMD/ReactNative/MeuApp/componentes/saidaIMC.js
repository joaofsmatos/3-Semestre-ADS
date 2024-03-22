import { Text, View, StyleSheet } from "react-native";

export default props => {
    const categoria = () => {
        if(props.imc) {
            if (props.imc < 18.5) {
              return "Baixo peso";
            } else if (props.imc >= 18.5 && props.imc <= 24.9) {
                return "Peso saudável";
            } else if (props.imc >= 25 && props.imc <= 29.9) {
                return "Sobrepeso";
            } else {
                return "Obesidade";
            }
          }
    }
    return(
        <View style={estilos.bloco}>
            <Text style={estilos.mensagem}>IMC: {props.imc}</Text>
            <Text style={estilos.mensagem}>Categoria: {categoria()}</Text>
        </View>
    );
}

const estilos = StyleSheet.create({
    bloco: {
        marginBottom: 10
    },
    mensagem: {
        fontSize: 35,
        color: 'black',
    },
    entrada: {
        borderColor: 'red',
        borderWidth: 2,
        borderRadius: 7,
        padding: '2%'
    }
});