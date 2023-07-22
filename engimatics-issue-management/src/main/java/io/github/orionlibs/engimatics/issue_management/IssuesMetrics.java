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
public class IssuesMetrics
{
    private int numberOfAttachments;
    private int numberOfUniqueWatchers;
    private int numberOfIssues;
    private int numberOfOpenIssues;
    private int numberOfClosedIssues;
    private int numberOfIssuesInBacklog;
    private int numberOfComments;
    private int numberOfModifications;
    private int numberOfStoryPoints;
    private int numberOfReopenedIssues;
    private int numberOfAssignees;
    private Map<IssuePriority, Integer> priorityToVolumeMapper;
    private Map<IssueType, Integer> typeToVolumeMapper;
}
