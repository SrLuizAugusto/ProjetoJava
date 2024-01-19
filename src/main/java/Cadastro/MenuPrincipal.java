package Cadastro;

public class MenuPrincipal {

	public static void main(String[] args) {

PessoaDao pd = new PessoaDao();
/*try {
	Pessoa p1 = new Pessoa(3,"Luiz Augusto", "luiz@gmail.com");
	pd.incluirPessoa(p1);

}catch (Exception e){
	System.out.println("Error Creating p1");
}*/


System.out.print(pd.ListarPessoas());


	}

}
