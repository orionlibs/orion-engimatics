package io.github.orionlibs.engimatics.issue_management;

import io.github.orionlibs.engimatics.core.OrionEnumeration;

public enum IssuePriority implements OrionEnumeration
{
    LOW_PRIORITY("Low Priority"),
    HIGH_PRIORITY("High Priority"),
    CRITICAL("Critical");
    private String name;


    private IssuePriority(String name)
    {
        setName(name);
    }


    @Override
    public String get()
    {
        return getName();
    }


    public String getName()
    {
        return this.name;
    }


    public void setName(String name)
    {
        this.name = name;
    }


    @Override
    public boolean is(OrionEnumeration other)
    {
        return other instanceof IssuePriority && this == other;
    }


    @Override
    public boolean isNot(OrionEnumeration other)
    {
        return other instanceof IssuePriority && this != other;
    }


    public static boolean valueExists(String other)
    {
        IssuePriority[] values = values();
        for(IssuePriority value : values)
        {
            if(value.get().equals(other))
            {
                return true;
            }
        }
        return false;
    }


    public static IssuePriority getEnumForValue(String other)
    {
        IssuePriority[] values = values();
        for(IssuePriority value : values)
        {
            if(value.get().equals(other))
            {
                return value;
            }
        }
        return null;
    }
}
