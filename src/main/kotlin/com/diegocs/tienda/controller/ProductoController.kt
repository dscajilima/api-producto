package com.diegocs.tienda.controller

import com.diegocs.tienda.model.Producto
import com.diegocs.tienda.service.ProductoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/productos")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])

class ProductoController {
    @Autowired
    lateinit var productoService: ProductoService

    @GetMapping
    fun list(): List<Producto>{
        return productoService.list()
    }

    @PostMapping
    fun save (@RequestBody producto: Producto):Producto{
        return productoService.save(producto)
    }
}