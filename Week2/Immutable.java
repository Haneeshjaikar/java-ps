package Week2;
import java.util.*;

public final class Immutable {
    private final List<String> list;
    private final Date date;

    public Immutable(List<String> list, Date date) {
        this.list = list;
        this.date = new Date(date.getTime());
    }

    public List<String> getList() {
		return new ArrayList<>(list);
	}

    public Date getDate() {
        return new Date(date.getTime());
    }
}
