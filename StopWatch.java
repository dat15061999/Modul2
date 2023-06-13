import java.sql.Date;
import java.sql.Time;
import java.time.Instant;
import java.time.Duration;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
        this.endTime = System.currentTimeMillis();
    }

    public Instant getStartTime() {  return Instant.ofEpochMilli(startTime);};
    public Instant getEndTime() {  return Instant.ofEpochMilli(endTime);};


    public void start() {
        this.startTime  = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public String toString() {
        return "Thời gian đã trôi qua: " + getElapsedTime() + "ms";
    }
}
