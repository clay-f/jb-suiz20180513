# 报销审批测试

更新 2018-06-08 21:44

为了适配新模式使用前后分离， mvc 将被拆解。版本 0.2 仍然保留 mvc

----

更新 2018-06-14 17:27

### 发票工作流程:

#### 描述
根据当前用户角色，对发票有不同的管理功能

#### 功能
* 普通员工: 创建发票、修改发票、每一次提交发票信息后都要等上级审批

> 若上级拒绝审批通过，则需重新修改发票信息，以便再次提交发票

* 经理: 查看所有发票，审核发票或拒绝

* 管理: 查看所有金额大于 5000 的发票；拥有对订单审批的权限

* 财务: 查看已经审批通过的订单并支付金额

* 员工: 发起审批
