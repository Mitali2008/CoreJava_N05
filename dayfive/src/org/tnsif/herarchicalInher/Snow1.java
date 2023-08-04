package org.tnsif.herarchicalInher;

public class Snow1 {

	private int version;
	// getters And Setters
		public int getVersion() {
			return version;
		}

		public void setVersion(int version) {
			this.version = version;
		}
	// To String
		@Override
		public String toString() {
			return "SnowCone [version=" + version + ", toString()=" + super.toString() + "]";
		}

		
	// Parameterized Constructor
		public Snow1(String brandname, int modelno,int version) {
			super();
			this.version=version;
		}

		public void Snow(String brandname, int modelno, int version2) {
			// TODO Auto-generated constructor stub
		}
		
		
		
		
	}
