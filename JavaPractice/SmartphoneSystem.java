// Q6 — SmartPhone System
// ============================================================
//
// Create two interfaces:
// - Camera
// - MusicPlayer
//
// Create a SmartPhone class that implements both.
//
// Use:
// - Interface
// - Multiple interfaces
// - Method implementation
// - Object creation

interface Camera {
    public void clickPhoto();
}

interface MusicPlayer {
    public void playmusic();
}

// SmartPhone implements multiple interfaces
class SmartPhone implements Camera, MusicPlayer {

    // Provides implementation for the interface method
    @Override
    public void clickPhoto() {
        System.out.println("Photo clicked");
    }

    // Provides implementation for the interface method
    @Override
    public void playmusic() {
        System.out.println("Music Playing....");
    }
}

public class SmartphoneSystem {

    public static void main(String[] args) {

        // Create a SmartPhone object
        SmartPhone s = new SmartPhone();

        // Call methods implemented from both interfaces
        s.clickPhoto();
        s.playmusic();
    }
}

// Output:
// Photo clicked
// Music Playing....