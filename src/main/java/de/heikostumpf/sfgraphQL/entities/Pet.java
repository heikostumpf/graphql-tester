package de.heikostumpf.sfgraphQL.entities;

import de.heikostumpf.sfgraphQL.enums.Animal;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="pets")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Animal type;

    private int age;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "owner_id")
    private Owner owner;
}
