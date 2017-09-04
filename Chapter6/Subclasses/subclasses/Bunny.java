package subclasses;

class CanNotHopException extends Exception{}

/*
class Hopper{
	public void hop(){}
}

class Bunny extends Hopper{
	public void hop() throws CanNotHopException{} // DOES NOT COMPILE
}


class Hopper{
	public void hop() throws CanNotHopException{}
}

class Bunny extends Hopper{
	public void hop(){}
}


class Hopper{
	public void hop() throws Exception{}
}

class Bunny extends Hopper{
	public void hop() throws CanNotHopException{}
}
*/

class Hopper{
	public void hop(){}
}

class Bunny extends Hopper{
	public void hop() throws IllegalStateException{}
}