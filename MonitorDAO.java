import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.IOException;

public class MonitorDAO {
		
	private static FileOutputStream arquivoOut;
	private static File inputFile;
	private static File tempFile;
	private static BufferedReader reader;
	private static BufferedWriter writer;
	private ArrayList<Monitor> monitor;
	
	public MonitorDAO() {
		
	}
	
	public void addMonitor(Monitor monitor) {
		try {
			arquivoOut = new FileOutputStream("BancoDeDados.txt", true);
			arquivoOut.write(monitor.toString().getBytes());
			arquivoOut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteMonitor(String id) {
		inputFile = new File("BancoDeDados.txt");
		tempFile = new File("myTempFile.txt");
		try {
			reader = new BufferedReader(new FileReader(inputFile));
			writer = new BufferedWriter(new FileWriter(tempFile));
			String currentLine;
			id = "id" + id;
			while ((currentLine = reader.readLine()) != null) {
				if(currentLine.contains(id))
					continue;
				writer.write(currentLine + System.getProperty("line.separator"));
			}
			writer.close();
			reader.close();
			inputFile.delete();
			tempFile.renameTo(inputFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
