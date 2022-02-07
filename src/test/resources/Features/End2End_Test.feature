Feature: Automated End2End Test
 
Scenario: customer place an order by purchasing an item from search

Given User launch chrome browser
When enter url "https://shop.demoqa.com/"
And search for "dress"
And choose to buy the first item
And moves to checkout from mini cart
And enter personal details on checkout page
And select same delivery address
And select payment method as "check" payment
And place the order
