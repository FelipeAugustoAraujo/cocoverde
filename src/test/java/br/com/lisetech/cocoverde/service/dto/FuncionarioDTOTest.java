package br.com.lisetech.cocoverde.service.dto;

import static org.assertj.core.api.Assertions.assertThat;

import br.com.lisetech.cocoverde.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class FuncionarioDTOTest {

    @Test
    void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(FuncionarioDTO.class);
        FuncionarioDTO funcionarioDTO1 = new FuncionarioDTO();
        funcionarioDTO1.setId(1L);
        FuncionarioDTO funcionarioDTO2 = new FuncionarioDTO();
        assertThat(funcionarioDTO1).isNotEqualTo(funcionarioDTO2);
        funcionarioDTO2.setId(funcionarioDTO1.getId());
        assertThat(funcionarioDTO1).isEqualTo(funcionarioDTO2);
        funcionarioDTO2.setId(2L);
        assertThat(funcionarioDTO1).isNotEqualTo(funcionarioDTO2);
        funcionarioDTO1.setId(null);
        assertThat(funcionarioDTO1).isNotEqualTo(funcionarioDTO2);
    }
}
