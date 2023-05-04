# Atv07

Elabore uma classe que receba 5 notas de alunos por meio de showInputDialog, armazene essas notas em um array de cinco elementos, apresente em tela as cinco notas em ordem decrescente (da maior para a menor) e a média aritmética das notas.


IFPR - Campus Cascavel

Aluno: Gabriel Costa de Moraes

Turma: 3° INF 2023

Disciplina: Programação orientada a Objetos Professor: Nelson Bellincanta

```
public class a
{
	public static void main(String[] args) {

		String aux; // str axuliar para o JOptionPane
        int vetor[] new int[5]; //declaração e alocação do vetor

        
        for (int i = 0; i < 5; i++){ //iniciando um for para repetir 5 vezes a entrada da nota

            //entrada dos dados com a classe JOptionPane
            aux = JOptionPane.showInputDialog("Entre com a nota da primeira prova");
            //conversao dos dados para float e armazenando o dado no vetor
            vetor[i] = Float.parseFloat(aux); 

        } //fim do for 

        // organizando o vetor do maior para o menor (decrescente)

        boolean repetir;
        do {
            repetir = false;
             
            for (int i = 1; i < vetor.length; i++) {
                if (vetor[i - 1] > vetor[i]) {
                    int temp = vetor[i -1];
                    vetor[i - 1] = vetor[i];
                    vetor[i] = temp;
                    repetir = true;
                }
            }
        } while (repetir);


        JOptionPane.showMessageDialog(null, "Notas organizadas = " + vetor);
        
	}
}


```
