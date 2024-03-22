import { TextInput, Text, View, StyleSheet } from "react-native";

export default props => {
    return(
        <View style={estilos.bloco}>
            <Text style={estilos.mensagem}>Digite seu peso</Text>
            <TextInput 
                style={estilos.entrada} 
                placeholder="99.99" 
                keyboardType="numeric"
                onChangeText={text => props.kg(text)}
            />
        </View>
    );
}

const estilos = StyleSheet.create({
    bloco: {
        marginBottom: 10
    },
    mensagem: {
        fontSize: 40,
        color: 'black',
    },
    entrada: {
        borderColor: 'red',
        borderWidth: 2,
        borderRadius: 7,
        padding: '2%'
    }
});