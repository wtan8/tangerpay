
Please import the ff. in Postman or any api tool.  It include sample payload for testing:


curl --location 'http://localhost:8080/contacts/recordContactDetails' \
--header 'Content-Type: application/json' \
--data '{
      "contactName": "Ivana Alawi",
      "phoneNum": "222-6666"
}'
