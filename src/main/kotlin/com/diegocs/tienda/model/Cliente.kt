package com.diegocs.tienda.model

import javax.persistence.*


@Entity
@Table(name = "usuarios")

class Cliente {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null

    var nombre: String? = null

    var edad: String? = null
}