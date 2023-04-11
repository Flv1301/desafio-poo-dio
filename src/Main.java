import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCarga_horaria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCarga_horaria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFlavio = new Dev();
        devFlavio.setNome("Flávio Alexandre Souza Nunes");
        devFlavio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Flávio:" + devFlavio.getConteudosInscritos());
        devFlavio.progredir();
        devFlavio.progredir();
        System.out.println("Conteúdos Inscritos Flávio:" + devFlavio.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Flávio:" + devFlavio.getConteudosConcluidos());
        System.out.println("XP Flávio: " + devFlavio.calcularTotalXp());
        System.out.println("----------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Outro Dev");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Outro Dev:" + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Conteúdos Inscritos Outro Dev:" + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Outro Dev:" + dev2.getConteudosConcluidos());
        System.out.println("XP Outro Dev: " + dev2.calcularTotalXp());
    }
}
