package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRhymer;

	public interface Rhymersfactory { //TODO: zmienić nazwę klasy
	
		public defaultCountingOutRhymer GetStandardRhymer();
		
		public defaultCountingOutRhymer GetFalseRhymer();
		
		public defaultCountingOutRhymer GetFIFORhymer();
		
		public defaultCountingOutRhymer GetHanoiRhymer();
		
	}
