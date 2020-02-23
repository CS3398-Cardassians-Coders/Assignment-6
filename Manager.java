// Author: James Michael

package threesolid;

// The manager class sets both worker types and gives them their 
// appropriate sub functions.
class Manager {
	IWorker worker;

	public void Manager() {

	}
	public void setWorker(IWorker w) {
		worker=w;
	}

	public void manage() {
		worker.work();
	}
}