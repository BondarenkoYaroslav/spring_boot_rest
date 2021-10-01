package com.spring.rest.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Column int id;
    private @Column String name;
    private @Column String surname;
    private @Column Date birthday;
    private @Column String mail;
    private @Column String phone;
}
