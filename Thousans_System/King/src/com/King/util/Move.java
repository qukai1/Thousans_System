package com.King.util;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
/**
 * 鼠标的移动
 * @author Administrator
 *
 */
public class Move {
	Boolean startDrag;
	Point p;
	public Move(JFrame j) {
		// 移动当前窗体
		j.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				startDrag = true;
				p = e.getPoint();
			}

			public void mouseReleased(MouseEvent e) {
				startDrag = false;
			}
		});
		j.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				Point p1 = e.getPoint();
				Point p2 = j.getLocation(null);
				p2.x += p1.x - p.x;
				p2.y += p1.y - p.y;
				j.setLocation(p2);
			}
		});
	}
}
