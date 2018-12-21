package com.diegobiazin.SpringBootKotlin.dto

import com.diegobiazin.SpringBootKotlin.domain.Pessoa

class PessoaDTO(val id: String,
                val nome: String,
                val email: String) {

    constructor(pessoa: Pessoa) : this(pessoa.id!!, pessoa.nome, pessoa.email)
}