package collectionsqueue.collectionsdeque;

import collectionsqueue.job.Job;
import collectionsqueue.job.NoJobException;
import org.junit.jupiter.api.Test;
import java.util.ArrayDeque;
import java.util.Deque;
import static org.junit.jupiter.api.Assertions.*;

public class JobQueueTest {

    @Test
    public void emptyQueueShouldThrowException() throws NoJobException {
        Exception ex = assertThrows(NoJobException.class, () -> {
            new JobQueue().dispatchUrgentJob(new ArrayDeque<>());
        });
        assertEquals("No job available, get a rest!", ex.getMessage());
    }

    @Test
    public void urgentJobShouldComeFromHead() throws NoJobException {
        Job urgent = new Job(4, "urgent");
        Job notUrgent = new Job(5, "not urgent");
        JobQueue jobQueue = new JobQueue();
        Deque<Job> jobs = jobQueue.addJobByUrgency(urgent, notUrgent);
        Job firstJob = jobQueue.dispatchUrgentJob(jobs);
        assertEquals("urgent", firstJob.getJobDescription());
        assertTrue(firstJob.isUrgent());
    }

    @Test
    public void notUrgentJobShouldComeFromTail() throws NoJobException {
        Job urgent = new Job(4, "urgent");
        Job notUrgent = new Job(5, "not urgent");
        JobQueue jobQueue = new JobQueue();
        Deque<Job> jobs = jobQueue.addJobByUrgency(urgent, notUrgent);
        Job lastJob = jobQueue.dispatchNotUrgentJob(jobs);
        assertEquals("not urgent", lastJob.getJobDescription());
        assertFalse(lastJob.isUrgent());
    }
}
