
public class App {

	public static void main(String[] args) {
		String nome, materia, horario;
		int matricula;
		nome = "weber";
		materia = "Calculo";
		horario = "15:00";
		matricula = 644383;
		MonitorDAO testedao = new MonitorDAO();
		Monitor monitor1 = new Monitor(nome,materia,horario,matricula);
		Monitor monitor2 = new Monitor();
		testedao.addMonitor(monitor1);
		testedao.addMonitor(monitor2);
		testedao.deleteMonitor("2");
		System.out.print("eh isso");

	}

}
