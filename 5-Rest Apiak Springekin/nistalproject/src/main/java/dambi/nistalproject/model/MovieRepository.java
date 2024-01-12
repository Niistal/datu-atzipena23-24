package dambi.nistalproject.model;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository {
    


    List<Movie> findAll();

    Movie findById(String id);

    Movie save(Movie title);
    
    long delete(String title);
}

