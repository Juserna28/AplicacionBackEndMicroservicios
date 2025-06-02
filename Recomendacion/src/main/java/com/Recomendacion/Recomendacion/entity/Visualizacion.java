package main.java.com.Recomendacion.Recomendacion.entity;

@Entity
public class Visualizacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}
