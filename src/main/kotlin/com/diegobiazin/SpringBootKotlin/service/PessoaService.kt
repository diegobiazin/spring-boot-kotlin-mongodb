package com.diegobiazin.SpringBootKotlin.service

import com.diegobiazin.SpringBootKotlin.Repository.PessoaRepository
import com.diegobiazin.SpringBootKotlin.domain.Pessoa
import org.springframework.stereotype.Service

@Service
class PessoaService (private val pessoaRepository: PessoaRepository){

    fun findAll(): List<Pessoa> {
        return pessoaRepository.findAll()
    }
}