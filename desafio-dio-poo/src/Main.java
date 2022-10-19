import com.br.dio.desafio.dominio.Bootcamp;
import com.br.dio.desafio.dominio.Curso;
import com.br.dio.desafio.dominio.Dev;
import com.br.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //instânciando os cursos
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("Introdução à linguagem Java");
        curso1.setDescricao("Curso dedicado aos iniciantes na linguagem Java - Conceitos Basicos");
        curso1.setCargaHoraria(4);

        curso2.setTitulo("Introdução à Progração Orientada a Objetos - POO");
        curso2.setDescricao("Adequado aos alunos que ja tem os conceitos básicos");
        curso2.setCargaHoraria(8);

        //instânciando as mentorias
        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Adequado aos alunos que já fizeram o curso de Java");
        mentoria.setData(LocalDate.now());



        //mostrando os cursos e mentorias instanciados
        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMarcelo = new Dev();
        devMarcelo.setNome("Marcelo");
        devMarcelo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devMarcelo.getConteudosInscritos());
        devMarcelo.progredir();
        System.out.println("----");
        System.out.println("Conteúdos Inscritos" + devMarcelo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devMarcelo.getConteudosConcluidos());
        System.out.println("XP = " + devMarcelo.calcularTotalXP());

        System.out.println("------------------------------------------------------------------------");
        Dev devFlora = new Dev();
        devFlora.setNome("Flora");
        devFlora.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devFlora.getConteudosInscritos());
        devFlora.progredir();

        System.out.println("----");
        System.out.println("Conteúdos Inscritos" + devFlora.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devFlora.getConteudosConcluidos());
        System.out.println("XP = " + devFlora.calcularTotalXP());



    }
}
