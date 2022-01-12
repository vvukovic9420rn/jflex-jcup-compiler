import java.io.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	  try
	  {
		FileReader file = new FileReader( args[0] );
		MPLexer scanner = new MPLexer( file );
		MPParser parser = new MPParser( scanner );
		ASTNode ast = (ASTNode) parser.parse().value;
		String outFileName = args[0].substring( 
			0, args[0].indexOf( ".")+1 );
		outFileName += "ic";
		BufferedWriter writer = 
			new BufferedWriter( 
			    new FileWriter( outFileName ));
		ast.translate( writer );
		writer.close();
	  }
	  catch( Exception e )
	  {
		 System.out.println(e);
	  }
	}

}
