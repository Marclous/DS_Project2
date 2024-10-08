 /**
 * This class should represent the individual records from the input log file.
 *
 * @author Puyuan Song
 */
package project2;
import java.util.Date;

public class Record {

    private int terminal;
    private boolean login;
    private String username;
    private Date time;

    public Record(int terminal, boolean login, String username, Date time) {
        
    }

    // Getter methods (Accessors)

    // Returns the terminal number
    public int getTerminal() {
        return terminal;
    }

    
    /**
     * Returns whether this record represents a login
     * @return user login status
     */
    public boolean isLogin() {
        return login;
    }

    /**
     * Returns whether this record represents a logout (just the negation of login)
     * @return user logout status
     */
    public boolean isLogout() {
        return !login;
    }

     
    /**
     * Returns the username associated with this record
     * @return username
     */
    public String getUsername() {
        return username;
    }


    /**
     * Returns the time associated with this record
     * @return time
     */
    public Date getTime() {
        return time;
    }
}
