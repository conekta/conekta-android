package io.conekta;

import io.conekta.model.Customer;
import io.conekta.model.CustomerResponse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerApiTest {
    CustomersApi instance = new CustomersApi();
    String apiKey = "key_xxx";
    @Before
    public void config (){
        instance.setBasePath(BaseTest.getBasePath());
        instance.setApiKey( apiKey );
    }
    
    @Test
    public void CreateCustomerTest() throws ApiException {
        Customer customer = new Customer();
        customer.setName("test dot");
        customer.setEmail("test@conekta.com");
        customer.setPhone("+573143159054");
        
        CustomerResponse response= instance.createCustomer(customer, "es", null);
        
        assertEquals("cus_2tXyF9BwPG14UMkkg", response.getId());

    }
}