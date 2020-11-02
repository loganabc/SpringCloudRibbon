<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User</title>
    <link rel="stylesheet" href="/element-ui2.13.2/lib/theme-chalk/index.css">
    <link rel="stylesheet" href="/css/Userone.css">
</head>
<body>
<div id="app">
    <el-input v-model="userId" placeholder="用户ID"></el-input>
    <br/>
    <el-button type="primary" @click="queryById">主要按钮</el-button>

    <el-table :data="userList" style="width: 100%" :row-class-name="tableRowClassName">
        <el-table-column prop="userId" label="ID" width="180"></el-table-column>
        <el-table-column prop="password" label="密码" width="180"></el-table-column>
        <el-table-column prop="userName" label="姓名" width="180"></el-table-column>
        <el-table-column prop="isDeleted" label="地址" width="240"></el-table-column>
    </el-table>



</div>
<script type="text/javascript" src="/vueCDN/vue.js"></script>
<script type="text/javascript" src="/element-ui2.13.2/lib/index.js"></script>
<script type="text/javascript" src="/axios-0.19.2/dist/axios.js"></script>
<script type="text/javascript" src="/js/Userone.js"></script>
</body>
</html>