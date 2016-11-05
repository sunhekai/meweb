package org.sunhk.meweb.dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.sunhk.meweb.model.Task;
import org.sunhk.meweb.model.TaskExample;

public interface TaskMapper {
    int countByExample(TaskExample example);

    int deleteByExample(TaskExample example);

    int deleteByPrimaryKey(Long taskid);

    int insert(Task record);

    int insertSelective(Task record);

    List<Task> selectByExample(TaskExample example);

    Task selectByPrimaryKey(Long taskid);

    int updateByExampleSelective(@Param("record") Task record, @Param("example") TaskExample example);

    int updateByExample(@Param("record") Task record, @Param("example") TaskExample example);

    int updateByPrimaryKeySelective(Task record);

    int updateByPrimaryKey(Task record);
    
    List<Task> selectUndoTask();
}