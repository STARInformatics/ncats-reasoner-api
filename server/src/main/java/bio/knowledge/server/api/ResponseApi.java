package bio.knowledge.server.api;

import bio.knowledge.server.model.Response;
import bio.knowledge.server.model.ResponseFeedback;

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

@Api(value = "response", description = "the response API")
public interface ResponseApi {

    @ApiOperation(value = "Request stored responses and results", notes = "", response = Response.class, tags={ "response", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Response.class),
        @ApiResponse(code = 404, message = "Response_id not found", response = Response.class) })
    @RequestMapping(value = "/response/{response_id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Response> getResponse(@ApiParam(value = "Integer identifier of the response to return",required=true ) @PathVariable("responseId") Integer responseId);


    @ApiOperation(value = "Request stored feedback for this response", notes = "", response = ResponseFeedback.class, tags={ "response", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ResponseFeedback.class),
        @ApiResponse(code = 404, message = "Response_id not found", response = ResponseFeedback.class) })
    @RequestMapping(value = "/response/{response_id}/feedback",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ResponseFeedback> getResponseFeedback(@ApiParam(value = "Integer identifier of the response to return",required=true ) @PathVariable("responseId") Integer responseId);

}
