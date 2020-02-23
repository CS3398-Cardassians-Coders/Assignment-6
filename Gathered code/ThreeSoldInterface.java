// Author: Jeremy Ecker
package threesolid;

// Implements the principle of Interface Segregation and Single Responsibility
interface IWorker extends IWorkable, IFeedable {}

interface IWorkable
{
	public void work();
}

interface IFeedable
{
	public void feed();
}

