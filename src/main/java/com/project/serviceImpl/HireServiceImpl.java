package com.project.serviceImpl;

import com.project.dao.HireDao;
import com.project.daoImpl.HireDaoImpl;
import com.project.dto.Hire;
import com.project.service.HireService;

public class HireServiceImpl implements HireService {
	HireDao hD = new HireDaoImpl();

	@Override
	public boolean hireRequest(Hire hire) {

		return hD.hireRequest(hire);
	}

	@Override
	public boolean hireCancelation(int hireId) {

		return hD.hireCancelation(hireId);
	}

}
