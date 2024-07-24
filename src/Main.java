
public class Main {

	public static void main(String[] args) {
		
		PlayList playlist = new PlayList(3);
		
		Song s1 = new Song("S1");
		Song s2 = new Song("S2");
		Song s3 = new Song("S3");
		Song s4 = new Song("S4");
		
		playlist.addSong(s1);
		playlist.addSong(s2);
		playlist.addSong(s3);
		playlist.printPlayList();
		
		playlist.playSong(s4);
		playlist.printPlayList();
		
		playlist.playSong(s2);
		playlist.printPlayList();
		
		playlist.playSong(s1);
		playlist.printPlayList();
		
		
	}

}
