package bio.knowledge.server.api;

import bio.knowledge.server.model.Response;
import bio.knowledge.server.model.ResponseFeedback;

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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-09T20:52:49.953-07:00")

@Controller
public class ResponseApiController implements ResponseApi {



    public ResponseEntity<Response> getResponse(@ApiParam(value = "Integer identifier of the response to return",required=true ) @PathVariable("responseId") Integer responseId) {
        // do some magic!
        return new ResponseEntity<Response>(HttpStatus.OK);
    }

    public ResponseEntity<ResponseFeedback> getResponseFeedback(@ApiParam(value = "Integer identifier of the response to return",required=true ) @PathVariable("responseId") Integer responseId) {
        // do some magic!
        return new ResponseEntity<ResponseFeedback>(HttpStatus.OK);
    }

}
