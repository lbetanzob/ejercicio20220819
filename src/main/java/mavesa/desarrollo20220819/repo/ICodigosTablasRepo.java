package mavesa.desarrollo20220819.repo;

import mavesa.desarrollo20220819.entidades.CodigosTablas;
import mavesa.desarrollo20220819.objetovalioso.AgruparTablas;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ICodigosTablasRepo extends CrudRepository<CodigosTablas,Integer> {

    @Query(value = "select CT from CodigosTablas CT order by CT.codTabla") // JPQL es similar a SQL
    List<CodigosTablas> ordenarCodTabla();

    @Query("select new mavesa.desarrollo20220819.objetovalioso."+
            "AgruparTablas((CT.codTabla.descripTabla),(CT.desCodTabla))" +
            "from CodigosTablas CT order by CT.codTabla.IdTabla")
    public List<AgruparTablas> agruparxct();
}
