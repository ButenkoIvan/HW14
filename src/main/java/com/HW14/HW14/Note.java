package com.HW14.HW14;

import lombok.Data;


import javax.persistence.*;


@Entity
@Data
public class Note {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    @Column
    private String title;
    @Column
    private String content;
}
