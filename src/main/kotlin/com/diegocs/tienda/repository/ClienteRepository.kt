package com.diegocs.tienda.repository

import com.diegocs.tienda.model.Cliente
import org.springframework.data.jpa.repository.JpaRepository

interface ClienteRepository: JpaRepository<Cliente, Long> {
    fun findById (id: Long?): Cliente?
}