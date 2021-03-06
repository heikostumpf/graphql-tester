package de.heikostumpf.sfgraphQL.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="owners")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstname;

    private String lastname;

    private int age;

    public Owner() {
    }

    public Owner(long id) {
        this.id = id;
    }
}
