package git;

import git.objects.Commit;

/**
 *
 */
public class Repository {
    public Index index;
    public HEAD head;

    public void init() {

    }

    public void gitClone() {

    }

    public void fetch() {

    }

    public void pull() {
        fetch();
        merge();
        // rebase();
    }

    public void push() {

    }

    public void status() {

    }

    public void diff() {

    }

    public void add() {
        index.add();
    }

    public void restore() {

    }

    public void commit() {
        Commit newCommit = new Commit();

        newCommit.parents[0] = HEAD.ref.commitId;

        HEAD.ref.commitId = newCommit.objId;

        index.clear();
    }

    public void reset() {
        // soft
        // fixed
        // hard
    }

    public void rm() {

    }

    public void mv() {

    }

    public void branch() {

    }

    public void checkout() {

    }

    public void merge() {

    }

    public void rebase() {

    }

    public void log() {

    }

    public void stash() {

    }

    public void tag() {

    }

    public void cherryPick() {

    }

    public void revert() {

    }

    public void reflog() {

    }


}
