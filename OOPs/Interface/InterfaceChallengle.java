/*
 * Q5 — Challenge
 *
 * Create two interfaces:
 *
 * interface Camera {
 *     void takePhoto();
 * }
 *
 * interface MusicPlayer {
 *     void playMusic();
 * }
 *
 * Create a class SmartPhone that implements both interfaces.
 *
 * Implement both methods and call them using a SmartPhone object.
 *
 * Expected output:
 *
 * Photo taken
 * Music playing
 */

interface Camera {

    // Interface method
    void takePhoto();
}

interface MusicPlayer {

    // Interface method
    void playMusic();
}

class SmartPhone implements Camera, MusicPlayer {

    // Implement takePhoto() from Camera
    @Override
    public void takePhoto() {
        System.out.println("Photo taken");
    }

    // Implement playMusic() from MusicPlayer
    @Override
    public void playMusic() {
        System.out.println("Music playing");
    }
}

public class InterfaceChallengle {

    public static void main(String[] args) {

        // Create SmartPhone object
        SmartPhone s = new SmartPhone();

        // Call Camera method
        s.takePhoto();

        // Call MusicPlayer method
        s.playMusic();
    }
}

// Output:
// Photo taken
// Music playing

/*
 * Explanation:
 * SmartPhone implements both Camera and MusicPlayer, so it must implement both interface methods.
 * One class can implement multiple interfaces.
 *
 * Important:
 * Interface methods must be implemented as public.
 * @Override shows that we are implementing an interface method.
 */