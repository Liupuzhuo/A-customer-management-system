CREATE TABLE IF NOT EXISTS `userRole` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `roleName` varchar(255) DEFAULT NULL COMMENT '角色名称',
  `permissionCharacters` varchar(255) DEFAULT NULL COMMENT '权限字符',
  `rolestate` int DEFAULT NULL COMMENT '状态',
  `createdTime` datetime DEFAULT NULL COMMENT '创建时间',
  `updatedTime` datetime DEFAULT NULL COMMENT '更新时间',
PRIMARY KEY (`id`)
) COMMENT='角色实体';
CREATE TABLE IF NOT EXISTS `userinfo` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userName` varchar(255) DEFAULT NULL COMMENT '用户名称',
  `nickname` varchar(255) DEFAULT NULL COMMENT '用户昵称',
  `belongingDepartment` varchar(255) DEFAULT NULL COMMENT '归属部门',
  `phoneNumber` varchar(255) DEFAULT NULL COMMENT '联系电话',
  `stateBfuw` varchar(255) DEFAULT NULL COMMENT '状态',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  `remarksDqdd` varchar(255) DEFAULT NULL COMMENT '备注',
  `createdTime` datetime DEFAULT NULL COMMENT '创建时间',
  `updatedTime` datetime DEFAULT NULL COMMENT '更新时间',
PRIMARY KEY (`id`)
) COMMENT='用户实体';
CREATE TABLE IF NOT EXISTS `worklist` (
  `id` int NOT NULL COMMENT 'id',
  `项目名称` varchar(255) NOT NULL COMMENT '项目名称',
  `任务类型` varchar(255) NOT NULL COMMENT '任务类型',
  `意向飞地` varchar(255) DEFAULT NULL COMMENT '意向飞地',
  `任务状态` varchar(255) NOT NULL COMMENT '任务状态',
  `项目经理` varchar(255) NOT NULL COMMENT '项目经理',
PRIMARY KEY (`id`)
) COMMENT='项目工作表单';
CREATE TABLE IF NOT EXISTS `worklist` (
  `id` int NOT NULL COMMENT 'id',
  `project_name` varchar(255) NOT NULL COMMENT 'projectName',
  `task_type` varchar(255) NOT NULL COMMENT 'taskType',
  `intention_feidi` varchar(255) DEFAULT NULL COMMENT 'intentionFeidi',
  `task_state` varchar(255) NOT NULL COMMENT 'taskState',
  `manager` varchar(255) NOT NULL COMMENT 'manager',
  `updatedTime` datetime DEFAULT NULL COMMENT '更新时间',
  `createdTime` datetime DEFAULT NULL COMMENT '创建时间',
PRIMARY KEY (`id`)
) COMMENT='worklist';
CREATE TABLE IF NOT EXISTS `worklist` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
  `project_name` varchar(255) NOT NULL COMMENT 'projectName',
  `task_type` varchar(255) NOT NULL COMMENT 'taskType',
  `intention_feidi` varchar(255) DEFAULT NULL COMMENT 'intentionFeidi',
  `task_state` varchar(255) NOT NULL COMMENT 'taskState',
  `manager` varchar(255) NOT NULL COMMENT 'manager',
  `remark` varchar(255) DEFAULT NULL COMMENT 'remark',
  `create_time` datetime DEFAULT NULL COMMENT 'createTime',
  `update_time` datetime NOT NULL COMMENT 'updateTime',
PRIMARY KEY (`id`)
) COMMENT='WORKLIST';
CREATE TABLE IF NOT EXISTS `status_enum` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
  `code` varchar(255) NOT NULL COMMENT 'code',
  `name` varchar(255) NOT NULL COMMENT 'name',
  `type` int NOT NULL COMMENT 'type',
PRIMARY KEY (`id`)
) COMMENT='statusEnum';
CREATE TABLE IF NOT EXISTS `task_track` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
  `director` varchar(255) NOT NULL COMMENT 'director',
  `task_status` varchar(255) NOT NULL COMMENT 'taskStatus',
  `progress` varchar(255) NOT NULL COMMENT 'progress',
  `create_time` datetime NOT NULL COMMENT 'createTime',
  `tracking_time` date NOT NULL COMMENT 'trackingTime',
  `work_list_id` bigint NOT NULL COMMENT 'workListId',
  `update_time` datetime DEFAULT NULL COMMENT 'updateTime',
PRIMARY KEY (`id`)
) COMMENT='taskTrack';
CREATE TABLE IF NOT EXISTS `purview_relevancy` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
  `role_id` bigint NOT NULL COMMENT 'roleId',
  `purview_id` bigint NOT NULL COMMENT 'purviewId',
  `purview_code_arr` varchar(255) NOT NULL COMMENT 'purviewCodeArr',
PRIMARY KEY (`id`)
) COMMENT='purviewRelevancy';
CREATE TABLE IF NOT EXISTS `purview` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
  `code` varchar(255) NOT NULL COMMENT 'code',
  `name` varchar(255) NOT NULL COMMENT 'name',
PRIMARY KEY (`id`)
) COMMENT='purview';
CREATE TABLE IF NOT EXISTS `role_relevance` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_id` bigint NOT NULL COMMENT 'userId',
  `role_id` bigint NOT NULL COMMENT 'roleId',
PRIMARY KEY (`id`)
) COMMENT='roleRelevance';
CREATE TABLE IF NOT EXISTS `operation_log` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userId` bigint DEFAULT NULL COMMENT '用户ID',
  `userName` varchar(255) DEFAULT NULL COMMENT '用户名称',
  `operationType` varchar(255) DEFAULT NULL COMMENT '操作类型',
  `ipAddress` varchar(255) DEFAULT NULL COMMENT 'IP地址',
  `operationDescription` text DEFAULT NULL COMMENT '操作描述',
  `createdTime` datetime DEFAULT NULL COMMENT '创建时间',
  `parameters` varchar(255) DEFAULT NULL COMMENT '请求参数',
PRIMARY KEY (`id`)
) COMMENT='操作日志';
