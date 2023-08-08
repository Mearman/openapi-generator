/*
 * OpenAPI Petstore
 *
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package main

import (
	"log"
	"net/http"

	petstoreserver "github.com/GIT_USER_ID/GIT_REPO_ID/go"
)

func main() {
	log.Printf("Server started")

	PetAPIService := petstoreserver.NewPetAPIService()
	PetAPIController := petstoreserver.NewPetAPIController(PetAPIService)

	StoreAPIService := petstoreserver.NewStoreAPIService()
	StoreAPIController := petstoreserver.NewStoreAPIController(StoreAPIService)

	UserAPIService := petstoreserver.NewUserAPIService()
	UserAPIController := petstoreserver.NewUserAPIController(UserAPIService)

	router := petstoreserver.NewRouter(PetAPIController, StoreAPIController, UserAPIController)

	log.Fatal(http.ListenAndServe(":8080", router))
}