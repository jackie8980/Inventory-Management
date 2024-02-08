WESTERN GOVERNOR UNIVERSITY
D287 – JAVA FRAMEWORKS

Part C:

    Changed the title and header of the mainscreen.html page on lines 14 and 19.

Part D:

    Created an about.html file under templates for the about page.
    - updated the h1 and title of the file to match the shop (lines 6 and 10)
    - added a description in the body of the page 
    - included a link to go back to the main screen
    Created AboutShopController to handle GetMapping of the page
    
    Created a button to navigate to the about.html page in mainscreen.html on line 20

Part E:
    
    - uncommented lines corresponding to the sample products and items
    - added comment description on line 45
    - moved instantiation of thePart and outsourcedParts list to lines 42 and 43
    - added parts in lines 46-109
    - added products in lines 117-126

Part F:

    - Added a button in the mainscreen.html on line 86
    - Created confirmationbuynow.html for successful purchase with button back to mainscreen
    - Created failedpurchase.html for unsuccessful purchase with button back to mainscreen
    - Created BuyNowController
        - Lines 15 + 16 initializing context variable used in the method
        - Lines 18-32 logic behind failed puchase if inventory is less than 1, successful otherwise.
            - Links to respective html pages created above
    - ProductService Interface:
        - Line 20: Added method purchase() 
    - ProductServiceImpl.java:
        - Lines 68 - 71: Overrided purchase() method to decrement inventory by 1

Part G:
    
    mainscreen.html:    
    - Lines 39 + 40, added extra table headers for min and max inventory
        - Lines 49 + 50, added row info for each extra row
    
    Part.java
    - Lines 31 - 34: Initialized minInv and maxInv
    - Lines 89 - 102: Added getters and setters for minInv and maxInv 
    - Lines 128 - 138: Added method to validate inventory
    
    BootStrapData.java
    - Added minInv and maxInv to the sample parts

    application.properties:
    - Renamed the datasource url to "theautomaster"
    
    InhousePartForm.html:
    - Lines 20 - 25: Added input fields for min and max inventory along with error messages
    
    OutsourcedPartForm.html:
    - Lines 22 - 27: Added input fields for min and max inventory along with error messages
    
    AddInhousePartController.java:
    - Modified line 42 to also return the form again if the inventory is out of bounds

    AddOutsourcedPartController.java:
    - Modified line 43 to also return the form again if the inventory is out of bounds

Part H:
    
    - Modified Lines 42 - 47 in AddInhousePartController.java to display error message if inventory is higher or lower 
        than the minimums/maximums 
    - Modified Lines 44 - 49 in AddOutsourcedPartController.java to display error message if inventory is higher or lower 
        than the minimums/maximums 
    - Modified Lines 36 - 39 in EnufPartsValidator.java to include logic that prevents updating products
        if the parts would fall below the inventory minimum
    - Modified Lines 108 - 110 to only show the part available to associate if the inventory is greater than the min

Part I:
    
    - Added 2 tests for minimum and maximum on lines 159 - 176 for PartTest.java

Part J:

    - Deleted DeletePartsValidator since it had 0 usage
    
    
