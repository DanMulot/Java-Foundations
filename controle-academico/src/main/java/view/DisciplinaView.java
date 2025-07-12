package view;

import javax.swing.JOptionPane;

import model.Disciplina;
import repository.DisciplinaRepository;

public class DisciplinaView {
    public static void executar(){
        String idString = JOptionPane.showInputDialog("Digite o Id da Disciplina");
        int id = Integer.parseInt(idString);
        String nome = JOptionPane.showInputDialog("Digite o nome da Disciplina");
        String cargaHorariaString = JOptionPane.showInputDialog("Digite a cargaHoraria");
        int cargaHoraria = Integer.parseInt(cargaHorariaString);
        String categoriaString = JOptionPane.showInputDialog("Digite a Categoria");

        Disciplina disciplina = new Disciplina(id, nome, cargaHoraria, categoriaString);
        DisciplinaRepository.salvar(disciplina);

    }
}