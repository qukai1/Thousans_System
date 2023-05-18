/*
 Navicat Premium Data Transfer

 Source Server         : CateDate
 Source Server Type    : MySQL
 Source Server Version : 50729
 Source Host           : localhost:3306
 Source Schema         : king

 Target Server Type    : MySQL
 Target Server Version : 50729
 File Encoding         : 65001

 Date: 18/05/2023 22:19:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for food
-- ----------------------------
DROP TABLE IF EXISTS `food`;
CREATE TABLE `food`  (
  `foodID` int(4) NOT NULL AUTO_INCREMENT COMMENT '菜品ID',
  `foodIn` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '菜品介绍',
  `foodName` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '菜品名称',
  `foodPrice` decimal(10, 2) NOT NULL COMMENT '菜品价格',
  `foodState` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '菜品状态',
  `foodType` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '菜品类型',
  `foodSculpture` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '菜品图片',
  `merchantsID` int(11) NOT NULL COMMENT '商家ID',
  PRIMARY KEY (`foodID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of food
-- ----------------------------
INSERT INTO `food` VALUES (16, '这个菜很好吃', '辣椒炒肉', 20.00, '上架', '小吃', '2022-05-17_08_26_10_232.png', 1);
INSERT INTO `food` VALUES (17, '0', '1212', 12.00, '预售', '小吃', '2022-05-17_08_26_10_232.png', 1);
INSERT INTO `food` VALUES (18, '0', '12', 12.00, '预售', '小吃', '2022-05-17_09_22_02_581.png', 1);
INSERT INTO `food` VALUES (19, '辣椒炒肉', '12', 1212.00, '上架', '小吃', '2022-05-17_09_28_11_702.png', 1);
INSERT INTO `food` VALUES (20, '0', '强子炒肉', 56.55, '上架', '小炒', NULL, 1);

-- ----------------------------
-- Table structure for orderdateiled
-- ----------------------------
DROP TABLE IF EXISTS `orderdateiled`;
CREATE TABLE `orderdateiled`  (
  `dateiledID` int(11) NOT NULL AUTO_INCREMENT COMMENT '详细订单ID',
  `foodPrice` decimal(10, 2) NOT NULL COMMENT '菜品价格',
  `orderCount` int(11) NOT NULL COMMENT '数量',
  `orderID` int(11) NULL DEFAULT NULL COMMENT '数量',
  `sFoodName` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '菜品名称',
  PRIMARY KEY (`dateiledID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of orderdateiled
-- ----------------------------
INSERT INTO `orderdateiled` VALUES (1, 20.00, 1, 1, '小炒肉');
INSERT INTO `orderdateiled` VALUES (2, 10.00, 1, 2, '土豆丝');

-- ----------------------------
-- Table structure for orderstate
-- ----------------------------
DROP TABLE IF EXISTS `orderstate`;
CREATE TABLE `orderstate`  (
  `orderStateID` int(11) NOT NULL AUTO_INCREMENT COMMENT '状态ID',
  `orderNumber` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单编号',
  `orderState` varchar(14) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单状态',
  PRIMARY KEY (`orderStateID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of orderstate
-- ----------------------------
INSERT INTO `orderstate` VALUES (1, '202205161430', '4');
INSERT INTO `orderstate` VALUES (2, '202020', '3');

-- ----------------------------
-- Table structure for orderthe
-- ----------------------------
DROP TABLE IF EXISTS `orderthe`;
CREATE TABLE `orderthe`  (
  `orderID` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单ID',
  `merchantsID` int(11) NOT NULL COMMENT '商家ID',
  `userID` int(11) NOT NULL COMMENT '用户ID',
  `address` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '下单地址',
  `name` varchar(7) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名字',
  `orderNumber` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单编号',
  `saleDate` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '下单日期',
  `shoppingNote` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户备注',
  `shoppingPrice` decimal(10, 2) NOT NULL COMMENT '购物车订单总额',
  `xPhone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户手机号',
  PRIMARY KEY (`orderID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of orderthe
-- ----------------------------
INSERT INTO `orderthe` VALUES (1, 1, 2, '沙县小吃', '小李', '202205161430', '2020-11-1', '小辣', 40.00, '15960378008');
INSERT INTO `orderthe` VALUES (2, 1, 2, '沙县小吃', '小王', '202020', '2020-2-2', '差俩', 20.00, '12213123213');

-- ----------------------------
-- Table structure for shopping
-- ----------------------------
DROP TABLE IF EXISTS `shopping`;
CREATE TABLE `shopping`  (
  `shoppingID` int(11) NOT NULL COMMENT '购物车ID',
  `foodID` int(11) NOT NULL COMMENT '菜品ID',
  `merchantsID` int(11) NOT NULL COMMENT '商家id',
  `userID` int(11) NULL DEFAULT NULL COMMENT '用户ID',
  `shoppingCount` int(11) NOT NULL DEFAULT 1 COMMENT '购物数量',
  `shoppingPrice` decimal(10, 2) NOT NULL COMMENT '购物车订单总额',
  PRIMARY KEY (`shoppingID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of shopping
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `sculpture` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像',
  `mailbox` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '邮箱',
  `account` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '账号',
  `userAddres` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `userPhone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话号码',
  `userName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户姓名',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户类型',
  `merchantsType` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '店铺类型',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '2022-05-16_01_40_01_869.png', 'heibas@126.com', '123', '234', '23', '沙县小吃', '123', '商家', '234');
INSERT INTO `user` VALUES (2, '', '1212', '1', '12', '12', '21', '123', '普通用户', '12123');
INSERT INTO `user` VALUES (3, '2022-05-16_01_40_01_869.png', '1', '11', '1', '1', '东北饺子', '1221', '管理员', NULL);
INSERT INTO `user` VALUES (4, '2022-05-16_01_40_01_869.png', '1', '11', '1', '1', '东北饺子', '1221', '商家', NULL);
INSERT INTO `user` VALUES (5, '2022-05-16_01_40_01_869.png', '1', '11', '1', '1', '东北饺子', '1221', '商家', NULL);
INSERT INTO `user` VALUES (6, '2022-05-16_01_40_01_869.png', '1', '11', '1', '1', '东北饺子', '1221', '商家', NULL);
INSERT INTO `user` VALUES (7, '2022-05-16_01_40_01_869.png', '1', '11', '1', '1', '东北饺子', '1221', '商家', NULL);
INSERT INTO `user` VALUES (8, '2022-05-16_01_40_01_869.png', '1', '11', '1', '1', '东北饺子', '1221', '商家', NULL);
INSERT INTO `user` VALUES (9, '2022-05-16_01_40_01_869.png', '1', '11', '1', '1', '东北饺子', '1221', '商家', NULL);
INSERT INTO `user` VALUES (10, '2022-05-16_01_40_01_869.png', '1', '11', '1', '1', '东北饺子', '1221', '商家', NULL);
INSERT INTO `user` VALUES (11, '2022-05-16_01_40_01_869.png', '1', '11', '1', '1', '东北饺子', '1221', '商家', NULL);

SET FOREIGN_KEY_CHECKS = 1;
