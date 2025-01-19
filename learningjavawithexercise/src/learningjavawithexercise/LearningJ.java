package learningjavawithexercise;
import java.util.Scanner;

public class LearningJ {
	public static int[] BoobleSort(int ary[]) {
		int x = ary.length;
		for(int i = 0; i < x - 1; i++) {
			for(int j = 0; j < x - i - 1; j++) {
				if(ary[j] > ary[j + 1]) {
					int troca = ary[j];
					ary[j] = ary[j + 1];
					ary[j + 1] = troca;
				}
			}
		}
		return ary;
	}
	
	public static void Triangulos(int ary[]) {
		int lado[] = BoobleSort(ary);
		if((lado[0] + lado[1]) > lado[2]) {
			System.out.print("É um triangulo, ");
				if(lado[0] == lado[1] && lado[1] == lado[2]) {
					System.out.println("do tipo Equilatero.");
				}
				else if(lado[0] == lado[1] || lado[0] == lado[2] || lado[1] == lado[2]) {
					System.out.println("do tipo Isóceles.");
				}
				else {
					System.out.println("do tipo Escaleno.");
				}
				 if((Math.pow(lado[0], 2) + Math.pow(lado[1], 2)) == Math.pow(lado[2], 2)) {
					System.out.println("E é um Triangulo Retangulo");
				}
		}
		else {
			System.out.println("Não é, um Triangulo.");
		}
	}
		
		
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

									/*EXERCICIOS*/
		
							/*LISTA 1*/
		/*EX2
		System.out.println("Media De Notas!");
		System.out.println("Digite a nota da sua primeira prova:");
		float notaOne = keyboard.nextFloat();		
		System.out.println("Digite sua Segunda Nota: ");
		float notaTwo = keyboard.nextFloat();		
		float n =  (int) (notaOne + notaTwo) / 2;
		System.out.printf("Sua media e: %f", n);
		*/
		
		/*EX3
		Integer car = 359, people = 4;
		System.out.printf("Vamos distribuir %d carros para %d pessoas e portanto devem sobrar %d carros", car, people, (car - people));
		*/

		/*EX4
		System.out.println("Calculo de circulo");
		double raio = 0, diametro = 0, area = 0, circuferencia = 0;
		
		System.out.println("Digite o valor do Raio: ");
		raio = keyboard.nextInt();
		
		diametro = Math.pow(raio,2);
		System.out.println("O valor do dia metro e: " + diametro);
		
		area = Math.PI * Math.pow(raio,2);
		System.out.println("O valor da Area e: " + area);
		
		circuferencia = Math.pow(Math.PI, 2) * raio;
		System.out.println("O valor da circuferencia e: " + circuferencia);
		*/
		
							/*LISTA 2*/
		/*EX2
		System.out.println("Consumo medio de Combustiveo");
		
		System.out.println("Digite a quantidade de combustivel: ");
		double combustivel = keyboard.nextInt();
		
		System.out.println("Digite a distancia percorrida: ");
		double distancia = keyboard.nextFloat();
		
		double consumoMedio =  (int) distancia / combustivel;
		System.out.println("O consumo medio e: "+ consumoMedio);
		*/
		
		/*EX3
		System.out.println("Calculo de Ganho (Festa)");
		
		System.out.println("Digite o valor do ingressos para Mulheres: ");
		float ticketWoman= keyboard.nextFloat();
		
		System.out.println("Digite o Valor do ingresso para os Homens: ");
		float ticketMen = keyboard.nextFloat();
		
		System.out.println("Digite a quantidade de Mulheres Presente na festa: ");
		int qtdWomanParty = keyboard.nextInt();
		
		System.out.println("Digite a quantidade de Homens Presente na festa: ");
		int qtdMenParty = keyboard.nextInt();
		
		float valorArrecadado = (ticketWoman * qtdWomanParty) + (ticketMen * qtdMenParty);
		
		System.out.println("O valor total Arecadado com a festa foi de " + valorArrecadado);
		*/
		
		/*EX4
		System.out.println("Calculo de volume de cilindro");
		
		System.out.printf("DIgite o valor do Raio do Cilindro: ");
		float raioCilindro = keyboard.nextFloat();
		
		System.out.printf("Digite a Altura do cilindro: ");
		float alturaCilindro = keyboard.nextFloat();
		
		System.out.println("O volume do cilindro e " + (Math.PI * Math.pow(raioCilindro, 2) * alturaCilindro));
		*/
		
		/*EX5
		System.out.println("Funçao quadratica delta:");
		
		System.out.print("Digite o valor do coeficiente A: ");
		double coeficienteA = keyboard.nextDouble();
		
		System.out.print("Digite o valor do coeficiente B: ");
		double coeficienteB = keyboard.nextDouble();
		
		System.out.print("Digite o valor do coeficiente C");
		double coeficienteC = keyboard.nextDouble();
		
		System.out.println("Delta = " + (Math.pow(coeficienteB, 2) - 4 * coeficienteA - coeficienteC));
		*/
		
		/*EX6
		System.out.println("Impar ou Par");
		System.out.print("Digite o valor a ser comparado: ");
		int numIP = keyboard.nextInt();
		System.out.println((numIP % 2));
		*/
		
		/*EX7
		System.out.println("Conversor de temperatura");
		
		System.out.print("Digite para o que deseja converter, 1 -> Fahrenheit ou 2 -> Celsius: ");
		int choiceTemp = keyboard.nextInt();
		
		System.out.print("Digite a temperatura: ");
		float temp = keyboard.nextFloat();
		
		if(choiceTemp == 1) {
			double fahrenheitTemp = (temp * 1.8) + 32;
			System.out.println("A temperatura em fahrenheit e " + fahrenheitTemp);
		}
		else if(choiceTemp == 2) {
			double celsiusTemp = (temp - 32) / 1.8;
			System.out.println("A temperatura em Celcius e " + celsiusTemp);
		}
		*/
		
		/*EX8
		System.out.println("Calculo aritmetico");
		double nums[];
		nums =  new double [3];
		double mediaAritmeticaThree = 0, n = (int) 3;
		for(int i = 0; i < n; i++) {
			System.out.printf("Digete o %d valor: ", (i + 1));
			nums[i] = keyboard.nextDouble();
			mediaAritmeticaThree += nums[i];
		}
		System.out.println("A media aritmetica e: " + (mediaAritmeticaThree / n));
		*/
		
							/*LISTA 3*/
		/*EX1
		System.out.println("Maior ou Menor");
		
		System.out.print("Digite o valor de comparaçao N: ");
		int compN = keyboard.nextInt();
		
		System.out.print("Digite o Valor a ser comparado X: ");
		int compX = keyboard.nextInt();
		
		if(compX < compN) {
			System.out.println("Sim");
		}
		else {
			System.out.println("Não");
		}
		*/
		
		/*EX2
		System.out.println("Par ou Impar");
		int iPN = 0;
		System.out.print("Digite o valor a ser comparado: ");
		iPN = keyboard.nextInt();
		
		if(iPN % 2 == 0) {
			System.out.printf("%d e Par", iPN);
		}
		else {
			System.out.printf("%d e imapr", iPN);
		}
		*/
		
		/*EX3
		System.out.println("Comparador de valor");
		
		System.out.print("Digite um valor: ");
		double nOne = keyboard.nextDouble();
		
		System.out.print("Digite outro valor: ");
		double nTwo = keyboard.nextDouble();
		
		if(nOne > nTwo) {
			System.out.printf("%f e maior", nOne);
		}
		else {
			System.out.printf("%f e maior", nTwo);
		}
		*/
		
		/*EX4
		System.out.println("Comparador de valor");
		
		System.out.print("Digite um valor: ");
		double nOne = keyboard.nextDouble();
		
		System.out.print("Digite outro valor: ");
		double nTwo = keyboard.nextDouble();
		
		if(nOne > nTwo) {
			System.out.printf("%f e maior", nOne);
		}
		else if(nOne < nTwo){
			System.out.printf("%f e maior", nTwo);
		}
		else {
			System.out.printf("%f e %f sao iguais.", nOne, nTwo);
		}
		*/
		
		/*EX5
		System.out.println("Numeri multiplo de 10");
		
		System.out.print("Digite um valor: ");
		int nMult = keyboard.nextInt();
		
		if(nMult < 0) {
			System.out.println("Nao e multiplo de 10");
		}
		else if(nMult % 10 == 0) {
			System.out.println("E multiplo de 10");
		}
		else {
			System.out.println("Nao é multiplo de 10");
		}
		*/
		
		/*EX6
		System.out.println("Maior que 10");
		int nN = 10;
		System.out.print("Digite o primeiro valor: ");
		int nNOne = keyboard.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		int nNTwo = keyboard.nextInt();
		
		if(nNOne > nN && nNTwo > nN) {
			System.out.println("Sim, ambos são maiores.");
		}
		else {
			System.out.println("Ambos são menores.");
		}
		*/
		
		/*EX7
		System.out.println("Conversor de Tempo");
		int h = 0, m = 0, s = 0;
		System.out.print("Digite o valor em segundos: ");
		int segNum = keyboard.nextInt();
		
		h = segNum / 3600;
		m = (segNum % 3600) / 60;
		s = segNum % 60;
		System.out.printf("%dH %dM %ds", h, m, s);
		*/
		
							/*LISTA 4*/
		
		/*EX1
		String outText = new String("Senac");
		System.out.println("DIgite um valor: ");
		int identificadorDeValor= keyboard.nextInt();
		int arrayDeComparacaoDeValores[] = { 14, 24, 23, 32, 33 };
		boolean estado = false;
		for(int i = 0; i < arrayDeComparacaoDeValores.length; i++) {
			if(identificadorDeValor == arrayDeComparacaoDeValores[i]) {
				System.out.println(outText);
				estado = true;
				break;
			}
		}
		if(estado == false) {
			System.out.println("Valor sem Texto!");
		}*/
		
		/*EX2
		System.out.print("Digite um valor: ");
		int xDoIntervalo = keyboard.nextInt();
		boolean intervalo = xDoIntervalo >= 15 && xDoIntervalo <= 25  || xDoIntervalo >= 45 && xDoIntervalo <= 50;
		String outTexting = intervalo ? "Erro" : null;
		System.out.println(outTexting);*/
		
		/*EX3
		System.out.print("DIgite um valor: ");
		int yDoIntervalo = keyboard.nextInt();
		boolean intervaloY = yDoIntervalo > 80 && yDoIntervalo <  25 || yDoIntervalo == 40;
		String frasesDoDostoievski = intervaloY ? "Às vezes o homem prefere o sofrimento à paixão." : "Todos somos responsáveis de tudo, perante todos.";
		System.out.println(frasesDoDostoievski);
		*/
		
		/*EX4 e EX5
		int sideByTriangulo[] = new int[3];
		System.out.println("Digite os valores dos lados do triangulo: ");
		for(int i = 0; i < sideByTriangulo.length; i++) {
			System.out.print((i + 1) + " = ");
			sideByTriangulo[i] = keyboard.nextInt();
		}
		Triangulos(sideByTriangulo);
		*/
		
		/*EX6
		System.out.print("Digite um valor maior que 40, que seja multiplo de 5 e 7: ");
		int n = keyboard.nextInt();
		if(n < 40) {
			System.out.println("Erro !!!!!!");
		}
		else if(n % 5 == 0 && n % 7 == 0) {
			System.out.println("Parabéns.");
		}
		else {
			System.out.println("Não é multiplo.");
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
