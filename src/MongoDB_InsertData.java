import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoDB_InsertData {

    MongoClient mongo = new MongoClient("localhost",27017);
    MongoDatabase database = mongo.getDatabase("users");
    MongoCollection collection = database.getCollection("users");
    Document document = new Document();

    public void insertData(String name, int age, String gender, boolean isActive, String balance, String picture, String eyeColor ) {

        document.put("name", name);
        document.put("age", age);
        document.put("gender", gender);
        document.put("isActive", isActive);
        document.put("balance", balance);
        document.put("picture", picture);
        document.put("eyeColor", eyeColor);

        collection.insertOne(document);

    }


}
