/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Cadastro;

import java.util.Scanner;

/**
 *
 * @author lauol
 */
public class Crud {

    public static void main(String[] args) throws Exception {
      int cod;
      Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma opção");
        cod=sc.nextInt();
      
      switch(cod){
          case 1-> { 
              PessoaDao pd = new PessoaDao();
              int id;
              String nome;
              String email;
              
              System.out.println("Digite um id");
              id=sc.nextInt();
              System.out.println("Digite nome");
              nome=sc.next();
              System.out.println("Digite email");
              email=sc.next();
              
              
              Pessoa p1 = new Pessoa(id,nome,email);
              pd.incluirPessoa(p1);
              
              System.out.println("Registro criado"+ pd.ListarPessoas());
              sc.close();
            }
          case 2->{
              String nome;
              String email;
              int id;
              
              System.out.println("Digite o id que deseja buscar");
              id=sc.nextInt();
              System.out.println("Digite novo nome");
              nome=sc.nextLine();
              System.out.println("Digite novo email");
              email=sc.nextLine();
              
              PessoaDao pd = new PessoaDao();
              Pessoa p = new Pessoa();
              p.setNomePessoa(nome);
              p.setEmail(email);
              p.setIdPessoa(id);
                            
              pd.alterarPessoa(p);
              pd.consultarPessoaIndividual(id);
              sc.close();
          }
          case 3->{
              System.out.println("Qual o id da pessoa a ser excluida?");
              PessoaDao pd = new PessoaDao();
              Pessoa p = new Pessoa();
              p.setIdPessoa(sc.nextInt());
              
              pd.excluirPessoa(p);
              sc.close();
          }
          default -> {
              System.out.println("Saindo.....");
              sc.close();
          }
    }
}
}
