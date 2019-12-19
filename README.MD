# Credit Model Backend Server

### Workspace setup
1. Download Java 11 from Oracle website or OpenJDK 11
2. Download any Java IDE that supports Maven Projects
2. Import the clone backed-project into the IDE workspace as Maven Project.
3. Run pom.xml file to generate the spring boot jar 'CreditModel-0.0.1-SNAPSHOT.jar'

## Setup Database:
1. Install MySQL Database
2. Run the CreditModel.sql file. 

## Running up backend server :
1. Open command terminal windows. 
2. Copy spring boot jar file to a preferred location or traverse to the 'target' folder within maven project folder.
3. Run the following command to start the server - 
    java -jar CreditModel-0.0.1-SNAPSHOT.jar --server.port=8080
4. To confirm the server has started successfully, you should see the log message "Started CreditModelApplication in n.nnn seconds" on the console
5. To shutdown the server press Ctrl + C on windows. On Mac press Control + C

## Credit Model RESTful APIs and Sample payloads

Using you favourite RESTful API test tool (e.g. Postman) you can start testing the back end API. Following is the URL and sample payload for different credit model APIs

### Save a new loan application - 
#### URL: http://localhost:8080/creditmodel/saveloanapplication - 
#### Sample JSON Payload - 
{
	"companyName": "ABC",
	"loanAmount": 100000000,
	"industry": "Travel",
	"size": "100-200",
	"location": "Karnataka",
	"relationshipManagerId": "1"
}


### Save a new loan application - 
#### URL: http://localhost:8080/creditmodel/updateloanapplication - 
#### Sample JSON Payload - 
{
    "loanApplicationId": 1,
    "companyName": "ABC",
    "loanAmount": 100000000,
    "industry": "Travel",
    "size": "100-200",
    "location": "Karnataka",
    "relationShipManagerId": "1"
}

### Find all loan application info for a relationship manager  - 
#### URL: http://localhost:8080/creditmodel/findloanapplications/{relationshipManagerId}/{pageIndex}
#### Sample JSON Payload - None

### Get a specific loan application info for a relationship manager  - 
#### URL: http://localhost:8080/creditmodel/getloanapplications/{loanApplicationId}
#### Sample JSON Payload - None

### Filter loan application based on filter conditions
#### URL: http://localhost:8080/creditmodel/filterloanapplications - 
#### Sample JSON Payload - 
{
"loanAmountGreaterThan": "0",
"loanAmountLessThan": 10000000,
"loanStatusApproved": "true",
"loanStatusPending": "false",
"loanStatusRejected": "true",
"applicationStatusActive": "true",
"applicationStatusClosed": "false",
"relationshipManagerId": "1",
"pageIndex": 0
}

### Search loan application based on loan id or company name
#### URL: http://localhost:8080/creditmodel/searchloanapplications/{relationshipManagerId}/{searchString}/{pageIndex}
#### Sample JSON Payload - None

### ApplicationModule - 
**NOTE** USE A VALID loanApplicationId GENERATED FROM 'saveloanapplication' API CALL.
#### URL: http://localhost:8080/creditmodel/saveapplicationmodule
#### Sample JSON Payload - 
{
"loanApplicationId": "1",
"businessVintage": "120",
"numberOfPromoters": "5",
"promoterGraduate": "false",
"promotersFromSameFamily": "false",
"numberOfCollaterals": "5",
"pledgedCollateralSelfOccupied": "false",
"natureOfBusinessIsManufacturing": "true",
"natureOfBusinessChemicalProduct": "false",
"maximumSharesHeldByPromoters": "44.59",
"previousBankPublicSectorBank": "false",
"probabilityOfDefaultScore": "",
"validated": "true"
}

### BehaviourModule - 
**NOTE** USE A VALID loanApplicationId GENERATED FROM 'saveloanapplication' API CALL.
#### URL: http://localhost:8080/creditmodel/savebehaviourmodule
#### Sample JSON Payload - 
{
"loanApplicationId": "1",
"noOfInwardChequeReturn": "12",
"penalChargesLastYear": "false",
"averageEODBalanceLastMonth": "55.89",
"debitGreaterThanCredit": "false",
"noOfDaysWithZeroCreditOverThreeMonths": "5",
"interestServiceDelays": "true",
"transactionsOnPromotersPersonalAccount": "true",
"sesonalityOfBusiness": "false",
"creditDebitRatio": "30.33",
"transactionInForeignCurrency": "false",
"probabilityOfDefaultScore": "",
"validated": "true"
}

### CommercialBureau - 
**NOTE** USE A VALID loanApplicationId GENERATED FROM 'saveloanapplication' API CALL. 
#### URL: http://localhost:8080/creditmodel/savecommercialbureau
#### Sample JSON Payload - 
{
"loanApplicationId": "1",
"maximumDPDInLoanLastYear": "12",
"noOfSecuredLoanAvailedLastYear": "2",
"averageUtilizationOfSecuredLoanLastYear": "40.36",
"recentDPDInMonths": "2",
"noOfLCBGTakenLastYear": "2",
"loansWrittenOfLastYear": "5",
"noOfWorkingCapitalFacilityAvailedLastYear": "3",
"noOfConsecutiveMonthOverDraftUtil": "5",
"noOfTermLoansTakenInLastYear": "3",
"maxLoanUtilizationObservedLastYear": "40.66",
"probabilityOfDefaultScore": "",
"validated": "true"
}

### ConsumerBureau - 
**NOTE** USE A VALID loanApplicationId GENERATED FROM 'saveloanapplication' API CALL.
#### URL: http://localhost:8080/creditmodel/saveconsumerbureau
#### Sample JSON Payload - 
{
"loanApplicationId": "1",
"maximumDPDOfPromoterLastYear": "15",
"averageDPDOfPromotersLastYear": "12.33",
"noOfLoanAvailedLastYear": "3",
"activeSecuredLoanOfPromoters": "2",
"yearSinceFirstLoanByPromoters": "5",
"averageNumberOfLoanAvailedLastYear": "7.3",
"monthsSinceLastDPDForAnyPromoters": "15",
"maxNoConsecutiveMonthDPDByAnyPromoters": "2",
"avgNoInqueriesForBusinessLoans": "4.2",
"monthSinceLastInquiryForSecureLoan": "12",
"probabilityOfDefaultScore": "",
"validated": "true"
}

### FinancialModule - 
**NOTE** USE A VALID loanApplicationId GENERATED FROM 'saveloanapplication' API CALL.
#### URL: http://localhost:8080/creditmodel/savefinancialmodule
#### Sample JSON Payload - 
{
"loanApplicationId": "1",
"growthInSalesSinceLastYear": "15",
"currentAssetLiabilityRatio": "30",
"debtEquityRatio": "40",
"returnOnEquity": "20",
"growthInPAT": "10",
"returnOnAssets": "15",
"assetRatio": "34.55",
"workingCapitalDays": "120",
"growthInTangibleNetWorth": "14",
"assetTurnOverRatio": "18.5",
"probabilityOfDefaultScore": "",
"validated": "true"
}

### QCA Module - 
**NOTE** USE A VALID loanApplicationId GENERATED FROM 'saveloanapplication' API CALL.
#### URL: http://localhost:8080/creditmodel/saveqcamodule
#### Sample JSON Payload - 
{
"loanApplicationId": "LN-APP-00004",
"percentageOfTxDoneInCash": "10%-30%",
"currentCEOTenure": "1-5",
"percentageOfProfitReinvested": "0%-25%",
"percentageOfNonContractEmployees": "10%-25%",
"noOfStrikesByEmployees": "Never",
"noOfLitigationByBorrower": "1-2",
"delayedTaxAndDuePayment": "1-2",
"chiefAccountDevelopingReports": "The report creation is outsourced to a CA firm",
"businessRequiresSpecialPermit": "Yes, and is obtained",
"percentageOfLongTermSuppliers": "30%-60%",
"validated": "true"
}

### Overall PD Score calculation - **NOTE** USE A VALID loanApplicationId GENERATED FROM 'saveloanapplication' API CALL.
#### URL: http://localhost:8080/creditmodel/calculateprobabilityofdefault/{loanApplicationId}
#### Sample JSON Payload - None
