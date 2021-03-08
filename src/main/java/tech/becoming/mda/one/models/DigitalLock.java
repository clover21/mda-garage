package tech.becoming.mda.one.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DigitalLock {
	
	private boolean valid;
	private Integer code = 1234;

	
	public void validate(DigitalKey key) {
		this.valid = key.getCode() == this.code;
	}

	public void sendSignalOpen() {
		// TODO - implement DigitalLock.sendSignalOpen
		throw new UnsupportedOperationException();
	}
}
