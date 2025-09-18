package Encapsulation.Enp9;
public class Enc9 {
    public static void main(String[] args){
        MusicPlayer player=new MusicPlayer();
        player.setSongName("Saiyaara");
        System.out.print("Now Playing: " + player.getSongName());
    }
}
