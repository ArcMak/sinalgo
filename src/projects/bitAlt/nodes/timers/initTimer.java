package projects.bitAlt.nodes.timers;

import projects.bitAlt.nodes.nodeImplementations.tokenNode;
import sinalgo.nodes.timers.Timer;

public class initTimer extends Timer {

	public void fire() {
		tokenNode n= (tokenNode) this.node;
		n.start();
	}
	

}
