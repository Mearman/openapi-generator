/*
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.controller;

import io.micronaut.http.annotation.*;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.core.convert.format.Format;
import reactor.core.publisher.Mono;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.exceptions.HttpStatusException;
import org.openapitools.model.Order;
import jakarta.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", comments = "Generator version: 7.5.0-SNAPSHOT")
@Controller
@Tag(name = "Store", description = "The Store API")
public class StoreController {
    /**
     * Delete purchase order by ID
     * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
     *
     * @param orderId ID of the order that needs to be deleted (required)
     */
    @Operation(
        operationId = "deleteOrder",
        summary = "Delete purchase order by ID",
        responses = {
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Order not found")
        },
        parameters = {
            @Parameter(name = "orderId", description = "ID of the order that needs to be deleted", required = true)
        }
    )
    @Delete(uri="/store/order/{orderId}")
    @Produces(value = {})
    public Mono<Void> deleteOrder(
        @PathVariable(value="orderId") @NotNull String orderId
    ) {
        // TODO implement deleteOrder();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Returns pet inventories by status
     * Returns a map of status codes to quantities
     *
     * @return Map&lt;String, Integer&gt;
     */
    @Operation(
        operationId = "getInventory",
        summary = "Returns pet inventories by status",
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Map.class))
            })
        },
        security = {
            @SecurityRequirement(name = "api_key")
        }
    )
    @Get(uri="/store/inventory")
    @Produces(value = {"application/json"})
    public Mono<Map<String, Integer>> getInventory() {
        // TODO implement getInventory();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Find purchase order by ID
     * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generate exceptions
     *
     * @param orderId ID of pet that needs to be fetched (required)
     * @return Order
     */
    @Operation(
        operationId = "getOrderById",
        summary = "Find purchase order by ID",
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/xml", schema = @Schema(implementation = Order.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = Order.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Order not found")
        },
        parameters = {
            @Parameter(name = "orderId", description = "ID of pet that needs to be fetched", required = true)
        }
    )
    @Get(uri="/store/order/{orderId}")
    @Produces(value = {"application/xml", "application/json"})
    public Mono<Order> getOrderById(
        @PathVariable(value="orderId") @NotNull @Min(1L) @Max(5L) Long orderId
    ) {
        // TODO implement getOrderById();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Place an order for a pet
     * 
     *
     * @param order order placed for purchasing the pet (required)
     * @return Order
     */
    @Operation(
        operationId = "placeOrder",
        summary = "Place an order for a pet",
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/xml", schema = @Schema(implementation = Order.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = Order.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid Order")
        },
        parameters = {
            @Parameter(name = "order", description = "order placed for purchasing the pet", required = true)
        }
    )
    @Post(uri="/store/order")
    @Produces(value = {"application/xml", "application/json"})
    @Consumes(value = {"application/json"})
    public Mono<Order> placeOrder(
        @Body @NotNull @Valid Order order
    ) {
        // TODO implement placeOrder();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }

}
