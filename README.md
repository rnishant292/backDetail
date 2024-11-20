# backDetail
Register user : 
http://localhost:8080/register

body : 
{
  "usEmail": "user@example.com",
  "usPwd": "password123"
}

login user :
http://localhost:8080/login

body :
{
  "usEmail": "user@example.com",
  "usPwd": "password123"
}

fetch bank details:
http://localhost:8080/user/bank/fetch
only pass bearer token

Response: 
[
    {
        "bkId": 1,
        "bkName": "SBI",
        "bkAccountNumber": "2177127172",
        "bkIfsc": "duhia",
        "bkModdt": "dsjjs"
    },
    {
        "bkId": 2,
        "bkName": "SCB",
        "bkAccountNumber": "2177127172",
        "bkIfsc": "duhia",
        "bkModdt": "dsjjs"
    }
]


Add bank details:
http://localhost:8080/user/bank/add
Request Body and also pass bearer token

{
  "bkName": "SBI",
  "bkAccountNumber": "2177127172",
  "bkIfsc": "duhia",
  "bkModdt": "dsjjs"
}

Response:
Bank Details Added


