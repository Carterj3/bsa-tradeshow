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
	
	
}
