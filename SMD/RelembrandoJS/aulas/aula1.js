document.getElementById("bt").addEventListener("click", mudarDiv);
function mudarDiv() {
    let texto = document.getElementById("entrada").value;
    document.getElementById("saida").innerHTML = `<h1>${texto}</h1>`;
}