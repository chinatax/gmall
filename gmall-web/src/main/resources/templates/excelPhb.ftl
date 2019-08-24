<!DOCTYPE html>
<html >
<body>
<H1>Hello,World!</H1>
<div>
    <a href="/phb/exportExcel" target="_blank">EasyExcel导出测试</a>
</div>
<div style="position: relative;">
    <input style="width: 68px; position: absolute;opacity: 0;" id="importExcel" type="file" accept=".xlsx">
    <button >导入测试</button>
</div>

<script src="/js/jquery-3.3.1.min.js?1"></script>
<script src="/layui/layer/layer.js?1"></script>
<script src="/jqueryFileUpload-9.10.0/vendor/jquery.ui.widget.js?1"></script>
<script src="/jqueryFileUpload-9.10.0/jquery.fileupload.js?1"></script>
<script>
    $('#importExcel').fileupload({

        url: "/phb/importExcel",
        dataType: 'json',
        success: function (data) {
            layer.msg(data.msg);
        }
    });
</script>
<div>
    <a href="/phb/insertPhb" target="_blank">入库排行榜</a>
</div>
</body>
</html>