package bio.knowledge.server.api;

import bio.knowledge.server.model.Query;
import bio.knowledge.server.model.Response;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-09T20:52:49.953-07:00")

@Api(value = "query", description = "the query API")
public interface QueryApi {

    @ApiOperation(value = "Query using a predefined query type", notes = "", response = Response.class, tags={ "query", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Response.class),
        @ApiResponse(code = 400, message = "Invalid status value", response = Response.class) })
    @RequestMapping(value = "/query",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Response> query(@ApiParam(value = "Query information to be submitted" ,required=true ) @RequestBody Query body);

}
