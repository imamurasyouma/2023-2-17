import javax.swing.*;
import java.awt.*;
public class Kadai13 extends JFrame{
	public Kadai13(){ //�R���X�g���N�^
		setTitle("�ۑ�13");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container con = getContentPane();
		con.add(new MyPanel());
	}
	public static void main(String[] args){
		//�t���[�����쐬���ĕ\��
		Kadai13 w = new Kadai13();
		w.setBounds(100,100,400,300);//�E�B���h�E�̈ʒu�ƃT�C�Y���w��
		w.setVisible(true); //�E�B���h�E�̉���Ԃ�ݒ�
	}
}
class MyPanel extends JPanel{
	//�O���t�B�b�N�`�揈�����L�q
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