package io.github.orionlibs.engimatics.issue_management;

import io.github.orionlibs.engimatics.issue_management.IssuePriority;
import io.github.orionlibs.engimatics.issue_management.IssueType;
import java.util.Map;
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
public class IssuesAnalytics
{
    private int averageNumberOfAttachments;
    private int averageNumberOfUniqueWatchers;
    private int averageNumberOfComments;
    private int averageNumberOfModifications;
    private int averageNumberOfStoryPoints;
    private int averageNumberOfAssignees;
    private int averageNumberOfResolvedIssuesPerDay;
    private int averageNumberOfResolvedIssuesPerPersonPerDay;
    private int averageIssueAgeInSeconds;
    private int averageTimeToFirstResponseInSeconds;
    private int averageTimeToResolutionInSeconds;
    private float percentageOfOpenIssues;
    private float percentageOfClosedIssues;
    private float percentageOfReopenedIssues;
    private float percentageOfIssuesInBacklog;
    private Map<IssuePriority, Float> priorityToPercentageMapper;
    private Map<IssueType, Float> typeToPercentageMapper;
    private float averageImpactScore;
    private float averageNumberOfStoryPointsResolvedPerSprint;
    private float averageNumberOfIssuesResolvedPerSprint;
    //TODO: analysis of the trends in the volume, severity, and types of issues over time
    //TODO: analysis of the trends in issues categorized by different modules or components of the software
}
