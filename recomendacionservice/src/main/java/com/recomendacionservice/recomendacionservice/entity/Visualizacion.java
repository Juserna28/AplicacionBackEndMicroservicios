package main.java.com.recomendacionservice.recomendacionservice.entity;

@Entity
public class Visualizacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long peliculaId; 
    
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}
