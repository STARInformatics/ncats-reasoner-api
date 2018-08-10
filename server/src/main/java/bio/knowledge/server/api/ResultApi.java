package bio.knowledge.server.api;

import bio.knowledge.server.model.Feedback;
import bio.knowledge.server.model.Result;
import bio.knowledge.server.model.ResultFeedback;

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

@Api(value = "result", description = "the result API")
public interface ResultApi {

    @ApiOperation(value = "Request stored result", notes = "", response = Result.class, tags={ "result", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Result.class),
        @ApiResponse(code = 404, message = "result_id not found", response = Result.class) })
    @RequestMapping(value = "/result/{result_id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Result> getResult(@ApiParam(value = "Integer identifier of the result to return",required=true ) @PathVariable("resultId") Integer resultId);


    @ApiOperation(value = "Request stored feedback for this result", notes = "", response = ResultFeedback.class, tags={ "result", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ResultFeedback.class),
        @ApiResponse(code = 404, message = "result_id not found", response = ResultFeedback.class) })
    @RequestMapping(value = "/result/{result_id}/feedback",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ResultFeedback> getResultFeedback(@ApiParam(value = "Integer identifier of the result to return",required=true ) @PathVariable("resultId") Integer resultId);


    @ApiOperation(value = "Store feedback for a particular result", notes = "", response = Void.class, tags={ "result", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Void.class),
        @ApiResponse(code = 400, message = "Invalid status value", response = Void.class) })
    @RequestMapping(value = "/result/{result_id}/feedback",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> postResultFeedback(@ApiParam(value = "Integer identifier of the result to return",required=true ) @PathVariable("resultId") Integer resultId,
        @ApiParam(value = "Comment information" ,required=true ) @RequestBody Feedback body);

}
