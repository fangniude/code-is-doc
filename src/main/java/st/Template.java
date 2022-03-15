package st;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

/**
 * @author rd20
 */
public class Template {
    public static void main(String[] args) {
        final ST st1 = new ST("hello, <name>");
        st1.add("name", "world");
        System.out.println(st1.render());

        STGroup group = new STGroupFile("test.stg");
        ST st = group.getInstanceOf("decl");
        final ST a = group.getInstanceOf("a");
        System.out.println(a);
        st.add("type", "int");
        st.add("name", "x");
        st.add("value", 0);
        System.out.println(st.render());
        System.out.println(group.getTemplateNames());

        // 主要是入口，入口没有几个，可以说，是根对象没有几个；
        // sql 语句类型： crud, create table, drop table, alter table, create schema, drop schema, use database

    }
}
