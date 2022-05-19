<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>增加收件地址</title>
</head>
<body>
<h2>增加收件地址</h2>
<select>
    <#list  provinceVOList as provinceVO>
        <option value="${provinceVO.id}">${provinceVO.name}</option>
    </#list>
</select>
</body>
</html>
