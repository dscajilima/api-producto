package com.diegocs.tienda.service

import com.diegocs.tienda.model.Cliente
import com.diegocs.tienda.repository.ClienteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.RequestBody

@Service

class ClienteService {
    @Autowired
    lateinit var clienteRepository: ClienteRepository
    fun list(): List<Cliente> {
        return clienteRepository.findAll()
    }
    fun save(@RequestBody cliente:Cliente): Cliente{
        return clienteRepository.save(cliente)
    }
    fun update(@RequestBody cliente: Cliente): Cliente {
        return clienteRepository.save(cliente)
    }

    fun updateEdad (cliente: Cliente): Cliente {
        val response = clienteRepository.findById(cliente.id)
            ?: throw Exception()
        response.apply {
            this.edad=cliente.edad
        }
        return clienteRepository.save(response)
    }
    fun delete (id:Long): Boolean{
        clienteRepository.deleteById(id)
        return true
    }
}