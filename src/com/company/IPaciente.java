package com.company;

import java.io.Serializable;
import java.util.List;

public interface IPaciente {
    List<String> obterDadosPessoais();
    List<String> obterDiagnostico(Medico medico) throws IllegalAccessException;
}
