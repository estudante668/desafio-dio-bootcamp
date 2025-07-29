import java.time.LocalDate;

import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
       
        Curso curso = new Curso();
       
        curso.setTitulo("Curso de Java");
        curso.setDescricao("Aprenda os conceitos básicos de Java");
        curso.setCargaHoraria(40);
        System.out.println(curso);

        Curso curso1 = new Curso();
       
        curso1.setTitulo("Curso de JS");
        curso1.setDescricao("Aprenda os conceitos básicos de JavasCript");
        curso1.setCargaHoraria(30);
        System.out.println(curso1);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Tire suas dúvidas sobre Java");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);
        
    }
}
