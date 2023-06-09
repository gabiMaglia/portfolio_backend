package com.portfolio.Gabriel.Maglia.Entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Getter @Setter
@Entity
public class Studies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String title_st;

    @NotNull
    private String institution_st;

    @NotNull
    private String startDate_st;


    private String endDate_st;

    @NotNull
    private String description_st;


    private String img_st;

    @NotNull
    private Long persona_id;

    @NotNull
    private Long persona_DNI_persona;
}
