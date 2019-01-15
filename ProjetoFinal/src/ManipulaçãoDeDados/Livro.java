package ManipulaçãoDeDados;

import java.util.Arrays;
import java.util.Objects;


public class Livro {
    
    private String isnb;
    private String titulo;
    private String numEdicao;
    private String copyringt;
    private String arquivoDeImagem;
    private String preco;
    private String editora;
    private String[] autores;
    
    
    @Override
    public int hashCode() {
        
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.isnb);
        hash = 97 * hash + Objects.hashCode(this.titulo);
        hash = 97 * hash + Objects.hashCode(this.numEdicao);
        hash = 97 * hash + Objects.hashCode(this.copyringt);
        hash = 97 * hash + Objects.hashCode(this.arquivoDeImagem);
        hash = 97 * hash + Objects.hashCode(this.preco);
        hash = 97 * hash + Objects.hashCode(this.editora);
        hash = 97 * hash + Arrays.deepHashCode(this.autores);
        return hash;
    }

    //Esses 2 metodos vão procurar pra mim
    //Quando eu tiver todos os dados do livro.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Livro other = (Livro) obj;
        if (!Objects.equals(this.isnb, other.isnb)) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.numEdicao, other.numEdicao)) {
            return false;
        }
        if (!Objects.equals(this.copyringt, other.copyringt)) {
            return false;
        }
        if (!Objects.equals(this.arquivoDeImagem, other.arquivoDeImagem)) {
            return false;
        }
        if (!Objects.equals(this.preco, other.preco)) {
            return false;
        }
        if (!Objects.equals(this.editora, other.editora)) {
            return false;
        }
        if (!Arrays.deepEquals(this.autores, other.autores)) {
            return false;
        }
        return true;
    }
    
    
    //Quando eu não tiver todos os dados do livro
    //Se pa depois fazer um com o metodo contem
    public int corespondecia(Livro[] c) {
        
        int[] coresponde = new int[c.length];
        int maior = 0;
        int index = -1;
        
        for(int i = 0; i < c.length; i++){
            
            //if(this.arquivoDeImagem.equals(c[i].arquivoDeImagem))
                //coresponde[i] += 1;
            
            if(this.copyringt.toLowerCase().equals(c[i].copyringt.toLowerCase()))
                coresponde[i] += 1;
            
            if(this.isnb.toLowerCase().equals(c[i].isnb.toCharArray()))
                coresponde[i] += 1;
            
            if(this.numEdicao.toLowerCase().equals(c[i].numEdicao.toLowerCase()))
                coresponde[i] += 1;
            
            if(this.preco.toLowerCase().equals(c[i].preco.toLowerCase()))
                coresponde[i] += 1;
            
            if(this.titulo.toLowerCase().equals(c[i].titulo.toLowerCase()))
                coresponde[i] += 1;
            
            if(this.editora.toLowerCase().equals(c[i].editora.toLowerCase()))
                coresponde[i] += 1;
            
    
            /*for(int a = 0; a < this.autores.length; a++){
                if(this.autores[a].toLowerCase().equals(c[i].autores[i]))
                    coresponde[i] += 1;
            }*/
            
            //não vou considerar autores por enquanto
        }
            
        for(int i = 0; i < coresponde.length; i++ ){
            maior = Math.max(coresponde[i], maior);
            
            if(maior == coresponde[i])
                index = i;
            
            if(index != -1)
                return index;
        }
        
        return -1;
    }

    public String getIsnb() {
        return isnb;
    }

    public void setIsnb(String isnb) {
        this.isnb = isnb;
    }

    public int sizeAutores(){
       return this.autores.length;
    }
    public String getAutor(int i){
        return this.autores[i];
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNumEdicao() {
        return numEdicao;
    }

    public void setNumEdicao(String numEdicao) {
        this.numEdicao = numEdicao;
    }

    public String getCopyringt() {
        return copyringt;
    }

    public void setCopyringt(String copyringt) {
        this.copyringt = copyringt;
    }

    public String getArquivoDeImagem() {
        return arquivoDeImagem;
    }

    public void setArquivoDeImagem(String arquivoDeImagem) {
        this.arquivoDeImagem = arquivoDeImagem;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String[] getAutores() {
        return autores;
    }
    

    public void setAutores(String[] autores) {
        this.autores = autores;
    }
    
    public void newAutores(int number){
        autores = new String[number];
    }
    
    
    
}//end class
