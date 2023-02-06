package co.develhope.springrepositories1.repositories;

import co.develhope.springrepositories1.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "car-repo",collectionResourceDescription = @Description("car description"),itemResourceDescription = @Description("single car"))
public interface CarRepository extends JpaRepository<Car, Long> {
}
