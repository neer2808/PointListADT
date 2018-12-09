import java.awt.*;

public class PointListADT
{
	/*
	* Default Constructor Method for the class.
	* */
	PointListADT()
	{
		//	pre-condition	:	NONE.
		//	post-condition	:	This default constructor will call the 'setup()'
		//	method(which creates an empty list). It allocates enough memory for
		//	a list containing 'DEF_	MAX_LIST_SIZE' points.(it is a constant value)
	}
	
	/*
	* Parameterized Constructor Method for the class.
	* */
	PointListADT(int maxNumber)
	{
		//	pre-condition	:	maxNumber > 0.
		//	post-condition	:	This constructor creates an empty list. It allocates
		//	enough memory for a list containing  'maxNumber' points.
	}
	
	
	/*
	* Helper Method for the Constructor Methods.
	* */
	private void setup(int size)
	{
		//	pre-condition	:	size > 0. Method is declared private because only
		//	the constructors will be allowed to call this method.
		//	post-condition	:	This method will create an empty point list of a
		//	specific size based on the value of size received from the constructor.
	}
	
	
	/*
	* Member Method for the Class. This method appends data elements to the structure.
	* */
	void append(Point point)
	{
		//	pre-condition	:	This method will append an element only if the list
		//	is not full.
		//	post-condition	:	Adds an element 'newPoint' to the end of the list.
		//	If the list is empty, then adds 'newPoint' as the first (and only) point
		//	in the list. Then, it moves the cursor to newPoint.
	}
	
	/*
	* Member Method for the Class. This method will remove all the points in a list.
	* */
	void clear()
	{
		//	pre-condition	:	NONE.
		//	post-condition	:	This method removes all the points in a list.
	}
	
	
	/*
	* Member method for the Clas.. This method will check whether the list is empty.
	* */
	boolean isEmpty()
	{
		//	pre-condition	:	NONE.
		//	post-condition	:	This method returns TRUE if the list is empty, otherwise
		//	the method will return false.
		return false;
	}
	
}
