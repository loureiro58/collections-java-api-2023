package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        Livro livro = new Livro(titulo, autor, anoPublicacao);
        livroList.add(livro);
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!livroList.isEmpty()){
            for (Livro livro: livroList){
                if(livro.getAutor().equals(autor)){
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAno(int anoInicial, int anoFinal) {
        List<Livro> livrosPorAno = new ArrayList<>();

        if(!livroList.isEmpty()){
            for (Livro livro: livroList){
                if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                    livrosPorAno.add(livro);
                }
            }
        }
        return livrosPorAno;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livrosPorTitulo = null;

        if(!livroList.isEmpty()){
            for (Livro livro: livroList){
                if(livro.getTitulo().equals(titulo)){
                    livrosPorTitulo = livro;
                    break;
                }
            }
        }
        return livrosPorTitulo;
    }

    public static void main(String[] args) {

        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("Livro 1", "Autor 1", 1000);
        catalogo.adicionarLivro("Livro 1", "Autor 3", 1001);
        catalogo.adicionarLivro("Livro 1", "Autor 3", 1003);
        catalogo.adicionarLivro("Livro 4", "Autor 4", 1004);
        catalogo.adicionarLivro("Livro 5", "Autor 5", 1005);

        System.out.println(catalogo.pesquisarPorAutor("Autor 3"));
        System.out.println(catalogo.pesquisarPorIntervaloAno(1003,1004));
        System.out.println(catalogo.pesquisarPorTitulo("Livro 1"));


    }
}
