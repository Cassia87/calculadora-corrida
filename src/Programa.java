import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	Calculos calc = new Calculos();
	int opcao = 0;
		
	while(opcao != 4) {
		System.out.print("Escolha uma opção: [1] Pace | [2] Tempo | [3] Distância | [4] Sair\n");
		opcao = sc.nextInt();
		if(opcao == 1){
			System.out.println("Digite a distância percorrida em kilometros: ");
			double distancia = sc.nextDouble();
			System.out.println("Digite o tempo em horas: ");
			double hora = sc.nextDouble();
			System.out.println("Digite o tempo em minutos ");
			double minutos = sc.nextDouble();
			System.out.println("Digite o tempo em segundos: ");
			double segundos = sc.nextDouble();
			
	        double pace = calc.Pace(distancia, hora, minutos, segundos);

	        if (pace > 0) { 
	            System.out.printf("Pace: %.2f min/km%n", pace);
	        } else {
	            System.out.println("Erro: pace inválido. Verifique os valores inseridos.");
	        }
			
				
		} else if (opcao == 2) {
			
			System.out.println("Digite a distância percorrida em kilometros: ");
			double distancia = sc.nextDouble();
			System.out.println("Digite o pace (minutos): ");
			double paceMinutos = sc.nextDouble();
			System.out.println("Digite o pace (segundos) ");
			double paceSegundos = sc.nextDouble();
			double tempo = calc.Tempo(distancia, paceMinutos, paceSegundos);
			
			int horas = (int) tempo / 3600;
		    int minutos = (int) (tempo % 3600) / 60;
		    int segundos = (int) tempo % 60;
		    
		    
			String tempoFormatado = String.format("%02d:%02d:%02d", horas, minutos, segundos);
	        System.out.println("Tempo estimado para percorrer a distância:  " + tempoFormatado);
			
		} else if (opcao == 3) {
			
			System.out.println("Digite o pace (minutos): ");
			double paceMinutos = sc.nextDouble();
			System.out.println("Digite o pace (segundos) ");
			double paceSegundos = sc.nextDouble();
			System.out.println("Digite o tempo em horas: ");
			double hora = sc.nextDouble();
			System.out.println("Digite o tempo em minutos ");
			double minutos = sc.nextDouble();
			System.out.println("Digite o tempo em segundos: ");
			double segundos = sc.nextDouble();
			double distancia = calc.Distancia(paceMinutos, paceSegundos, hora, minutos, segundos);
			System.out.printf("Distância percorrida: %.2f km ", distancia);
			
		} else {
			System.out.println("Fim do programa");
		}
			System.out.println();
	
		}
	
	sc.close();
	
	}

}

