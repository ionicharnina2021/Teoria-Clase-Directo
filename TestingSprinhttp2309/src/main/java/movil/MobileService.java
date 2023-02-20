package movil;

import static org.assertj.core.api.Assertions.filter;

import java.util.List;

public class MobileService {
	
	
	
	public List<MobileDTO> getMobileFilter(MobileFilter mobileFilter){
		return mobilRepo.findAllByPrecioBetweeen(mobileFilter.getPrecio().getMin(),mobileFilter.getPrecio().getMax())
		.filter((movilAlmacenamiento)->{mobileFilter.getAlmacenamiento().isBetween(movil.getAlmacenamiento());})
		.filter((pantalla)->{})
		.filter((ram)->{});
	}

}
