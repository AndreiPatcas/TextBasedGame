import java.util.ArrayList;

public class Player {

    private ArrayList<Collectible> collected_items;
    private String name;
    private Scene location;
    public Player(String name){
        collected_items=new ArrayList<>();
        this.name=name;
    }

    public ArrayList<Collectible> getCollectedItems(){
        return collected_items;
    }
    public void setLocation(Scene scene){
        this.location=scene;
    }
    public Scene getLocation(){
        return this.location;
    }
    public void move(String direction){
        if(direction.equals("north")){
            Scene next=this.location.getNorth();
            if (next!=null){
                setLocation(this.location.getNorth());
            }else{
                System.out.println(">> You can't do that!");
            }
        }
        if(direction.equals("south")){
            Scene next=this.location.getSouth();
            if (next!=null){
                setLocation(this.location.getSouth());
            }else{
                System.out.println(">> You can't do that!");
            }
        }
        if(direction.equals("east")){
            Scene next=this.location.getEast();
            if (next!=null){
                setLocation(this.location.getEast());
            }else{
                System.out.println(">> You can't do that!");
            }
        }
        if(direction.equals("west")){
            Scene next=this.location.getWest();
            if (next!=null){
                setLocation(this.location.getWest());
            }else{
                System.out.println(">> You can't do that!");
            }
        }
    }



}
