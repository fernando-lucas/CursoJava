package br.com.abc.javacore.S_strings.test;

// Exercícios baseados no curso Maratona Java do Canal DevDojo.
// Aulas 80 e 81
// Classes Uteis Java - String
public class StringTest {

    public static void main(String[] args) {
        
        // Lição01: Strings são imutáveis. -------------------------------------
        
        // Cria a string "Willian" no [String Constant Pool]
        String nome = "William"; 
        
        // A Variavel [nome] ainda continua apontada para "Willian";
        nome.concat(" Suane"); 
        // Retorna apenas "Willian";
        System.out.println(nome); 
        
        // A variavel [nome] aponta para uma nova string chamada "Willian Suane"
        nome = nome.concat(" Suane"); 
        // Retorna "Willian Suane"
        System.out.println(nome);     
        
        
        // Já existe uma string "Willian". A variavel [nome2] aponta para ela.
        String nome2 = "William"; 
        
        
        // Lição02: Metodos -------------------------------------
        System.out.println("---------------------------------");
        String teste = "Goku";
        String teste2 = "goku";
        
        // Compara as strings
        System.out.println(teste.equals(teste2));
        
        // Compara as strings ignorando o Case Sensitive.
        System.out.println(teste.equalsIgnoreCase(teste2));
        
        //Imprimir um caractere de determinada posição.
        System.out.println("---------------------------------");
        System.out.println(teste.charAt(0));
        System.out.println(teste.charAt(1));
        System.out.println(teste.charAt(2));
        System.out.println(teste.charAt(3));
        
        // Retorna o tamanho da string
        System.out.println("---------------------------------");
        System.out.println("Tamanho da string: " + teste.length());
        
        // Substitui caracteres
        System.out.println("---------------------------------");
        String teste3 = "Mamão";
        System.out.println(teste3);
        System.out.println(teste3.replace('o', 'i'));
        
        // Transformar a string em maiusculo e minusculo
        System.out.println("---------------------------------");
        String teste4 = "André";
        System.out.println(teste4);
        System.out.println(teste4.toUpperCase());
        System.out.println(teste4.toLowerCase());
        
        // Retornar substring
        System.out.println("---------------------------------");
        String cidade = "Belo Horizonte";
        // Obs: O primeiro parâmetro inicia a partir do 0; O segundo inicia a partir do 1;
        System.out.println(cidade.substring(0, 1));
        System.out.println(cidade.substring(1, 2));
        System.out.println(cidade.substring(0, 8));
        
        // Retira espaços a direita e a esquerda da string
        System.out.println("---------------------------------");
        String objeto = "       Notebook      ";
        System.out.println(objeto);
        System.out.println(objeto.trim());
    }
}
