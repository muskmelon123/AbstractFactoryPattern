
public class Client {
	public static void main(String arg[]){
		SkinFactory factory = new GreenSkinFactory();
		Button button;
		ImageView imageview;
		TextView textview;
		button = factory.creatButton();
		imageview = factory.creatImageView();
		textview = factory.creatTextView();
		button.display();
		imageview.display();
		textview.display();
	}
}
/*ע�⣺���󹤳�ģʽ����������������һ���ǲ�Ʒ�壬һ���ǲ�Ʒ�ȼ���Blue��Green�����ؼ�����һ����Ʒ�塣BlueButton��GreenButton����һ����Ʒ�ȼ���
���󹤳�ģʽ��Ӳ�Ʒ�����ӣ���������һ����Ʒ�ȼ��ͱȽ��鷳������ҪΥ������ģʽ�����ԣ���Ʒ�ȼ��̶�����Ҫ��Ӳ�Ʒ��ľͿ����ó����Ʒģʽ��*/