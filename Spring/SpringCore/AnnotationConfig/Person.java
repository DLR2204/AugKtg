package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("per")
public class Person {
	
		private int pid;
		
		private String pname;
		
		private int pincode;
		
		@Autowired
		private Address padd;
		
		public Person() {
			// TODO Auto-generated constructor stub
		}

		public int getPid() {
			return pid;
		}

		public void setPid(int pid) {
			this.pid = pid;
		}

		public String getPname() {
			return pname;
		}

		public void setPname(String pname) {
			this.pname = pname;
		}

		public int getPincode() {
			return pincode;
		}

		public void setPincode(int pincode) {
			this.pincode = pincode;
		}

		public Address getPadd() {
			return padd;
		}

		public void setPadd(Address padd) {
			this.padd = padd;
		}

		public Person(int pid, String pname, int pincode, Address padd) {
			super();
			this.pid = pid;
			this.pname = pname;
			this.pincode = pincode;
			this.padd = padd;
		}

		@Override
		public String toString() {
			return "Person [pid=" + pid + ", pname=" + pname + ", pincode=" + pincode + ", padd=" + padd + "]";
		}
		
		
	

}
