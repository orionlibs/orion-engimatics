package io.github.orionlibs.engimatics.issue_management.analytics.per_issue;

public class IssueAge
{
    public static long getIssueAgeInSeconds(long issueCreationEpoch, long issueResolutionEpoch)
    {
        return (issueResolutionEpoch - issueCreationEpoch) / 1000;
    }
}
