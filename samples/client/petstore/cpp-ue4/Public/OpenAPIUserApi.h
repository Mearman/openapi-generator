/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#pragma once

#include "CoreMinimal.h"
#include "OpenAPIBaseModel.h"

namespace OpenAPI 
{

class OPENAPI_API OpenAPIUserApi
{
public:
	OpenAPIUserApi();
	~OpenAPIUserApi();

	/* Sets the URL Endpoint. 
	* Note: several fallback endpoints can be configured in request retry policies, see Request::SetShouldRetry */
	void SetURL(const FString& Url);

	/* Adds global header params to all requests */
	void AddHeaderParam(const FString& Key, const FString& Value);
	void ClearHeaderParams();
	
	/* Sets the retry manager to the user-defined retry manager. User must manage the lifetime of the retry manager.
	* If no retry manager is specified and a request needs retries, a default retry manager will be used. 
	* See also: Request::SetShouldRetry */
	void SetHttpRetryManager(FHttpRetrySystem::FManager& RetryManager);
	FHttpRetrySystem::FManager& GetHttpRetryManager();

	class CreateUserRequest;
	class CreateUserResponse;
	class CreateUsersWithArrayInputRequest;
	class CreateUsersWithArrayInputResponse;
	class CreateUsersWithListInputRequest;
	class CreateUsersWithListInputResponse;
	class DeleteUserRequest;
	class DeleteUserResponse;
	class GetUserByNameRequest;
	class GetUserByNameResponse;
	class LoginUserRequest;
	class LoginUserResponse;
	class LogoutUserRequest;
	class LogoutUserResponse;
	class UpdateUserRequest;
	class UpdateUserResponse;
	
    DECLARE_DELEGATE_OneParam(FCreateUserDelegate, const CreateUserResponse&);
    DECLARE_DELEGATE_OneParam(FCreateUsersWithArrayInputDelegate, const CreateUsersWithArrayInputResponse&);
    DECLARE_DELEGATE_OneParam(FCreateUsersWithListInputDelegate, const CreateUsersWithListInputResponse&);
    DECLARE_DELEGATE_OneParam(FDeleteUserDelegate, const DeleteUserResponse&);
    DECLARE_DELEGATE_OneParam(FGetUserByNameDelegate, const GetUserByNameResponse&);
    DECLARE_DELEGATE_OneParam(FLoginUserDelegate, const LoginUserResponse&);
    DECLARE_DELEGATE_OneParam(FLogoutUserDelegate, const LogoutUserResponse&);
    DECLARE_DELEGATE_OneParam(FUpdateUserDelegate, const UpdateUserResponse&);
    
    FHttpRequestPtr CreateUser(const CreateUserRequest& Request, const FCreateUserDelegate& Delegate = FCreateUserDelegate()) const;
    FHttpRequestPtr CreateUsersWithArrayInput(const CreateUsersWithArrayInputRequest& Request, const FCreateUsersWithArrayInputDelegate& Delegate = FCreateUsersWithArrayInputDelegate()) const;
    FHttpRequestPtr CreateUsersWithListInput(const CreateUsersWithListInputRequest& Request, const FCreateUsersWithListInputDelegate& Delegate = FCreateUsersWithListInputDelegate()) const;
    FHttpRequestPtr DeleteUser(const DeleteUserRequest& Request, const FDeleteUserDelegate& Delegate = FDeleteUserDelegate()) const;
    FHttpRequestPtr GetUserByName(const GetUserByNameRequest& Request, const FGetUserByNameDelegate& Delegate = FGetUserByNameDelegate()) const;
    FHttpRequestPtr LoginUser(const LoginUserRequest& Request, const FLoginUserDelegate& Delegate = FLoginUserDelegate()) const;
    FHttpRequestPtr LogoutUser(const LogoutUserRequest& Request, const FLogoutUserDelegate& Delegate = FLogoutUserDelegate()) const;
    FHttpRequestPtr UpdateUser(const UpdateUserRequest& Request, const FUpdateUserDelegate& Delegate = FUpdateUserDelegate()) const;
    
private:
    void OnCreateUserResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FCreateUserDelegate Delegate) const;
    void OnCreateUsersWithArrayInputResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FCreateUsersWithArrayInputDelegate Delegate) const;
    void OnCreateUsersWithListInputResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FCreateUsersWithListInputDelegate Delegate) const;
    void OnDeleteUserResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FDeleteUserDelegate Delegate) const;
    void OnGetUserByNameResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FGetUserByNameDelegate Delegate) const;
    void OnLoginUserResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FLoginUserDelegate Delegate) const;
    void OnLogoutUserResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FLogoutUserDelegate Delegate) const;
    void OnUpdateUserResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FUpdateUserDelegate Delegate) const;
    
	FHttpRequestRef CreateHttpRequest(const Request& Request) const;
	bool IsValid() const;
	void HandleResponse(FHttpResponsePtr HttpResponse, bool bSucceeded, Response& InOutResponse) const;

	FString Url;
	TMap<FString,FString> AdditionalHeaderParams;
	mutable FHttpRetrySystem::FManager* RetryManager = nullptr;
	mutable TUniquePtr<HttpRetryManager> DefaultRetryManager;
};
	
}