public class DesempenhoEscolar {
    private int rmEstudante;
    private String nomeEstudante;
    private int bimestre;
    private String curso;
    private String disciplina;
    private double n1;
    private double n2;
    private double n3;
    private String mencaoFinal;
    private int totalFaltas;

    public DesempenhoEscolar(int rm, String disc, int bim, double n1, double n2, double n3){
        this.rmEstudante = rm;
        this.disciplina = disc;
        this.bimestre = bim;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }  

    public void setRmEstudante(int rmEstudante) {
        this.rmEstudante = rmEstudante;
    }

    public int getRmEstudante() {
        return rmEstudante;
    }

    public void setNomeEstudante(String nomeEstudante) {
        this.nomeEstudante = nomeEstudante;
    }

    public String getNomeEstudante() {
        return nomeEstudante;
    }

    public void setBimestre(int bimestre) {
        this.bimestre = bimestre;
    }

    public int getBimestre() {
        return bimestre;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN1() {
        return n1;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN2() {
        return n2;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    public double getN3() {
        return n3;
    }

    public void setTotalFaltas(int totalFaltas) {
        this.totalFaltas = totalFaltas;
    }

    public int getTotalFaltas() {
        return totalFaltas;
    }

    public String getMencaoFinal() {
        return mencaoFinal;
    }

    public String calculaMencaoFinal(){
        double media = (this.n1 + this.n2 + this.n3)/3;
        if (media > 8 ){
            this.mencaoFinal = "MB";
        } 
        else if (media >=7){
            this.mencaoFinal = "B";
        }
        else if (media >= 6){
            this.mencaoFinal = "R";
        }
        else{
            this.mencaoFinal = "I";
        }
        
        return this.mencaoFinal;
    }
}
