package com.flexshose.flexshoesbackend.service.impl;


import com.flexshose.flexshoesbackend.dto.CustomersDTO;
import com.flexshose.flexshoesbackend.mapper.CustomerMapper;
import com.flexshose.flexshoesbackend.repository.CustomerRepository;
import com.flexshose.flexshoesbackend.service.CustomerService;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class CustomerServiceImpl implements CustomerService {
    CustomerRepository customerRepository;
    CustomerMapper customerMapper;
    @Override
    public List<CustomersDTO> getAllCustomer() {
        return customerRepository.findAll().stream()
                .map(item -> customerMapper.mapToCustomerDTO(item))
                .collect(Collectors.toList());
    }
	@Override
	public CustomersDTO save(CustomersDTO customersDTO) {
		// TODO Auto-generated method stub
		return  customerMapper.mapToCustomerDTO(customerRepository.save(customerMapper.mapToCustomer(customersDTO)));
	}
	@Override
	public CustomersDTO findByID(Integer id) {
		// TODO Auto-generated method stub
		return customerMapper.mapToCustomerDTO(customerRepository.findById(id).get());
	}
}
