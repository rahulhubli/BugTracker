package com.sprint.service;

import java.util.List;

public interface StaffService {
	//public List<Complaint> getAllComplaints();
	
	public void findComplaint(Integer complaint_id);

	public String viewComplaint(Integer complaint_id);

	public Staff forwardToOthers(Integer staff_id);

	public String viewStatus(Integer complaint_id);
	
	
	// public List<Staff> deleteProduct(Integer productId);
}
