package model.entity;

public enum NoteBookContainer {
    FIRST_NOTE("Taras", "loggiing"),
    SECOND_NOTE("Kolyan","some_logg"),
    THIRD_NOTE("Vadim","login");

    private String login;
    private String name;

    NoteBookContainer(String name, String login){
        this.login = login;
        this.name = name;
    }

    public String getLogin(){
        return login;
    }

    public String getName(){
        return  name;
    }


    public static boolean checkForLoginExistent(String login){
        for (NoteBookContainer note : NoteBookContainer.values()) {
            if (note.getLogin().equals(login))
                return true;
        }
        return false;
    }

}
