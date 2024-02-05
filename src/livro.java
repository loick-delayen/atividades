public class livro {

    static class Livro {
        public String titulo, autor;
        public int ano;

        Livro(String titulo, String autor, int ano) {
            this.titulo = titulo;
            this.autor = autor;
            this.ano = ano;
        }
    }

    public static void main(String[] args) {
        Livro livro1 = new Livro("Half Bad", "Sally Green", 2014);

        System.out.println("Titulo: " + livro1.titulo);
        System.out.println("Autor: " + livro1.autor);
        System.out.println("Ano: " + livro1.ano);
    }
}
