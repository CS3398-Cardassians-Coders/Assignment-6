// Author: Jeremy Ecker
package threesolid;

// Implements the principle of Interface Segregation

interface Iworker extends Iworkable, Ifeedable {}

interface Iworkable
{
	public void work();
}

interface Ifeedable
{
	public void feed();
}

