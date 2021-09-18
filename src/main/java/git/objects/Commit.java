package git.objects;


public class Commit extends Obj {

    public String treeId;

    public String[] parents;

    public UserAndTime author;

    public UserAndTime committer;

    public String msg;
}
