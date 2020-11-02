<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User</title>
    <link rel="stylesheet" href="/element-ui2.13.2/lib/theme-chalk/index.css">
    <link rel="stylesheet" href="/css/User.css">

</head>
<body>
<div id="app">
    <el-table :data="tableData" style="width: 100%" :row-class-name="tableRowClassName">
        <el-table-column prop="date" label="日期" width="180"></el-table-column>
        <el-table-column prop="name" label="姓名" width="180"></el-table-column>
        <el-table-column prop="address" label="地址" width="240"></el-table-column>
    </el-table>
    <br/>
    <br/>
    <el-row>
        <el-button>默认按钮</el-button>
        <el-button type="primary">主要按钮</el-button>
        <el-button type="success">成功按钮</el-button>
        <el-button type="info">信息按钮</el-button>
        <el-button type="warning">警告按钮</el-button>
        <el-button type="danger">警告按钮</el-button>
    </el-row>

    <br/>

    <el-row>
        <el-button plain>默认按钮</el-button>
        <el-button type="primary" plain>主要按钮</el-button>
        <el-button type="success" plain>成功按钮</el-button>
        <el-button type="info" plain>信息按钮</el-button>
        <el-button type="warning" plain>警告按钮</el-button>
        <el-button type="danger" plain>警告按钮</el-button>
    </el-row>

    <br/>

    <el-row>
        <el-button round>默认按钮</el-button>
        <el-button type="primary" round>主要按钮</el-button>
        <el-button type="success" round>成功按钮</el-button>
        <el-button type="info" round>信息按钮</el-button>
        <el-button type="warning" round>警告按钮</el-button>
        <el-button type="danger" round>警告按钮</el-button>
    </el-row>

    <br/>

    <el-row>
        <el-button round plain>默认按钮</el-button>
        <el-button type="primary" round plain>主要按钮</el-button>
        <el-button type="success" round plain>成功按钮</el-button>
        <el-button type="info" round plain>信息按钮</el-button>
        <el-button type="warning" round plain>警告按钮</el-button>
        <el-button type="danger" round plain :loading="true">警告按钮</el-button>
        <el-button type="text">警告按钮</el-button>
    </el-row>

    <br/>

    <el-row>
        <el-button icon="el-icon-search" circle></el-button>
        <el-button icon="el-icon-edit" type="primary" circle></el-button>
        <el-button icon="el-icon-check" type="success" circle></el-button>
        <el-button icon="el-icon-message" type="info" circle></el-button>
        <el-button icon="el-icon-star-off" type="warning" circle></el-button>
        <el-button icon="el-icon-star-on" type="warning" circle></el-button>
        <el-button icon="el-icon-delete" type="danger" circle></el-button>
    </el-row>

    <br/>

    <el-row>
        <el-button>默认按钮</el-button>
        <el-button size="medium">默认按钮</el-button>
        <el-button size="small">默认按钮</el-button>
        <el-button size="mini">默认按钮</el-button>
    </el-row>

</div>
<script type="text/javascript" src="/vueCDN/vue.js"></script>
<script type="text/javascript" src="/element-ui2.13.2/lib/index.js"></script>
<script type="text/javascript" src="/js/User.js"></script>
</body>
</html>