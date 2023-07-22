package io.github.orionlibs.engimatics.issue_management;

import io.github.orionlibs.engimatics.core.OrionEnumeration;

public enum IssueType implements OrionEnumeration
{
    BUG("Bug"),
    FEATURE("Feature"),
    OPERATIONAL("Operational"),
    TECHNICAL_DEBT("Technical Debt");
    private String name;


    private IssueType(String name)
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
        return other instanceof IssueType && this == other;
    }


    @Override
    public boolean isNot(OrionEnumeration other)
    {
        return other instanceof IssueType && this != other;
    }


    public static boolean valueExists(String other)
    {
        IssueType[] values = values();
        for(IssueType value : values)
        {
            if(value.get().equals(other))
            {
                return true;
            }
        }
        return false;
    }


    public static IssueType getEnumForValue(String other)
    {
        IssueType[] values = values();
        for(IssueType value : values)
        {
            if(value.get().equals(other))
            {
                return value;
            }
        }
        return null;
    }
}
