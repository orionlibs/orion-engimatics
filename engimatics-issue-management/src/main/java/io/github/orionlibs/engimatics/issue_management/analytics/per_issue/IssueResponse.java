package io.github.orionlibs.engimatics.issue_management.analytics.per_issue;

public class IssueResponse
{
    public static long getIssueTimeToFirstResponseInSeconds(long issueCreationEpoch, long issueTimeToFirstResponseEpoch)
    {
        return (issueTimeToFirstResponseEpoch - issueCreationEpoch) / 1000;
    }
}
