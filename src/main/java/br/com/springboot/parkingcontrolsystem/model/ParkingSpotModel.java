package br.com.springboot.parkingcontrolsystem.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PARKING_SPOT")
public class ParkingSpotModel implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, unique = true, length = 10)
    private String parkingSpotNumber;

    @Column(nullable = false, unique = true, length = 7)
    private String licensePlateCar;

    @Column(nullable = false, length = 70)
    private String brandCar;

    @Column(nullable = false, length = 70)
    private String modelCar;

    @Column(nullable = false, length = 70)
    private String colorCar;

    @Column(nullable = false)
    private LocalDateTime registrationDate;

    @Column(nullable = false, length = 130)
    private String reponsibleName;

    @Column(nullable = false, length = 30)
    private String apartament;

    @Column(nullable = false, length = 30)
    private String block;

    public ParkingSpotModel() {}

    public UUID getId() {
        return this.id;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getParkingSpotNumber() {
        return parkingSpotNumber;
    }

    public void setParkingSpotNumber(String parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public String getLicensePlateCar() {
        return licensePlateCar;
    }

    public void setLicensePlateCar(String licensePlateCar) {
        this.licensePlateCar = licensePlateCar;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getReponsibleName() {
        return reponsibleName;
    }

    public void setReponsibleName(String reponsibleName) {
        this.reponsibleName = reponsibleName;
    }

    public String getApartament() {
        return apartament;
    }

    public void setApartament(String apartament) {
        this.apartament = apartament;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    @Override
    public String toString() {
        return "ParkingSpotModel [id=" + id + ", parkingSpotNumber=" + parkingSpotNumber + ", licensePlateCar="
                + licensePlateCar + ", brandCar=" + brandCar + ", modelCar=" + modelCar + ", colorCar=" + colorCar
                + ", registrationDate=" + registrationDate + ", reponsibleName=" + reponsibleName + ", apartament="
                + apartament + ", block=" + block + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((parkingSpotNumber == null) ? 0 : parkingSpotNumber.hashCode());
        result = prime * result + ((licensePlateCar == null) ? 0 : licensePlateCar.hashCode());
        result = prime * result + ((brandCar == null) ? 0 : brandCar.hashCode());
        result = prime * result + ((modelCar == null) ? 0 : modelCar.hashCode());
        result = prime * result + ((colorCar == null) ? 0 : colorCar.hashCode());
        result = prime * result + ((registrationDate == null) ? 0 : registrationDate.hashCode());
        result = prime * result + ((reponsibleName == null) ? 0 : reponsibleName.hashCode());
        result = prime * result + ((apartament == null) ? 0 : apartament.hashCode());
        result = prime * result + ((block == null) ? 0 : block.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ParkingSpotModel other = (ParkingSpotModel) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (parkingSpotNumber == null) {
            if (other.parkingSpotNumber != null)
                return false;
        } else if (!parkingSpotNumber.equals(other.parkingSpotNumber))
            return false;
        if (licensePlateCar == null) {
            if (other.licensePlateCar != null)
                return false;
        } else if (!licensePlateCar.equals(other.licensePlateCar))
            return false;
        if (brandCar == null) {
            if (other.brandCar != null)
                return false;
        } else if (!brandCar.equals(other.brandCar))
            return false;
        if (modelCar == null) {
            if (other.modelCar != null)
                return false;
        } else if (!modelCar.equals(other.modelCar))
            return false;
        if (colorCar == null) {
            if (other.colorCar != null)
                return false;
        } else if (!colorCar.equals(other.colorCar))
            return false;
        if (registrationDate == null) {
            if (other.registrationDate != null)
                return false;
        } else if (!registrationDate.equals(other.registrationDate))
            return false;
        if (reponsibleName == null) {
            if (other.reponsibleName != null)
                return false;
        } else if (!reponsibleName.equals(other.reponsibleName))
            return false;
        if (apartament == null) {
            if (other.apartament != null)
                return false;
        } else if (!apartament.equals(other.apartament))
            return false;
        if (block == null) {
            if (other.block != null)
                return false;
        } else if (!block.equals(other.block))
            return false;
        return true;
    }
}
