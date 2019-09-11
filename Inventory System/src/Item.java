/**
 * 
 */

/**
 * @author Busgeeth Pravesh
 *
 */
public class Item {
	
	//defining attributes
	public String itemID;
	public String name;
	public String description;
	private String category;
	private String supplierName;
	private int supplierContacts;
	public double price;
	public double availableQty;
	static int totalItems =0;
	
	/**
	 * default constructor
	 */
	public Item() {
		super();
		}

	
	/**
	 * overloaded constructors
	 * @param itemID
	 * @param name
	 * @param description
	 * @param category
	 * @param supplierName
	 * @param supplierContacts
	 * @param price
	 * @param availableQty
	 */
	public Item(String itemID, String name, String description, String category, String supplierName, int supplierContacts,
			double price, double availableQty) {
		super();
		this.itemID = itemID;
		this.name = name;
		this.description = description;
		this.category = category;
		this.supplierName = supplierName;
		this.supplierContacts = supplierContacts;
		this.price = price;
		this.availableQty = availableQty;
		totalItems++;
	
	}


	/**
	 * @return the itemID
	 */
	public String getItemID() {
		return itemID;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}


	/**
	 * @return the supplierName
	 */
	public String getSupplierName() {
		return supplierName;
	}


	/**
	 * @return the supplierContacts
	 */
	public int getSupplierContacts() {
		return supplierContacts;
	}


	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}


	/**
	 * @return the availableQty
	 */
	public double getAvailableQty() {
		return availableQty;
	}


	/**
	 * @param itemID the itemID to set
	 */
	public void setItemID(String itemID) {
		this.itemID = itemID;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}


	/**
	 * @param supplierName the supplierName to set
	 */
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}


	/**
	 * @param supplierContacts the supplierContacts to set
	 */
	public void setSupplierContacts(int supplierContacts) {
		this.supplierContacts = supplierContacts;
	}


	/**
	 * @param price the price to set
	 * Set price of an item and defaults it to zero if negative.
	 */
	public void setPrice(double price) {
		if (price > 0.00) {
		this.price = price;
		}
		else { price = 0.00; }
	}

	/**
	 * @param availableQty the availableQty to set
	 * the available quantity greater than 0
	 * if negative, defaults to zero.
	 */
	public void setAvailableQty(double availableQty) {
		if (availableQty > 0) {
		this.availableQty = availableQty;
		}
			else { availableQty = 0; }
		}
	
	/**
	 * 
	 * @param p
	 * @return
	 */
	public boolean equals(Item i) {
		if (this.itemID.equalsIgnoreCase(i.itemID)){
			return true;
			}
			else
				return false;

	}

	
	@Override
	public String toString() {
		return "[itemID=" + itemID + ", name=" + name + ", description=" + description + ", category=" + category
				+ ", supplierName=" + supplierName + ", supplierContacts=" + supplierContacts + ", price=" + price
				+ ", availableQty=" + availableQty + "]";
	}


	public String findItemByCat() {
		 return("ItemID: " + this.itemID + "  " + "Name:" + this.name+ "  " + "Description:" + this.description + "  " +
				 "Supplier Name:" + this.supplierName + "  "+ "Supplier Contacts:" + this.supplierContacts+ "  " + "Price:" + this.price+ "  " +
				 "Available Quantity:" +this.availableQty);
		}
	
	public static void totalItems1() {
		
		System.out.println(totalItems);
		}
		public static int totalItems() {
			return totalItems;
		}
}
