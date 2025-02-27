alert('Boas vindas ao nosso site!');
let numeroDeVendas = 50;
let saldoDisponivel = 1000;
let mensagemDeErro = 'Erro! Preencha todos os campos';
alert(mensagemDeErro);
let nomeDeUsuario = prompt('Qual é o seu nome de usuário?');
let idade = prompt('Qual é a sua idade?');

if (idade >= 18){
    alert('Pode tirar a habilitação!');
}