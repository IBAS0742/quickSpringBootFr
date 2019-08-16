package com.company.project.model;

import javax.persistence.*;

public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 任务内容(用于判断一个任务是否重复运行的指标，例如在干旱指数中，该内容为draught-2010-12，如果存在该记录，后面计算2010年第12个八天时将提出警告，任务在运行中)
     */
    @Column(name = "task_content")
    private String taskContent;

    /**
     * 100表示完成 -1表示任务失败
     */
    private Integer schedule;

    /**
     * 任务的简短说明（服务器位置，执行开始时间，结束时间，执行者其他说明等等）
     */
    private String statement;

    /**
     * 开始时间
     */
    @Column(name = "start_time")
    private String startTime;

    /**
     * 结束时间
     */
    @Column(name = "end_time")
    private String endTime;

    /**
     * 可能会有其他内容，例如执行完成后，要新增一条数据库记录，内容如何定义，看自己
     */
    private String other;

    /**
     * 用于不同项目进行索引时使用，例如干旱这里可以写 draught，同时当一个模块有多个步骤时，这里可能可以写 module_1 module_2 来进行区分
     */
    @Column(name = "task_index")
    private String taskIndex;

    /**
     * 记录执行过程中输出的日志内容
     */
    private String log;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取任务内容(用于判断一个任务是否重复运行的指标，例如在干旱指数中，该内容为draught-2010-12，如果存在该记录，后面计算2010年第12个八天时将提出警告，任务在运行中)
     *
     * @return task_content - 任务内容(用于判断一个任务是否重复运行的指标，例如在干旱指数中，该内容为draught-2010-12，如果存在该记录，后面计算2010年第12个八天时将提出警告，任务在运行中)
     */
    public String getTaskContent() {
        return taskContent;
    }

    /**
     * 设置任务内容(用于判断一个任务是否重复运行的指标，例如在干旱指数中，该内容为draught-2010-12，如果存在该记录，后面计算2010年第12个八天时将提出警告，任务在运行中)
     *
     * @param taskContent 任务内容(用于判断一个任务是否重复运行的指标，例如在干旱指数中，该内容为draught-2010-12，如果存在该记录，后面计算2010年第12个八天时将提出警告，任务在运行中)
     */
    public void setTaskContent(String taskContent) {
        this.taskContent = taskContent;
    }

    /**
     * 获取100表示完成 -1表示任务失败
     *
     * @return schedule - 100表示完成 -1表示任务失败
     */
    public Integer getSchedule() {
        return schedule;
    }

    /**
     * 设置100表示完成 -1表示任务失败
     *
     * @param schedule 100表示完成 -1表示任务失败
     */
    public void setSchedule(Integer schedule) {
        this.schedule = schedule;
    }

    /**
     * 获取任务的简短说明（服务器位置，执行开始时间，结束时间，执行者其他说明等等）
     *
     * @return statement - 任务的简短说明（服务器位置，执行开始时间，结束时间，执行者其他说明等等）
     */
    public String getStatement() {
        return statement;
    }

    /**
     * 设置任务的简短说明（服务器位置，执行开始时间，结束时间，执行者其他说明等等）
     *
     * @param statement 任务的简短说明（服务器位置，执行开始时间，结束时间，执行者其他说明等等）
     */
    public void setStatement(String statement) {
        this.statement = statement;
    }

    /**
     * 获取开始时间
     *
     * @return start_time - 开始时间
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * 设置开始时间
     *
     * @param startTime 开始时间
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取结束时间
     *
     * @return end_time - 结束时间
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * 设置结束时间
     *
     * @param endTime 结束时间
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取可能会有其他内容，例如执行完成后，要新增一条数据库记录，内容如何定义，看自己
     *
     * @return other - 可能会有其他内容，例如执行完成后，要新增一条数据库记录，内容如何定义，看自己
     */
    public String getOther() {
        return other;
    }

    /**
     * 设置可能会有其他内容，例如执行完成后，要新增一条数据库记录，内容如何定义，看自己
     *
     * @param other 可能会有其他内容，例如执行完成后，要新增一条数据库记录，内容如何定义，看自己
     */
    public void setOther(String other) {
        this.other = other;
    }

    /**
     * 获取用于不同项目进行索引时使用，例如干旱这里可以写 draught，同时当一个模块有多个步骤时，这里可能可以写 module_1 module_2 来进行区分
     *
     * @return task_index - 用于不同项目进行索引时使用，例如干旱这里可以写 draught，同时当一个模块有多个步骤时，这里可能可以写 module_1 module_2 来进行区分
     */
    public String getTaskIndex() {
        return taskIndex;
    }

    /**
     * 设置用于不同项目进行索引时使用，例如干旱这里可以写 draught，同时当一个模块有多个步骤时，这里可能可以写 module_1 module_2 来进行区分
     *
     * @param taskIndex 用于不同项目进行索引时使用，例如干旱这里可以写 draught，同时当一个模块有多个步骤时，这里可能可以写 module_1 module_2 来进行区分
     */
    public void setTaskIndex(String taskIndex) {
        this.taskIndex = taskIndex;
    }

    /**
     * 获取记录执行过程中输出的日志内容
     *
     * @return log - 记录执行过程中输出的日志内容
     */
    public String getLog() {
        return log;
    }

    /**
     * 设置记录执行过程中输出的日志内容
     *
     * @param log 记录执行过程中输出的日志内容
     */
    public void setLog(String log) {
        this.log = log;
    }
}