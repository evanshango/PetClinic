package com.evans.sfgpetclinic.bootstrap;

import com.evans.sfgpetclinic.model.Owner;
import com.evans.sfgpetclinic.model.Vet;
import com.evans.sfgpetclinic.services.OwnerService;
import com.evans.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Barry");
        owner1.setLastName("Allen");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Cisco");
        owner2.setLastName("Ramon");

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Ace");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Clint");
        vet2.setLastName("Barton");

        vetService.save(vet2);

        System.out.println("Loaded vets...");
    }
}
