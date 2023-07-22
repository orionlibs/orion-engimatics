package io.github.orionlibs.engimatics.issue_management;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class IssueAnalytics
{
    private int averageNumberOfCommentsPerDay;
    private int averageNumberOfModificationsPerDay;
    private long issueAgeInSeconds;
    //time between when an issue is created and when it is first responded to
    private long timeToFirstResponseInSeconds;
    private long timeToResolutionInSeconds;
}
