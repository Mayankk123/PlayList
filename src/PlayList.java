import java.util.*;

public class PlayList {
	
	private List<Song> songs;
	private int capacity;
	
	public PlayList(int capacity) {
		this.capacity = capacity;
		this.songs = new ArrayList<>();
	}
	
	public void addSong(Song song) {
		if(songs.size() == capacity) {
			songs.remove(0);
		}
		songs.add(song);
		}

    public void playSong(Song song) {
        if (songs.contains(song)) {
            songs.remove(song);
        }
        addSong(song);
    }
	
	public void printPlayList() {
		for(Song song: songs) {
			System.out.print(song.getName() + " ");
		}
		System.out.println();
	}
}
