import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MongoDB_RetrieveData {

    MongoClient mongo = new MongoClient("localhost",27017);
    MongoDatabase database = mongo.getDatabase("users");
    MongoCollection collection = database.getCollection("users");

    List<Document> documents = (List<Document>) collection.find().into(new ArrayList<Document>());

    public void getCollection() {

        try {
            FindIterable<Document> iterDoc = collection.find();
            int i = 1;

            Iterator it = iterDoc.iterator();

            while (it.hasNext()) {
                System.out.println(it.next());
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void getCollection2() {

        try {

            for (Document document : documents) {
                System.out.println(document);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
