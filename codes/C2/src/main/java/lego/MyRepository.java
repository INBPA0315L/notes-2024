package lego;

import base.Queries;
import base.Repository;
import lombok.NonNull;

import java.io.IOException;
import java.util.*;

public class MyRepository
        extends Repository<LegoSet>
        implements Queries<LegoSet, LegoSet.Minifigure, LegoSet.Theme> {

    public MyRepository() throws IOException {
        super(LegoSet.class);
    }

    public static void main(String[] args) throws IOException {
        MyRepository repository = new MyRepository();
        System.out.println(repository);
        System.out.println(repository.getMaximumOfBricks());
        System.out.println(repository.getFirstSetContainingMinifigure("sw1035"));
        System.out.println(repository.getCountOfSetsByTheme(LegoSet.Theme.HARRY_POTTER));
        // TODO: test your other methods
    }

    @Override
    public int getMaximumOfBricks() {
        // int max = getAll().get(0).getBricks();
        int max = getAll().getFirst().getBricks();
        for (int i = 1; i < getAll().size(); i++) {
            if (getAll().get(i).getBricks() > max) {
                max = getAll().get(i).getBricks();
            }
        }
        return max;
    }

    @Override
    public int getTotalNumberOfMinifigures() {
        int sum = 0;
        for (LegoSet legoSet : getAll()) {
            for (LegoSet.Minifigure minifigure : legoSet.getMinifigures()) {
                sum += minifigure.getQuantity();
            }
        }
        return sum;
    }

    @Override
    public LegoSet getFirstSetContainingMinifigure(@NonNull String id) {
        for (LegoSet legoSet : getAll()) {
            for (LegoSet.Minifigure minifigure : legoSet.getMinifigures()) {
                if (Objects.equals(id, minifigure.getId())) {
                    return legoSet;
                }
            }
        }
        return null;
    }

    @Override
    public LegoSet.Minifigure getFirstMinifigureById(@NonNull String id) {
        for (LegoSet legoSet : getAll()) {
            for (LegoSet.Minifigure minifigure : legoSet.getMinifigures()) {
                if (Objects.equals(id, minifigure.getId())) {
                    return minifigure;
                }
            }
        }
        return null;
    }

    @Override
    public int getCountOfSetsByTheme(LegoSet.@NonNull Theme theme) {
        int counter = 0;
        for (LegoSet legoSet : getAll()) {
            if (legoSet.getTheme() == theme) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public double getAverageNumberOfBricks() {
        int sum = 0;
        for (LegoSet legoSet : getAll()) {
            sum += legoSet.getBricks();
        }
        return sum / (double) getAll().size();
    }

    @Override
    public double getAverageNumberOfMinifigures() {
        int sum = 0;
        for (LegoSet legoSet : getAll()) {
            sum += legoSet.getMinifigures().length;
        }
        return sum / (double) getAll().size();
    }

    @Override
    public List<LegoSet> getSetsOrderByCountOfBricksDescThenByCodeDesc() {
        List<LegoSet> legoSets = new ArrayList<>(getAll());
        Collections.sort(legoSets, new Comparator<LegoSet>() {
            @Override
            public int compare(LegoSet o1, LegoSet o2) {
                if (o1.getBricks() != o2.getBricks()) {
                    return Objects.compare(o1.getBricks(), o2.getBricks(),
                            Comparator.reverseOrder());
                }
                return Objects.compare(o1.getCode(), o2.getCode(),
                        Comparator.reverseOrder());
            }
        });
        return legoSets;
    }

    @Override
    public List<LegoSet> getSetsOrderByCountOfBricksAscThenByCodeAsc() {
        List<LegoSet> legoSets = new ArrayList<>(getAll());
        Collections.sort(legoSets);
        return legoSets;
    }

    @Override
    public Set<LegoSet> getSetsByTheme(LegoSet.@NonNull Theme theme) {
        Set<LegoSet> legoSets = new HashSet<>();
        for (LegoSet legoSet : getAll()) {
            if (legoSet.getTheme() == theme) {
                legoSets.add(legoSet);
            }
        }
        return legoSets;
    }

    @Override
    public List<LegoSet.Minifigure> getMinifiguresHavingMultipleQuantities() {
        List<LegoSet.Minifigure> minifigures = new ArrayList<>();
        for (LegoSet legoSet : getAll()) {
            for (LegoSet.Minifigure minifigure : legoSet.getMinifigures()) {
                if (minifigure.getQuantity() > 1) {
                    minifigures.add(minifigure);
                }
            }
        }
        return minifigures;
    }

    @Override
    public Set<LegoSet.Theme> getThemesHavingMinifigures() {
        Set<LegoSet.Theme> themes = new HashSet<>();
        for (LegoSet legoSet : getAll()) {
            if (legoSet.getMinifigures().length > 0) {
                themes.add(legoSet.getTheme());
            }
        }
        return themes;
    }
}
