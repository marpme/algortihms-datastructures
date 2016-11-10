package resources;

/**
 * Created by marvinpiekarek on 10/11/2016.
 */
public enum Gender {

    MALE(1),
    FEMALE(2),
    OTHER(3);

    private final int value;

    Gender(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}