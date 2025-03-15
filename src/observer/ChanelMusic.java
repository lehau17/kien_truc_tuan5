package observer;
import java.util.ArrayList;
import java.util.List;

class ChanelMusic {
    private List<Observer> users = new ArrayList<>();
    private String name;

    public ChanelMusic(String name) {
        this.name = name;
    }

    public void addUser(Observer user) {
        users.add(user);
    }

    public void removeUser(Observer user) {
        users.remove(user);
    }

    public void notifyUsers(String message) {
        for (Observer user : users) {
            user.update("[" + name + "] " + message);
        }
    }

    public void uploadNewSong(String songName) {
        System.out.println(name + " uploaded a new song: " + songName);
        notifyUsers("New song available: " + songName);
    }
}
