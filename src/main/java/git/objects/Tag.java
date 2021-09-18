package git.objects;

/**
 * 
 */
public class Tag extends Obj {
    /**
     * Tag 指向的 对象类型
     */
    public ObjType type;
    /**
     * 指向的对象ID
     */
    public String objId;
    public String tagName;
    public UserAndTime tagger;
    public String msg;
}
