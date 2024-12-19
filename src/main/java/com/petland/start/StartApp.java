package com.petland.start;

import com.petland.repository.AnimalRepository;
import com.petland.repository.ProdutoServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements ApplicationRunner {


    @Autowired
    private AnimalRepository animalRepository;

    @Autowired
    private ProdutoServicoRepository produtoServicoRepository;

    @Override
    public void run(org.springframework.boot.ApplicationArguments args) throws Exception {
        //        Animal bolota = new Animal();
        //        bolota.setNome("Bolota");
        //        bolota.setEspecie(AnimalEspecie.CACHORRO);
        //        bolota.setAniversario(LocalDate.of(2018, 1, 1));
        //
        //        ProdutoServico banhoETosa = new ProdutoServico();
        //        banhoETosa.setNome("Banho e Tosa");
        //        banhoETosa.setValor(60.0);
        //        banhoETosa.setServico(true);
        //
        //        animalRepository.save(bolota);
        //        produtoServicoRepository.save(banhoETosa);
    }
}
