package org.sunhk.meweb.service;

import java.util.List;

import org.sunhk.meweb.model.Task;

public interface ITaskService {
	List<Task> selectUndoTask();
	
	public int insertTask(Task record);
}
