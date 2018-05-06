package com.lesuorac.bsa.tradeshow.models;

import com.lesuorac.bsa.tradeshow.csv.CsvColumn;

public class BsaRecord {
	
	@CsvColumn(name = "Event Name")
	String eventName;

	@CsvColumn(name = "Start Date")
	String startDate;

	@CsvColumn(name = "End Date")
	String endDate;

	@CsvColumn(name = "Registration Number")	
	String registrationNumber;

	@CsvColumn(name = "Registered By First Name")
	String registeredByFirstName;

	@CsvColumn(name = "Registered By Last Name")
	String registeredByLastName;

	@CsvColumn(name = "Registered By Address")
	String registeredByAddress;

	@CsvColumn(name = "Registered By City")
	String registeredByCity;

	@CsvColumn(name = "Registered By State")
	String registeredByState;

	@CsvColumn(name = "Registered By Postal Code")
	String registeredByPostalCode;

	@CsvColumn(name = "Registered By Phone")
	String registeredByPhone;

	@CsvColumn(name = "Registered By Email")
	String registeredByEmail;

	@CsvColumn(name = "Registration Date/Time")
	String registrationDateTime;

	@CsvColumn(name = "Effective Date")
	String effectiveDate;

	@CsvColumn(name = "Registration Cost")
	String registrationCost;

	@CsvColumn(name = "Amount Of Discount")
	String amountOfDiscount;

	@CsvColumn(name = "Amount Of Tax")
	String amountOfTax;

	@CsvColumn(name = "Total Amount Paid")
	String totalAmountPaid;

	@CsvColumn(name = "Registrant Cost")
	String registrantCost;

	@CsvColumn(name = "Registered")
	String registered;

	@CsvColumn(name = "Waitlisted")
	String waitlisted;

	@CsvColumn(name = "Attended")
	String attended;

	@CsvColumn(name = "First Name")
	String firstName;

	@CsvColumn(name = "Last Name")
	String lastName;

	@CsvColumn(name = "Type")
	String type;

	@CsvColumn(name = "Telephone")
	String telephone;

	@CsvColumn(name = "Email")
	String email;

	@CsvColumn(name = "Address")
	String address;

	@CsvColumn(name = "City")
	String city;

	@CsvColumn(name = "State")
	String state;

	@CsvColumn(name = "Postal Code")
	String postalCode;

	@CsvColumn(name = "Country")
	String country;

	@CsvColumn(name = "Telephone 2")
	String telephone2;

	@CsvColumn(name = "Fax")
	String fax;

	@CsvColumn(name = "Parents")
	String parents;

	@CsvColumn(name = "Email 2")
	String email2;

	@CsvColumn(name = "Title")
	String title;

	@CsvColumn(name = "Suffix")
	String suffix;

	@CsvColumn(name = "Gender")
	String gender;

	@CsvColumn(name = "Training 1")
	String training1;

	@CsvColumn(name = "Training 2")
	String training2;

	@CsvColumn(name = "Generic 1")
	String generic1;

	@CsvColumn(name = "Generic 2")
	String generic2;

	@CsvColumn(name = "Event Sponsor $5,000")
	String eventSponser5000;

	@CsvColumn(name = "Event Sponsor $5,000:Cost")
	String eventSponser5000Cost;

	@CsvColumn(name = "Room Sponsor $1,000")
	String eventSponser1000;

	@CsvColumn(name = "Room Sponsor $1,000:Cost")
	String eventSponser1000Cost;

	@CsvColumn(name = "Exhibitor Table 18 ft. Frontage")
	String exhibtorTable18FtFrontage;

	@CsvColumn(name = "Exhibitor Table 18 ft. Frontage:Cost")
	String exhibtorTable18FtFrontageCost;

	@CsvColumn(name = "Exhibitor Booth 9 ft. Frontage")
	String exhibtorBooth9FtFrontage;

	@CsvColumn(name = "Exhibitor Booth 9 ft. Frontage:Cost")
	String exhibtorBooth9FtFrontageCost;
	
	@CsvColumn(name = "I need Electricity for a display at the Tradeshow")
	String needsElectricty;

	@CsvColumn(name = "I would like to donate a door prize for the Tradeshow")
	String donateDoorPrize;

	@CsvColumn(name = "Describe the door prize you are donating")
	String doorPrizeDescription;

	@CsvColumn(name = "Meal Ticket")
	String mealTicket;

	@CsvColumn(name = "Meal Ticket:Cost")
	String mealTicketCost;

	@CsvColumn(name = "Event Booklet - Full Page Ad $100")
	String eventBookletFullPageAd;

	@CsvColumn(name = "Event Booklet - Full Page Ad $100:Cost")
	String eventBookletFullPageAdCost;

	@CsvColumn(name = "Event Booklet - Half Page Ad $50")
	String eventBookletHalfPageAd;

	@CsvColumn(name = "Event Booklet - Half Page Ad $50:Cost")
	String eventBookletHalfPageAdCost;

	@CsvColumn(name = "Flyers on Information Table $25")
	String flyersOnInformationTable;
	
	@CsvColumn(name="Flyers on Information Table $25:Cost")
	String flyersOnInformationTableCost;

	@CsvColumn(name = "Company Name")
	String companyName;

	@CsvColumn(name = "Contact Name")
	String contactName;

	@CsvColumn(name = "Contact email")
	String contactEmail;

	@CsvColumn(name = "Contact Phone Number")
	String contactPhoneNumber;

	@CsvColumn(name = "Please list your company's URL")
	String companyUrl;

	@CsvColumn(name = "Number of Months for organization website / event link")
	String numberOfMonthsForOrganizationWebsite;

	@CsvColumn(name = "Number of Months for organization website / event link:Cost")
	String numberOfMonthsForOrganizationWebsiteCost;

	@CsvColumn(name = "Please list the Month(s) for the organization website / event link")
	String specificMonthsForOrganizationWebsite;

	@CsvColumn(name = "Please list the organization website / event link")
	String organizationWebsite;

	@CsvColumn(name = "Number of posts for organization website / event link")
	String numberOfPostsForOrganizationWebsite;

	@CsvColumn(name = "Number of posts for organization website / event link:Cost")
	String numberOfPostsForOrganizationWebsiteCost;

	@CsvColumn(name = "Please list the organization website / event link1")
	String organizationWebsiteForPosts;

	@CsvColumn(name = "Number of quarters * Number of items")
	String numberOfQuartersTimesItems;

	@CsvColumn(name = "Number of quarters * Number of items:Cost")
	String numberOfQuartersTimesItemsCost;

	@CsvColumn(name = "Please describe each item and the quarter(s) you want it placed.")
	String itemsDescription;

	@CsvColumn(name = "Number of flyers / brochures* Number of month(s)")
	String numberOfFlyersTimesMonths;

	@CsvColumn(name = "Number of flyers / brochures* Number of month(s):Cost")
	String numberOfFlyersTimesMonthsCost;

	@CsvColumn(name = "Please describe each flyer / brochure and the month(s) you want it placed.")
	String flyersDescription;

	@CsvColumn(name = "Full Page Ad (7 1/2 w x 10 h)")
	String fullPageAd;

	@CsvColumn(name = "Full Page Ad (7 1/2 w x 10 h):Cost")
	String fullPageAdCost;

	@CsvColumn(name = "Half Page Ad (7 1/2 w x 4 1/2 h)")
	String halfPageAd;

	@CsvColumn(name = "Half Page Ad (7 1/2 w x 4 1/2 h):Cost")
	String halfPageAdCost;

	@CsvColumn(name = "Quarter Page Ad (3 1/2 w x 4 1/2 h)")
	String quarterPageAd;

	@CsvColumn(name = "Quarter Page Ad (3 1/2 w x 4 1/2 h):Cost")
	String quarterPageAdCost;
	
	@CsvColumn(name = "Please list the quarter you want the ad to start.")
	String adStartingQuarter;

	@CsvColumn(name = "Summer Camp T-Shirt Sponsorship")
	String summerCampTeeShirtSponser;

	@CsvColumn(name = "Summer Camp T-Shirt Sponsorship:Cost")
	String summerCampTeeShirtSponserCost;

	@CsvColumn(name = "Annual Report Sponsorship")
	String annualReportSponsership;

	@CsvColumn(name = "Annual Report Sponsorship:Cost")
	String annualReportSponsershipCost;

	@CsvColumn(name = "Placement of your organization website/event link: $50 per link. ")
	String placementOfOrganizationWebsite;

	@CsvColumn(name = "Placement of your organization website/event link: $50 per link. :Cost")
	String placementOfOrganizationWebsiteCost;

	@CsvColumn(name = "Placement of your organization logo with website/link: $100 per link.")
	String placementOfLogoWithWebsite;

	@CsvColumn(name = "Placement of your organization logo with website/link: $100 per link.:Cost")
	String placementOfLogoWithWebsiteCost;

	@CsvColumn(name = "Placement of your organization pictures with website/link: $200 per link.")
	String placementOfPicturesWithWebsite;

	@CsvColumn(name = "Placement of your organization pictures with website/link: $200 per link.:Cost")
	String placementOfPicturesWithWebsiteCost;

	public String getEventName() {
		return this.eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getRegistrationNumber() {
		return this.registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getRegisteredByFirstName() {
		return this.registeredByFirstName;
	}

	public void setRegisteredByFirstName(String registeredByFirstName) {
		this.registeredByFirstName = registeredByFirstName;
	}

	public String getRegisteredByLastName() {
		return this.registeredByLastName;
	}

	public void setRegisteredByLastName(String registeredByLastName) {
		this.registeredByLastName = registeredByLastName;
	}

	public String getRegisteredByAddress() {
		return this.registeredByAddress;
	}

	public void setRegisteredByAddress(String registeredByAddress) {
		this.registeredByAddress = registeredByAddress;
	}

	public String getRegisteredByCity() {
		return this.registeredByCity;
	}

	public void setRegisteredByCity(String registeredByCity) {
		this.registeredByCity = registeredByCity;
	}

	public String getRegisteredByState() {
		return this.registeredByState;
	}

	public void setRegisteredByState(String registeredByState) {
		this.registeredByState = registeredByState;
	}

	public String getRegisteredByPostalCode() {
		return this.registeredByPostalCode;
	}

	public void setRegisteredByPostalCode(String registeredByPostalCode) {
		this.registeredByPostalCode = registeredByPostalCode;
	}

	public String getRegisteredByPhone() {
		return this.registeredByPhone;
	}

	public void setRegisteredByPhone(String registeredByPhone) {
		this.registeredByPhone = registeredByPhone;
	}

	public String getRegisteredByEmail() {
		return this.registeredByEmail;
	}

	public void setRegisteredByEmail(String registeredByEmail) {
		this.registeredByEmail = registeredByEmail;
	}

	public String getRegistrationDateTime() {
		return this.registrationDateTime;
	}

	public void setRegistrationDateTime(String registrationDateTime) {
		this.registrationDateTime = registrationDateTime;
	}

	public String getEffectiveDate() {
		return this.effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getRegistrationCost() {
		return this.registrationCost;
	}

	public void setRegistrationCost(String registrationCost) {
		this.registrationCost = registrationCost;
	}

	public String getAmountOfDiscount() {
		return this.amountOfDiscount;
	}

	public void setAmountOfDiscount(String amountOfDiscount) {
		this.amountOfDiscount = amountOfDiscount;
	}

	public String getAmountOfTax() {
		return this.amountOfTax;
	}

	public void setAmountOfTax(String amountOfTax) {
		this.amountOfTax = amountOfTax;
	}

	public String getTotalAmountPaid() {
		return this.totalAmountPaid;
	}

	public void setTotalAmountPaid(String totalAmountPaid) {
		this.totalAmountPaid = totalAmountPaid;
	}

	public String getRegistrantCost() {
		return this.registrantCost;
	}

	public void setRegistrantCost(String registrantCost) {
		this.registrantCost = registrantCost;
	}

	public String getRegistered() {
		return this.registered;
	}

	public void setRegistered(String registered) {
		this.registered = registered;
	}

	public String getWaitlisted() {
		return this.waitlisted;
	}

	public void setWaitlisted(String waitlisted) {
		this.waitlisted = waitlisted;
	}

	public String getAttended() {
		return this.attended;
	}

	public void setAttended(String attended) {
		this.attended = attended;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTelephone2() {
		return this.telephone2;
	}

	public void setTelephone2(String telephone2) {
		this.telephone2 = telephone2;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getParents() {
		return this.parents;
	}

	public void setParents(String parents) {
		this.parents = parents;
	}

	public String getEmail2() {
		return this.email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSuffix() {
		return this.suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTraining1() {
		return this.training1;
	}

	public void setTraining1(String training1) {
		this.training1 = training1;
	}

	public String getTraining2() {
		return this.training2;
	}

	public void setTraining2(String training2) {
		this.training2 = training2;
	}

	public String getGeneric1() {
		return this.generic1;
	}

	public void setGeneric1(String generic1) {
		this.generic1 = generic1;
	}

	public String getGeneric2() {
		return this.generic2;
	}

	public void setGeneric2(String generic2) {
		this.generic2 = generic2;
	}

	public String getEventSponser5000() {
		return this.eventSponser5000;
	}

	public void setEventSponser5000(String eventSponser5000) {
		this.eventSponser5000 = eventSponser5000;
	}

	public String getEventSponser5000Cost() {
		return this.eventSponser5000Cost;
	}

	public void setEventSponser5000Cost(String eventSponser5000Cost) {
		this.eventSponser5000Cost = eventSponser5000Cost;
	}

	public String getEventSponser1000() {
		return this.eventSponser1000;
	}

	public void setEventSponser1000(String eventSponser1000) {
		this.eventSponser1000 = eventSponser1000;
	}

	public String getEventSponser1000Cost() {
		return this.eventSponser1000Cost;
	}

	public void setEventSponser1000Cost(String eventSponser1000Cost) {
		this.eventSponser1000Cost = eventSponser1000Cost;
	}

	public String getExhibtorTable18FtFrontage() {
		return this.exhibtorTable18FtFrontage;
	}

	public void setExhibtorTable18FtFrontage(String exhibtorTable18FtFrontage) {
		this.exhibtorTable18FtFrontage = exhibtorTable18FtFrontage;
	}

	public String getExhibtorTable18FtFrontageCost() {
		return this.exhibtorTable18FtFrontageCost;
	}

	public void setExhibtorTable18FtFrontageCost(String exhibtorTable18FtFrontageCost) {
		this.exhibtorTable18FtFrontageCost = exhibtorTable18FtFrontageCost;
	}

	public String getExhibtorBooth9FtFrontage() {
		return this.exhibtorBooth9FtFrontage;
	}

	public void setExhibtorBooth9FtFrontage(String exhibtorBooth9FtFrontage) {
		this.exhibtorBooth9FtFrontage = exhibtorBooth9FtFrontage;
	}

	public String getExhibtorBooth9FtFrontageCost() {
		return this.exhibtorBooth9FtFrontageCost;
	}

	public void setExhibtorBooth9FtFrontageCost(String exhibtorBooth9FtFrontageCost) {
		this.exhibtorBooth9FtFrontageCost = exhibtorBooth9FtFrontageCost;
	}

	public String getNeedsElectricty() {
		return this.needsElectricty;
	}

	public void setNeedsElectricty(String needsElectricty) {
		this.needsElectricty = needsElectricty;
	}

	public String getDonateDoorPrize() {
		return this.donateDoorPrize;
	}

	public void setDonateDoorPrize(String donateDoorPrize) {
		this.donateDoorPrize = donateDoorPrize;
	}

	public String getDoorPrizeDescription() {
		return this.doorPrizeDescription;
	}

	public void setDoorPrizeDescription(String doorPrizeDescription) {
		this.doorPrizeDescription = doorPrizeDescription;
	}

	public String getMealTicket() {
		return this.mealTicket;
	}

	public void setMealTicket(String mealTicket) {
		this.mealTicket = mealTicket;
	}

	public String getMealTicketCost() {
		return this.mealTicketCost;
	}

	public void setMealTicketCost(String mealTicketCost) {
		this.mealTicketCost = mealTicketCost;
	}

	public String getEventBookletFullPageAd() {
		return this.eventBookletFullPageAd;
	}

	public void setEventBookletFullPageAd(String eventBookletFullPageAd) {
		this.eventBookletFullPageAd = eventBookletFullPageAd;
	}

	public String getEventBookletFullPageAdCost() {
		return this.eventBookletFullPageAdCost;
	}

	public void setEventBookletFullPageAdCost(String eventBookletFullPageAdCost) {
		this.eventBookletFullPageAdCost = eventBookletFullPageAdCost;
	}

	public String getEventBookletHalfPageAd() {
		return this.eventBookletHalfPageAd;
	}

	public void setEventBookletHalfPageAd(String eventBookletHalfPageAd) {
		this.eventBookletHalfPageAd = eventBookletHalfPageAd;
	}

	public String getEventBookletHalfPageAdCost() {
		return this.eventBookletHalfPageAdCost;
	}

	public void setEventBookletHalfPageAdCost(String eventBookletHalfPageAdCost) {
		this.eventBookletHalfPageAdCost = eventBookletHalfPageAdCost;
	}

	public String getFlyersOnInformationTable() {
		return this.flyersOnInformationTable;
	}

	public void setFlyersOnInformationTable(String flyersOnInformationTable) {
		this.flyersOnInformationTable = flyersOnInformationTable;
	}

	public String getFlyersOnInformationTableCost() {
		return this.flyersOnInformationTableCost;
	}

	public void setFlyersOnInformationTableCost(String flyersOnInformationTableCost) {
		this.flyersOnInformationTableCost = flyersOnInformationTableCost;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactEmail() {
		return this.contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactPhoneNumber() {
		return this.contactPhoneNumber;
	}

	public void setContactPhoneNumber(String contactPhoneNumber) {
		this.contactPhoneNumber = contactPhoneNumber;
	}

	public String getCompanyUrl() {
		return this.companyUrl;
	}

	public void setCompanyUrl(String companyUrl) {
		this.companyUrl = companyUrl;
	}

	public String getNumberOfMonthsForOrganizationWebsite() {
		return this.numberOfMonthsForOrganizationWebsite;
	}

	public void setNumberOfMonthsForOrganizationWebsite(String numberOfMonthsForOrganizationWebsite) {
		this.numberOfMonthsForOrganizationWebsite = numberOfMonthsForOrganizationWebsite;
	}

	public String getNumberOfMonthsForOrganizationWebsiteCost() {
		return this.numberOfMonthsForOrganizationWebsiteCost;
	}

	public void setNumberOfMonthsForOrganizationWebsiteCost(String numberOfMonthsForOrganizationWebsiteCost) {
		this.numberOfMonthsForOrganizationWebsiteCost = numberOfMonthsForOrganizationWebsiteCost;
	}

	public String getSpecificMonthsForOrganizationWebsite() {
		return this.specificMonthsForOrganizationWebsite;
	}

	public void setSpecificMonthsForOrganizationWebsite(String specificMonthsForOrganizationWebsite) {
		this.specificMonthsForOrganizationWebsite = specificMonthsForOrganizationWebsite;
	}

	public String getOrganizationWebsite() {
		return this.organizationWebsite;
	}

	public void setOrganizationWebsite(String organizationWebsite) {
		this.organizationWebsite = organizationWebsite;
	}

	public String getNumberOfPostsForOrganizationWebsite() {
		return this.numberOfPostsForOrganizationWebsite;
	}

	public void setNumberOfPostsForOrganizationWebsite(String numberOfPostsForOrganizationWebsite) {
		this.numberOfPostsForOrganizationWebsite = numberOfPostsForOrganizationWebsite;
	}

	public String getNumberOfPostsForOrganizationWebsiteCost() {
		return this.numberOfPostsForOrganizationWebsiteCost;
	}

	public void setNumberOfPostsForOrganizationWebsiteCost(String numberOfPostsForOrganizationWebsiteCost) {
		this.numberOfPostsForOrganizationWebsiteCost = numberOfPostsForOrganizationWebsiteCost;
	}

	public String getOrganizationWebsiteForPosts() {
		return this.organizationWebsiteForPosts;
	}

	public void setOrganizationWebsiteForPosts(String organizationWebsiteForPosts) {
		this.organizationWebsiteForPosts = organizationWebsiteForPosts;
	}

	public String getNumberOfQuartersTimesItems() {
		return this.numberOfQuartersTimesItems;
	}

	public void setNumberOfQuartersTimesItems(String numberOfQuartersTimesItems) {
		this.numberOfQuartersTimesItems = numberOfQuartersTimesItems;
	}

	public String getNumberOfQuartersTimesItemsCost() {
		return this.numberOfQuartersTimesItemsCost;
	}

	public void setNumberOfQuartersTimesItemsCost(String numberOfQuartersTimesItemsCost) {
		this.numberOfQuartersTimesItemsCost = numberOfQuartersTimesItemsCost;
	}

	public String getItemsDescription() {
		return this.itemsDescription;
	}

	public void setItemsDescription(String itemsDescription) {
		this.itemsDescription = itemsDescription;
	}

	public String getNumberOfFlyersTimesMonths() {
		return this.numberOfFlyersTimesMonths;
	}

	public void setNumberOfFlyersTimesMonths(String numberOfFlyersTimesMonths) {
		this.numberOfFlyersTimesMonths = numberOfFlyersTimesMonths;
	}

	public String getNumberOfFlyersTimesMonthsCost() {
		return this.numberOfFlyersTimesMonthsCost;
	}

	public void setNumberOfFlyersTimesMonthsCost(String numberOfFlyersTimesMonthsCost) {
		this.numberOfFlyersTimesMonthsCost = numberOfFlyersTimesMonthsCost;
	}

	public String getFlyersDescription() {
		return this.flyersDescription;
	}

	public void setFlyersDescription(String flyersDescription) {
		this.flyersDescription = flyersDescription;
	}

	public String getFullPageAd() {
		return this.fullPageAd;
	}

	public void setFullPageAd(String fullPageAd) {
		this.fullPageAd = fullPageAd;
	}

	public String getFullPageAdCost() {
		return this.fullPageAdCost;
	}

	public void setFullPageAdCost(String fullPageAdCost) {
		this.fullPageAdCost = fullPageAdCost;
	}

	public String getHalfPageAd() {
		return this.halfPageAd;
	}

	public void setHalfPageAd(String halfPageAd) {
		this.halfPageAd = halfPageAd;
	}

	public String getHalfPageAdCost() {
		return this.halfPageAdCost;
	}

	public void setHalfPageAdCost(String halfPageAdCost) {
		this.halfPageAdCost = halfPageAdCost;
	}

	public String getQuarterPageAd() {
		return this.quarterPageAd;
	}

	public void setQuarterPageAd(String quarterPageAd) {
		this.quarterPageAd = quarterPageAd;
	}

	public String getQuarterPageAdCost() {
		return this.quarterPageAdCost;
	}

	public void setQuarterPageAdCost(String quarterPageAdCost) {
		this.quarterPageAdCost = quarterPageAdCost;
	}

	public String getAdStartingQuarter() {
		return this.adStartingQuarter;
	}

	public void setAdStartingQuarter(String adStartingQuarter) {
		this.adStartingQuarter = adStartingQuarter;
	}

	public String getSummerCampTeeShirtSponser() {
		return this.summerCampTeeShirtSponser;
	}

	public void setSummerCampTeeShirtSponser(String summerCampTeeShirtSponser) {
		this.summerCampTeeShirtSponser = summerCampTeeShirtSponser;
	}

	public String getSummerCampTeeShirtSponserCost() {
		return this.summerCampTeeShirtSponserCost;
	}

	public void setSummerCampTeeShirtSponserCost(String summerCampTeeShirtSponserCost) {
		this.summerCampTeeShirtSponserCost = summerCampTeeShirtSponserCost;
	}

	public String getAnnualReportSponsership() {
		return this.annualReportSponsership;
	}

	public void setAnnualReportSponsership(String annualReportSponsership) {
		this.annualReportSponsership = annualReportSponsership;
	}

	public String getAnnualReportSponsershipCost() {
		return this.annualReportSponsershipCost;
	}

	public void setAnnualReportSponsershipCost(String annualReportSponsershipCost) {
		this.annualReportSponsershipCost = annualReportSponsershipCost;
	}

	public String getPlacementOfOrganizationWebsite() {
		return this.placementOfOrganizationWebsite;
	}

	public void setPlacementOfOrganizationWebsite(String placementOfOrganizationWebsite) {
		this.placementOfOrganizationWebsite = placementOfOrganizationWebsite;
	}

	public String getPlacementOfOrganizationWebsiteCost() {
		return this.placementOfOrganizationWebsiteCost;
	}

	public void setPlacementOfOrganizationWebsiteCost(String placementOfOrganizationWebsiteCost) {
		this.placementOfOrganizationWebsiteCost = placementOfOrganizationWebsiteCost;
	}

	public String getPlacementOfLogoWithWebsite() {
		return this.placementOfLogoWithWebsite;
	}

	public void setPlacementOfLogoWithWebsite(String placementOfLogoWithWebsite) {
		this.placementOfLogoWithWebsite = placementOfLogoWithWebsite;
	}

	public String getPlacementOfLogoWithWebsiteCost() {
		return this.placementOfLogoWithWebsiteCost;
	}

	public void setPlacementOfLogoWithWebsiteCost(String placementOfLogoWithWebsiteCost) {
		this.placementOfLogoWithWebsiteCost = placementOfLogoWithWebsiteCost;
	}

	public String getPlacementOfPicturesWithWebsite() {
		return this.placementOfPicturesWithWebsite;
	}

	public void setPlacementOfPicturesWithWebsite(String placementOfPicturesWithWebsite) {
		this.placementOfPicturesWithWebsite = placementOfPicturesWithWebsite;
	}

	public String getPlacementOfPicturesWithWebsiteCost() {
		return this.placementOfPicturesWithWebsiteCost;
	}

	public void setPlacementOfPicturesWithWebsiteCost(String placementOfPicturesWithWebsiteCost) {
		this.placementOfPicturesWithWebsiteCost = placementOfPicturesWithWebsiteCost;
	}
	
	
}
