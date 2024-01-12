package dambi.nistalproject.model;


import java.util.ArrayList;
import java.util.List;
import jakarta.annotation.PostConstruct;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mongodb.ReadConcern;
import com.mongodb.ReadPreference;
import com.mongodb.TransactionOptions;
import com.mongodb.WriteConcern;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;


import static com.mongodb.client.model.Filters.eq;

public class MongoDBMovieRepository implements MovieRepository{

        private static final TransactionOptions txnOptions = TransactionOptions.builder()
                .readPreference(ReadPreference.primary())
                .readConcern(ReadConcern.MAJORITY)
                .writeConcern(WriteConcern.MAJORITY)
                .build();
        @Autowired
        private MongoClient client;
        private MongoCollection<Movie> moviesCollection;
        private MongoCollection<Actor> actorsCollection;

        @PostConstruct
        void init() {
            moviesCollection = client.getDatabase("Movies").getCollection("movie", Movie.class);
        }

        @Override
        public List<Movie> findAll() {
            return moviesCollection.find().into(new ArrayList<>());
        }

        @Override
        public Movie findById(String id) {
            return moviesCollection.find(eq("_id", new ObjectId(id))).first();
        }

        @Override
        public Movie save(Movie title) {
            title.setId(new ObjectId());
            moviesCollection.insertOne(title);
            return title;
        }

        @Override
        public long delete(String title) {
            return moviesCollection.deleteMany(eq("title", title)).getDeletedCount();
        }
        
    

    }


