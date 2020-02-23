//Author: Zachary Stoebe
//Group: Cardassians

package threesolid;

// SuperWorker uses the Open Close Principle to extend Iworkable and Feedable
// interfaces and the Single Responsibilty Principle.
class SuperWorker implements IWorkable, IFeedable
{
    SuperWorker() {
    }

    public void work() {
	System.out.println("I'm working REALLY hard.");
    }

    public void feed() {
	System.out.println("I'm eating now.");
    }
}
