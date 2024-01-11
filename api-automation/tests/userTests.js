const chakram = require('chakram'), 
expect = chakram.expect;

describe("User Module", function() {

    it("GET - GetUserInfo Invalid User", function () {
        const resBody ={
         "code": 1,
         "type": "error",
         "message": "User not found"
        };
             
        const response = chakram.get("https://petstore.swagger.io/v2/user/testnihal181200");
        expect(response).to.have.status(404);
        expect(response).to.comprise.of.json(resBody); 
        expect(response).to.have.header('content-type' , 'application/json'); 
        return chakram.wait();
    });

    it("POST - CreatetUser" , function () {
        const resBody ={
            "code": 200,
            "type": "unknown",
            "message": "1861616119"
        };
        const body = {
            "id": 1861616119,
            "username": "testnihal1812890",
            "firstName": "test66",
            "lastName": "nihal66",
            "email": "nihal.cevik.test@test.com",
            "password": "test18",
            "phone": "05312345679",
            "userStatus": 0
          }
        const response = chakram.post("https://petstore.swagger.io/v2/user", body);
        expect(response).to.have.status(200);
        expect(response).to.comprise.of.json(resBody);
        return chakram.wait();
    });

    it("GET - GetUserInfo", function () {
        
        const resBody = {
            "id": 18616161191,
            "username": "testnihal181289099",
            "firstName": "test661",
            "lastName": "nihal661",
            "email": "nihal.cevik.test11@test.com",
            "password": "test181",
            "phone": "053123456791",
            "userStatus": 1
         };
        
        const response = chakram.get("https://petstore.swagger.io/v2/user/testnihal181289099");
        expect(response).to.have.status(200);
        expect(response).to.comprise.of.json(resBody); 
        expect(response).to.have.header('content-type' , 'application/json'); 
        return chakram.wait();
    });

    it("DELETE - DeletetUser" , function () {
        const resBody ={
            "code": 200,
            "type": "unknown",
            "message": "testnihal181289099"
        };

        const response = chakram.delete("https://petstore.swagger.io/v2/user/testnihal181289099");
        expect(response).to.have.status(200);
        expect(response).to.comprise.of.json(resBody); 
        expect(response).to.have.header('content-type' , 'application/json'); 
        return chakram.wait();
    });

    it("PUT - UpdateUserInfo" , function () {
        const resBody ={
            "code": 200,
            "type": "unknown",
            "message": "18616161191"
        }
        const body = {
            "id": 18616161191,
            "username": "testnihal181289099",
            "firstName": "test661",
            "lastName": "nihal661",
            "email": "nihal.cevik.test11@test.com",
            "password": "test181",
            "phone": "053123456791",
            "userStatus": 1
          };
        const response = chakram.put("https://petstore.swagger.io/v2/user/testnihal18", body);
        expect(response).to.have.status(200);
        expect(response).to.comprise.of.json(resBody); 
        expect(response).to.have.header('content-type' , 'application/json'); 
        return chakram.wait();
    });



});
    