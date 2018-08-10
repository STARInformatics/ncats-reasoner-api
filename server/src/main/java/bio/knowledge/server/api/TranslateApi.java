package bio.knowledge.server.api;

import bio.knowledge.server.model.Query;
import bio.knowledge.server.model.Question;

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

@Api(value = "translate", description = "the translate API")
public interface TranslateApi {

    @ApiOperation(value = "Translate natural language question into a standardized query", notes = "", response = Query.class, responseContainer = "List", tags={ "translate", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Query.class),
        @ApiResponse(code = 400, message = "Invalid status value", response = Query.class) })
    @RequestMapping(value = "/translate",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<List<Query>> translate(@ApiParam(value = "Question object that needs to be translated" ,required=true ) @RequestBody Question body);

}
