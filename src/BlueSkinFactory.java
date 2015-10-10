
public class BlueSkinFactory implements SkinFactory {

	@Override
	public Button creatButton() {
		// TODO Auto-generated method stub
		return new BlueButton();
	}

	@Override
	public TextView creatTextView() {
		// TODO Auto-generated method stub
		return new BlueTextView();
	}

	@Override
	public ImageView creatImageView() {
		// TODO Auto-generated method stub
		return new BlueImageView();
	}

}
