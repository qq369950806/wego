<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>增加收件地址</title>
</head>
<body>
<h2>增加收件地址</h2>
<select id="provinceSelect">
    <#list  provinceVOList as provinceVO>
        <option value="${provinceVO.id}">${provinceVO.name}</option>
    </#list>
</select>
<select id="citySelect">
    <option value="-1">请选择城市</option>
</select>
<select id="countrySelect">
    <option value="-1">请选择县区</option>
</select>
<script src="${request.contextPath}/assets/js/jquery3.6.0.js"></script>
<script>
    $("#provinceSelect").change(function (){
        //获取用户当前选择省份的编号
        let provinceId = $("#provinceSelect").val();
        //AJAX请求，获取指定省下所有的城市
        $.get("${request.contextPath}/city/getCityByProvinceId/"+provinceId,function(res) {
            //先将Select清空
            $("#citySelect").empty();
            //将数据写到option中，同时将option加入到select
            for (let i in res) {
                $("#citySelect").append("<option value= '"+res[i].id+"'>"+res[i].name+"</option>");
            }
        });
    })
    $("#citySelect").change(function (){
        let cityId = $("#citySelect").val();
        $.get("${request.contextPath}/country/getCountryByCityId/"+cityId,function (res) {
            $("#countrySelect").empty();
            for(let i in res){
                $("#countrySelect").append("<option value='"+res[i].id+"'>"+res[i].name+"</option>");
            }
        })

    });
</script>
</body>
</html>
