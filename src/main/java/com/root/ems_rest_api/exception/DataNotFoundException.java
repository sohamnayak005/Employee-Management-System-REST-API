package com.root.ems_rest_api.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DataNotFoundException extends RuntimeException {

  String msg = "Data Not Found ";

}
