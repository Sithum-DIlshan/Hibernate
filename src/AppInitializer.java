import entity.Item;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

public class AppInitializer {
    public static void main(String[] args) {
        Item item = new Item();
        item.setCode("I-002");
        item.setDescription("Munchee");
        item.setPackSize("150g");
        item.setUnitPrice(200.00);
        item.setQtyOnHand(100);

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction tx = session.beginTransaction();

        session.save(item);

        tx.commit();
        session.close();
    }
}
