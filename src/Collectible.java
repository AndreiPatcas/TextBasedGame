public class Collectible extends AbstractItem{

    private Scene location;
    public Collectible(int id, String name, String description,Scene location) {
        super(id, name, description);
        this.location=location;
    }

    @Override
    public void interaction() {

    }
    public void take(){
        System.out.println("You took "+ this.getName());
    }

}
