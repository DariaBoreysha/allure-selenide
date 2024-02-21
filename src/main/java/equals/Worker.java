package equals;

import java.util.Objects;

public class Worker {

    private int id;
    private String name;

    Worker(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Worker)) return false;

        Worker worker = (Worker) o;
       if(id != worker.id) return false;
       return name != null ? name.equals(worker.name) : worker.name != null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result *
                (name != null ? name.hashCode() : 0);
        return result;
    }
}
