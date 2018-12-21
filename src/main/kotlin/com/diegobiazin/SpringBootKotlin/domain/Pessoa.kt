package com.diegobiazin.SpringBootKotlin.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Pessoa(@Id val id: String?,
                  val nome: String,
                  val email: String)