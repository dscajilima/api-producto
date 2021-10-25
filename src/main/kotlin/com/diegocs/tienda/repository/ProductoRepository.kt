package com.diegocs.tienda.repository

import com.diegocs.tienda.model.Producto
import org.springframework.data.jpa.repository.JpaRepository

interface ProductoRepository:JpaRepository <Producto,Long> {
}