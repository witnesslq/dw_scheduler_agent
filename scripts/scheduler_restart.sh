#!/bin/bash
# 删除原来的进程
ps -aux | grep 'dw_scheduler_agent' | awk '{print $2}' | while read pid;
  do
    echo "old pid: ${pid}"
    kill -9 $pid;
  done

loDate=`date +%Y-%m-%d`;

nohup java -DAPP_NAME=dw_scheduler_agent \
-Dfile.encoding=utf-8 \
-jar $DW_SCHEDULER_AGENT_HOME/scripts/dw_scheduler_agent.jar >> /data/log/dwlogs/schedule_log/scheduler_run_log/scheduler.out.$loDate 2>&1 &