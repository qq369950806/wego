<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>修改收件地址</title>
</head>
<body>
<h2>修改收件地址</h2>
<form action="${request.contextPath}/receiveAddr/" method="post">
    <input type="hidden" name="id" value="${receiveAddr.id}">
    收件人：<input type="text" name="receiver" value="${receiveAddr.receiver}"> <br>
    <span id="provinceSelectSpan">
          <select id="provinceSelect">
        <#list province?keys as key>
            <option value="${key}">${province[key]}</option>
        </#list>
    </select>
    </span>
    <select id="citySelect">
        <#list city?keys as key>
            <option value="${key}">${city[key]}</option>
        </#list>
    </select>
    <select id="countrySelect" name="countryId">
        <#list country?keys as key>
            <option value="${key}">${country[key]}</option>
        </#list>
    </select>
    <br>
    详细地址：<input type="text" name="addr" value="${receiveAddr.addr}"> <br>
    邮编：<input type="text" name="postcode" value="${receiveAddr.postcode}"> <br>
    电话：<input type="text" name="tel" value="${receiveAddr.tel}"> <br>
    <input type="submit" value="提交">
</form>

<script src="${request.contextPath}/assets/js/jquery3.6.0.js"></script>
<script>
    $("#provinceSelectSpan").click(function () {
        $.get("${request.contextPath}/province/list", function (res) {
            //先将Select清空
            $("#provinceSelect").empty();
            //将数据写到option中，同时将option加入到select
            for (let i in res) {
                $("#provinceSelect").append("<option value= '" + res[i].id + "'>" + res[i].name + "</option>");
            }
        });
    });

    <#--$("#provinceSelect").change(function () {-->
    <#--    //获取用户当前选择省份的编号-->
    <#--    let provinceId = $("#provinceSelect").val();-->
    <#--    //AJAX请求，获取指定省下所有的城市-->
    <#--    $.get("${request.contextPath}/city/getCityByProvinceId/" + provinceId, function (res) {-->
    <#--        //先将Select清空-->
    <#--        $("#citySelect").empty();-->
    <#--        //将数据写到option中，同时将option加入到select-->
    <#--        for (let i in res) {-->
    <#--            $("#citySelect").append("<option value= '" + res[i].id + "'>" + res[i].name + "</option>");-->
    <#--        }-->
    <#--    });-->
    <#--})-->
    <#--$("#citySelect").change(function () {-->
    <#--    let cityId = $("#citySelect").val();-->
    <#--    $.get("${request.contextPath}/country/getCountryByCityId/" + cityId, function (res) {-->
    <#--        $("#countrySelect").empty();-->
    <#--        for (let i in res) {-->
    <#--            $("#countrySelect").append("<option value='" + res[i].id + "'>" + res[i].name + "</option>");-->
    <#--        }-->
    <#--    })-->
    <#--});-->
</script>
</body>
</html>
