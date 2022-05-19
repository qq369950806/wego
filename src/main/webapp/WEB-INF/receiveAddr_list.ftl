<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>用户地址列表</title>
</head>
<body>

<a href="${request.contextPath}/receiveAddr/openAddPage">增加收件地址</a>
<br>
<hr>
<br>
<form action="" method="get">
    <table style="width: 88%;text-align: center;">
        <tr>
            <td></td>
            <td>编号</td>
            <td>收件人姓名</td>
            <td>省</td>
            <td>市</td>
            <td>区</td>
            <td>详细地址</td>
            <td>邮编</td>
            <td>电话</td>
            <td></td>
        </tr>
        <#assign i=0>
        <#list receiveAddrVOList as receiveAddrVO>
            <#assign i=i+1>
            <tr>
                <td>
                    <input type="radio" name="receiceId" value="${receiveAddrVO.id}">
                </td>
                <td>${i}</td>
                <td>${receiveAddrVO.receiver}</td>
                <td>${receiveAddrVO.province}</td>
                <td>${receiveAddrVO.city}</td>
                <td>${receiveAddrVO.country}</td>
                <td>${receiveAddrVO.addr}</td>
                <td>${receiveAddrVO.postcode}</td>
                <td>${receiveAddrVO.tel}</td>
                <td><#if i==1>默认</#if></td>
            </tr>
        </#list>
        <tr>
            <td colspan="10">
                <input type="submit" value="选中作为订单的地址">
            </td>
        </tr>
    </table>
</form>
</body>
</html>