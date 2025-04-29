import java.util.Objects;

public class Pair {
    int first, second;
    public Pair(int a, int b){
        this.first = Math.min(a, b);
        this.second = Math.max(a, b);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if(!(o instanceof Pair)) return false;
        Pair p = (Pair) o;
        return first == p.first && second == p.second;
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    @Override
    public String toString(){
        return "(" + first + "," + second + ")";
    }
}