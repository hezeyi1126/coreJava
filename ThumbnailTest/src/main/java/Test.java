import java.io.IOException;

import net.coobird.thumbnailator.Thumbnails;

/**
 * @author 贺保铭
 *
 * 2018年05月07日
 */
public class Test {
	
	public static void main(String[] args) throws Exception {
		Thumbnails.of("C:\\Users\\Administrator\\Pictures\\111.jpg")
				  .scale(1f)
				  .outputQuality(0.2f)
				  .toFile("C:\\Users\\Administrator\\Pictures\\222.jpg"); 
	}

}
