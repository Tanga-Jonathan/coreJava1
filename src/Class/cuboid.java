package Class;

public class cuboid {

    int len;
    int width;
    int height;
    int volume;

public cuboid(int len, int width, int height){
    this.len = len;
    this.width = width;
    this.height = height;
    
}
// this constructor sets the three dimensions the same
public cuboid(int dimension){
    this.len = dimension;
    this.width = dimension;
    this.height = dimension;
    
}
// this sets the dimendions to the same static values 
public cuboid(){
    this.len = 16;
    this.width = 16;
    this.height = 16;
    
}

// this sets height constant
public cuboid(int len, int width){
    this.len = len;
    this.width = width;
    this.height = 10;
    
}


public void setWidth(int width){
    this.width = width;

};

public void setLen(int len){
    this.len = len;

};

public void setHeight(int height){
    this.height = height;

};

public int getWidth(){
    return width;

};

public int getLen(){
    return len;

};

public int getHeight(){
    return height;

};




public int Volume(){
    return volume = len*height*width;
}
int areaa;
public int Area(){
    return areaa = len*width;
}


    public static void main(String[] args) {
    
        cuboid obj = new cuboid(3, 6, 2);
        System.out.println("Height is: "+obj.getHeight());
        System.out.println("Volume is: "+obj.Volume()+" centimeters.");

        cuboid area = new cuboid(3, 6);
        System.out.println(area.Area());

        cuboid cube = new cuboid( 6);
        System.out.println(cube.Volume());


}
    
}