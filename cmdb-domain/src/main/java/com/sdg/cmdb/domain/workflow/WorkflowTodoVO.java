package com.sdg.cmdb.domain.workflow;

import com.sdg.cmdb.domain.workflow.detail.WorkflowTodoDetailVO;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;


public class WorkflowTodoVO extends WorkflowTodoDO implements Serializable {

    private static final long serialVersionUID = -7525786606283551913L;

    private String applyViewTime;

    private List<WorkflowTodoDetailVO> todoDetails;

    private HashMap<String, WorkflowTodoUserDO> todoUserList;

    private WorkflowDO workflowDO;

    @Override
    public String toString() {
        return "WorkflowTodoVO{" +
                "id=" + getId() +
                ", wfId=" + getWfId() +
                ", wfName='" + getWfName() + '\'' +
                ", applyUserId=" + getApplyUserId() +
                ", applyDisplayName='" + getApplyDisplayName() + '\'' +
                ", todoPhase=" + getTodoPhase() +
                ", todoStatus=" + getTodoStatus() +
                ", gmtApply='" + getGmtApply() + '\'' +
                ", applyViewTime='" + applyViewTime + '\'' +


                ", gmtModify='" + getGmtModify() + '\'' +
                ", gmtCreate='" + getGmtCreate() + '\'' +
                '}';
    }

    public WorkflowTodoVO(WorkflowDO workflowDO, WorkflowTodoDO workflowTodoDO, List<WorkflowTodoDetailVO> todoDetails, HashMap<String, WorkflowTodoUserDO> todoUserList) {
        this.workflowDO = workflowDO;
        setId(workflowTodoDO.getId());
        setWfId(workflowTodoDO.getWfId());
        setWfName(workflowTodoDO.getWfName());
        setApplyUserId(workflowTodoDO.getApplyUserId());
        setApplyDisplayName(workflowTodoDO.getApplyDisplayName());
        setTodoPhase(workflowTodoDO.getTodoPhase());
        setTodoStatus(workflowTodoDO.getTodoStatus());
        setGmtApply(workflowTodoDO.getGmtApply());
        this.todoDetails = todoDetails;
        this.todoUserList = todoUserList;
    }

    public WorkflowTodoVO() {
    }

    public String getApplyViewTime() {
        return applyViewTime;
    }

    public void setApplyViewTime(String applyViewTime) {
        this.applyViewTime = applyViewTime;
    }

    public HashMap<String, WorkflowTodoUserDO> getTodoUserList() {
        return todoUserList;
    }

    public void setTodoUserList(HashMap<String, WorkflowTodoUserDO> todoUserList) {
        this.todoUserList = todoUserList;
    }

    public WorkflowDO getWorkflowDO() {
        return workflowDO;
    }

    public void setWorkflowDO(WorkflowDO workflowDO) {
        this.workflowDO = workflowDO;
    }

    public List<WorkflowTodoDetailVO> getTodoDetails() {
        return todoDetails;
    }

    public void setTodoDetails(List<WorkflowTodoDetailVO> todoDetails) {
        this.todoDetails = todoDetails;
    }


}
