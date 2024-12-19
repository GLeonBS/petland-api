package com.petland.start;

import com.petland.model.Cadastro;
import com.petland.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements ApplicationRunner {

    @Autowired
    private CadastroRepository cadastroRepository;

    @Override
    public void run(org.springframework.boot.ApplicationArguments args) throws Exception {
        Cadastro leon = new Cadastro();
        leon.setId(1);
        leon.setNome("Gabriel Leon");

        cadastroRepository.save(leon);

    }
}
