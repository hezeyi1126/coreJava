ǰ��
��Ϊ���׵�java����˳���Ա��ͼƬ�������һֱ�Ǹ�ͷ�۵����顣

���ںܶ���վ�ϣ������ϴ�ͼƬ������ܣ���ͼƬ�������ڵĺܶ��ֻ���˵����������Ķ��Ǹ���ͼƬ���ֱ���Ҳ���൱�ĸߣ���Ȼռ�õĴ洢�ռ�Ҳ�ʹ��ˡ�����Ҳ�Ͳ����ˣ���ÿ���û����ϴ���3M��ͼƬ��ô�죿

������Ȼ����Ӳ�̵Ĵ�ſռ��ǲ�ֵǮ�ģ�1T��2T����������������Ǯ��������⡣

��������ֵ̫Ǯ�ˣ��û����������������ҳ���ظ����죬������ΪͼƬ̫���µ��ǾͲ���Ǯ�ܽ���������ˡ�

��Ϊ�û������绷�����ǲ��ɿ��Ƶġ�������ֻ�ܿ���ѹ��ͼƬ�������Ӷ���֤��վ�򿪵��ٶȡ�

 

ѹ����Ҫ��
ͼƬѹ�������ҵ��뷨���������漸��Ҫ��

1��ѹ���̶ȿɿ��ƣ���ѹ���ɶ�С�Ͷ�С��

2��ѹ��֮��ͼƬ�����ܵĲ�ʧ�档

3��ѹ���ٶ�Ҫ�졣

4������򵥣��������١�

 

ʵ��
Ȼ�������ЩҪ��ȥѰ�ң��ҵ���Thumbnailator��һ��googleʹ�õĿ�Դ�Ĺ����ࡣ

���������������������˵�����е�Ҫ��

ͬʱ����ͼƬ�Ĵ������˱�ķ���������ת�����У���ˮӡ�ȵȡ�

��github����ĵ�ַ�ǣ�https://github.com/coobird/thumbnailator

maven�ĵ�ַ

<dependency>
   <groupId>net.coobird</groupId>
   <artifactId>thumbnailator</artifactId>
   <version>0.4.8</version>
</dependency>
ʹ�������ر�ļ򵥣�һ�д���͸㶨��

Thumbnails.of("ԭͼ�ļ���·��") 
        .scale(1f) 
        .outputQuality(0.5f) 
        .toFile("ѹ�����ļ���·��");

���е�scale�ǿ���ָ��ͼƬ�Ĵ�С��ֵ��0��1֮�䣬1f����ԭͼ��С��0.5����ԭͼ��һ���С������Ĵ�С��ָͼƬ�ĳ���

��outputQuality��ͼƬ��������ֵҲ����0��1��Խ�ӽ���1����Խ�ã�Խ�ӽ���0����Խ�

����ѹ��ͼƬ��˵������Ѿ��㹻�ˡ�

 

�ŵ�
1��������ʹ�á�

2��ѹ��ͼƬЧ���ܺá����£�����100��ԭͼ��50����0.5f

image

3��ͼƬ��������������0.25f��ԭͼ�ĶԱ�

image

image

������ѹ������ģ�������ԭͼ������������

 

��������
�������������ʹ�õļ�����

- Hide code
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

public class ThumbnailatorTest {

    /**
     * 
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        ThumbnailatorTest thumbnailatorTest = new ThumbnailatorTest();
        thumbnailatorTest.test1();
        thumbnailatorTest.test2();
        thumbnailatorTest.test3();
        thumbnailatorTest.test4();
        thumbnailatorTest.test5();
        thumbnailatorTest.test6();
        thumbnailatorTest.test7();
        thumbnailatorTest.test8();
        thumbnailatorTest.test9();
    }

    /**
     * ָ����С��������
     * 
     * @throws IOException
     */
    private void test1() throws IOException {
        /*
         * size(width,height) ��ͼƬ���200С���߱�300С������
         * ��ͼƬ���200С���߱�300�󣬸���С��300��ͼƬ�������� ��ͼƬ���200�󣬸߱�300С������С��200��ͼƬ��������
         * ��ͼƬ���200�󣬸߱�300��ͼƬ��������С����Ϊ200���Ϊ300
         */
        Thumbnails.of("images/test.jpg").size(200, 300).toFile("C:/image_200x300.jpg");
        Thumbnails.of("images/test.jpg").size(2560, 2048).toFile("C:/image_2560x2048.jpg");
    }

    /**
     * ���ձ�����������
     * 
     * @throws IOException
     */
    private void test2() throws IOException {
        /**
         * scale(����)
         */
        Thumbnails.of("images/test.jpg").scale(0.25f).toFile("C:/image_25%.jpg");
        Thumbnails.of("images/test.jpg").scale(1.10f).toFile("C:/image_110%.jpg");
    }

    /**
     * �����ձ�����ָ����С��������
     * 
     * @throws IOException
     */
    private void test3() throws IOException {
        /**
         * keepAspectRatio(false) Ĭ���ǰ��ձ������ŵ�
         */
        Thumbnails.of("images/test.jpg").size(120, 120).keepAspectRatio(false).toFile("C:/image_120x120.jpg");
    }

    /**
     * ��ת
     * 
     * @throws IOException
     */
    private void test4() throws IOException {
        /**
         * rotate(�Ƕ�),������˳ʱ�� ��������ʱ��
         */
        Thumbnails.of("images/test.jpg").size(1280, 1024).rotate(90).toFile("C:/image+90.jpg");
        Thumbnails.of("images/test.jpg").size(1280, 1024).rotate(-90).toFile("C:/iamge-90.jpg");
    }

    /**
     * ˮӡ
     * 
     * @throws IOException
     */
    private void test5() throws IOException {
        /**
         * watermark(λ�ã�ˮӡͼ��͸����)
         */
        Thumbnails.of("images/test.jpg").size(1280, 1024).watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File("images/watermark.png")), 0.5f)
                .outputQuality(0.8f).toFile("C:/image_watermark_bottom_right.jpg");
        Thumbnails.of("images/test.jpg").size(1280, 1024).watermark(Positions.CENTER, ImageIO.read(new File("images/watermark.png")), 0.5f)
                .outputQuality(0.8f).toFile("C:/image_watermark_center.jpg");
    }

    /**
     * �ü�
     * 
     * @throws IOException
     */
    private void test6() throws IOException {
        /**
         * ͼƬ����400*400������
         */
        Thumbnails.of("images/test.jpg").sourceRegion(Positions.CENTER, 400, 400).size(200, 200).keepAspectRatio(false)
                .toFile("C:/image_region_center.jpg");
        /**
         * ͼƬ����400*400������
         */
        Thumbnails.of("images/test.jpg").sourceRegion(Positions.BOTTOM_RIGHT, 400, 400).size(200, 200).keepAspectRatio(false)
                .toFile("C:/image_region_bootom_right.jpg");
        /**
         * ָ������
         */
        Thumbnails.of("images/test.jpg").sourceRegion(600, 500, 400, 400).size(200, 200).keepAspectRatio(false).toFile("C:/image_region_coord.jpg");
    }

    /**
     * ת��ͼ���ʽ
     * 
     * @throws IOException
     */
    private void test7() throws IOException {
        /**
         * outputFormat(ͼ���ʽ)
         */
        Thumbnails.of("images/test.jpg").size(1280, 1024).outputFormat("png").toFile("C:/image_1280x1024.png");
        Thumbnails.of("images/test.jpg").size(1280, 1024).outputFormat("gif").toFile("C:/image_1280x1024.gif");
    }

    /**
     * �����OutputStream
     * 
     * @throws IOException
     */
    private void test8() throws IOException {
        /**
         * toOutputStream(������)
         */
        OutputStream os = new FileOutputStream("C:/image_1280x1024_OutputStream.png");
        Thumbnails.of("images/test.jpg").size(1280, 1024).toOutputStream(os);
    }

    /**
     * �����BufferedImage
     * 
     * @throws IOException
     */
    private void test9() throws IOException {
        /**
         * asBufferedImage() ����BufferedImage
         */
        BufferedImage thumbnail = Thumbnails.of("images/test.jpg").size(1280, 1024).asBufferedImage();
        ImageIO.write(thumbnail, "jpg", new File("C:/image_1280x1024_BufferedImage.jpg"));
    }
}
�����ľ��巽��ϸ�ڿ����Լ�ȥ�鿴�ٷ���API���������ϵ�������Դ��

 

�ο����ͣ�

http://blog.csdn.net/wangpeng047/article/details/17610451

http://blog.csdn.net/qiaqia609/article/details/53171149

http://www.cnblogs.com/miskis/p/5500822.html