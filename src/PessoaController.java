import java.util.List;

public class PessoaController {

    public void ListAll(List<Pessoa> lista){
        for (Pessoa pessoa : lista) {
            System.out.println("Nome: "+pessoa.nome+" | Idade: "+pessoa.idade);
        }
    }
}
