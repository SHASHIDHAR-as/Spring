package com.thinkconstructive.rest_demo.controller;

import com.thinkconstructive.rest_demo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudVendor")
public class CloudVendorAPIService
{
    CloudVendor cloudVendor;

   @GetMapping("{VendorId}")
    public CloudVendor getCloudVendordetails(String VendorId)
   {
       return cloudVendor;
//               new CloudVendor("C1","Vendor1",
//               "Address One","XXXXX");
   }

   @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
   {
       this.cloudVendor=cloudVendor;
       return  "Cloud Vendor Created Successfully";
   }

   @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
   {
       this.cloudVendor=cloudVendor;
       return  "Cloud Vendor Updated Successfully";
   }

   @DeleteMapping("{VendorId}")
    public String deleteCloudVendorDetails(String VendorId)
   {
       this.cloudVendor=null;
       return  "Cloud Vendor Deleted Successfully";
   }
}
