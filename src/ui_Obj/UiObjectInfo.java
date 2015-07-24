package ui_Obj;

public class UiObjectInfo {
	
	//  locators for testcase # 1 
	 
	public static String Uiobj_hotel_main_link = "FLIGHT | HOTEL | CAR";
	public static String Uiobj_hotel_Tab_link = "Hotel";
	public static String Uiobj_hotel_Dst_id= "marketSearchKeyword";
	public static String Uiobj_hotel_DateField_id="outboundDate";
	//public static String Uiobj_hotel_Sel_InDate_link="30";
	public static String Uiobj_hotel_DateOut_id="returnDate";
	//public static String Uiobj_hotel_Sel_OutDate_link="3";
	public static String Uiobj_hotel_Sel_Rooms_id="rooms";
	public static String Uiobj_hotel_Sel_Adult_xpath ="//select[@id='adults']";
	public static String Uiobj_hotel_find_id="submitButton";
	// hotels results 
	public static String Uiobj_hotel_DestName_id="outbound_results";
	//public static String Uiobj_hotel_Rating_xpath="//*[@id='hotelRating']/span[1]";
	public static String Uiobj_hotel_Rating_id="hotelRating";
	//id=hotelRating
	

//  locators for testcase # 2
	
// repeat all the steps till find  	
	public static String Uiobj_hotel_comp_xpath = "//*[@id='hotelList']/li[1]/div/div[1]/div[2]/input";
	public static String Uiobj_hotel_comp2_xpath = "//*[@id='hotelList']/li[5]/div/div[1]/div[2]/input";
	// compare
	public static String Uiobj_hotel_compare_xpath = "//*[@id='hotel_list_wrapper']/div[1]/div[1]/input";
	public static String Uiobj_hotel_Tick_class="compare_modal_amenities_checked";
	
	//locators for testcase #3
	//public static String Uiobj_hotel_main_link = "FLIGHT | HOTEL | CAR";
	public static String Uiobj_flight_Tab_link = "Hotel";
	public static String Uiobj_flight_rr_id="roundTrip";
	public static String Uiobj_flight_destto_id="originAirport_displayed";
	public static String Uiobj_flight_destfro_id="originAirport_displayed";
	public static String Uiobj_flight_indate_id="outboundDate";
	public static String Uiobj_flight_outdate_id="returnDate";
	public static String Uiobj_flight_adult_id="adultPassengerCount";
	public static String Uiobj_flight_senior_id="seniorPassengerCount";
	public static String Uiobj_flight_submit_id="submitButton";
	public static String Uiobj_flight_sel_to_xpath="//div[@id='Out1AContainer']//label[@class='product_price']";
	public static String Uiobj_flight_out_radio_id="Out1A";
	public static String Uiobj_flight_sel_fro_xpath="//div[@id='In1AContainer']//label[@class='product_price']";
	public static String Uiobj_flight_in_radio_id="In1A";
	public static String Uiobj_flight_contin_id="priceItinerarySubmit";
	public static String Uiobj_flight_contin2_name="optionsItinerarySubmit";
	
	

}
