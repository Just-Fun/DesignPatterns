package ua.com.serzh.proxy.tutorialspoint;

/**
 * Created by Sergey on 8/9/17.
 */
public class ProxyImage implements Image{

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("ProxyImage display() start.\n");
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
        System.out.println("\nProxyImage display() finished.");
        System.out.println("-----------------------");
    }
}
