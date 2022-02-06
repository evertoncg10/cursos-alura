package br.com.alura.rh.service;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriodicidadeEntreReajustes implements ValidacaoReajuste{

    @Override
    public void validar(Funcionario funcionario, BigDecimal aumento) {
        LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();
        long mesesDeseUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
        if (mesesDeseUltimoReajuste < 6) {
            throw new ValidacaoException("Intervalo entre reajustes deve ser no minimo de 6 meses");
        }
    }
}
