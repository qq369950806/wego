<#list 1..pageBean.pages as i>
    <span style="margin-right: 23px;">
        <a href="javascript:void(0);" onclick="getPage(${i})">
            <span <#if pageBean.pageNum = i> style="color: red;" </#if>>${i}</span>
        </a>
   </span>
</#list>
<select name="pageSize" id="pageSizeSelect">
    <option value="10" <#if pageBean.pageSize==10>selected</#if>>10</option>
    <option value="20" <#if pageBean.pageSize==20>selected</#if>>20</option>
    <option value="30" <#if pageBean.pageSize==30>selected</#if>>30</option>
    <option value="40" <#if pageBean.pageSize==40>selected</#if>>40</option>
</select>

<script type="text/javascript">
    function getPage(pageNum) {
        let pageSize = $("#pageSizeSelect").val();
        document.location.href = "${request.contextPath}/${pageBean.url!}&pageSize=" + pageSize + "&pageNum=" + pageNum
    };
</script>