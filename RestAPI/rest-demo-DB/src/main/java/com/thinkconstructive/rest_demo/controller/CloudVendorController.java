package com.thinkconstructive.rest_demo.controller;

import com.thinkconstructive.rest_demo.model.CloudVendor;
import com.thinkconstructive.rest_demo.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudVendor")
public class CloudVendorController
{
    CloudVendorService cloudVendorService;
    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }


    //Read Specific Cloud Vendor Details
   @GetMapping("{VendorId}")
    public CloudVendor getCloudVendordetails(@PathVariable("VendorId") String VendorId)
   {
       return cloudVendorService.getCloudVendor(VendorId);
//               new CloudVendor("C1","Vendor1",
//               "Address One","XXXXX");
   }

   //Read All Cloud Vendor Details
   @GetMapping()
    public List<CloudVendor> getAllCloudVendordetails()
   {
       return cloudVendorService.getAllCloudVendors();
   }


   @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
   {
       cloudVendorService.createCloudVendor(cloudVendor);
       return  "Cloud Vendor Created Successfully";
   }

   @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
   {
       cloudVendorService.updateCloudVendor(cloudVendor);
       return  "Cloud Vendor Updated Successfully";
   }

   @DeleteMapping("{VendorId}")
    public String deleteCloudVendorDetails(@PathVariable("VendorId") String VendorId)
   {
       cloudVendorService.deleteCloudVendor(VendorId);
       return  "Cloud Vendor Deleted Successfully";
   }
}
