package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.Client;
import java.util.UUID;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.SecurityContext;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", comments = "Generator version: 7.5.0-SNAPSHOT")
public class AnotherFakeApiServiceImpl extends AnotherFakeApiService {
    @Override
    public Response call123testSpecialTags( @NotNull UUID uuidTest, Client body, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
