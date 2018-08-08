package com.carvalho.pontointeligente.api.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.carvalho.pontointeligente.api.entities.Empresa;
import com.carvalho.pontointeligente.api.entities.Lancamento;
import com.carvalho.pontointeligente.api.repositories.EmpresaRepository;
import com.carvalho.pontointeligente.api.service.EmpresaService;
import com.carvalho.pontointeligente.api.service.LancamentoService;

@Service
public class LancamentoServiceImpl implements LancamentoService {

    @Override
    public Page<Lancamento> buscarPorFuncionarioId(Long funcionarioId, PageRequest pageRequest) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Optional<Lancamento> buscarPorId(Long id) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Lancamento persistir(Lancamento lancamento) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void remover(Long id) {
	// TODO Auto-generated method stub
	
    }

}
