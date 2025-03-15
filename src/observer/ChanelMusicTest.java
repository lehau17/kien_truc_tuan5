package observer;

class ChanelMusicTest {
    public static void main(String[] args) {
        ChanelMusic chanel = new ChanelMusic("Top Hits");
        
        User user1 = new User("Alice");
        User user2 = new User("Bob");
        
        chanel.addUser(user1);
        chanel.addUser(user2);
        
        chanel.uploadNewSong("Shape of You");
        
        chanel.removeUser(user1);
        
        chanel.uploadNewSong("Blinding Lights");
    }
}

