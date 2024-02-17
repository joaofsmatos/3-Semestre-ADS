// Importa a biblioteca readline
const readline = require('readline');

// Cria uma interface para leitura de entrada do usuário
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

// Função para verificar se um número é par ou ímpar
function verificarParOuImpar(numero) {
    if (numero % 2 === 0) {
        return "par";
    } else {
        return "ímpar";
    }
}

// Função principal
function main() {
    // Solicita ao usuário que insira um número
    rl.question("Digite um número: ", (numero) => {
        // Converte o número para inteiro
        numero = parseInt(numero);

        // Verifica se o número inserido é válido
        if (isNaN(numero)) {
            console.log("Por favor, insira um número válido.");
        } else {
            // Verifica se o número é par ou ímpar
            const resultado = verificarParOuImpar(numero);

            // Exibe o resultado
            console.log(`O número ${numero} é ${resultado}.`);

            // Fecha a interface de leitura
            rl.close();
        }
    });
}

// Chama a função principal
main();