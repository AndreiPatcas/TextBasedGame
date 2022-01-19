import java.util.ArrayList;

public class Container extends AbstractItem{
    private ArrayList<Collectible> items;
    public Container(int id, String name, String description) {
        super(id, name, description);
        this.items=new ArrayList<>();
    }

    public void addInContainer(Collectible item){
        this.items.add(item);
    }
    public void removeFromContainer(Collectible item){
        this.items.remove(item);
    }
    @Override
    public void interaction() {

    }
}
