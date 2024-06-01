package in.raj.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(AppExceptionHandler.class);
    @ExceptionHandler(value = Exception.class)
    public String handle(Exception e){
        String msg = e.getMessage();
        logger.error(msg);
        return "errorPage";
    }
}
