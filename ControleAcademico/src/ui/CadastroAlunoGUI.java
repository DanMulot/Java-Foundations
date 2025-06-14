package ui;

import java.io.PrintWriter;

import javax.swing.JOptionPane;

import model.Aluno;

public class CadastroAlunoGUI {
    public static void executar() throws Exception {
        String nome = JOptionPane.showInputDialog("Digite o nome do Aluno");
        String endereco = JOptionPane.showInputDialog("Digite o endereço do aluno");
        String idadeString = JOptionPane.showInputDialog("Digite a idade do aluno");
        int idade = Integer.parseInt(idadeString);
        String matricolaString = JOptionPane.showInputDialog("Digite a matricula do Aluno");
        int matricula = Integer.parseInt(matricolaString);

        Aluno aluno = new Aluno(nome, endereco ,idade, matricula);
        aluno .visualizar();

        // Persistencia de dados em arquivo - .txt
        PrintWriter out = new PrintWriter("alunos.txt");
        out.println("nome, endereco ,idade ,matricula");
        out.println(
            aluno.getNome() + "," +
            aluno.getEndereco() + "," +
            aluno.getIdade() + "," +
            aluno.getMatricula() 
             
        );
        out.close();






        }
}
