package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        OutsourcedPart thePart = null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();

        //preloaded parts
        if (productRepository.count() == 0 && partRepository.count() == 0) {
            OutsourcedPart tires = new OutsourcedPart();
            tires.setCompanyName("Michelin");
            tires.setName("Michelin Pilot Sport 4s");
            tires.setInv(20);
            tires.setPrice(350.0);
            tires.setId(100L);
            tires.setMinInv(1);
            tires.setMaxInv(100);
            outsourcedPartRepository.save(tires);
            thePart = null;
            outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for (OutsourcedPart part : outsourcedParts) {
                if (part.getName().equals("Michelin Pilot Sport 4s")) thePart = part;
            }

            OutsourcedPart ktuner = new OutsourcedPart();
            ktuner.setCompanyName("KTuner LLC");
            ktuner.setName("KTuner");
            ktuner.setInv(28);
            ktuner.setPrice(230.0);
            ktuner.setId(101L);
            ktuner.setMinInv(1);
            ktuner.setMaxInv(40);
            outsourcedPartRepository.save(ktuner);
            thePart = null;
            outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for (OutsourcedPart part : outsourcedParts) {
                if (part.getName().equals("KTuner")) thePart = part;
            }

            OutsourcedPart wheels = new OutsourcedPart();
            wheels.setCompanyName("BBS");
            wheels.setName("REV7");
            wheels.setInv(49);
            wheels.setPrice(915.0);
            wheels.setId(102L);
            wheels.setMinInv(4);
            wheels.setMaxInv(100);
            outsourcedPartRepository.save(wheels);
            thePart = null;
            outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for (OutsourcedPart part : outsourcedParts) {
                if (part.getName().equals("REV7")) thePart = part;
            }

            OutsourcedPart mat = new OutsourcedPart();
            mat.setCompanyName("Weather Tech");
            mat.setName("Weather Tech Floor Mats");
            mat.setInv(201);
            mat.setPrice(99.0);
            mat.setId(103L);
            mat.setMinInv(0);
            mat.setMaxInv(300);
            outsourcedPartRepository.save(mat);
            thePart = null;
            outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for (OutsourcedPart part : outsourcedParts) {
                if (part.getName().equals("Weather Tech Floor Mats")) thePart = part;
            }

            OutsourcedPart exhaust = new OutsourcedPart();
            exhaust.setCompanyName("Valvetronic");
            exhaust.setName("Straight Pipes open valve");
            exhaust.setInv(12);
            exhaust.setPrice(2300.0);
            exhaust.setId(104L);
            exhaust.setMinInv(0);
            exhaust.setMaxInv(20);
            outsourcedPartRepository.save(exhaust);
            thePart = null;
            outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for (OutsourcedPart part : outsourcedParts) {
                if (part.getName().equals("Straight Pipes open valve")) thePart = part;
            }

            System.out.println(thePart.getCompanyName());

            for (OutsourcedPart part : outsourcedParts) {
                System.out.println(part.getName() + " " + part.getCompanyName());
            }

            Product lexus = new Product("Lexus IS 500", 65000.0, 6);
            Product honda = new Product("Honda Accord 2.0T", 29000.0, 18);
            Product bmw = new Product("BMW M340i xDrive", 63000.0, 9);
            Product toyota = new Product("Toyota Rav4 XSE", 34000.0, 32);
            Product audi = new Product("Audi RS6 Avant", 126000.0, 1);
            productRepository.save(lexus);
            productRepository.save(honda);
            productRepository.save(bmw);
            productRepository.save(toyota);
            productRepository.save(audi);

            System.out.println("Started in Bootstrap");
            System.out.println("Number of Products" + productRepository.count());
            System.out.println(productRepository.findAll());
            System.out.println("Number of Parts" + partRepository.count());
            System.out.println(partRepository.findAll());
        }
    }
}
