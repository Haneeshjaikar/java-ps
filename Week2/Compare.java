package Week2;

public class Compare implements Comparable<Compare> {
    public String name;
	public int id;

    @Override
    public int compareTo(Compare c) {
        return this.name.compareToIgnoreCase(c.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

class Comparartor {
    public int compare(Compare c1, Compare c2)
    {
        return c1.name.compareTo(c2.name);
    }
}
