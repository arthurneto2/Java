package exemplos.POO.classes.escola;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private String[] disciplinas;
    private double[][] notas;

    public Aluno(){
        disciplinas = new String[3];
        notas = new double[3][3];
    }

    public double calculaMedia(int disciplinaIndex) {
        double soma = 0;
        for (int i = 0; i < notas[disciplinaIndex].length; i++) {
            soma += notas[disciplinaIndex][i];
        }
        return soma / notas[disciplinaIndex].length;
    }

    public boolean verificaAprovacao (int disciplinaIndex, int notaMinima) {
        double media = calculaMedia(disciplinaIndex);
        return media >= notaMinima;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public double[][] getNotas() {
        return notas;
    }
}
