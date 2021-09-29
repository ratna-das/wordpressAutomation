@tag @all
Feature: Validating WordPress My profile page
  I want to test word press functionality

  Background:
    Given I am on log in page
    And I log in with valid user id and password
    And I should land on home page
    When I click on my profile icon
    Then I should be on my profile page


  @tag1
  Scenario: Side nav option validation
    And I should see "My Profile" option is selected
    And I should see following option in side nav bar:
      | My Profile            |
      | Account Settings      |
      | Purchases             |
      | Security              |
      | Privacy               |
      | Manage Blogs          |
      | Notification Settings |
      | Blocked Sites         |
      | Get Apps              |


  @tag2
  Scenario: Profile section validation
    And I should see my userid in side navbar
    And my public display name should be visible
    And I should see log out option available on side nav bar
    When I log out
    Then I should be land on promo page

  @tag3
  Scenario: Profile details updated
    And I update my first name
    And I update my last name
    When I update my public user name
    And I save my details
    Then my public display name should be updated

  @tag4
  Scenario: Uploading profile link
    Given I click add profile link button
    And I should see following option available:
      | Add WordPress Site |
      | Add URL            |
    When I add profile link "1"
    And I add profile link "2"
    Then I should see 2 link added to my profile
    When I remove all the link
    Then I should see 0 link added to my profile