package br.com.andrebaroni.burger.store.api.infra.repository;

import br.com.andrebaroni.burger.store.api.domain.entity.PortionDiscount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Collection;
import java.util.UUID;

@Repository
public interface PortionDiscountRepository extends JpaRepository<PortionDiscount, UUID>, Serializable {

    Collection<PortionDiscount> findByActiveOrderById(Boolean active);
}
