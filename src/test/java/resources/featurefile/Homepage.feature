Feature: Home Page
  As a user I want to verify Job search using different data set

  Scenario Outline: User should able to verify job search using different data type
    Given User On HomePage
    When  User accept cookies
    And  User enter job title "<jobTitle>"
    And  User entre location "<location>"
    And   User select distance "<distance>"
    And   User click on moreSearchOptionsLink
    And   User enter salaryMin "<salaryMin>"
    And   User enter salaryMax "<salaryMax>"
    And   User select salaryType "<salaryType>"
    And   User select jobType "<jobType>"
    And   User click on Find Jobs button
    Then  User verify the result "<result>"
    Examples:
      | jobTitle        | location                | distance       | salaryMin | salaryMax | salaryType | jobType   | result                                    |
      | project manager | Wembley, Greater London | up to 15 miles | 30000     | 40000     | annum      | Permanent | Permanent Project Manager jobs in Wembley |
      | QA              | Watford                 | up to 15 miles | 35000     | 40000     | annum      | Permanent | Permanent Qa jobs in Watford              |
      | QP              | Watford                 | up to 10 miles | 35000     | 40000     | annum      | Permanent | Permanent Qp jobs in Watford              |
      | QC              | Watford                 | up to 15 miles | 20000     | 30000     | annum      | Permanent | Permanent Qc jobs in Watford              |
      | Tester          | Watford                 | up to 10 miles | 25000     | 30000     | annum      | Permanent | Permanent Tester jobs in Watford          |

