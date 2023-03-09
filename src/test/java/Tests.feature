Feature: PiWorks anasayfa "contact us" testleri
  Scenario Outline: ilk olarak her şeyi doğru girerek gönderecek ardından "first name" kısmını boş bırakarak göndermeye çalışacak.
    Given open main page
    And click contact us button
    And type First Name "<First Name>"
    And type Last Name "Ay"
    And type Business E-Mail Adress "<meminay60@gmail.com>"
    And type Company "eminimki.com"
    And type Job Title "QA Intern"
    And type Business Phone "55555555555"
    And select Category "Careers"
    And type Message "Bu ön görüşme testi için yazılmış bir otomasyondur."
    When click send button
    Then check status
    Examples:
      | First Name |
      |Muhammed Emin|
      |             |
