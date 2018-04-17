public class MongoTest {

    public static void main(String[] args) {
       // MongoDB_Connector connector = new MongoDB_Connector();
       // connector.connect();
        MongoDB_InsertData insert = new MongoDB_InsertData();
      //  insert.insertData();

        MongoDB_RetrieveData data = new MongoDB_RetrieveData();
        data.getCollection2();
    }

}
