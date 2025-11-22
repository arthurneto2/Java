package exemplos.POO.classes.escola;

public class Aluno {
    String nome;
    String matricula;
    String curso;
    String[] disciplinas;
    double[] notas;

    public Aluno(){
        disciplinas = new String[3];
        notas = new double[3];
    }

    public boolean aprovado (double nota){
        return nota >= 7;
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

    public void setNotas(double[] notas) {
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

    public double[] getNotas() {
        return notas;
    }
}
