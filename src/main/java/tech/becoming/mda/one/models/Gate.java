package tech.becoming.mda.one.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Gate {

	private Motor motor;
	private DigitalLock lock;

	public void open() {
		// TODO - implement Gate.open
		throw new UnsupportedOperationException();
	}
	
}
