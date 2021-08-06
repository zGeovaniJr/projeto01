/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediasalunos;

import java.util.Scanner;

/**
 *
 * @author geovani.junior
 */
public class medias {
   
// quantos alunos tem a turma/ calcular media/ quantos alunos foram calculados
public static void main(String[]args) {
    int qtdMediasSomadas = 0;
Scanner sc = new Scanner(System.in);
System.out.println("quantos alunos deseja calcalar? ");
int turma = sc.nextInt();
for(int i = 0; 1 < turma; i++) {
    
    System.out.println("Digite o nome do aluno: ");
    String aluno = sc.next();
    
    System.out.println("Digite a primeira nota: ");
    double nota1 = sc.nextDouble();
    
    System.out.println("Digite a segunda nota: ");
    double nota2 = sc.nextDouble();
    
    double media = (nota1 + nota2) / 2;
    System.out.println("A media do aluno" + aluno + "foi: " + media);
    
    if(media >= 7) {
        System.out.println(" Aprovado... Parabens!");
    }
    else {
        System.out.println(" Reprovado!");
    }
    System.out.println("");
    qtdMediasSomadas++;
}
System.out.println("Você calculou a média de: " + qtdMediasSomadas + "alunos");
System.out.println("###Fim###");
} 
}
