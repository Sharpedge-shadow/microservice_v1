package com.eazyschool.cards.exception;

import com.eazyschool.cards.repository.CardsRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CardAlreadyExistsException extends RuntimeException {
         public CardAlreadyExistsException(String message) {
             super(message);
         }

}
