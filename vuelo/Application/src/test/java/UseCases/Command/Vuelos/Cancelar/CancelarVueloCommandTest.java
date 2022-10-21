package UseCases.Command.Vuelos.Cancelar;

import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;

import Dto.VueloDto;
import UseCases.Command.Vuelos.Crear.CrearVueloCommand;

public class CancelarVueloCommandTest {
	@Test
	public void dataValid() {

		UUID key = UUID.randomUUID();
		VueloDto vueloDto = new VueloDto();
		vueloDto.setKey(key);
		CancelarVueloCommand command = new CancelarVueloCommand(vueloDto.key);
		Assert.assertEquals(key, command.vueloDto.getKey());
	}

	@Test
	public void constructorIsPrivate() {
		Assert.assertTrue(CrearVueloCommand.class.getConstructors()[0].canAccess(null));
	}
}
