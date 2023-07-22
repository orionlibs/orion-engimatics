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
public class Issue
{
    private String id;
    private String key;
    private String url;
    private String status;
    private boolean isReopened;
    private String projectID;
    private String projectName;
    private IssuePriority priority;
    private IssueType type;
    private boolean isInBacklog;
    private int numberOfAttachments;
    private int numberOfWatchers;
    private int numberOfSubtasks;
    private int numberOfOpenSubtasks;
    private int numberOfClosedSubtasks;
    private int numberOfComments;
    private int numberOfLinkedIssues;
    private int numberOfModifications;
    private int numberOfStoryPoints;
    private int numberOfAssignees;
    private float impactScore;
}
