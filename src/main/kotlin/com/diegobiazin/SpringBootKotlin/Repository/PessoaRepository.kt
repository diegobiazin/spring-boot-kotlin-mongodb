package com.diegobiazin.SpringBootKotlin.Repository

import com.diegobiazin.SpringBootKotlin.domain.Pessoa
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface PessoaRepository : MongoRepository<Pessoa, String> {
}