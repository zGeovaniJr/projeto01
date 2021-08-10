/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import entidade.Aluno;
import javax.swing.JOptionPane;

/**
 *
 * @author geovani.junior
 */
public class TestaAluno {
    
    public static void main(String[] args) {
      Aluno aluno = new Aluno();
      String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
      
      System.out.println("Nome: " + aluno.getNome());
      
//      aluno.sobrenome = JOptionPane.showInputDialog("Digite o sobrenome do aluno");
//      aluno.idade = JOptionPane.showInputDialog("Digite a idade do aluno");
//
//      
//      aluno.salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salario do aluno"));
//      
//      aluno.cpf = Long.parseLong(JOptionPane.
//                                   showInputDialog("digite o cpf"));
//      
//        JOptionPane.showMessageDialog(null, "Nome: " + aluno.nome + " " + aluno.sobrenome + "\nidade: " + aluno.idade
//        + "\nSalario: " + aluno.salario + "\ncpf: " + aluno.cpf);
    }
}