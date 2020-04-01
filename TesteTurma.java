import javax.swing.JOptionPane;
public class TesteTurma
{
   public static void main (String [] args)
   {
      // coletando dados
      
      String nome = JOptionPane.showInputDialog(" Nome ");
      String curso = JOptionPane.showInputDialog(" Curso ");
      int quantidade = Integer.parseInt(JOptionPane.showInputDialog(" Quantidade de alunos " ));
      int serie = Integer.parseInt(JOptionPane.showInputDialog(" Serie do aluno " ));
      
      //objeto 
      Turma turma = new Turma(nome, curso, quantidade, serie);
      
      // String de saida
      
      String resultado = " Nome: " + turma.getNome() + "\nCurso: " + turma.getCurso() + "\nQuantidade: " + turma.getQuantidade() + "\nSerie: " + turma.getSerie();
      
      // Mostra aluno
      
      JOptionPane.showMessageDialog(null, resultado);
      
      // Altere informações 
      quantidade = Integer.parseInt( JOptionPane.showInputDialog (" Quantidade de alunos" ));
      
      // muda usando os metodo modificadores
      
      turma.setQuantidade(quantidade);
      
      // mostra novamente o cadastro do aluno
      // monta a String de saida chamando os metodos de acesso do aluno
      resultado =  " Nome: " + turma.getNome() + "\nCurso: " + turma.getCurso() + "\nQuantidade: " + turma.getQuantidade() + "\nSerie: " + turma.getSerie();
      
      
      // Mostra aluno
      
      JOptionPane.showMessageDialog(null, resultado);
   }
   
}