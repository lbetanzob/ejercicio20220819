package mavesa.desarrollo20220819.controlador;

import mavesa.desarrollo20220819.entidades.Prmaster;
import mavesa.desarrollo20220819.entidades.Tablas;
import mavesa.desarrollo20220819.repo.IPrmasterRepo;
import mavesa.desarrollo20220819.repo.ITablasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prmaster")
public class PrmasterController {
    @Autowired
    private IPrmasterRepo iPrRepo;
    @GetMapping("/listaprmaster")
    public Iterable<Prmaster> listapr() {
        return iPrRepo.findAll();
    }
}
