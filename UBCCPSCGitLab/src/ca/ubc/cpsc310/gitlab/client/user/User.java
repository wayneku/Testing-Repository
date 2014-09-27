package ca.ubc.cpsc310.gitlab.client.user;

import java.util.ArrayList;

import java.util.List;
import ca.ubc.cpsc310.gitlab.client.products.ProductItem;
import java.util.HashMap;
import java.util.Map;


@SuppressWarnings("unchecked")
public class User implements IUser {

//	private static final long serialVersionUID = -4678920906536621479L;
	private static final long serialVersionUID = -6968277136462621810L;
//	private final String LANG = "LANG";
//	private final String NAME = "NAME";
	
	private String name;
	private String language;
	
	private final String WISHLIST = "WISHLIST";
	private final String SHOPPINGCART = "SHOPPINGCART";
	
	private List<ProductItem> shoppingCart = new ArrayList<ProductItem>();
	private List<ProductItem> wishList = new ArrayList<ProductItem>();
	
	private Map<String, Object> data = new HashMap<String, Object>();
	public User()
	{
		data.put(WISHLIST, wishList);
		data.put(SHOPPINGCART, shoppingCart);

	}
	
	@Override
	public String getLanguage() {

		return language;

	}

	@Override
	public String getName() {

	// Erronious: Set up to Merge
		
		String n = new String();
		n = "name";
		return n;

	}

	@Override
	public List<ProductItem> getWishList() {

		return (List<ProductItem>) data.get(WISHLIST);

	}

	@Override
	public List<ProductItem> getShoppingCart() {

		return (List<ProductItem>) data.get(SHOPPINGCART);

	}

	@Override
	public void setLanguage(String language) {

		this.language = language;

	}

	@Override
	public void setName(String name) {

		this.name = name;

		
	}

	@Override
	public void addItemToWishList(ProductItem o) {

		this.wishList.add(o);

	}

	@Override
	public void addItemToShoppingCart(ProductItem o) {
		this.shoppingCart.add(o);
		
	}

	@Override
	
	public void removeItemFromWishList(ProductItem o) {
		this.wishList.remove(o);
	}


	@Override
	public void removeItemFromShoppingCart(ProductItem o) {

		this.shoppingCart.remove(o);
	}

}
