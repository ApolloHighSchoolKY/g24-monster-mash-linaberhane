public class Troll extends Monster{
    public String riddle;

    public Troll(String name){
        riddle = "";
        super(name);
    }

    public String kill(){
        return getName() + " killed a victim. Clubbing's not always fun.\n";
    }

    public String riddle(){
        return getName() + " stopped you from going under the bridge. Answer his riddle.\n";
    }

    public String askRiddle(String question){
        riddle = question;
        return getName() + ": " + riddle + "\n";
    }
}