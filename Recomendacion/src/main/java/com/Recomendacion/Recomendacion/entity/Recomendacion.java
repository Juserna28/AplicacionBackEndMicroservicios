package main.java.com.Recomendacion.Recomendacion.entity;

@Entity
public class Recomendacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long usuarioId;
    private Long peliculaId;
    private String motivo;

}
