package mavesa.desarrollo20220819.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter @Getter @NoArgsConstructor @AllArgsConstructor
@Entity
public class CodigosTablas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCodTabla;

    @Column(length = 10)
    private String codigoTabla;
    @Column(length = 50)
    private String desCodTabla;

    @ManyToOne
    private Tablas codTabla;


}
