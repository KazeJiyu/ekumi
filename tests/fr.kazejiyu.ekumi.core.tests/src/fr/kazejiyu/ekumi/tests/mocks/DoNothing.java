package fr.kazejiyu.ekumi.tests.mocks;

import fr.kazejiyu.ekumi.core.ekumi.Context;
import fr.kazejiyu.ekumi.core.ekumi.impl.ActivityImpl;

public class DoNothing extends ActivityImpl {
	
	@Override
	public void run(Context context) {
		// do nothing
	}

}
