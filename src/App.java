import java.time.LocalDate;

import br.com.desafio.Curso;
import br.com.desafio.dominio.BootCamp;
import br.com.desafio.dominio.Conteudo;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentorias;

public class App {

    public static void main(String[] args) {
        

        Curso curso = new Curso();
		curso.setTitulo("Historia");
		curso.setDescricao("Doutorado historia");
		curso.setCargaHoraria(40);
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Matemática");
		curso1.setDescricao("Doutorado Matemática");
		curso1.setCargaHoraria(60);

        Conteudo conteudoCurso = new Curso();
        Conteudo conteudoMentoria = new Mentorias();

        Mentorias mentoria = new Mentorias();
		mentoria.setTitulo("Mentoria Historia");
		mentoria.setDescricao("Mentorias para Doutotado");
		mentoria.setData(LocalDate.now());

        		
		BootCamp bootcamp = new BootCamp();
            bootcamp.setNome("BootCamp Doutorado");
            bootcamp.setDescricao("BootCamp para Doutorado");
			bootcamp.getConteudos().add(curso);
			bootcamp.getConteudos().add(curso1);
			bootcamp.getConteudos().add(mentoria);

        System.out.println("Conteúdos do BootCamp: " + bootcamp.getConteudos());
		
         Dev maria = new Dev();
			maria.setNome("Maria");
			maria.inscreverBootCamp(bootcamp);
			System.out.println("Conteudos inscrito por Maria: " + maria.getInscritos());
            System.out.println("Conteudos concluido por Maria: " + maria.getConcluidos());
            maria.progredir();

            System.out.println("Conteudos inscritos por Maria após progresso: " + maria.getInscritos());
            System.out.println("Conteudos concluido por Maria após progresso: " + maria.getConcluidos());
            System.out.println("XP total de Maria: " + maria.calcularTotalXp());
        
	Dev joao = new Dev();
            joao.setNome("João");
            joao.inscreverBootCamp(bootcamp);
            System.out.println("Conteudos inscritos por João: " + joao.getInscritos());
            System.out.println("Conteudos concluido por João: " + joao.getConcluidos());
            joao.progredir();
            System.out.println("Conteudos inscritos por João após progresso: " + joao.getInscritos());
            System.out.println("Conteudos concluido por João após progresso: " + joao.getConcluidos());
            System.out.println("XP total de João: " + joao.calcularTotalXp());
			
    }			
}
