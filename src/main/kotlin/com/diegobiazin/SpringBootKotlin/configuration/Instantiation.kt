package com.diegobiazin.SpringBootKotlin.configuration

import com.diegobiazin.SpringBootKotlin.Repository.PessoaRepository
import com.diegobiazin.SpringBootKotlin.domain.Pessoa
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Configuration

@Configuration
class Instantiation(private val pessoaRepository: PessoaRepository) : CommandLineRunner {

    override fun run(vararg args: String?) {

        val p1 = Pessoa(null, "Diego Biazin", "diego_biazin@hotmail.com")

        pessoaRepository.saveAll(listOf(p1))
    }
}