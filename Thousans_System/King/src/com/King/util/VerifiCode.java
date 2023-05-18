package com.King.util;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
public class VerifiCode extends JPanel{
	/**
	 * ��ȡ��֤��
	 */
	private static final long serialVersionUID = 1L;
	private int weight = 100; // ��֤��ͼƬ�ĳ��Ϳ�
	private int height = 30;
	private String text; // ����������֤����ı�����
	private Random r = new Random(); // ��ȡ���������
	private String[] fontNames = { "����", "���Ŀ���", "����", "΢���ź�", "����_GB2312" }; // ��������
	private String codes = "23456789abcdefghjkmnopqrstuvwxyzABCDEFGHJKMNPQRSTUVWXYZ"; // ��֤������

	private Color randomColor() // ��ȡ�������ɫ
	{
//		 int r=this.r.nextInt(150); //����Ϊʲô��150����Ϊ��r��g��b��Ϊ255ʱ����Ϊ��ɫ��Ϊ�˺ñ��ϣ���Ҫ��ɫ��һ�㡣
//		 int g=this.r.nextInt(150);
//		 int b=this.r.nextInt(150);
		return new Color(255, 255, 255); // ����һ�������ɫ
	}

	private Font randomFont() // ��ȡ�������
	{
		int index = r.nextInt(fontNames.length); // ��ȡ���������
		String fontName = fontNames[index];
		int style = r.nextInt(4); // �����ȡ�������ʽ��0������ʽ��1�ǼӴ֣�2��б�壬3�ǼӴּ�б��
		int size = r.nextInt(5) + 24; // �����ȡ����Ĵ�С
		return new Font(fontName, style, size); // ����һ�����������
	}

	private char randomChar() // ��ȡ����ַ�
	{
		int index = r.nextInt(codes.length());
		return codes.charAt(index);
	}

	private void drawLine(BufferedImage image) // �������ߣ���֤�������������ֹ���������ͼƬ
	{
		int num = 3; // ��������ߵ�����
		Graphics2D g = (Graphics2D) image.getGraphics();
		for (int i = 0; i < num; i++) {
			int x1 = r.nextInt(weight);
			int y1 = r.nextInt(height);
			int x2 = r.nextInt(weight);
			int y2 = r.nextInt(height);
			g.setColor(randomColor());
			g.drawLine(x1, y1, x2, y2);
		}
	}

	private BufferedImage createImage() // ����ͼƬ�ķ���
	{
		BufferedImage image = new BufferedImage(weight, height, BufferedImage.TYPE_INT_RGB); // ����ͼƬ������
		Graphics2D g = (Graphics2D) image.getGraphics(); // ��ȡ����
		g.setColor(new Color(253, 185, 33)); // ���ñ���ɫ,RGB��ɫֵ
		g.fillRect(0, 0, weight, height);
		return image; // ����һ��ͼƬ
	}

	public BufferedImage getImage() // ��ȡ��֤��ͼƬ�ķ���
	{
		BufferedImage image = createImage();
		Graphics2D g = (Graphics2D) image.getGraphics(); // ��ȡ����
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 4; i++) // ���ĸ��ַ�����
		{
			String s = randomChar() + ""; // ��������ַ�����Ϊֻ�л��ַ����ķ�����û�л��ַ��ķ�����������Ҫ���ַ�����ַ����ٻ�
			sb.append(s); // ��ӵ�StringBuilder����
			float x = i * 1.0F * weight / 4; // �����ַ���x����
			g.setFont(randomFont()); // �������壬���
			g.setColor(randomColor()); // ������ɫ�����
			g.drawString(s, x, height - 5);
		}
		this.text = sb.toString();
		drawLine(image);
		return image;
	}

	public static void output(BufferedImage image, OutputStream out) throws IOException // ����֤��ͼƬд���ķ���
	{
		ImageIO.write(image, "JPEG", out);
	}

	public String getText() // ��ȡ��֤���ı��ķ���
	{
		return text;
	}
	 public static void main(String[] args) throws IOException {
		VerifiCode a=new VerifiCode();
		BufferedImage img=a.getImage();
	    File out=new File("src/sava.jpg");
	    ImageIO.write(img, "jpg",out);
		System.out.println(a.getText());
	}
}