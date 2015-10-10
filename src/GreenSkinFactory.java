
public class GreenSkinFactory implements SkinFactory {

	@Override
	public Button creatButton() {
		// TODO Auto-generated method stub
		return new GreenButton();
	}

	@Override
	public TextView creatTextView() {
		// TODO Auto-generated method stub
		return new GreenTextView();
	}

	@Override
	public ImageView creatImageView() {
		// TODO Auto-generated method stub
		return new GreenImageView();
	}

}
