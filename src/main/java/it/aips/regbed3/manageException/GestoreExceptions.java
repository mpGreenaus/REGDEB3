package it.aips.regbed3.manageException;

import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GestoreExceptions {

	@ExceptionHandler(DataAccessException.class)
    public ResponseEntity<RispostaMessaggioErrore> handleDataAccessException(DataAccessException ex) {
    	RispostaMessaggioErrore erroreRisposta = new RispostaMessaggioErrore(ex.getMessage());
        return new ResponseEntity<>(erroreRisposta, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<RispostaMessaggioErrore> handleArithmeticException(ArithmeticException ex) {
    	RispostaMessaggioErrore erroreRisposta = new RispostaMessaggioErrore("Errore di calcolo: " + ex.getMessage());
        return new ResponseEntity<>(erroreRisposta, HttpStatus.BAD_REQUEST);
    }
    
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<RispostaMessaggioErrore> handlIllegalArgumentException(IllegalArgumentException ex) {
    	RispostaMessaggioErrore erroreRisposta = new RispostaMessaggioErrore("errore inatteso di tipo: "+ ex.getMessage());
        return new ResponseEntity<>(erroreRisposta, HttpStatus.BAD_REQUEST);
    }
}
