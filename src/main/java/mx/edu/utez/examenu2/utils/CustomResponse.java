package mx.edu.utez.examenu2.utils;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class CustomResponse <T> {
    T data;
    Boolean error;
    int StatusCode;
    String message;

}
