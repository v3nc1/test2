import java.util.EventObject;

public class FormEvent extends EventObject{
	
	private String conv;
	
	public FormEvent(Object source) {
		super(source);
		
	}
	
	public FormEvent(Object source, String conv) {
		super(source);
		
		this.conv=conv;
		
	}

	public String getConv() {
		return conv;
	}

	public void setConv(String conv) {
		this.conv = conv;
	}

}
