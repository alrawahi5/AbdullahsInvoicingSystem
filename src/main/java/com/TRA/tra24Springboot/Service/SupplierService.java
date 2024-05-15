package com.TRA.tra24Springboot.Service;

import com.TRA.tra24Springboot.DTO.SupplierDTO;
import com.TRA.tra24Springboot.Models.ContactDetails;
import com.TRA.tra24Springboot.Models.Order;
import com.TRA.tra24Springboot.Models.Product;
import com.TRA.tra24Springboot.Models.Supplier;
import com.TRA.tra24Springboot.Repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SupplierService {

    @Autowired
    SupplierRepository supplierRepository;

    public Supplier addSupplier(Supplier supplier){
        /*String companyName;
        String country;
        ContactDetails contactDetails;
        List<Product> productsOffered;
        Date nextDeliveryTime;
        List<Product> expectedProducts;
        String complaints;
        String paymentMethods; //TODO: Enum for payment methods
        String shippingMethods;
        String minimumOrderQuantity;
        List<Order> orders;*/

        supplier.setCompanyName("Samail Technology");
        supplier.setCountry("Oman");
        supplier.getContactDetails();
        supplier.getProductsOffered();
        supplier.setNextDeliveryTime(new Date());
        supplier.getExpectedProducts();
        supplier.setComplaints("None");
        supplier.setPaymentMethods("However the customer wishes");
        supplier.setShippingMethods("Vehicles, Airplanes, Bikes, and Ships");
        supplier.setMinimumOrderQuantity("1");
        supplier.getOrders();

        return supplierRepository.save(supplier);
    }

    public String deleteSupplier(Integer id){
      Supplier  supplier = supplierRepository.findById(id).get();
        if (supplier.getId().equals(id)) {
            supplier.setIsActive(Boolean.FALSE);
            System.out.println(supplier.toString());
        }
        return "Success";
    }

    public Supplier updateSupplier(Supplier supplier){
        /*String companyName;
        String country;
        ContactDetails contactDetails;
        List<Product> productsOffered;
        Date nextDeliveryTime;
        List<Product> expectedProducts;
        String complaints;
        String paymentMethods; //TODO: Enum for payment methods
        String shippingMethods;
        String minimumOrderQuantity;
        List<Order> orders;*/

        String companyName = supplier.getCompanyName();
        ContactDetails contactDetails = supplier.getContactDetails();
        List<Product> productList = supplier.getProductsOffered();
        Date deliveryTime = supplier.getNextDeliveryTime();
        List<Product> expectedProdicts = supplier.getExpectedProducts();
        String complaints = supplier.getComplaints();
        String paymentMethods = supplier.getPaymentMethods();
        String shipmentMethod = supplier.getShippingMethods();
        String minnimumQuantity = supplier.getMinimumOrderQuantity();
        List<Order> orderList = supplier.getOrders();

        supplier.setCompanyName(companyName);
        supplier.setContactDetails(contactDetails);
        supplier.setProductsOffered(productList);
        supplier.setNextDeliveryTime(deliveryTime);
        supplier.setExpectedProducts(expectedProdicts);
        supplier.setComplaints(complaints);
        supplier.setPaymentMethods(paymentMethods);
        supplier.setShippingMethods(shipmentMethod);
        supplier.setMinimumOrderQuantity(minnimumQuantity);
        supplier.setOrders(orderList);

        return supplierRepository.save(supplier);
    }

    public List<SupplierDTO> getSupplier(){
        List<Supplier> suppliers = supplierRepository.findAll();
        return SupplierDTO.convertToDTO(suppliers);
    }


}

