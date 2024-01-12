package  dambi.nistalproject.model;

import org.bson.types.ObjectId;

public class Actor {
    private ObjectId objid;
    private int cast_id;
    private String character;
    private int gender; // 1 male, 2 female
    private int id;
    private String name;
    private int order;// auto increment

    public Actor(ObjectId objid, int cast_id, String character, int gender, int id, String name, int order) {
        this.objid = objid;
        this.cast_id = cast_id;
        this.character = character;
        this.gender = gender;
        this.id = id;
        this.name = name;
        this.order = order;
    }

    public Actor() {
        
    }

    
    public ObjectId getObjid() {
        return objid;
    }
    public void setObjid(ObjectId objid) {
        this.objid = objid;
    }
    public int getCast_id() {
        return cast_id;
    }
    public void setCast_id(int cast_id) {
        this.cast_id = cast_id;
    }
    public String getCharacter() {
        return character;
    }
    public void setCharacter(String character) {
        this.character = character;
    }
    public int getGender() {
        return gender;
    }
    public void setGender(int gender) {
        this.gender = gender;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Actor [objid=" + objid + ", cast_id=" + cast_id + ", character=" + character + ", gender=" + gender
                + ", id=" + id + ", name=" + name + ", order=" + order + "]";
    }
    
    
}
