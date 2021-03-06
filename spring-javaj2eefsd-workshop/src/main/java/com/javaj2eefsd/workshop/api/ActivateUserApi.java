/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.javaj2eefsd.workshop.api;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaj2eefsd.workshop.api.ApiResponseMessage;
import com.javaj2eefsd.workshop.model.ActivateUser;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;

//IDIOM:Item-0032: Add a useful javadoc comment to each class,interface,Enum declaration.
/**
* This is ActivateUserApi interface this class is to create the API resource
*/
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-06T07:36:56.089+05:30")

@Api(value = "activateUser", description = "the activateUser API")
public interface ActivateUserApi {
    
    @ApiOperation(value = "Activating the User.", nickname = "activateUserLoginAccount", notes = "Activating the user by validating with OTP.", response = ActivateUser.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "register", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Activating user.", response = ActivateUser.class),
        @ApiResponse(code = 404, message = "Activating the user by validating with OTP Failed.") })
    @RequestMapping(value = "/activateUser",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<ApiResponseMessage> activateUserLoginAccount(
		@ApiParam(value = "Activating user." ,required=true )  @Valid @RequestBody ActivateUser body)
		throws Exception;
   
   
}
