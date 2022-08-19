package mavesa.desarrollo20220819.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Setter @Getter @NoArgsConstructor @AllArgsConstructor
@Entity
public class Prmaster {
    @Id
    @Column(length = 12)
    private String codigoPrms;
    private String descripPrms;
    @ManyToOne
    private CodigosTablas colorPrms;
    @ManyToOne
    private CodigosTablas areaPrms;
    @ManyToOne
    private CodigosTablas prendaPrms;
}
