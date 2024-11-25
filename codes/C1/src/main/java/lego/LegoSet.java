package lego;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@Getter
@Setter(AccessLevel.PACKAGE)
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class LegoSet {
    @EqualsAndHashCode.Include
    private String code;
    private String name;
    private Theme theme;
    private int bricks;
    @ToString.Exclude
    private Minifigure[] minifigures;

    @NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
    @AllArgsConstructor
    @Getter
    @ToString
    @EqualsAndHashCode(onlyExplicitlyIncluded = true)
    public static final class Minifigure {
        @EqualsAndHashCode.Include
        private final String id;
        private final String name;
        private final int quantity;
    }

    public static enum Theme {
        @JsonProperty("City")
        CITY,
        @JsonProperty("Harry Potter")
        HARRY_POTTER,
        @JsonProperty("Star Wars")
        STAR_WARS,
        @JsonProperty("Creator Expert")
        CREATOR_EXPERT
    }
}
