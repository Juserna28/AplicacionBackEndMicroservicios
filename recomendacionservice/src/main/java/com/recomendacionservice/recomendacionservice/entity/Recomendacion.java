package main.java.com.recomendacionservice.recomendacionservice.entity;

@Entity
public class Recomendacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String categoria;

    private String usuario;

    private String descripcion;

}
