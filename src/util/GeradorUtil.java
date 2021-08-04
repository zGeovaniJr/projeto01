/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author geovani.junior
 */
public class GeradorUtil {

    /**
     * Retorna um valor String conforme a quantidade de numero solicitado
     *
     */
    public String gerarNumero(int qtde) {
        String senha = "";
        int numero;
        for (int i = 0; i < qtde; i++) {
            numero = (int) (Math.random() * 10);
            senha = senha + numero;
        }
        return senha;
    }

    public String gerarCpf() {
        return gerarNumero(3) + "." + gerarNumero(3) + "." + gerarNumero(3) + "-" + gerarNumero(2);
    }

    public String gerarCnpj() {
        return gerarNumero(2) + "." + gerarNumero(3) + "." + gerarNumero(3) + "/" + gerarNumero(4) + "-" + gerarNumero(2);
    }

    public String gerarTlfnFx() {
        return "(48)3" + gerarNumero(3) + "-" + gerarNumero(4);
    }

    public String gerarNmrCel() {
        return "(48)9" + gerarNumero(3) + "-" + gerarNumero(4);
    }

    public String gerarCep() {
        return gerarNumero(5) + "-" + gerarNumero(3);
    }

    public double gerarSalario() {
        int numero = (int) (Math.random() * 100000);
        return numero;
    }

    public String gerarNome() {
        String[] nomes = {"Geovani", "João", "Maria", "Pedro", "luiz", "Aline",
            "Gabriel", "Bernardo", "José", "Vinicius", "Lucas", "Ana", "Camila",
            "Catarina", "Nilzete", "Antonio", "Igor", "Vilson", "Carlos", "Julia"};
        int tamanhoLista = nomes.length;
        int indice = (int) (Math.random() * tamanhoLista);
        return nomes[indice] + " " + gerarSobrenome();
    }
    public String gerarSobrenome() {
        String[] nomes = {"Souza", "Silva", "Santos", "Emiliano", "Pereira", "Pires",
            "Mota", "Rocha", "Assis", "Garcez", "Carvalho", "Correia", "Oliveira",
            "Martinez", "Almeida", "Duarte", "Ferreira", "Rodrigues", "Alves", "Vasconcelos"};
        int tamanhoLista = nomes.length;
        int indice = (int) (Math.random() * tamanhoLista);
        return nomes[indice];
    }

    public static void main(String[] args) {
        GeradorUtil util = new GeradorUtil();
        
        String nome = util.gerarNome();
        System.out.println("Nome :" + nome);
    }
   
}