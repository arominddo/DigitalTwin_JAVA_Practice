package ch07;

import java.awt.*;
import java.awt.event.*;

class  InnerEx7{
	public static void main(String[] args) {
		Button b = new Button("Start");
		
//		ActionListener al = new ActionListener();
		
		b.addActionListener(new EventHandler());
		b.addActionListener(new ActionListener() {   //조상 클래스 또는 인터페이스 이름이다.
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!!!");
				
			}
		});
	}
}

class EventHandler implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occurred!!!");
	}
}
