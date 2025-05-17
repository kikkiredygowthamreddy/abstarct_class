abstract  class swift{
      public abstract void warm();
       public abstract void swim();
        
        public void playradio(){
            System.out.println("playing radio....");
}
}
abstract class benz extends swift{
      public void warm(){
            System.out.println("warming up");
      }
}
class updatedbenz extends benz{ //concrete class
      public void swim(){
            System.out.println("swimingg...");
      }
}
public class good{
      public static void main(String args[]){
swift obj = new updatedbenz(); {
      obj.playradio();
      obj.swim();
      obj.warm();
}
      }
}