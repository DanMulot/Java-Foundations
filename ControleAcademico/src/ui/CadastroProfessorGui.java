package ui;

import java.io.PrintWriter;

import javax.swing.JOptionPane;

import model.Professor;

public class CadastroProfessorGui {
    public static void executar() throws Exception {
        String nome = JOptionPane.showInputDialog("Digite o nome do Professor: ");
        String endereco = JOptionPane.showInputDialog("Digite o endereço do Professor: ");
        String idadeString = JOptionPane.showInputDialog("Digite a idade do Professor: ");
        int idade = Integer.parseInt(idadeString);
        String matriculaString=JOptionPane.showInputDialog("Digite a Matricula do Professor");
        int matricula=Integer.parseInt(matriculaString);
        String CPF = JOptionPane.showInputDialog("Digite o CPF do Professor: ");
        String atuacao = JOptionPane.showInputDialog("Digite Atucao do Professor");

        Professor professor = new Professor(nome, endereco, idade, matricula, CPF, atuacao);
        professor.visualizar();

        PrintWriter out = new PrintWriter("Professor.txt");
        out.println("nome, endereco ,idade ,CPF, Atuacao");
        out.println(
                        professor.getNome() + "," +
                        professor.getEndereco() + "," +
                        professor.getIdade() + "," +
                        professor.getCPF() + "," +
                        professor.getAtuacao());

        out.close();

    }
}
