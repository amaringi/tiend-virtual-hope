package users;

//atributos encapsulados con modificador de acceso private
public class User {
    private int id;
    private String name;
    private String lastname;
    private String phone;
    private String mail;
    private String password;

    //constructor de la clase
    public User(){

    }
    //getter and setter
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
}
