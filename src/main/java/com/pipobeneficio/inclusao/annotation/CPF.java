package com.pipobeneficio.inclusao.annotation;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Max(value = 99999999999L, message = "O CPF deve conter 11 dgitos") 
@Min(value = 10000000000L, message = "O CPF deve conter 11 digitos" )
public @interface CPF {

}
