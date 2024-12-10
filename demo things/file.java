//    @Test
//    public void uplodeFile(){
//
//        File excelFile = new File("C:/Users/sushi/OneDrive/Desktop/Regression skiptrace files for all scenario/20_valid_records.xlsx");
//
//        Response response = RestAssured.given()
//                .header("Authorization", "Bearer " + h.tokan)
//                .multiPart("file", excelFile)
//                .when()
//                .post("/api/address/uploadFile");
//
//        Assert.assertEquals(response.statusCode(),200 );
//        String responseBody = response.asString();
//
//        System.out.println(responseBody);
//    }
//
//