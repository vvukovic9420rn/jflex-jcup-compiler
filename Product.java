public class Product extends BinaryExpression {
	
	public Product( Expression left, Expression right )
	{
		super( left, right );
	}
	
	protected String opCode()
	{
		return "Mul";
	}
}
