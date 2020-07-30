package com.my;

/**
 *  用3个": """来表示文本块    \表示不换行  \s表示空格
 * @author bao
 *
 */
public class TextChunk {

	public static void main(String[] args) {
		String lines = """
		         你好，我叫做\
		         小冯，很高兴\
		         认识你！
		         你好坏~\
		         \s我好喜欢
		         """;
		
		String html = """ 
				<html> 
					<head> 
					
					</head>
					
					<body>
					  haha
					</body>
				
				</html>
				
				""";
		System.out.println(html);
	}
}
