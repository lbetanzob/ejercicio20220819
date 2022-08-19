package mavesa.desarrollo20220819.entidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Setter @Getter @NoArgsConstructor @AllArgsConstructor
@Entity
public class Tablas {
    // ciodigo id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdTabla;

    @Column(length = 50)
    private String descripTabla;
    private int tabTabla;

    //relacion con detalle de codigos de tablas
 //   @OneToMany(mappedBy = "codTabla")
 //   @JsonIgnoreProperties("codTabla")
 //   private List<CodigosTablas> codTablas;
}
