import java.util.List;

public class PessoaController {

    public void ListAll(List<Pessoa> lista){
        int num = 0;
        for (Pessoa pessoa : lista) {
            System.out.println("ID: "+num +"Nome: "+pessoa.nome+" | Idade: "+pessoa.idade);
            num +=1;
        }
    }

    public Pessoa AddPerson(String nome, int idade){
        return new Pessoa(nome, idade);
    }

    public void RemovePerson(List<Pessoa> lista,int id){
        lista.remove(id);
    }

}
