package com.TRA.tra24Springboot.DTO;

import com.TRA.tra24Springboot.Models.ContactDetails;
import com.TRA.tra24Springboot.Models.Order;
import com.TRA.tra24Springboot.Models.Product;
import com.TRA.tra24Springboot.Models.Supplier;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class SupplierDTO {
    String companyName;
    String country;
    ContactDetails contactDetails;
    List<Product> productsOffered;
    Date nextDeliveryTime;
    List<Product> expectedProducts;
    String complaints;
    String paymentMethods;
    String shippingMethods;
    String minimumOrderQuantity;
    List<OrderDOT> orders;


    public static SupplierDTO convertToDTO(Supplier supplier) {
        SupplierDTO supplierDTO = new SupplierDTO();
        supplierDTO.setCompanyName(supplier.getCompanyName());
        supplierDTO.setCountry(supplierDTO.getCountry());
        supplierDTO.setContactDetails(supplier.getContactDetails());
        supplierDTO.setProductsOffered(supplier.getProductsOffered());
        supplierDTO.setNextDeliveryTime(supplier.getNextDeliveryTime());
        supplierDTO.setExpectedProducts(supplier.getExpectedProducts());
        supplierDTO.setComplaints(supplierDTO.getComplaints());
        supplierDTO.setPaymentMethods(supplierDTO.getPaymentMethods());
        supplierDTO.setShippingMethods(supplierDTO.getShippingMethods());
        supplierDTO.setMinimumOrderQuantity(supplierDTO.getMinimumOrderQuantity());
        //supplierDTO.setOrders(supplier.getOrders());
        return supplierDTO;
    }

    public static List<SupplierDTO> convertToDTO(List<Supplier> supplierList) {
        List<SupplierDTO> supplierDOTS = new ArrayList<>();
        for (Supplier oldFromTheDB : supplierList) {
            SupplierDTO dto = convertToDTO(oldFromTheDB);
            supplierDOTS.add(dto);
        }
        return supplierDOTS;
    }
}
