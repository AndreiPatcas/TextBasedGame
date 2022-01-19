public class Scene extends AbstractItem {

    private boolean accesible=true;
    private Scene north,south,east,west;
//    public Scene(int id, String name, String description) {
//        super(id, name, description);
//    }

    public Scene(int id, String name, String description, boolean accesible, Scene north, Scene south, Scene east, Scene west) {
        super(id, name, description);
        this.accesible = accesible;
        this.north = north;
        this.south = south;
        this.east = east;
        this.west = west;
    }



    @Override
    public void interaction() {

    }

    public Scene getNorth() {
        return north;
    }

    public Scene getSouth() {
        return south;
    }

    public Scene getEast() {
        return east;
    }

    public Scene getWest() {
        return west;
    }
}
