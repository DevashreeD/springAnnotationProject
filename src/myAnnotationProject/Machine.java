package myAnnotationProject;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Machine {
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
 public String plotterName;
 
 @Min(value=0, message="must be greater than or equal to zero")
	@Max(value=10, message="must be less than or equal to 10")
 public String cartridgeNo;
 
 public String Rolls;
 
 public String machineId;

public String getPlotterName() {
	return plotterName;
}

public void setPlotterName(String plotterName) {
	this.plotterName = plotterName;
}

public String getMachineId() {
	return machineId;
}

public void setMachineId(String machineId) {
	this.machineId = machineId;
}

public String getCartridgeNo() {
	return cartridgeNo;
}

public void setCartridgeNo(String cartridgeNo) {
	this.cartridgeNo = cartridgeNo;
}

public String getRolls() {
	return Rolls;
}

public void setRolls(String rolls) {
	Rolls = rolls;
}
 
 }
 

