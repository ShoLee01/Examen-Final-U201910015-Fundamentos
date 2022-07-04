package upc.edu.pe.finalexamen.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "tbl_hotel")
@Data
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "name", length = 200)
    private String name;

    @NotNull
    @Column(name = "price")
    private Double price;

    @NotNull
    @Column(name = "startDate")
    private Date startDate;

    @NotNull
    @Column(name = "endDate")
    private Date endDate;


}
