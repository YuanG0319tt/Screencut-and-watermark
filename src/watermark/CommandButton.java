package watermark;

import javax.swing.JButton;
/**
 * ʵ��������ӿڵİ�ť
 * @author LiMengyuan
 *
 */
public class CommandButton extends JButton {

	private static final long serialVersionUID = 1L;
	/**
	 * �и���ť���͵�ö��ButtonStyle
	 */
	protected enum ButtonStyle{
		selectImage("ѡ��ͼƬ"),
		selectSavepath("ѡ����·��"),
		preview("Ԥ��Ч��"),
		batching("�������"),
		moreSetting("��������"),
		drirect("�������");
		private String name;
		ButtonStyle(String name){
			this.name = name;
		}
		public String getButtonName(){
			return name;
		}
	}
	/**
	 * @param style �и���ť���͵�ö��ButtonStyle
	 */
	public CommandButton(ButtonStyle style){
		super(style.getButtonName());
		addActionListener(new ButtonAction(style));
	}
}
