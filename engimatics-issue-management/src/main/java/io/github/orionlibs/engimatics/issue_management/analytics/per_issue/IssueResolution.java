package io.github.orionlibs.engimatics.issue_management.analytics.per_issue;

public class IssueResolution
{
    public static long getIssueTimeToResolutionInSeconds(long issueCreationEpoch, long issueTimeToResolutionEpoch)
    {
        return (issueTimeToResolutionEpoch - issueCreationEpoch) / 1000;
    }
}
