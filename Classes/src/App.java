import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		Scanner ler =  new Scanner (System.in);
		
		// instanciando Turma DS
		
		Turma dS= new Turma();
		dS.qntAlunos=40;
		dS.qntProfessores=15;
		dS.curso="Desenvolvimento de Sistemas(DS)";
		dS.periodo="Manhã";
		for(int i=0; i< dS.qntProfessores; i++) {
			System.out.println("insira o nome do"+ i +"º professor");
			dS.professores[i]=ler.next();
		}
		for(int i=0; i< dS.qntAlunos; i++) {
			System.out.println("insira o nome do"+ i +"º Aluno");
			dS.alunos[i]=ler.next();
		}
		
		// instanciando turma ADM
		
		Turma adm= new Turma();
		adm.qntAlunos=40;
		adm.qntProfessores=15;
		adm.curso="Desenvolvimento de Sistemas(DS)";
		adm.periodo="Manhã";
		for(int i=0; i< adm.qntProfessores; i++) {
			System.out.println("insira o nome do"+ i +"º professor");
			adm.professores[i]=ler.next();
		}
		for(int i=0; i< dS.qntAlunos; i++) {
			System.out.println("insira o nome do"+ i +"º Aluno");
			adm.alunos[i]=ler.next();
		}
		ler.close();
	}

}
