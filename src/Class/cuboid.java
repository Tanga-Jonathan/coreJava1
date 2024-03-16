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

    public static void main(String[] args) {
    
        cuboid obj = new cuboid(3, 6, 2);
        System.out.println("Height is: "+obj.getHeight());
        System.out.println("Volume is: "+obj.Volume()+" centimeters.");

}
    
}