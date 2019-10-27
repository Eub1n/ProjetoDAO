
public class Monitor {
	private String nome , materia, horario;
	private int  matricula;
	private static int id = 0;
	
	public Monitor() {
		id++;
		this.nome= "Sem nome";
		this.materia= "//";
		this.horario= "00:00";
		this.matricula = 0;
	}
	
	public Monitor(String nome, String materia, String horario, int matricula) {
		id++;
		this.nome= nome;
		this.materia= materia;
		this.horario= horario;
		this.matricula = matricula;
	}
			
	public int getid() {
		return id;
	}
	
	public String getnome() {
		return nome;
	}
	
	public void setnome(String nome) {
		this.nome = nome;
	}
	
	public String getmateria() {
		return materia;
	}
	
	public void setmateria(String materia) {
		this.materia = materia;
	}
	
	public int getmatricula() {
		return matricula;
	}
	
	public void setmatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String gethorario() {
		return horario;
	}
	
	public void sethorario(String horario) {
		this.horario = horario;
	}
	
	public String toString() {
        return "||ID: " + id+ "| Monitor: " + nome + "|  Disciplina: " + materia + "|  Horário: " + horario+"||";
    }
	
	
}
