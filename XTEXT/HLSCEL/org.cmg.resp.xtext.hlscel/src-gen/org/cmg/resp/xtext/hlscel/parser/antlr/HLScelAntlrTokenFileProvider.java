/*
* generated by Xtext
*/
package org.cmg.resp.xtext.hlscel.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class HLScelAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/cmg/resp/xtext/hlscel/parser/antlr/internal/InternalHLScel.tokens");
	}
}
