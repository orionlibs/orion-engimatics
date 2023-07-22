package io.github.orionlibs.engimatics.issue_management.analytics.per_issue;

import java.util.Arrays;

public class IssueComments
{
    public static float getAverageNumberOfComments(int[] commentsPerIssue)
    {
        if(commentsPerIssue == null)
        {
            throw new IllegalArgumentException("commentsPerIssue cannot be null");
        }
        return (float)Arrays.stream(commentsPerIssue).summaryStatistics().getAverage();
    }
}
