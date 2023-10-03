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
        if(medicine !=null && medicine)
    }
}