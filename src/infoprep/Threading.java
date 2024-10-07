package infoprep;

public class Threading {
    public static void main(String[] args) {
        Thread t = new Thread(new impThread());
        t.start();

    }
}
