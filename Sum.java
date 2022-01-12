
public class Sum extends BinaryExpression {
	
	public Sum( Expression left, Expression right )
	{
		super( left, right );
	}
	
	protected String opCode()
	{
		return "Add";
	}
}
