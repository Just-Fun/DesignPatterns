package ua.com.serzh.builder;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.List;

@Data
@NoArgsConstructor
//@Getter(lazy=true)
public class TempTest {

    //    @Singular
//    List<String> list = new ArrayList<>();
//    @Getter(lazy = true)
//    private final List<String> list = new ArrayList<>();
    List<String> list = Collections.emptyList();

    List<Integer> integers;
}
