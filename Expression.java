import java.io.*;

public abstract class Expression extends ASTNode{
	
	protected String result;
	
	protected void genLoad( String reg,
			BufferedWriter out ) throws IOException
	{
		out.write( "\tLoad_Mem\t" + 
			reg + ", " + result );
		out.newLine();
	}
}

