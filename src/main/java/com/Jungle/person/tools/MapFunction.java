package com.Jungle.person.tools;

import com.Jungle.person.models.KeyValue;

import java.util.List;

@FunctionalInterface
public interface MapFunction {
    List<KeyValue> MapF(String key, String value);
}
