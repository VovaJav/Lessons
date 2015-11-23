package ua.com.todd.customviewproject;

import java.util.Objects;

public class Some {
    public int a;
    public int b;
    public String str;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Some some = (Some) o;
        return Objects.equals(a, some.a) &&
                Objects.equals(b, some.b) &&
                Objects.equals(str, some.str);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, str);
    }
}
