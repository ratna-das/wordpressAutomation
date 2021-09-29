$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/feature/wordPress.feature");
formatter.feature({
  "name": "Validating WordPress My profile page",
  "description": "  I want to test word press functionality",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@all"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on log in page",
  "keyword": "Given "
});
formatter.match({
  "location": "LogInSteps.iAmOnHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I log in with valid user id and password",
  "keyword": "And "
});
formatter.match({
  "location": "LogInSteps.iLogInWithValidUserIdAndPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should land on home page",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.iShouldLandOnHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on my profile icon",
  "keyword": "When "
});
formatter.match({
  "location": "ProfileSteps.iClickOnMyProfileIcon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be on my profile page",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileSteps.iShouldBeOnMyProfilePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Side nav option validation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@all"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "I should see \"My Profile\" option is selected",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.iShouldSeeOptionIsSelected(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see following option in side nav bar:",
  "rows": [
    {
      "cells": [
        "My Profile"
      ]
    },
    {
      "cells": [
        "Account Settings"
      ]
    },
    {
      "cells": [
        "Purchases"
      ]
    },
    {
      "cells": [
        "Security"
      ]
    },
    {
      "cells": [
        "Privacy"
      ]
    },
    {
      "cells": [
        "Manage Blogs"
      ]
    },
    {
      "cells": [
        "Notification Settings"
      ]
    },
    {
      "cells": [
        "Blocked Sites"
      ]
    },
    {
      "cells": [
        "Get Apps"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.iShouldSeeFollowingOptionInSideNavBar(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on log in page",
  "keyword": "Given "
});
formatter.match({
  "location": "LogInSteps.iAmOnHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I log in with valid user id and password",
  "keyword": "And "
});
formatter.match({
  "location": "LogInSteps.iLogInWithValidUserIdAndPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should land on home page",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.iShouldLandOnHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on my profile icon",
  "keyword": "When "
});
formatter.match({
  "location": "ProfileSteps.iClickOnMyProfileIcon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be on my profile page",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileSteps.iShouldBeOnMyProfilePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Profile section validation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@all"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "I should see my userid in side navbar",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.iShouldSeeMyUseridInSideNavbar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "my public display name should be visible",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.myPublicDisplayNameShouldBeVisible()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Public Display Name not matched expected [Ratna_Das] but found [Moni_Dash]\n\tat org.testng.Assert.fail(Assert.java:97)\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:136)\n\tat org.testng.Assert.assertEquals(Assert.java:118)\n\tat org.testng.Assert.assertEquals(Assert.java:575)\n\tat stepDefinition.ProfileSteps.myPublicDisplayNameShouldBeVisible(ProfileSteps.java:46)\n\tat ✽.my public display name should be visible(src/test/java/feature/wordPress.feature:31)\n",
  "status": "failed"
});
formatter.step({
  "name": "I should see log out option available on side nav bar",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.iShouldSeeLogOutOptionAvailableOnSideNavBar()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I log out",
  "keyword": "When "
});
formatter.match({
  "location": "ProfileSteps.iLogOut()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I should be land on promo page",
  "keyword": "Then "
});
formatter.match({
  "location": "LogInSteps.iShouldBeLandOnPromoPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on log in page",
  "keyword": "Given "
});
formatter.match({
  "location": "LogInSteps.iAmOnHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I log in with valid user id and password",
  "keyword": "And "
});
formatter.match({
  "location": "LogInSteps.iLogInWithValidUserIdAndPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should land on home page",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.iShouldLandOnHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on my profile icon",
  "keyword": "When "
});
formatter.match({
  "location": "ProfileSteps.iClickOnMyProfileIcon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be on my profile page",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileSteps.iShouldBeOnMyProfilePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Profile details updated",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@all"
    },
    {
      "name": "@tag3"
    }
  ]
});
formatter.step({
  "name": "I update my first name",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.iUpdateMyFirstName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I update my last name",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.iUpdateMyLastName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I update my public user name",
  "keyword": "When "
});
formatter.match({
  "location": "ProfileSteps.iUpdateMyPublicUserName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I save my details",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.iSaveMyDetails()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "my public display name should be updated",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileSteps.myPublicDisplayNameShouldBeUpdated()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on log in page",
  "keyword": "Given "
});
formatter.match({
  "location": "LogInSteps.iAmOnHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I log in with valid user id and password",
  "keyword": "And "
});
formatter.match({
  "location": "LogInSteps.iLogInWithValidUserIdAndPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should land on home page",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.iShouldLandOnHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on my profile icon",
  "keyword": "When "
});
formatter.match({
  "location": "ProfileSteps.iClickOnMyProfileIcon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be on my profile page",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileSteps.iShouldBeOnMyProfilePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Uploading profile link",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@all"
    },
    {
      "name": "@tag4"
    }
  ]
});
formatter.step({
  "name": "I click add profile link button",
  "keyword": "Given "
});
formatter.match({
  "location": "ProfileSteps.iClickAddProfileLinkButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see following option available:",
  "rows": [
    {
      "cells": [
        "Add WordPress Site"
      ]
    },
    {
      "cells": [
        "Add URL"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.iShouldSeeFollowingOptionAvailable(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add profile link \"1\"",
  "keyword": "When "
});
formatter.match({
  "location": "ProfileSteps.iAddProfileLink(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add profile link \"2\"",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.iAddProfileLink(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see 2 link added to my profile",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileSteps.iShouldSeeLinkAddedToMyProfile(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I remove all the link",
  "keyword": "When "
});
formatter.match({
  "location": "ProfileSteps.iRemoveAllTheLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see 0 link added to my profile",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileSteps.iShouldSeeLinkAddedToMyProfile(int)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});