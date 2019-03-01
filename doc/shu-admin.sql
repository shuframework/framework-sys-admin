/*
Navicat MySQL Data Transfer

Source Server         : 本地数据库
Source Server Version : 50640
Source Host           : localhost:3306
Source Database       : shu-admin

Target Server Type    : MYSQL
Target Server Version : 50640
File Encoding         : 65001

Date: 2019-03-01 18:40:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_area
-- ----------------------------
DROP TABLE IF EXISTS `sys_area`;
CREATE TABLE `sys_area` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `area_code` varchar(64) CHARACTER SET utf8 NOT NULL COMMENT '区域编码',
  `parent_code` varchar(64) CHARACTER SET utf8 DEFAULT '0' COMMENT '父级编号',
  `area_name` varchar(100) CHARACTER SET utf8 DEFAULT NULL COMMENT '区域名称(全称)',
  `short_name` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '区域名称(简称)',
  `levels` char(1) CHARACTER SET utf8 DEFAULT '1' COMMENT '层级  1级 2级 3级 4级',
  `parent_code_path` varchar(500) CHARACTER SET utf8 DEFAULT NULL COMMENT '关联路径(用逗号分隔)',
  `path_name` varchar(500) CHARACTER SET utf8 DEFAULT NULL COMMENT '关联路径名称',
  `is_leaf` char(1) CHARACTER SET utf8 DEFAULT '0' COMMENT '是否是叶子节点 0 不是 1是',
  `area_type` char(1) CHARACTER SET utf8 DEFAULT NULL COMMENT '行政类型 1省 2自治区 3直辖市 4特别行政区 5省会市 6地级市 7区 8县',
  `region_type` char(1) CHARACTER SET utf8 DEFAULT NULL COMMENT '区域类型 1华北 2华东 3东北 4中南 5西南 6西北 7港澳台',
  `pinyin` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '拼音',
  `jianpin` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '简拼',
  `first_char` char(1) CHARACTER SET utf8 DEFAULT NULL COMMENT '首字母',
  `phone_area_code` varchar(5) CHARACTER SET utf8 DEFAULT NULL COMMENT '电话区号',
  `zip_code` varchar(10) CHARACTER SET utf8 DEFAULT NULL COMMENT '邮编',
  `longitude` decimal(12,7) DEFAULT NULL COMMENT '经度',
  `latitude` decimal(12,7) DEFAULT NULL COMMENT '纬度',
  `sortno` tinyint(4) DEFAULT NULL COMMENT '排序号',
  `remarks` varchar(500) CHARACTER SET utf8 DEFAULT NULL COMMENT '备注',
  `create_by` varchar(64) CHARACTER SET utf8 DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `enabled` char(1) CHARACTER SET utf8 DEFAULT '1' COMMENT '状态, 0禁用 1可用 2删除',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uq_area_code` (`area_code`),
  KEY `idx_area_parent_code` (`parent_code`),
  KEY `idx_area_type` (`area_type`),
  KEY `idx_region_type` (`region_type`),
  KEY `idx_area_first_char` (`first_char`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1 COMMENT='行政区划';

-- ----------------------------
-- Records of sys_area
-- ----------------------------
INSERT INTO `sys_area` VALUES ('1', '4', '0', null, null, '1', null, null, '0', null, null, null, null, null, null, null, '-54.4613512', '-125.4556785', null, null, null, null, null, '1');

-- ----------------------------
-- Table structure for sys_dept
-- ----------------------------
DROP TABLE IF EXISTS `sys_dept`;
CREATE TABLE `sys_dept` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增长，但不用来关联',
  `dept_code` varchar(64) DEFAULT NULL COMMENT '部门编号',
  `name` varchar(100) DEFAULT NULL COMMENT '部门名称',
  `parent_code` varchar(64) DEFAULT '0' COMMENT '父编号',
  `levels` char(1) DEFAULT '1' COMMENT '层级  1级 2级 3级 4级',
  `parent_code_path` varchar(500) DEFAULT NULL COMMENT '关联路径(用逗号分隔)',
  `is_leaf` char(1) DEFAULT '0' COMMENT '是否是叶子节点 0 不是 1是',
  `dept_type` varchar(2) DEFAULT NULL COMMENT '部门类型',
  `sortno` tinyint(4) DEFAULT NULL COMMENT '排序号',
  `remarks` varchar(500) DEFAULT NULL COMMENT '备注',
  `create_by` varchar(64) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `enabled` char(1) DEFAULT '1' COMMENT '状态, 0禁用 1可用 2删除',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uq_dept_code` (`dept_code`) COMMENT '部门编号唯一',
  KEY `idx_dept_parent_code` (`parent_code`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统表_部门';

-- ----------------------------
-- Records of sys_dept
-- ----------------------------

-- ----------------------------
-- Table structure for sys_dictionary
-- ----------------------------
DROP TABLE IF EXISTS `sys_dictionary`;
CREATE TABLE `sys_dictionary` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `parent_id` bigint(20) DEFAULT '0' COMMENT '父编码',
  `type_code` varchar(64) DEFAULT NULL COMMENT '类型编码',
  `dict_name` varchar(100) DEFAULT NULL COMMENT '显示的文字',
  `dict_value` varchar(50) DEFAULT NULL COMMENT '存的具体值',
  `sortno` tinyint(4) DEFAULT NULL COMMENT '排序号',
  `remarks` varchar(500) DEFAULT NULL COMMENT '备注',
  `create_by` varchar(64) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `enabled` char(1) DEFAULT '1' COMMENT '状态, 0禁用 1可用 2删除',
  PRIMARY KEY (`id`),
  KEY `idx_dict_pid` (`parent_id`) USING BTREE,
  KEY `idx_dict_type_code` (`type_code`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='系统表_字典表';

-- ----------------------------
-- Records of sys_dictionary
-- ----------------------------
INSERT INTO `sys_dictionary` VALUES ('1', null, null, '性别', null, null, null, null, null, null, '1');
INSERT INTO `sys_dictionary` VALUES ('2', null, null, '男', '1', null, null, null, null, null, '1');
INSERT INTO `sys_dictionary` VALUES ('3', null, null, '女', '2', null, null, null, null, null, '1');

-- ----------------------------
-- Table structure for sys_dictionary2
-- ----------------------------
DROP TABLE IF EXISTS `sys_dictionary2`;
CREATE TABLE `sys_dictionary2` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(64) DEFAULT NULL COMMENT '字典编码',
  `parent_code` varchar(64) DEFAULT '0' COMMENT '父编码',
  `dict_name` varchar(100) DEFAULT NULL COMMENT '显示的文字',
  `dict_value` varchar(50) DEFAULT NULL COMMENT '存的具体值',
  `sortno` tinyint(4) DEFAULT NULL COMMENT '排序号',
  `remarks` varchar(500) DEFAULT NULL COMMENT '备注',
  `create_by` varchar(64) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `enabled` char(1) DEFAULT '1' COMMENT '状态, 0禁用 1可用 2删除',
  PRIMARY KEY (`id`),
  KEY `idx_dict2_code` (`code`) USING BTREE,
  KEY `idx_dict2_parent_code` (`parent_code`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='系统表_字典表';

-- ----------------------------
-- Records of sys_dictionary2
-- ----------------------------
INSERT INTO `sys_dictionary2` VALUES ('1', null, null, null, null, null, null, null, null, null, '1');
INSERT INTO `sys_dictionary2` VALUES ('2', null, null, null, null, null, null, null, null, null, '1');
INSERT INTO `sys_dictionary2` VALUES ('3', null, null, null, null, null, null, null, null, null, '1');

-- ----------------------------
-- Table structure for sys_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_log`;
CREATE TABLE `sys_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `login_name` varchar(64) DEFAULT NULL COMMENT '角色名',
  `contents` varchar(4000) DEFAULT NULL COMMENT '内容',
  `client_ip` varchar(100) DEFAULT NULL COMMENT '客户端ip',
  `log_type` varchar(20) DEFAULT NULL COMMENT '日志类型',
  `request_path` varchar(200) DEFAULT NULL COMMENT '请求路径',
  `request_param` varchar(255) DEFAULT NULL COMMENT '请求参数',
  `request_method` varchar(10) DEFAULT NULL COMMENT '操作方式',
  `flag` char(1) DEFAULT NULL COMMENT '是否成功 1 true,  0 false',
  `response_result` varchar(500) DEFAULT NULL COMMENT '返回结果',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统表_操作日志表';

-- ----------------------------
-- Records of sys_log
-- ----------------------------

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(500) DEFAULT NULL COMMENT '菜单名称',
  `parent_id` bigint(20) DEFAULT NULL COMMENT '父id',
  `levels` char(1) DEFAULT NULL COMMENT '层级',
  `request_url` varchar(200) DEFAULT NULL COMMENT '请求路径',
  `permission` varchar(255) DEFAULT NULL COMMENT '权限标识',
  `icon_url` varchar(255) DEFAULT NULL COMMENT '图标路径',
  `menu_type` varchar(10) DEFAULT NULL COMMENT '菜单类型,1模块, 2菜单, 3按钮',
  `is_leaf` char(1) DEFAULT '0' COMMENT '是否是叶子节点 0 不是 1是',
  `sortno` tinyint(4) DEFAULT NULL COMMENT '排序号',
  `remarks` varchar(500) DEFAULT NULL COMMENT '备注',
  `create_by` varchar(64) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `enabled` char(1) DEFAULT '1' COMMENT '状态, 0禁用 1可用 2删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='系统表_菜单';

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES ('1', '系统管理', '0', '1', null, null, null, 'menu', '0', null, null, null, null, null, '1');
INSERT INTO `sys_menu` VALUES ('2', '员工管理', '1', '2', '/sysUser/init', null, null, 'menu', '0', null, null, null, null, null, '1');
INSERT INTO `sys_menu` VALUES ('3', '组织结构管理', '1', '2', '/sysDept/init', null, null, 'menu', '0', null, null, null, null, null, '1');
INSERT INTO `sys_menu` VALUES ('4', '角色管理', '1', '2', '/sysRole/init', null, null, 'menu', '0', null, null, null, null, null, '1');
INSERT INTO `sys_menu` VALUES ('5', '资源菜单管理', '1', '2', '/sysMenu/init', null, null, 'menu', '0', null, null, null, null, null, '1');
INSERT INTO `sys_menu` VALUES ('6', '字典管理', '1', '2', '/sysDictionary/init', null, null, 'menu', '0', null, null, null, null, null, '1');
INSERT INTO `sys_menu` VALUES ('7', 'demo示例', '0', '1', null, null, null, 'menu', '0', null, null, null, null, null, '1');
INSERT INTO `sys_menu` VALUES ('8', 'LinkButton（按钮）', '7', '2', '/initLinkButton', null, null, 'menu', '0', null, null, null, null, null, '1');
INSERT INTO `sys_menu` VALUES ('9', 'SwitchButton（开关按钮）', '7', '2', '/initSwitchButton', null, null, 'menu', '0', null, null, null, null, null, '1');

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(500) DEFAULT NULL COMMENT '名称',
  `sortno` tinyint(4) DEFAULT NULL COMMENT '排序号',
  `remarks` varchar(500) DEFAULT NULL COMMENT '备注',
  `create_by` varchar(64) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `enabled` char(1) DEFAULT '1' COMMENT '状态, 0禁用 1可用 2删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='系统表_角色';

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', '系统管理员', null, null, null, null, null, '1');

-- ----------------------------
-- Table structure for sys_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `role_id` bigint(20) DEFAULT NULL COMMENT '角色id',
  `menu_id` bigint(20) DEFAULT NULL COMMENT '菜单id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `enabled` char(1) DEFAULT '1' COMMENT '状态, 0禁用 1可用',
  PRIMARY KEY (`id`),
  KEY `idx_rm_role_id` (`role_id`),
  KEY `idx_rm_menu_id` (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色_菜单_中间表';

-- ----------------------------
-- Records of sys_role_menu
-- ----------------------------

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `login_name` varchar(64) NOT NULL COMMENT '登录名',
  `nick_name` varchar(50) DEFAULT NULL COMMENT '名称',
  `password` varchar(50) DEFAULT NULL COMMENT '密码',
  `sex` char(1) DEFAULT NULL COMMENT '性别',
  `icon_url` varchar(200) DEFAULT NULL COMMENT '头像',
  `phone_num` varchar(20) DEFAULT NULL COMMENT '手机号',
  `phone_num2` varchar(20) DEFAULT NULL COMMENT '备用号',
  `email` varchar(255) DEFAULT NULL COMMENT '电子邮箱',
  `address` varchar(1000) DEFAULT NULL COMMENT '地址',
  `dept_code` varchar(64) DEFAULT NULL COMMENT '部门id',
  `use_type` varchar(2) DEFAULT NULL COMMENT '用户类型',
  `leave_time` datetime DEFAULT NULL COMMENT '离职时间',
  `sortno` tinyint(4) DEFAULT NULL COMMENT '排序号',
  `remarks` varchar(500) DEFAULT NULL COMMENT '备注',
  `create_by` varchar(64) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `enabled` char(1) DEFAULT '1' COMMENT '状态, 0禁用 1可用 2删除',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uq_user_login_name` (`login_name`) USING BTREE COMMENT '登录名唯一',
  KEY `idx_user_phone` (`phone_num`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='系统表_用户';

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'test', '测试账号', '123', null, null, '1351233232', null, null, null, null, null, null, null, null, null, null, null, '1');

-- ----------------------------
-- Table structure for sys_user_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_menu`;
CREATE TABLE `sys_user_menu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户id',
  `menu_id` bigint(20) DEFAULT NULL COMMENT '菜单id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `enabled` char(1) DEFAULT '1' COMMENT '状态, 0禁用 1可用',
  PRIMARY KEY (`id`),
  KEY `idx_um_user_id` (`user_id`),
  KEY `idx_um_menu_id` (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户_菜单_中间表';

-- ----------------------------
-- Records of sys_user_menu
-- ----------------------------

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户id',
  `role_id` bigint(20) DEFAULT NULL COMMENT '角色id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `enabled` char(1) DEFAULT '1' COMMENT '状态, 0禁用 1可用',
  PRIMARY KEY (`id`),
  KEY `idx_um_user_id` (`user_id`),
  KEY `idx_um_role_id` (`role_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户_角色_中间表';

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
