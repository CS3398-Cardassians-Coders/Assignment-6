// Author: James Michael

package threesolid;

// The manager class sets both worker types and gives them their 
// appropriate sub functions.
class Manager {
	IWorker worker;
	IWorker robot;

	public void Manager() {

	}
	public void setWorkerW(IWorker w) {
		worker=w;
	}

	public void manageW() {
		worker.work();
	}
	
	public void setWorkerR(IWorker r) {
		robot=r;
	}
	
	public void manageR() {
		robot.work();
	}
}
