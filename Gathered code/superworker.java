//Author: Zachary Stoebe
//Group: Cardassians


package threesolid;

class SuperWorker implements IWorker, IFeedable
{
    SuperWorker() {
    }

    public void work() {
	System.out.println("I'm working REALLY hard.");
    }

    public void eat() {
	System.out.prinltn("I'm eating now.");
    }
}
