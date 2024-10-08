/**
 * This class should represent a single login session.
 *
 * @author Puyuan Song
 */
package project2;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Session {

    // Private fields
    private Record login;
    private Record logout;

    /**
     * This class should provide the two-parameter constructor that constructs a Session object based on a login record and logout record
     */
    public Session(Record login, Record logout) {
       
    }

    // Getter methods (Accessors)
    /**
     * Returns the terminal.
     * @return The terminal number.
     */
    public int getTerminal() {
        return login.getTerminal();
    }
    /**
     * Returns the login time.
     * @return the login time.
     */
    public Date getLoginTime() {
        return login.getTime();
    }
    /**
     * Returns the logout time.
     * @return the logout time.
     */
    public Date getLogoutTime() {
        return (logout != null) ? logout.getTime() : null;
    }
    /**
     * Returns the username time.
     * @return the username time.
     */
    public String getUsername() {
        return login.getUsername();
    }

    // Returns the duration between login and logout in milliseconds, or -1 if the session is active
    public long getDuration() {
        return 0;
    }

    // Helper method to format duration into days, hours, minutes, seconds
    private String formatDuration(long durationMillis) {
        return new String();
    }

    
    /**
     * Override toString method
     * Returns a string representation of the point in the format (x, y).
     * @return A string representation of the point.
     */
    @Override
    public String toString() {
        //TODO: Implement this
        return new String();
    }
}

