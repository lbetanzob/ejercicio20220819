package mavesa.desarrollo20220819.controlador;

import mavesa.desarrollo20220819.entidades.CodigosTablas;
import mavesa.desarrollo20220819.entidades.Tablas;
import mavesa.desarrollo20220819.repo.ICodigosTablasRepo;
import mavesa.desarrollo20220819.repo.ITablasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tablas")
public class TablasController {
    @Autowired
    private ITablasRepo iTabRepo;
    @GetMapping("/listatablas")
    public Iterable<Tablas> listatabla() {
        return iTabRepo.findAll();
    }
}
