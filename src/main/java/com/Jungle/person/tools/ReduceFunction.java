package com.Jungle.person.tools;

import java.util.List;

/**
 * @author Jungle
 */
@FunctionalInterface
public interface ReduceFunction {
    String ReduceF(String key, List<String> value);

    default String getName() {
        return this.getClass().getName();
    }
}
