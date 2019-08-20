/*
 Navicat MySQL Data Transfer

 Source Server         : java
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : localhost:3306
 Source Schema         : deliverymanagement

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 20/08/2019 15:16:30
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for address
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address`  (
  `id` int(8) NOT NULL AUTO_INCREMENT COMMENT '收货地址id',
  `address_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '收货地址名称',
  `customer_id` int(11) NOT NULL COMMENT '所属客户id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of address
-- ----------------------------
INSERT INTO `address` VALUES (1, '地址1', 5);
INSERT INTO `address` VALUES (2, '地址2', 6);
INSERT INTO `address` VALUES (3, '地址3', 7);
INSERT INTO `address` VALUES (4, '地址4', 8);
INSERT INTO `address` VALUES (5, '地址5', 9);
INSERT INTO `address` VALUES (6, '地址6', 10);
INSERT INTO `address` VALUES (7, '地址7', 11);
INSERT INTO `address` VALUES (8, '地址8', 12);
INSERT INTO `address` VALUES (9, '地址9', 13);
INSERT INTO `address` VALUES (10, '地址10', 14);
INSERT INTO `address` VALUES (11, '地址11', 15);
INSERT INTO `address` VALUES (12, '地址12', 16);
INSERT INTO `address` VALUES (13, '地址13', 17);
INSERT INTO `address` VALUES (14, '地址14', 18);
INSERT INTO `address` VALUES (15, '地址15', 5);
INSERT INTO `address` VALUES (16, '地址16', 6);
INSERT INTO `address` VALUES (17, '地址17', 7);
INSERT INTO `address` VALUES (18, '地址18', 8);
INSERT INTO `address` VALUES (19, '地址19', 9);
INSERT INTO `address` VALUES (20, '地址20', 10);
INSERT INTO `address` VALUES (21, '地址21', 11);
INSERT INTO `address` VALUES (22, '地址22', 12);
INSERT INTO `address` VALUES (23, '地址23', 13);
INSERT INTO `address` VALUES (24, '地址24', 14);
INSERT INTO `address` VALUES (25, '地址25', 15);
INSERT INTO `address` VALUES (26, '地址26', 16);
INSERT INTO `address` VALUES (27, '地址27', 17);
INSERT INTO `address` VALUES (28, '地址28', 18);
INSERT INTO `address` VALUES (29, '地址29', 5);
INSERT INTO `address` VALUES (30, '地址30', 6);
INSERT INTO `address` VALUES (31, '地址31', 7);
INSERT INTO `address` VALUES (32, '地址32', 8);
INSERT INTO `address` VALUES (33, '地址33', 9);
INSERT INTO `address` VALUES (34, '地址34', 10);
INSERT INTO `address` VALUES (35, '地址35', 11);
INSERT INTO `address` VALUES (36, '地址36', 12);
INSERT INTO `address` VALUES (37, '地址37', 13);
INSERT INTO `address` VALUES (38, '地址38', 14);
INSERT INTO `address` VALUES (39, '地址39', 15);
INSERT INTO `address` VALUES (40, '地址40', 16);
INSERT INTO `address` VALUES (41, '地址41', 17);
INSERT INTO `address` VALUES (42, '地址42', 18);
INSERT INTO `address` VALUES (43, '地址43', 5);
INSERT INTO `address` VALUES (44, '地址44', 6);
INSERT INTO `address` VALUES (45, '地址45', 7);
INSERT INTO `address` VALUES (46, '地址46', 8);
INSERT INTO `address` VALUES (47, '地址47', 9);
INSERT INTO `address` VALUES (48, '地址48', 10);
INSERT INTO `address` VALUES (49, '地址49', 11);
INSERT INTO `address` VALUES (50, '地址50', 12);
INSERT INTO `address` VALUES (51, '地址51', 13);
INSERT INTO `address` VALUES (52, '地址52', 14);
INSERT INTO `address` VALUES (53, '地址53', 15);
INSERT INTO `address` VALUES (54, '地址54', 16);
INSERT INTO `address` VALUES (55, '地址55', 17);
INSERT INTO `address` VALUES (56, '地址56', 18);

-- ----------------------------
-- Table structure for cement
-- ----------------------------
DROP TABLE IF EXISTS `cement`;
CREATE TABLE `cement`  (
  `id` int(8) NOT NULL AUTO_INCREMENT COMMENT '水泥id',
  `name` varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '水泥名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of cement
-- ----------------------------
INSERT INTO `cement` VALUES (1, 'PC32.5R');
INSERT INTO `cement` VALUES (2, 'PO42.5');

-- ----------------------------
-- Table structure for delivery
-- ----------------------------
DROP TABLE IF EXISTS `delivery`;
CREATE TABLE `delivery`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '发货记录id',
  `truck_id` int(8) NOT NULL COMMENT '车辆id',
  `driver_id` int(11) NOT NULL COMMENT '司机id',
  `delivery_time` datetime(0) NOT NULL COMMENT '发货时间',
  `created_time` datetime(0) NOT NULL COMMENT '发货记录创建时间',
  `user_id` int(11) NOT NULL COMMENT '所属用户id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 32 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of delivery
-- ----------------------------
INSERT INTO `delivery` VALUES (1, 1, 19, '2019-06-09 00:00:00', '2019-06-28 16:23:57', 2);
INSERT INTO `delivery` VALUES (2, 2, 20, '2019-06-10 00:00:00', '2019-06-28 16:23:57', 2);
INSERT INTO `delivery` VALUES (3, 3, 21, '2019-06-11 00:00:00', '2019-06-28 16:23:57', 2);
INSERT INTO `delivery` VALUES (4, 1, 19, '2019-06-12 00:00:00', '2019-06-28 16:23:57', 2);
INSERT INTO `delivery` VALUES (5, 4, 22, '2019-06-13 00:00:00', '2019-06-28 16:23:57', 3);
INSERT INTO `delivery` VALUES (6, 5, 23, '2019-06-14 00:00:00', '2019-06-28 16:23:57', 3);
INSERT INTO `delivery` VALUES (7, 6, 24, '2019-06-15 00:00:00', '2019-06-28 16:23:57', 3);
INSERT INTO `delivery` VALUES (8, 4, 22, '2019-06-16 00:00:00', '2019-06-28 16:23:57', 3);
INSERT INTO `delivery` VALUES (9, 7, 25, '2019-06-17 00:00:00', '2019-06-28 16:23:57', 4);
INSERT INTO `delivery` VALUES (10, 8, 26, '2019-06-18 00:00:00', '2019-06-28 16:23:57', 4);
INSERT INTO `delivery` VALUES (11, 9, 27, '2019-06-19 00:00:00', '2019-06-28 16:23:57', 4);
INSERT INTO `delivery` VALUES (12, 7, 25, '2019-06-20 00:00:00', '2019-06-28 16:23:57', 4);
INSERT INTO `delivery` VALUES (15, 1, 19, '2019-06-26 12:11:43', '2019-06-28 16:23:57', 2);
INSERT INTO `delivery` VALUES (16, 1, 19, '2019-06-28 15:07:44', '2019-06-28 16:23:57', 2);
INSERT INTO `delivery` VALUES (17, 3, 20, '2019-06-28 15:12:01', '2019-06-28 16:23:57', 2);
INSERT INTO `delivery` VALUES (18, 2, 20, '2019-06-28 15:14:51', '2019-06-28 16:23:57', 2);
INSERT INTO `delivery` VALUES (19, 2, 21, '2019-06-28 15:16:50', '2019-06-28 16:23:57', 2);
INSERT INTO `delivery` VALUES (20, 3, 20, '2019-06-28 15:17:31', '2019-06-28 16:23:57', 2);
INSERT INTO `delivery` VALUES (21, 2, 21, '2019-06-28 15:25:47', '2019-06-28 16:23:57', 2);
INSERT INTO `delivery` VALUES (22, 2, 19, '2019-06-28 15:27:34', '2019-06-28 16:23:57', 2);
INSERT INTO `delivery` VALUES (23, 2, 20, '2019-06-28 05:05:00', '2019-06-28 16:23:57', 2);
INSERT INTO `delivery` VALUES (24, 2, 19, '2019-06-28 02:03:00', '2019-06-28 16:23:57', 2);
INSERT INTO `delivery` VALUES (25, 1, 20, '2019-06-27 00:00:00', '2019-06-28 16:34:12', 2);
INSERT INTO `delivery` VALUES (26, 2, 20, '2019-06-28 10:07:00', '2019-06-28 22:24:45', 2);
INSERT INTO `delivery` VALUES (27, 23, 20, '2019-07-01 16:09:55', '2019-07-01 16:10:07', 2);
INSERT INTO `delivery` VALUES (28, 22, 21, '2019-07-01 05:00:00', '2019-07-02 09:24:52', 2);
INSERT INTO `delivery` VALUES (29, 2, 20, '2019-07-01 06:00:00', '2019-07-02 10:16:34', 2);
INSERT INTO `delivery` VALUES (30, 2, 20, '2019-07-01 11:00:00', '2019-07-02 15:13:56', 2);
INSERT INTO `delivery` VALUES (31, 3, 21, '2019-07-02 00:00:00', '2019-07-04 13:34:21', 2);
INSERT INTO `delivery` VALUES (32, 3, 19, '2019-08-16 22:05:53', '2019-08-16 22:07:10', 2);

-- ----------------------------
-- Table structure for delivery_loader
-- ----------------------------
DROP TABLE IF EXISTS `delivery_loader`;
CREATE TABLE `delivery_loader`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '默认id',
  `delivery_id` int(11) NOT NULL COMMENT '发货记录id',
  `loader_id` int(11) NOT NULL COMMENT '装卸工id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 54 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of delivery_loader
-- ----------------------------
INSERT INTO `delivery_loader` VALUES (1, 1, 28);
INSERT INTO `delivery_loader` VALUES (2, 1, 29);
INSERT INTO `delivery_loader` VALUES (3, 2, 30);
INSERT INTO `delivery_loader` VALUES (4, 2, 31);
INSERT INTO `delivery_loader` VALUES (5, 3, 28);
INSERT INTO `delivery_loader` VALUES (6, 3, 29);
INSERT INTO `delivery_loader` VALUES (7, 4, 30);
INSERT INTO `delivery_loader` VALUES (8, 4, 31);
INSERT INTO `delivery_loader` VALUES (9, 5, 32);
INSERT INTO `delivery_loader` VALUES (10, 5, 33);
INSERT INTO `delivery_loader` VALUES (11, 6, 34);
INSERT INTO `delivery_loader` VALUES (12, 6, 35);
INSERT INTO `delivery_loader` VALUES (13, 7, 32);
INSERT INTO `delivery_loader` VALUES (14, 7, 33);
INSERT INTO `delivery_loader` VALUES (15, 8, 34);
INSERT INTO `delivery_loader` VALUES (16, 8, 35);
INSERT INTO `delivery_loader` VALUES (17, 9, 36);
INSERT INTO `delivery_loader` VALUES (18, 9, 37);
INSERT INTO `delivery_loader` VALUES (19, 10, 38);
INSERT INTO `delivery_loader` VALUES (20, 10, 39);
INSERT INTO `delivery_loader` VALUES (21, 11, 36);
INSERT INTO `delivery_loader` VALUES (22, 11, 37);
INSERT INTO `delivery_loader` VALUES (23, 12, 38);
INSERT INTO `delivery_loader` VALUES (24, 12, 39);
INSERT INTO `delivery_loader` VALUES (25, 15, 28);
INSERT INTO `delivery_loader` VALUES (26, 15, 29);
INSERT INTO `delivery_loader` VALUES (27, 16, 31);
INSERT INTO `delivery_loader` VALUES (28, 17, 28);
INSERT INTO `delivery_loader` VALUES (29, 17, 29);
INSERT INTO `delivery_loader` VALUES (30, 18, 31);
INSERT INTO `delivery_loader` VALUES (31, 18, 30);
INSERT INTO `delivery_loader` VALUES (32, 19, 31);
INSERT INTO `delivery_loader` VALUES (33, 19, 30);
INSERT INTO `delivery_loader` VALUES (34, 20, 28);
INSERT INTO `delivery_loader` VALUES (35, 20, 29);
INSERT INTO `delivery_loader` VALUES (36, 21, 30);
INSERT INTO `delivery_loader` VALUES (37, 21, 31);
INSERT INTO `delivery_loader` VALUES (38, 22, 29);
INSERT INTO `delivery_loader` VALUES (39, 22, 30);
INSERT INTO `delivery_loader` VALUES (40, 23, 28);
INSERT INTO `delivery_loader` VALUES (41, 23, 29);
INSERT INTO `delivery_loader` VALUES (42, 24, 29);
INSERT INTO `delivery_loader` VALUES (43, 25, 29);
INSERT INTO `delivery_loader` VALUES (44, 26, 31);
INSERT INTO `delivery_loader` VALUES (45, 26, 30);
INSERT INTO `delivery_loader` VALUES (46, 28, 28);
INSERT INTO `delivery_loader` VALUES (47, 29, 30);
INSERT INTO `delivery_loader` VALUES (48, 29, 31);
INSERT INTO `delivery_loader` VALUES (49, 30, 28);
INSERT INTO `delivery_loader` VALUES (50, 27, 28);
INSERT INTO `delivery_loader` VALUES (51, 31, 28);
INSERT INTO `delivery_loader` VALUES (52, 31, 29);
INSERT INTO `delivery_loader` VALUES (53, 32, 29);
INSERT INTO `delivery_loader` VALUES (54, 32, 30);

-- ----------------------------
-- Table structure for job
-- ----------------------------
DROP TABLE IF EXISTS `job`;
CREATE TABLE `job`  (
  `id` int(8) NOT NULL AUTO_INCREMENT COMMENT '职位id',
  `name` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '职位名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of job
-- ----------------------------
INSERT INTO `job` VALUES (1, '司机');
INSERT INTO `job` VALUES (2, '装卸工');

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单id',
  `customer_id` int(11) NOT NULL COMMENT '客户id',
  `address_id` int(8) NOT NULL COMMENT '收货地址id',
  `cement_id` int(8) NOT NULL COMMENT '水泥id',
  `unit_price` double NOT NULL COMMENT '单价',
  `num` double NOT NULL COMMENT '数量',
  `created_time` datetime(0) NOT NULL COMMENT '创建时间',
  `user_id` int(11) NOT NULL COMMENT '所属用户id',
  `delivery_id` int(11) NULL DEFAULT NULL COMMENT '所属发货记录',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `index_created_time`(`created_time`) USING BTREE,
  INDEX `index_user_id`(`user_id`) USING BTREE,
  INDEX `index_cement_id`(`cement_id`) USING BTREE,
  INDEX `index_customer_id`(`customer_id`) USING BTREE,
  INDEX `index_address_id`(`address_id`) USING BTREE,
  INDEX `index_delivery_id`(`delivery_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 44 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES (1, 5, 1, 1, 400, 10, '2019-05-22 12:00:00', 2, 1);
INSERT INTO `orders` VALUES (2, 5, 15, 1, 400, 11, '2019-05-23 00:00:00', 2, 15);
INSERT INTO `orders` VALUES (3, 5, 29, 1, 400, 12, '2019-05-24 00:00:00', 2, 15);
INSERT INTO `orders` VALUES (4, 5, 43, 1, 400, 13, '2019-05-25 00:00:00', 2, 2);
INSERT INTO `orders` VALUES (5, 6, 2, 1, 400, 14, '2019-05-26 00:00:00', 2, 2);
INSERT INTO `orders` VALUES (6, 6, 16, 1, 400, 15, '2019-05-27 00:00:00', 2, 3);
INSERT INTO `orders` VALUES (7, 6, 30, 1, 400, 16, '2019-05-28 00:00:00', 2, 3);
INSERT INTO `orders` VALUES (8, 6, 44, 1, 400, 17, '2019-05-29 00:00:00', 2, 4);
INSERT INTO `orders` VALUES (9, 7, 3, 1, 400, 18, '2019-05-30 00:00:00', 2, 4);
INSERT INTO `orders` VALUES (10, 10, 3, 2, 500, 19, '2019-05-31 00:00:00', 3, 5);
INSERT INTO `orders` VALUES (11, 11, 4, 2, 500, 20, '2019-06-01 00:00:00', 3, 6);
INSERT INTO `orders` VALUES (12, 12, 5, 2, 500, 21, '2019-06-02 00:00:00', 3, 7);
INSERT INTO `orders` VALUES (13, 13, 6, 2, 500, 22, '2019-06-03 00:00:00', 3, 8);
INSERT INTO `orders` VALUES (14, 15, 7, 2, 500, 23, '2019-06-04 00:00:00', 4, 9);
INSERT INTO `orders` VALUES (15, 16, 1, 2, 500, 24, '2019-06-05 00:00:00', 4, 10);
INSERT INTO `orders` VALUES (16, 17, 2, 2, 500, 25, '2019-06-06 00:00:00', 4, 11);
INSERT INTO `orders` VALUES (17, 18, 3, 2, 500, 26, '2019-06-07 00:00:00', 4, 12);
INSERT INTO `orders` VALUES (20, 5, 1, 1, 450, 12, '2019-06-26 10:40:10', 2, 16);
INSERT INTO `orders` VALUES (23, 6, 16, 1, 400, 10, '2019-06-28 14:13:31', 2, 17);
INSERT INTO `orders` VALUES (24, 9, 47, 2, 450, 15, '2019-06-28 15:10:10', 2, 17);
INSERT INTO `orders` VALUES (25, 8, 32, 2, 415, 9, '2019-06-28 15:11:16', 2, 19);
INSERT INTO `orders` VALUES (26, 7, 17, 1, 350, 8, '2019-06-28 15:11:54', 2, 18);
INSERT INTO `orders` VALUES (27, 9, 33, 2, 380, 10, '2019-06-28 15:16:47', 2, 20);
INSERT INTO `orders` VALUES (28, 9, 19, 2, 390, 10, '2019-06-28 15:18:58', 2, 22);
INSERT INTO `orders` VALUES (29, 8, 18, 2, 410, 14, '2019-06-28 15:25:42', 2, 21);
INSERT INTO `orders` VALUES (30, 6, 16, 2, 370, 13, '2019-06-28 15:33:13', 2, 23);
INSERT INTO `orders` VALUES (31, 7, 17, 1, 375, 6, '2019-06-28 15:33:32', 2, 23);
INSERT INTO `orders` VALUES (32, 6, 44, 2, 415, 10, '2019-06-28 15:35:22', 2, NULL);
INSERT INTO `orders` VALUES (33, 6, 44, 2, 385, 7, '2019-06-28 15:36:02', 2, 24);
INSERT INTO `orders` VALUES (34, 6, 44, 1, 365, 7, '2019-06-28 15:50:55', 2, 25);
INSERT INTO `orders` VALUES (35, 7, 45, 2, 420, 13, '2019-06-28 15:51:10', 2, 28);
INSERT INTO `orders` VALUES (36, 5, 15, 1, 400, 10, '2019-06-28 22:18:51', 2, NULL);
INSERT INTO `orders` VALUES (37, 5, 15, 2, 400, 10, '2019-06-28 22:20:52', 2, 26);
INSERT INTO `orders` VALUES (38, 9, 5, 1, 380, 10, '2019-06-28 22:24:23', 2, 26);
INSERT INTO `orders` VALUES (39, 7, 17, 2, 400, 13, '2019-07-01 12:24:31', 2, 27);
INSERT INTO `orders` VALUES (40, 7, 3, 2, 425, 14, '2019-07-01 16:13:49', 2, 29);
INSERT INTO `orders` VALUES (41, 9, 5, 1, 355, 10, '2019-07-01 17:01:53', 2, 30);
INSERT INTO `orders` VALUES (42, 8, 18, 1, 380, 10, '2019-07-02 10:15:49', 2, 31);
INSERT INTO `orders` VALUES (43, 9, 19, 2, 420, 10, '2019-07-02 19:24:55', 2, 31);
INSERT INTO `orders` VALUES (44, 9, 19, 2, 430, 8, '2019-07-04 13:31:07', 2, 32);

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`  (
  `id` int(8) NOT NULL COMMENT '角色id',
  `name` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '角色名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES (1, 'ROLE_ADMIN');
INSERT INTO `role` VALUES (2, 'ROLE_NORMAL');

-- ----------------------------
-- Table structure for truck
-- ----------------------------
DROP TABLE IF EXISTS `truck`;
CREATE TABLE `truck`  (
  `id` int(8) NOT NULL AUTO_INCREMENT COMMENT '车辆id',
  `license_plate` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '车牌号',
  `user_id` int(11) NOT NULL COMMENT '所属用户id',
  `max_capacity` double(4, 1) NOT NULL COMMENT '最大装载容量',
  `recent_usage_time` datetime(0) NOT NULL COMMENT '最近使用时间',
  `usage_count` int(11) NOT NULL COMMENT '使用次数',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 28 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of truck
-- ----------------------------
INSERT INTO `truck` VALUES (1, '湘C33360', 2, 16.0, '2019-07-02 15:04:48', 2);
INSERT INTO `truck` VALUES (2, '湘CUP234', 2, 16.0, '2019-07-02 15:13:56', 3);
INSERT INTO `truck` VALUES (3, '湘ATR265', 2, 16.0, '2019-08-16 22:07:10', 4);
INSERT INTO `truck` VALUES (4, '湘CHP345', 3, 18.0, '2019-07-02 15:04:48', 2);
INSERT INTO `truck` VALUES (5, '湘C8W123', 3, 20.0, '2019-07-02 15:04:48', 2);
INSERT INTO `truck` VALUES (6, '湘ATG345', 3, 20.0, '2019-07-02 15:04:48', 2);
INSERT INTO `truck` VALUES (7, '湘C13456', 4, 18.0, '2019-07-02 15:04:48', 2);
INSERT INTO `truck` VALUES (8, '湘CUP333', 4, 22.0, '2019-07-02 15:04:48', 2);
INSERT INTO `truck` VALUES (9, '湘ATR265', 4, 18.0, '2019-07-02 15:04:48', 2);
INSERT INTO `truck` VALUES (22, '湘C5J822', 2, 18.0, '2019-07-02 15:04:48', 2);
INSERT INTO `truck` VALUES (23, '湘A8K986', 2, 16.0, '2019-07-02 15:04:48', 2);
INSERT INTO `truck` VALUES (25, '湘C9U423', 2, 23.0, '2019-07-02 15:04:48', 2);
INSERT INTO `truck` VALUES (26, '湘C5J342', 2, 14.0, '2019-07-02 15:04:48', 2);
INSERT INTO `truck` VALUES (27, '湘A8J345', 2, 22.0, '2019-07-02 15:04:48', 2);
INSERT INTO `truck` VALUES (28, '湘CAK471', 2, 22.0, '2019-07-04 13:26:24', 0);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `password` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
  `realname` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '真实姓名',
  `phone` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '联系电话',
  `job_id` int(8) NULL DEFAULT NULL COMMENT '职位id',
  `remark` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `owner_id` int(11) NULL DEFAULT NULL COMMENT '所属用户id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 68 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'zhaofeng', '123456', '赵峰', '17373251096', NULL, NULL, NULL);
INSERT INTO `user` VALUES (2, 'zhangsan', '123456', '张三（用户）', '17373221908', NULL, NULL, NULL);
INSERT INTO `user` VALUES (3, 'lisi', '123456', '李四（用户）', '17373081908', NULL, NULL, NULL);
INSERT INTO `user` VALUES (4, 'wanghui', '123456', '王辉（用户）', '18097342567', NULL, NULL, NULL);
INSERT INTO `user` VALUES (7, NULL, NULL, '客户3', '18097342588', NULL, '修改备注', 2);
INSERT INTO `user` VALUES (8, NULL, NULL, '客户4', '18097342597', NULL, '23跳舞(((((ી(･◡･)ʃ)))))rgsf', 2);
INSERT INTO `user` VALUES (9, NULL, NULL, '客户5', '18097342606', NULL, NULL, 2);
INSERT INTO `user` VALUES (10, NULL, NULL, '客户6', '18097342615', NULL, NULL, 3);
INSERT INTO `user` VALUES (11, NULL, NULL, '客户7', '18097342624', NULL, NULL, 3);
INSERT INTO `user` VALUES (12, NULL, NULL, '客户8', '18097342633', NULL, NULL, 3);
INSERT INTO `user` VALUES (13, NULL, NULL, '客户9', '18097342642', NULL, NULL, 3);
INSERT INTO `user` VALUES (14, NULL, NULL, '客户10', '18097342651', NULL, NULL, 3);
INSERT INTO `user` VALUES (15, NULL, NULL, '客户11', '18097342660', NULL, NULL, 4);
INSERT INTO `user` VALUES (16, NULL, NULL, '客户12', '18097342669', NULL, NULL, 4);
INSERT INTO `user` VALUES (17, NULL, NULL, '客户13', '18097342678', NULL, NULL, 4);
INSERT INTO `user` VALUES (18, NULL, NULL, '客户14', '18097342687', NULL, NULL, 4);
INSERT INTO `user` VALUES (19, NULL, NULL, '司机1', '18097342696', 1, NULL, 2);
INSERT INTO `user` VALUES (20, NULL, NULL, '司机2', '18097342705', 1, NULL, 2);
INSERT INTO `user` VALUES (21, NULL, NULL, '司机3', '18097342714', 1, NULL, 2);
INSERT INTO `user` VALUES (22, NULL, NULL, '司机4', '18097342723', 1, NULL, 3);
INSERT INTO `user` VALUES (23, NULL, NULL, '司机5', '18097342732', 1, NULL, 3);
INSERT INTO `user` VALUES (24, NULL, NULL, '司机6', '18097342741', 1, NULL, 3);
INSERT INTO `user` VALUES (25, NULL, NULL, '司机7', '18097342750', 1, NULL, 4);
INSERT INTO `user` VALUES (26, NULL, NULL, '司机8', '18097342759', 1, NULL, 4);
INSERT INTO `user` VALUES (27, NULL, NULL, '司机9', '18097342768', 1, NULL, 4);
INSERT INTO `user` VALUES (28, NULL, NULL, '装卸工1', '18097342777', 2, NULL, 2);
INSERT INTO `user` VALUES (29, NULL, NULL, '装卸工2', '18097342786', 2, NULL, 2);
INSERT INTO `user` VALUES (30, NULL, NULL, '装卸工3', '18097342795', 2, NULL, 2);
INSERT INTO `user` VALUES (31, NULL, NULL, '装卸工4', '18097342804', 2, NULL, 2);
INSERT INTO `user` VALUES (32, NULL, NULL, '装卸工5', '18097342813', 2, NULL, 3);
INSERT INTO `user` VALUES (33, NULL, NULL, '装卸工6', '18097342822', 2, NULL, 3);
INSERT INTO `user` VALUES (34, NULL, NULL, '装卸工7', '18097342831', 2, NULL, 3);
INSERT INTO `user` VALUES (35, NULL, NULL, '装卸工8', '18097342840', 2, NULL, 3);
INSERT INTO `user` VALUES (36, NULL, NULL, '装卸工9', '18097342849', 2, NULL, 4);
INSERT INTO `user` VALUES (37, NULL, NULL, '装卸工10', '18097342858', 2, NULL, 4);
INSERT INTO `user` VALUES (38, NULL, NULL, '装卸工11', '18097342867', 2, NULL, 4);
INSERT INTO `user` VALUES (39, NULL, NULL, '装卸工12', '18097342876', 2, NULL, 4);
INSERT INTO `user` VALUES (54, NULL, NULL, '张三', '18987667546', NULL, NULL, 2);
INSERT INTO `user` VALUES (59, NULL, NULL, '张伟帅', '17898766547', 1, NULL, 2);
INSERT INTO `user` VALUES (63, NULL, NULL, '李四', '17362537948', NULL, '', 2);
INSERT INTO `user` VALUES (64, NULL, NULL, '李纯悦', '18473672289', NULL, '', 2);
INSERT INTO `user` VALUES (65, NULL, NULL, '张世', '18475894834', 2, NULL, 2);
INSERT INTO `user` VALUES (67, NULL, NULL, '李大大', '18765435678', NULL, '测试', 2);
INSERT INTO `user` VALUES (68, NULL, NULL, '汪云飞', '178988765678', 1, NULL, 2);

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role`  (
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `role_id` int(8) NOT NULL COMMENT '角色id',
  PRIMARY KEY (`user_id`, `role_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES (1, 1);
INSERT INTO `user_role` VALUES (2, 2);
INSERT INTO `user_role` VALUES (3, 2);
INSERT INTO `user_role` VALUES (4, 2);

SET FOREIGN_KEY_CHECKS = 1;
