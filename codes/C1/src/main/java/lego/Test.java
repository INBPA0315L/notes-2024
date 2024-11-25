package lego;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.io.File;

public class Test {
    @SneakyThrows
    public static void main(String[] args) {
        LegoSet legoSet = new LegoSet(
                "CODE",
                "My Set",
                null,
                50,
                new LegoSet.Minifigure[1]
        );
        System.out.println(legoSet);
        ObjectMapper mapper = new ObjectMapper();
        LegoSet[] legoSets = mapper.readValue(
                new File("input.json"),
                LegoSet[].class
        );
        for (LegoSet set : legoSets) {
            System.out.println(set);
        }
    }
}
