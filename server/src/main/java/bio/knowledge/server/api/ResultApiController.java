package bio.knowledge.server.api;

import bio.knowledge.server.model.Feedback;
import bio.knowledge.server.model.Result;
import bio.knowledge.server.model.ResultFeedback;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-09T20:43:13.676-07:00")

@Controller
public class ResultApiController implements ResultApi {



    public ResponseEntity<Result> getResult(@ApiParam(value = "Integer identifier of the result to return",required=true ) @PathVariable("resultId") Integer resultId) {
        // do some magic!
        return new ResponseEntity<Result>(HttpStatus.OK);
    }

    public ResponseEntity<ResultFeedback> getResultFeedback(@ApiParam(value = "Integer identifier of the result to return",required=true ) @PathVariable("resultId") Integer resultId) {
        // do some magic!
        return new ResponseEntity<ResultFeedback>(HttpStatus.OK);
    }

    public ResponseEntity<Void> postResultFeedback(@ApiParam(value = "Integer identifier of the result to return",required=true ) @PathVariable("resultId") Integer resultId,
        @ApiParam(value = "Comment information" ,required=true ) @RequestBody Feedback body) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
