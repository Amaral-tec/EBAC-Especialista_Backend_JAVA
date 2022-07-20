/* O objetivo desta tarefa é particar o uso de comentários */

package br.com.Amaral;

/**
 *  @author leandro.amaral;
 *
 * @since version1
 */

public class Cliente {

    private int codigo;

    private String nome;

    private String endereco;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
      
    /**
      * Médodo que gera o nome do cliente
      *
      * @return retorna o nome do cliente
      * 
      * @deprecated
      *
      * @see String getNomeCompleto()
      */
  
    public String getNome() {
        return nome;
    }
  
    public String getNomeCompleto() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void cadastrarEndereco() {

    }
}

public class CadastroCliente {
  
  /*
   * @param args
   *
   */
  
  public static void main(String arg[]) {
        criacaoCadastro();
    }
}

