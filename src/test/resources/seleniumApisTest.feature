@OnlineBooking
Feature: Test all the selenium APIs


Background: 
Given when I am on online bookings home page


Scenario: Test the selenium WebDriver Features
When I login and navigate to manage my bookings
And I select the start time as "13:00" and hours as 2
And give credit card details and checkout
Then I should get a confirmation page saying "Booking Confirmed" 