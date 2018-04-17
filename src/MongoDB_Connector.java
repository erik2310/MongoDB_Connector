import com.mongodb.MongoClient;

public class MongoDB_Connector {

    public void connect() {

        try {
            // Create a Mongo client
            MongoClient mongo = new MongoClient("localhost",27017);
            System.out.println("Successful connection to MongoDB");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
