import javax.swing.*;
import java.awt.*;
public class Kadai13 extends JFrame{
	public Kadai13(){ //コンストラクタ
		setTitle("課題13");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container con = getContentPane();
		con.add(new MyPanel());
	}
	public static void main(String[] args){
		//フレームを作成して表示
		Kadai13 w = new Kadai13();
		w.setBounds(100,100,400,300);//ウィンドウの位置とサイズを指定
		w.setVisible(true); //ウィンドウの可視状態を設定
	}
}
class MyPanel extends JPanel{
	//グラフィック描画処理を記述
	public void paintComponent(Graphics g){
		for(int x1,y1,i = 0; i<16 ; i++){
			x1 = (int)(200 + 100*Math.cos((i*360/16)*Math.PI/180));
			y1 = (int)(150 - 100*Math.sin((i*360/16)*Math.PI/180));
			for(int x2,y2,k = 0; k<16; k++){
				x2 = (int)(200 + 100*Math.cos((k*360/16)*Math.PI/180));
				y2 = (int)(150 - 100*Math.sin((k*360/16)*Math.PI/180));
				g.drawLine(x1,y1,x2,y2);
			}
		}
	}
}