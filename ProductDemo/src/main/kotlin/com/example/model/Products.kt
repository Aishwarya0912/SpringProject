package com.example.model

import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import org.springframework.stereotype.Component
import java.time.LocalDate
import java.util.*

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Component
@Table(name="product")
class Product(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val prodId :Int = 0,
        var prodName : String = "",
        val price : Int = 0



//    var JoiningDate: LocalDate = LocalDate.parse("0000-00-00"),



)
