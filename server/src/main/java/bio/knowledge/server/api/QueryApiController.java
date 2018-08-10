package bio.knowledge.server.api;

import bio.knowledge.server.model.Query;
import bio.knowledge.server.model.Response;

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
public class QueryApiController implements QueryApi {



    public ResponseEntity<Response> query(@ApiParam(value = "Query information to be submitted" ,required=true ) @RequestBody Query body) {
        // do some magic!
        return new ResponseEntity<Response>(HttpStatus.OK);
    }

}
