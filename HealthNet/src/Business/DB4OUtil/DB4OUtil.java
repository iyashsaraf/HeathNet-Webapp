package Business.DB4OUtil;

import Business.ConfigureASystem;
import Business.EcoSystem;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;

/**
 *
 * @author saket
 */
public class DB4OUtil {

    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString();
    private static DB4OUtil dB4OUtil;
    
    public synchronized static DB4OUtil getInstance(){
        if (dB4OUtil == null){
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            config.common().activationDepth(Integer.MAX_VALUE);
            config.common().updateDepth(Integer.MAX_VALUE);

            config.common().objectClass(EcoSystem.class).cascadeOnUpdate(true); 

            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(EcoSystem ecosystem) {
        ObjectContainer conn = createConnection();
        conn.store(ecosystem);
        conn.commit();
        conn.close();
    }
    
    public EcoSystem retrieveSystem(){
        ObjectContainer conn = createConnection();
        ObjectSet<EcoSystem> ecosystems = conn.query(EcoSystem.class);
        EcoSystem ecosystem;
        if (ecosystems.size() == 0){
            ecosystem = ConfigureASystem.configure();
        }
        else{
            ecosystem = ecosystems.get(ecosystems.size() - 1);
        }
        conn.close();
        return ecosystem;
    }
}
