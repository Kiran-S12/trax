package com.trax.services;

import java.util.List;

import com.trax.entities.Lead;

public interface LeadService {
	public void saveLeadInfo(Lead lead);
	public Lead findLeadById(long id);
	public void deleteLeadById(long id);
	public List<Lead> getAllLeads();


}
