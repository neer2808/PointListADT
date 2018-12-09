public class PointListADT
{
	/*
	* Default Constructor Method for the class.
	* */
	PointListADT()
	{
		//	pre-condition	:	none
		//	post-condition	:	This default constructor will call the 'setup()'
		//	method(which creates an empty list). It allocates enough memory for
		//	a list containing 'DEF_	MAX_LIST_SIZE' points.(it is a constant value)
	}
	
	/*
	* Parameterized Constructor Method for the class.
	* */
	PointListADT(int maxNumber)
	{
		//	pre-condition	:	maxNumber > 0
		//	post-condition	:	This constructor creates an empty list. It allocates
		//	enough memory for a list containing  'maxNumber' points.
	}
	
}
