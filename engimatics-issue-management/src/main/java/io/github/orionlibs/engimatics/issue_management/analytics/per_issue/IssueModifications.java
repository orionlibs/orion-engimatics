package io.github.orionlibs.engimatics.issue_management.analytics.per_issue;

import java.util.Arrays;

public class IssueModifications
{
    public static float getAverageNumberOfModifications(int[] modificationsPerIssue)
    {
        if(modificationsPerIssue == null)
        {
            throw new IllegalArgumentException("modificationsPerIssue cannot be null");
        }
        return (float)Arrays.stream(modificationsPerIssue).summaryStatistics().getAverage();
    }
}
