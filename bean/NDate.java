package it.by.Savkin.bean;

public class NDate {
	int hour;
	int min;
	String dayOfWeek;
	
	public NDate() {}
	
	public NDate(int hour, int min, String Day) {
		
		
		this.hour = hour;
		this.min = min;
		
		
		
		
		if ( (hour > 23) || (hour < 0) ) {
			this.hour = 0;
		}
		
		if ((min > 59)||(min < 0)) {
			this.min = 0;
		}
		
		
		int i = 0;
		String [] Week = new String[] {"Su","Sa","Tu","We","Th","Fr","Mo"};
		while (i < 6) {
			if (dayOfWeek.equals(Week[i])) {
				this.dayOfWeek = Week[i];
				break;
				}
			else
			
				this.dayOfWeek = "Mo";
			i++;
			}
				
			}
	

	public int getHour() {
		
		if ( (hour > 23) || (hour < 0) ) {
			this.hour = 0;
		}
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMin() {
		if ((min > 59)||(min < 0)) {
			this.min = 0;
		}
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public String getDayOfWeek() {
		
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		int i = 0;
		String [] Week = new String[] {"Su","Sa","Tu","We","Th","Fr","Mo"};
		while (i < 6) {
			if (dayOfWeek.equals(Week[i])) {
				this.dayOfWeek = Week[i];
				break;
				}
			else
				
				this.dayOfWeek = "Mo";
			i++;
			}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dayOfWeek == null) ? 0 : dayOfWeek.hashCode());
		result = prime * result + hour;
		result = prime * result + min;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NDate other = (NDate) obj;
		if (dayOfWeek == null) {
			if (other.dayOfWeek != null)
				return false;
		} else if (!dayOfWeek.equals(other.dayOfWeek))
			return false;
		if (hour != other.hour)
			return false;
		if (min != other.min)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NDate [hour=" + hour + ", min=" + min + ", dayOfWeek=" + dayOfWeek + "]";
	};
	

}
