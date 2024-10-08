 /**
 * The RecordList class should be used to store all the Record objects.
 *
 * @author Puyuan Song
 */
package project2;
import java.util.ArrayList;
import java.util.Date;
import java.util.NoSuchElementException;

public class RecordList extends ArrayList<Record> {

    // Default constructor to create an empty RecordList object
    public RecordList() {
        super();
    }

    /**
     * This method should construct and return the first login session for the specified user.
     * @return The first login session.
     */
    public Session getFirstSession(String user) {
        return null;
    }

    /**
     * This method should return the last login session for the specified user.
     * @param user
     * @return last login session
     */
    public Session getLastSession(String user) {
        return null;
    }
}
