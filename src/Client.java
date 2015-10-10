
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
/*注意：抽象工厂模式里面有两个条件，一个是产品族，一个是产品等级。Blue和Green三个控件就是一个产品族。BlueButton和GreenButton就是一个产品等级。
抽象工厂模式添加产品族好添加，但是增加一个产品等级就比较麻烦，后者要违反开闭模式。所以，产品等级固定，需要添加产品族的就可以用抽象产品模式。*/