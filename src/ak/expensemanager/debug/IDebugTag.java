package ak.expensemanager.debug;


public interface IDebugTag {

	final String ankitTag ="ankit ";
	final String CONTACT_ADDED = "Contact added successfully";
	final String CONTACT_EXISTS = "Contact already exists";
	final String CONTACT_REMOVED = "Contact removed successfully";
	
	final String CATEGORY_ADDED = "CATEGORY added successfully";
	final String CATEGORY_EXISTS = "CATEGORY already exists";
	final String CATEGORY_REMOVED = "CATEGORY removed successfully";
	
	final String FILL_CONTACT ="Type contact number in the text box";
	final String FILL_CATEGORY ="Type category name in the text box";
	
	final String MESSAGE  = "message";
	final int LIMIT = 1050;
	final String DEFINED_LIMIT = "limit";
	final String YEARLY_VIEW = "Yearly View";
	final String MONTHLY_VIEW = "Monthly View";
	final String DAILY_VIEW = "Daily View";
	final String DEFAULT_CATEGORY = "Fuel";
	final String BANK = "bank";
	
	final String [] DEFAULT_BANKS = {"ICICI","HDFC","AXIS","SBI","IDBI"};
	
	
	
	
	 enum Months{
			JANUARY,
			FEBUARY,
			MARCH,
			APRIL,
			MAY,
			JUNE,
			JULY,
			AUGUST,
			SEPTEMBER,
			OCTOBER,
			NOVEMBER,
			DECEMBER
		}
}
