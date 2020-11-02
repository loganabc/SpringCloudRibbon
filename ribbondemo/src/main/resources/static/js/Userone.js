var vue = new Vue({
    el: '#app',
    data:{
        userList:[],
        userId:null,
    },
    mounted:function(){
        this.queryUserList();
    },
    methods: {
        tableRowClassName({row, rowIndex}) {
            if (rowIndex%4 === 1) {
                return 'warning-row';
            } else if (rowIndex%4 === 3) {
                return 'success-row';
            }
            return '';
        },
        queryUserList:function () {
            axios({
                methods: 'POST',
                url:'/ribbon/hello2',
            }).then(function (res){
                if(res.data.code == 200){
                    this.userList = res.data.userList;
                }else if(res.data.code == 201){
                    this.$message.error(res.data.msg);
                    return;
                }
            }.bind(this)).catch(function (err) {
                console.log(err);
            });
        },
        queryById:function(){
            var parameter = new FormData();
            parameter.append("id", this.userId);
            axios({
                method:'post',
                url:'/ribbon/hello7',
                data:parameter,
            }).then(function (res){
                if(res.data.code == 200){
                    this.userList = res.data.user;
                }else if(res.data.code == 201){
                    this.$message.error(res.data.msg);
                    return;
                }
            }.bind(this)).catch(function (err) {
                console.log(err);
            });
        }
    }
})