package springATM;

import org.springframework.data.repository.CrudRepository;

import springATM.ATMUser; //SUPERFLUOUS???

public interface BankUserRepository extends CrudRepository<ATMUser, Long> {

}
