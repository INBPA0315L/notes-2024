package base;

import lombok.NonNull;

import java.util.List;
import java.util.Set;

/**
 * Defines queries for your {@link Repository} implementation.
 *
 * @param <T> the type of your top-level class
 * @param <U> the type of your static nested class
 * @param <V> the type of your enumerated class
 */
public interface Queries<T, U, V extends Enum<V>> {
    /**
     * Returns the greatest (maximum) value of bricks.
     *
     * @return the maximum of bricks
     */
    int getMaximumOfBricks();

    /**
     * Returns the total number of minifigures (the sum of the quantities).
     *
     * @return the total number of minifigures
     */
    int getTotalNumberOfMinifigures();

    /**
     * Returns the first set that contains the given minifigure.
     *
     * @param id the ID of the minifigure
     * @return the LEGO set
     * @throws java.util.NoSuchElementException if the minifigure cannot be found
     */
    T getFirstSetContainingMinifigure(@NonNull String id);

    /**
     * Returns the first minifigure with the given ID.
     *
     * @param id the ID of the minifigure
     * @return the minifigure
     * @throws java.util.NoSuchElementException if the minifigure cannot be found
     */
    U getFirstMinifigureById(@NonNull String id);

    /**
     * Returns the count of sets that belong to the given theme.
     *
     * @param theme the theme
     * @return the count of LEGO sets
     */
    int getCountOfSetsByTheme(@NonNull V theme);

    /**
     * Returns the average number of bricks per set.
     *
     * @return the average of bricks
     */
    double getAverageNumberOfBricks();

    /**
     * Returns the average number of minifigures per set.
     * <p>
     * Note that one set can contain multiple instances of the same minifigure.
     *
     * @return the average of minifigures
     */
    double getAverageNumberOfMinifigures();

    /**
     * Returns the sorted copy of the LEGO sets using a {@link java.util.Comparator} object:
     * <p>
     * <ol>
     *     <li>the count of bricks (descending)
     *     <li>the code (descending)
     * </ol>
     * <p>
     * <strong>The method cannot modify the original list.</strong>
     *
     * @return the sorted list of LEGO sets
     */
    List<T> getSetsOrderByCountOfBricksDescThenByCodeDesc();

    /**
     * Returns the sorted copy of the LEGO sets using the {@link Comparable} interface:
     * <p>
     * <ol>
     *     <li>the count of bricks (descending)
     *     <li>the code (descending)
     * </ol>
     * <p>
     * <strong>The method cannot modify the original list.</strong><br>
     * <strong>Implement the {@link Comparable} interface in your top-level class.</strong>
     *
     * @return the sorted list of LEGO sets
     */
    List<T> getSetsOrderByCountOfBricksAscThenByCodeAsc();

    /**
     * Returns all the LEGO sets of the given theme.
     *
     * @param theme the theme
     * @return the set of the LEGO sets
     */
    Set<T> getSetsByTheme(@NonNull V theme);

    /**
     * Returns the list of those minifigures whose quantity is greater than 1.
     *
     * @return the list of the minifigures
     */
    List<U> getMinifiguresHavingMultipleQuantities();

    /**
     * Returns all the themes that contain at least one set with minifigure(s).
     *
     * @return the set of the themes
     */
    Set<V> getThemesHavingMinifigures();
}