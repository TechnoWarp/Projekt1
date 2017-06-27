
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;

public class Time {

	LocalDateTime ur = LocalDateTime.now();
	TemporalAdjuster adjuster;
	LocalDateTime eventStamp = LocalDateTime.now().with(adjuster);

	public Time(LocalDateTime ur) {
		super();
		this.ur = ur;
	}

	public LocalDateTime getUr() {
		return ur;
	}
	
}
