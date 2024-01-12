package dambi.nistalproject.model;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository {
    


    List<Actor> findAllActor();

    Actor findByIdActor(String objid);

    Actor saveActor(Actor character);

    long deleteActor(String name);
}

