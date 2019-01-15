
import ManipulaçãoDeDados.Arquivo;

public class NewMainTest {

    
    public static void main(String[] args) {
        //Testar leitura e comparação de livros
        Arquivo a = new Arquivo("Livros.txt");
        a.lerLivro();
        System.out.println(a.getlistaLivros(0).getIsnb());
        System.out.println(a.getlistaLivros(0).getTitulo());
        System.out.println(a.getlistaLivros(0).getNumEdicao());
        System.out.println(a.getlistaLivros(0).getArquivoDeImagem());
        System.out.println(a.getlistaLivros(0).getPreco());
        System.out.println(a.getlistaLivros(0).getEditora());
        
        for(int i = 0; i < a.getlistaLivros(0).sizeAutores(); i++)
            System.out.println(a.getlistaLivros(0).getAutor(i));
        
    }
}
