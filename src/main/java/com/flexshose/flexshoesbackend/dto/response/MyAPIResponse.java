package com.flexshose.flexshoesbackend.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Builder
@Data
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@FieldDefaults(level =  AccessLevel.PRIVATE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MyAPIResponse <T> {
	@Builder.Default
	int code = 1000; 
	@Builder.Default
	String message = "Success";
	T result;
}