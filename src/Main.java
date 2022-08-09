import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devTamy = new Dev();
        devTamy.setNome("Tamy");
        devTamy.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo inscritos Tamy: " + devTamy.getConteudoInscritos());
        devTamy.progredir();
        System.out.println("-");
        System.out.println("Conteúdo inscritos Tamy: " + devTamy.getConteudoInscritos());
        System.out.println("Conteúdo concluidos Tamy: " + devTamy.getConteudoConcluidos());
        System.out.println("XP: " + devTamy.calcularTotalXp());


        System.out.println("---------------");

        Dev devZe = new Dev();
        devZe.setNome("Zé");
        devZe.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo inscritos Zé: " + devZe.getConteudoInscritos());
        devZe.progredir();
        devZe.progredir();
        devZe.progredir();
        System.out.println("-");
        System.out.println("Conteúdo inscritos Zé: " + devZe.getConteudoInscritos());
        System.out.println("Conteúdo concluidos Zé: " + devZe.getConteudoConcluidos());
        System.out.println("XP: " + devZe.calcularTotalXp());
    }

}
