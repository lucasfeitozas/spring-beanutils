package br.com.teste.framework.beanutils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.BeanUtils;

import br.com.teste.framework.beanutils.dto.AgendaDTO;
import br.com.teste.framework.beanutils.dto.BarcoDTO;
import br.com.teste.framework.beanutils.dto.PessoaDTO;
import br.com.teste.framework.beanutils.entity.Agenda;
import br.com.teste.framework.beanutils.entity.Barco;
import br.com.teste.framework.beanutils.entity.EnumTipoDocumento;
import br.com.teste.framework.beanutils.entity.Passageiro;
import br.com.teste.framework.beanutils.entity.Pessoa;

public class BeanUtilsTest {

	/**
	 * Teste simples de copia entre entity e DTO
	 * @author Lucas Feitozas (<a href="mailto:lucasfeitozas@gmail.com">lucasfeitozas@gmail.com</a>)
	 * @since 9 de abr de 2016 11:00:48
	 */
	@Test
	public void beanUtilsTest001(){
	
		Agenda agenda = new Agenda("UTIL AGENDA", new BigDecimal("10.00"), new Date(), 1);
		AgendaDTO agendaDTO = new AgendaDTO();
		BeanUtils.copyProperties(agenda, agendaDTO);;
		
		System.out.println(agendaDTO);
		Assert.assertTrue(agendaDTO.getNome().equals(agenda.getNome()));
		Assert.assertTrue(agendaDTO.getValor().equals(agenda.getValor()));
		Assert.assertTrue(agendaDTO.getVersao().equals(agenda.getVersao()));
	}
	
	/**
	 * conversao de entity com collections para DTO
	 * @author Lucas Feitozas (<a href="mailto:lucasfeitozas@gmail.com">lucasfeitozas@gmail.com</a>)
	 * @since 9 de abr de 2016 11:01:02
	 */
	@Test
	public void beanUtilsTest002(){
		List<Passageiro> listaPassageiro = new ArrayList<>();
		listaPassageiro.add( new Passageiro("Antonio Silva", 20, EnumTipoDocumento.CPF));
		listaPassageiro.add( new Passageiro("Maria do Carmo", 18, EnumTipoDocumento.RG));
		listaPassageiro.add( new Passageiro("José da Costa", 30, EnumTipoDocumento.CPF));
		listaPassageiro.add( new Passageiro("Gorete de Almeida", 24, EnumTipoDocumento.RG));
		
		Barco barco = new Barco(1, "Capitão América", 200, listaPassageiro);
		
		BarcoDTO barcoDTO = new BarcoDTO();
		BeanUtils.copyProperties(barco, barcoDTO);
		System.out.println(barcoDTO);
		
		Assert.assertTrue(barco.getNome().equals(barcoDTO.getNome()));
	}
	
	/**
	 * conversao de entity com referencia circular para DTO
	 * @author Lucas Feitozas (<a href="mailto:lucasfeitozas@gmail.com">lucasfeitozas@gmail.com</a>)
	 * @since 9 de abr de 2016 11:01:25
	 */
	@Test
	public void beanUtilsTest003() {
		Pessoa marido = new Pessoa("João", 10, null);
		Pessoa esposa = new Pessoa("Maria", 10, null);
		marido.setConjuge(esposa);
		esposa.setConjuge(marido);

		PessoaDTO maridoDTO = new PessoaDTO();
		BeanUtils.copyProperties(marido, maridoDTO, new String[]{"conjuge"});		
		
		PessoaDTO esposaDTO = new PessoaDTO();
		BeanUtils.copyProperties(esposa, esposaDTO, new String[]{"conjuge"});	
		
		maridoDTO.setConjuge(esposaDTO);
		esposaDTO.setConjuge(maridoDTO);

		System.out.println(maridoDTO);
		System.out.println(esposaDTO);
		Assert.assertTrue(maridoDTO.getNome().equals(marido.getNome()));
//		final PropertyDescriptor[] propertyDescriptors = BeanUtils.getPropertyDescriptors(p.getClass());
//
//		PessoaDTO pessoaDTO = new PessoaDTO();
//
//		final BeanWrapper src = new BeanWrapperImpl(p);
//		final BeanWrapper trg = new BeanWrapperImpl(pessoaDTO);
//
//		for (final PropertyDescriptor propertyDescriptor : propertyDescriptors) {
//			
//			
//			System.out.println(propertyDescriptor.getValue("nome"));
//			System.out.println(propertyDescriptor.getValue("idade"));
//			System.out.println(propertyDescriptor.getValue("conjuge"));
//			String propName = propertyDescriptor.getName();
//			
//			Object propertyValue = src.getPropertyValue(propName);
//			System.out.println(propertyValue);
//			System.out.println(propName + " " + src.getPropertyValue(propName));
////			trg.setPropertyValue(propName, src.getPropertyValue(propName));
//		}
//
		Assert.assertTrue(true);
	}
}
