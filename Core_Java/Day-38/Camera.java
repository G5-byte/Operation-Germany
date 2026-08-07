interface Camera {

    public void takePicture();
    public void recordVideo();

}

interface MusicPlayer {

    public void playMusic();
    public void pauseMusic();

}

class SmartPhone implements Camera, MusicPlayer{

    public void takePicture(){
        System.out.println("Taking a picture with the smartphone camera");
    }

    public void recordVideo(){
        System.out.println("Recording a video with the smartphone camera");
    }

    public void playMusic(){
        System.out.println("Playing music on the smartphone");
    }

    public void pauseMusic(){
        System.out.println("Pausing music on the smartphone");
    }
}

class Main{
    
    public static void main(String[] args){

        SmartPhone myPhone = new SmartPhone();  // Create a SmartPhone object
        myPhone.takePicture();
        myPhone.recordVideo();
        myPhone.playMusic();
        myPhone.pauseMusic();
    }
}