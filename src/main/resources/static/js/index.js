$("#one").click(function(){
    alert("你好")
    $.ajax({
        type:"POST",
        url:"/sp/pc/one/18",
        contentType:"application/json",
        data:'{"name":"张三","age":18}',
        dateTyep:"json",
        success:function(data){
            console.log(data)
        }
    })
})