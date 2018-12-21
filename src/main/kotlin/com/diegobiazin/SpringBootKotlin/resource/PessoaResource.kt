package com.diegobiazin.SpringBootKotlin.resource

import com.diegobiazin.SpringBootKotlin.dto.PessoaDTO
import com.diegobiazin.SpringBootKotlin.service.PessoaService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.stream.Collectors

@RestController
@RequestMapping(value = "/pessoas")
class PessoaResource(private val pessoaService: PessoaService) {

    @GetMapping
    fun findAll(): ResponseEntity<List<PessoaDTO>> {
        val pessoas = pessoaService.findAll()
        val pessoasDto = pessoas.stream().map { p -> PessoaDTO(p) }.collect(Collectors.toList())
        return ResponseEntity.ok().body(pessoasDto)
    }
}