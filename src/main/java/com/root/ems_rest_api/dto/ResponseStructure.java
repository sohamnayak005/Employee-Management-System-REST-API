package com.root.ems_rest_api.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class ResponseStructure<T> {
  String msg;
  T data;
  int statusCode;
}
