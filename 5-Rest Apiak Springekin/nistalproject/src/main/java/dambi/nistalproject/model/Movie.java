package dambi.nistalproject.model;

import java.util.List;

import org.bson.types.ObjectId;


public class Movie  {
    
    
    private ObjectId id;
    private int movieId;
    
    private String title;
    
    Actor actor = new Actor(id, movieId, title, movieId, movieId, title, movieId);


    public Movie(ObjectId id, int movieId, String title, Actor actor) {
        this.id = id;
        this.movieId = movieId;
        this.title = title;
        this.actor = actor;
    }

    public Movie() {
        
    }
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
    @Override
    public String toString() {
        return "Movie [id=" + id + ", movieId=" + movieId + ", title=" + title + ", actor=" + actor + "]";
    }
}

