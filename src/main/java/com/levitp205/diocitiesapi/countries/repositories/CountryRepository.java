package com.levitp205.diocitiesapi.countries.repositories;



import com.levitp205.diocitiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
