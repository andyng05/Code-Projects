class fruit {
    private String name;
    private String color;
    private boolean isSweet;
    private boolean isEdible;
    
    public fruit(String name, String color, boolean isSweet, boolean isEdible) {
    this.name = name;
    this.color = color;
    this.isSweet = isSweet;
    this.isEdible = isEdible;
    }
    
    public void displayInfo(){
    System.out.println("what its name: " + name);
    System.out.println("what its color: " + color);
    System.out.println("is it sweet: " + isSweet);
    System.out.println("is it edible: " + isEdible);
    }

public void setSweet(boolean sweet){
    isSweet = sweet;
}

public void setEdible(boolean edible){
    isEdible = edible;
}

public void setName(String name){
    this.name = name;
}

public void setColor(String color){
    this.color = color;
}

public String getColor(){
    return color;
}

public String getName(){
    return name;
}

public boolean isSweet(){
    return isSweet;
}

public boolean isEdible(){
    return isEdible;
}
}

public class fruits {
    public static void main(String[] args) {
    fruit apple = new fruit("apple", "yed", true, true);
    fruit banana = new fruit("banana", "yellow", true, true);
    fruit lemon = new fruit("lemon", "yellow", false, true);
        
    System.out.println("apple:");
    apple.displayInfo();
    
    System.out.println("\nbanana:");
    banana.displayInfo();
        
    System.out.println("\nlemon:");
    lemon.displayInfo();
    }
}
