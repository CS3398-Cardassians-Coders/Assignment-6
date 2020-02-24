//Author: Nicholas Sevilla
package threesolid;

//This class was put in a separate folder so it can have a single
//responsibility and ended it from the interfaces work and feed.

class Worker implements IWorkable, IFeedable{
	public void work() {
		// ....working
	}

	public void feed() {
		//.... eating in launch break
	}
}
