package UseCases.Command.Vuelos.Crear;

import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;

import Dto.VueloDto;

public class CrearVueloCommand_Test {

	@Test
	public void dataValid() {
		UUID key = UUID.randomUUID();
		VueloDto vueloDto = new VueloDto();
		vueloDto.setKey(key);
		CrearVueloCommand command = new CrearVueloCommand(vueloDto);
	}

	@Test
	public void constructorIsPrivate() {
		Assert.assertTrue(CrearVueloCommand.class.getConstructors()[0].canAccess(null));
	}
}
