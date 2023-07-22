package io.github.orionlibs.engimatics.core;

public interface OrionEnumeration
{
    String get();


    boolean is(OrionEnumeration other);


    boolean isNot(OrionEnumeration other);
}