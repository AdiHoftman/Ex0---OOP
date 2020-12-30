import java.util.Collection;

public class NodeData implements node_data{
    private int key;
    private int tag;
    private String info;
    private hashMap<node_data>() = new hashMap<node_data>();

    @Override
    public int getKey() {
        return this.key;
    }

    @Override
    public Collection<node_data> getNi() {
        return null;
    }

    @Override
    public boolean hasNi(int key) {
        return false;
    }

    @Override
    public void addNi(node_data t) {

    }

    @Override
    public void removeNode(node_data node) {

    }

    @Override
    public String getInfo() {
        return this.info;
    }

    @Override
    public void setInfo(String s) {
        this.info.equals(s);
    }

    @Override
    public int getTag() {
        return this.tag;
    }

    @Override
    public void setTag(int t) {
        this.tag = t;
    }
}
