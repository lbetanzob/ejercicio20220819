package mavesa.desarrollo20220819.controlador;

import mavesa.desarrollo20220819.entidades.CodigosTablas;
import mavesa.desarrollo20220819.objetovalioso.AgruparTablas;
import mavesa.desarrollo20220819.repo.ICodigosTablasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ctablas")
public class CodigosTablasController {
    @Autowired
    private ICodigosTablasRepo iCodTabRepo;
    @GetMapping("/listacodtablas")
    public Iterable<CodigosTablas> listatab()
    {
        return iCodTabRepo.findAll();
    }

    @GetMapping("/listacodtablasxct")
    public Iterable<CodigosTablas> listatabxct()
    {
        return iCodTabRepo.ordenarCodTabla();
    }

    @GetMapping("/listacodtxct")
    public Iterable<AgruparTablas> listatxct()
    {
        return iCodTabRepo.agruparxct();
    }

}
