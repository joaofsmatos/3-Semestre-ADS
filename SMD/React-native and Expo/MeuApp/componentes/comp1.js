import React from 'react';
import {StyleSheet, Text, View } from 'react-native';

export default function(propriedades) {
    return(
        <View>
            <Text style={estilos.txt1}>CFB Cursos</Text>
            <Text style={estilos.txt2}>{propriedades.nome}</Text>
        </View>
    );
}

const estilos = StyleSheet.create({
    txt1:{
        color:'#f00',
        fontSize: 35,
        marginTop: '10%'
    },
    txt2:{
        color:'#009900',
        fontSize: 35,
        marginTop: '10%'
    },
});