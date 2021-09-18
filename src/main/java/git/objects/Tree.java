package git.objects;

public class Tree extends Obj {
    public SubObj[] subObjIds;


    public static class SubObj {
        /**
         * 标识子文件类型，如文件夹，文件，符号链接，可执行文件等
         */
        public String mode = "100644";
        /**
         * 对象类型可能为： BLOB 或 TREE
         */
        public ObjType type = ObjType.BLOB;
        /**
         * 指向的子文件 或 文件夹 的ID
         */
        public String objId;

        /**
         * 子文件 或 文件夹 的 名称
         */
        public String fileName;
    }
}
