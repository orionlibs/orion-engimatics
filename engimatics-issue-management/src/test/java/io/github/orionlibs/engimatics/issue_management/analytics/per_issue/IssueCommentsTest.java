package io.github.orionlibs.engimatics.issue_management.analytics.per_issue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@TestInstance(Lifecycle.PER_METHOD)
@Execution(ExecutionMode.CONCURRENT)
public class IssueCommentsTest
{
    @Test
    void test_getAverageNumberOfComments()
    {
        int[] comments = new int[] {2, 6, 4, 9};
        assertEquals(5.25f, IssueComments.getAverageNumberOfComments(comments));
    }
}
