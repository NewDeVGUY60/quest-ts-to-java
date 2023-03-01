import java.util.Date;
import java.util.LinkedList;

public class User {
    private Date birthdate;
    private double size;
    private LinkedList<Photo> photos;
    private Address address; 

    public User(Date birthdate, double size, LinkedList<Photo> photos, Address address){
        this.birthdate = birthdate;
        this.size = size;
        this.photos = photos;
        this.address = address;
    }


    public Date getBirthdate(){
        return this.birthdate;
    }
    public double getSize(){
        return this.size;
    }
    public LinkedList<Photo> getPhotos(){
        return this.photos;
    }
    public Address getAddress(){
        return this.address;
    }
    public void setBirthdate(Date birthdate){
        this.birthdate = birthdate;
    }
    public void setSize(double size){
        this.size = size;
    }
    public void setPhotos(LinkedList<Photo> photos){
        this.photos = photos;
    }
    public void setAddress(Address address){
        this.address = address;
    }


}
