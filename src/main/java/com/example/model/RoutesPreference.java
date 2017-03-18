package com.example.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Dadi on 18/03/2017.
 */
@Entity
public class RoutesPreference {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date dateDebut;
    private Date dateFin;
    private String type;
    @ManyToOne
    private Users user;
    @ManyToOne
    private Routes route;

}
