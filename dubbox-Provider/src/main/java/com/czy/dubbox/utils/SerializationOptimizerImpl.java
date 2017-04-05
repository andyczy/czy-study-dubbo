package com.czy.dubbox.utils;


import com.czy.dubbox.entity.Simple;
import com.czy.dubbox.entity.User;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

//implements SerializationOptimizer
public class SerializationOptimizerImpl implements Serializable {

    public Collection<Class> getSerializableClasses() {
        List<Class> classes = new LinkedList<Class>();
        //这里可以把所有需要进行序列化的类进行添加
        classes.add(User.class);
        classes.add(Simple.class);
        return classes;
    }
}
