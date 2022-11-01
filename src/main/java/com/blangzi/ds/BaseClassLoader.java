package com.blangzi.ds.dynamic;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

public class BaseClassLoader {

    public static <T> List<T> loadServiceByClass(Class<T> clazz){
        List<T> objects = new ArrayList<>();

        ServiceLoader<T> load = ServiceLoader.load(clazz);

        Iterator<T> iterator = load.iterator();

        while (iterator.hasNext()){
            T next = iterator.next();
            objects.add(next);
        }

        return objects;
    }


}
