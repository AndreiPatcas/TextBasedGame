import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean endState=false;
        Player player=new Player("Andrei");
        Scene start=new Scene(1,"room","You are in your room now. you just got up from your bed. Close to your bed is a small bookshaft and a table.\n" +
                "You see on the floor your favorite book and a key.",true,null,null,null,null);
        Scene out=new Scene(2,"outside","You are outside now! There is nothing to see here!",true, null,null,null,null);
        player.setLocation(start);

	// write your code here
        while(true){
            Scene scene=player.getLocation();
            System.out.println(scene.getDescription());
            System.out.println(">> ");
            String command=scanner.nextLine();
            String arr[]=command.split(" ");
            String action=arr[0],object=arr[1];



            //PLAYER.EXECUTE_COMMAND()
            if(endState){
                break;
            }
        }
    }
}
