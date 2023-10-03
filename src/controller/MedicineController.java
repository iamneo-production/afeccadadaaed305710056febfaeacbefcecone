package com.pharmacy.controller;
import com.pharmacy.model.Medicine;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/medicines")
public class MedicineController
{
    private Map< Integer, Medicine> medicineMap=new HashMap<>();
    @postMapping
    public boolean addMedicine(@RequestBody Medicine medicine)
    {
        if(medicine !=null && medicine.getMedicineId()>0)
        {
            medicineMap.put(medicine.getMedicineId,medicine);
            return true;
        }
        return false;
    }
}
@PutMapping("/{medicineId}")
public Medicine updateMedicine(@PathVariable int medicineId, @RequestBody Medicine updatedMedicine)
{
    if(medicineMap.containsKey(medicineId)&& updatedMedicine!=null)
    {
        Medicine existingMedicine=medicineMap.get(medicineId);
        existingMedicine.setMedicineName(updatedMedicine.getMedicineName());
        existingMedicine.setPrice(updatedMedicine)
    }
}