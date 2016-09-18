package org.sunhk.meweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sunhk.meweb.dao.TaskMapper;
import org.sunhk.meweb.model.Task;
import org.sunhk.meweb.service.ITaskService;

@Service(value="taskService")
public class TaskServiceImpl implements ITaskService{

	@Autowired
	TaskMapper taskMapper;
	public List<Task> selectUndoTask() {
		return null;
	}

	public int insertTask(Task record) {
		return taskMapper.insert(record);
	}

}
