package br.com.springboot.parkingcontrolsystem.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.springboot.parkingcontrolsystem.model.ParkingSpotModel;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, Long> {
    
    public boolean existsByLicensePlateCar(String licensePlateCar);
    public boolean existsByParkingSpotNumber(String parkingSpotNumber);
    public boolean existsByApartamentAndBlock(String apartament, String block);
    public Optional<ParkingSpotModel> findById(UUID id);
}
