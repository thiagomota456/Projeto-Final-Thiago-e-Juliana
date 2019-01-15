package ManipulaçãoDeDados;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Arquivo {

    
    private Scanner input;
    private String nomeDoArquivo;
    private ArrayList<String> lista;
    private ArrayList<Livro> listaLivros;

    public Arquivo(String nome) {
        
        this.nomeDoArquivo = nome;
        this.lista = new ArrayList<>();
        this.listaLivros = new ArrayList<>();
    }

    public Arquivo(){
        
    }
    
        
    public static void gravarEmArquivo(String arquivo, String texto){

        try{
            FileWriter fileWriter = new FileWriter(arquivo, true);
            BufferedWriter conexao = new BufferedWriter(fileWriter);
            conexao.write(texto);
            conexao.newLine();
            conexao.close();
            
            
            JOptionPane.showMessageDialog(null, "'" + texto + "' cadastrada com sucesso");

        }
        catch(IOException iOException){
            JOptionPane.showMessageDialog(null, "Erro de entrada e saida de dados");
        }
        
            
    }
    
    public static void gravarEmArquivo(String arquivo, String texto, boolean mensagem){

        try{
            FileWriter fileWriter = new FileWriter(arquivo, true);
            BufferedWriter conexao = new BufferedWriter(fileWriter);
            conexao.write(texto);
            conexao.newLine();
            conexao.close();
            
            if(mensagem)
                JOptionPane.showMessageDialog(null, "'" + texto + "' cadastrada com sucesso");

        }
        catch(IOException iOException){
            JOptionPane.showMessageDialog(null, "Erro de entrada e saida de dados");
        }
        
            
    }
    
    //Esse cada espaço em branco delimita uma string
    public void listarPorElemento(){
        
        try{
            input = new Scanner(Paths.get(nomeDoArquivo));
            
            while(input.hasNext()){
                
                lista.add(input.next());
                
            }//end while
        }
        catch(IOException iOException){
            
            System.err.printf("Erro ao abri o arquivo");
        }
        
        input.close();
        
    }
    
    //Esse cada linha do Arquivo é uma String 
    public void listarPorLinha(){
        
        try{
            input = new Scanner(Paths.get(nomeDoArquivo));
            
            while(input.hasNext()){
                
                lista.add(input.nextLine());
                
            }//end while
        }
        catch(IOException iOException){
            
            System.err.printf("Erro ao abri o arquivo");
        }
        
        input.close();
        
    }
    
    //Criar um metodo especifico paraler livros
    public void lerLivro(){
        Livro l = new Livro();
        try{
            input = new Scanner(Paths.get(nomeDoArquivo));
            
            //Leitura no padão do arquivo
            l.setIsnb(input.nextLine());
            l.setTitulo(input.nextLine());
            l.setNumEdicao(input.nextLine());
            l.setCopyringt(input.nextLine());
            l.setArquivoDeImagem(input.nextLine());
            l.setPreco(input.nextLine());
            l.setEditora(input.nextLine());
            //Litura de autores
            String num = input.nextLine();
            JOptionPane.showMessageDialog(null, num);
            String[] autores = new String[Integer.parseInt(num)];          
            for(int i = 0; i < autores.length; i++){
                autores[i] = input.nextLine();
            }
           
            l.setAutores(autores);//add atores ao objeto
            listaLivros.add(l);//add obj a lista de livros
        }
        catch(IOException iOException){
            
            System.err.printf("Erro ao abri o arquivo");
        }
        
        input.close();
        
    }        
    
    public int sizeListaLivros(){
        return listaLivros.size();
    }

    public Livro[] getListaLivros() {
        return this.listaLivros.toArray(new Livro[this.listaLivros.size()]);
    }
    
    
   
     public void listarLivros(){
        Livro l = new Livro();
        try{
            input = new Scanner(Paths.get(nomeDoArquivo));
            
            while(input.hasNext()){
                
                //Leitura no padão do arquivo
                l.setIsnb(input.nextLine());
                l.setTitulo(input.nextLine());
                l.setNumEdicao(input.nextLine());
                l.setCopyringt(input.nextLine());
                l.setArquivoDeImagem(input.nextLine());
                l.setPreco(input.nextLine());
                l.setEditora(input.nextLine());
                //Litura de autores
                String num = input.nextLine();
                //JOptionPane.showMessageDialog(null, num);
                String[] autores = new String[Integer.parseInt(num)];          
                for(int i = 0; i < autores.length; i++){
                    autores[i] = input.nextLine();
                }

                l.setAutores(autores);//add atores ao objeto
                listaLivros.add(l);//add obj a lista de livros
                
            }
            
        }
        catch(IOException iOException){
            
            System.err.printf("Erro ao abri o arquivo");
        }
        
        input.close();
        
    }        
   
    
    
    public ArrayList<String> getLista() {
        return lista;
    }
    
    public String getElementoLista(int i) {
       return lista.get(i);
    }
    
    public Livro getlistaLivros(int i) {
       return listaLivros.get(i);
    }
    
    public int sizeList(){
        return lista.size();
    }
    
}//end class arquivo
