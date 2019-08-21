# gmall 从gitHub上fetch下来后
idea中建立springboot工程gmall，再次push到gitHub上
建立springboot工程gmall后，首次提交;
增加了几个springboot子工程:gmall-base
                         gmall-dao
                         gmall-service
                         gmall-web
增加各个子模块之间的依赖关系，删除各子模块不需要的文件夹
index 测试页面
本次更新，基本框架确定了，功能添加了oracle jdbcTemplate 和Test测试出错等问题，比较满意
增加了redisCache功能
添加了excel导入导出功能
将导入的excel文件保存在redis中，这波操作完美！
完美解决mybatis数据导入问题，excel数据成功导入到oracle数据库
新增功能excel导入导出减费帐一 ，并写入oracle数据库