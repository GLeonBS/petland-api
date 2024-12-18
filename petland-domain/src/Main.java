import com.petland.domain.atendimento.Atendimento;
import com.petland.domain.atendimento.AtendimentoStatus;
import com.petland.domain.atendimento.AtendimentoTipo;
import com.petland.domain.cadastro.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        cadastro.setId(1);
        cadastro.setNome("Gabriel Leon");

        Perfil perfil = new Perfil();
        perfil.setCliente(true);
        cadastro.setPerfil(perfil);

        Endereco endereco = new Endereco();
        endereco.setLogradouro("Rua dos Bobos");
        endereco.setNumero("125A");

        cadastro.setEndereco(endereco);
        //cadastro ok

        Animal animal = new Animal();
        animal.setId(1);
        animal.setNome("Rex");
        animal.setAniversario(LocalDate.of(2023, 12, 20));
        animal.setEspecie(Especie.CACHORRO);

        ProdutoServico servico = new ProdutoServico();
        servico.setId(1);
        servico.setNome("Banho e Tosa");
        servico.setValor(60.0);

        Atendimento atendimento = new Atendimento();
        atendimento.setId(1);
        atendimento.setData(LocalDate.now());
        atendimento.setHora(LocalTime.now());
        atendimento.setDescricao(servico.getNome());
        atendimento.setStatus(AtendimentoStatus.REALIZANDO);
        atendimento.setTipo(AtendimentoTipo.HIGIENIZACAO);
        atendimento.setSolicitante(cadastro);
        atendimento.setPaciente(animal);
        atendimento.setServico(servico);
        atendimento.setValor(servico.getValor());

        System.out.println(atendimento);
    }
}