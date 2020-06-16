package guru.springfamework.services;


import de.jojobi.model.CustomerListDTO;
import de.jojobi.model.CustomerDTO;

import java.util.List;

/**
 * Created by jt on 9/27/17.
 */
public interface CustomerService {

    List<CustomerDTO> getAllCustomers();

    CustomerDTO getCustomerById(Long id);

    CustomerDTO createNewCustomer(CustomerDTO customerDTO);

    CustomerDTO saveCustomerByDTO(Long id, CustomerDTO customerDTO);

    CustomerDTO patchCustomer(Long id, CustomerDTO customerDTO);

    void deleteCustomerById(Long id);
}
