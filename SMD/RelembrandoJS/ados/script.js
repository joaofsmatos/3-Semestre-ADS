document.getElementById("interruptor").addEventListener("click", trocarImagem);
var estado = false;
function trocarImagem() {
    let i = 0;
    if(i === 0) {
        i = 1;
        
    }
    const imagens = ["imgs/apagada.png", "imgs/acesa.png"];
    let img = document.getElementById("imagem");
    if (!estado) {
        document.getElementById("interruptor").innerHTML = "Apagar";
    } else {
        document.getElementById("interruptor").innerHTML = "Acender";
    }
    estado = !estado;
    img.src = imagens[estado ? 1 : 0];
}