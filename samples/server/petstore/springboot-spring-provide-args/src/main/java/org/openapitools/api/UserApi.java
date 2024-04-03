/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.5.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.springframework.http.HttpHeaders;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.OffsetDateTime;
import java.security.Principal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.5.0-SNAPSHOT")
@Validated
@Tag(name = "user", description = "Operations about user")
public interface UserApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /user/login : Logs user into the system
     *
     * @param username The user name for login (required)
     * @param password The password for login in clear text (required)
     * @return successful operation (status code 200)
     *         or Invalid username/password supplied (status code 400)
     */
    @Operation(
        operationId = "loginUser",
        summary = "Logs user into the system",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid username/password supplied")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/login",
        produces = { "application/json" }
    )
    
    default ResponseEntity<String> loginUser(
        @NotNull @Parameter(name = "username", description = "The user name for login", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "username", required = true) String username,
        @NotNull @Parameter(name = "password", description = "The password for login in clear text", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "password", required = true) String password,
        @Parameter(hidden = true) @Value("${server.port}") String someValue,
        @Parameter(hidden = true) @RequestHeader(value="x-project-id", required = false) String someHeaderValue,
        @Parameter(hidden = true) @RequestHeader final HttpHeaders headers,
        @Parameter(hidden = true) Principal principal,
        @Parameter(hidden = true) @Qualifier("jacksonObjectMapper") ObjectMapper mapper
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /user/logout : Logs out current logged in user session
     *
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "logoutUser",
        summary = "Logs out current logged in user session",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "default", description = "successful operation")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/logout"
    )
    
    default ResponseEntity<Void> logoutUser(
        @Parameter(hidden = true) @Value("${server.port}") String somePropertyValue,
        @Parameter(hidden = true) @RequestHeader(value="x-project-id", required = false) String someHeaderValue,
        @Parameter(hidden = true) @RequestHeader final HttpHeaders headers,
        @Parameter(hidden = true) Principal principal,
        @Parameter(hidden = true) @Qualifier("jacksonObjectMapper") ObjectMapper mapper
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
