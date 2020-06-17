package com.fahrul.os.api.common;



import com.fahrul.os.api.entity.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionRequest {

	
    private Order order;
	
    private Payment payment;
}
