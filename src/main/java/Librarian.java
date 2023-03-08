import java.util.Scanner;

public class Librarian {
    /*
    * The librarian should have a username and a password
    * The librarian should be able to search users, librarians and books
    * The librarian should be able to add\remove\ update user add\remove\ update_
    _ librarian and add\remove\ update book
     */
    Scanner in = new Scanner(System.in);
    private String UserName ;
    private String Password;
    public Librarian(String userName,String password){
        this.UserName = userName;
        this.Password = password;
    }

    public String getUserName() {
        return UserName;
    }
    public String getPassword() {
        return Password;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }
    public void setPassword(String password) {
        Password = password;
    }
}
