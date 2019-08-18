<!DOCTYPE html>
<html>
<head lang="en">
	<title>Spring Boot Demo - FreeMarker</title>
	
	<link href="/static/css/index.css" rel="stylesheet" />
	
</head>
<body>
	<center>
		<img src="/static/images/logo.png" />
		<h1 id="title">${title}</h1>
	</center>
	
	<script type="text/javascript" src="/webjars/jquery/2.1.4/jquery.min.js"></script>
	
	<script>
		
	
	
		$(function(){
			$('#title').click(function(){
				//alert('点击了');
				$.ajax({
						url: "http://127.0.0.1:8081/api/get",
						type: "POST",
						data: {
						    name: "测试跨域访问!"
						},
						success: function(data, status, xhr) {
						console.log(data);
						alert(data.name);
						}
					});
				
			});
		})
	</script>
	
	<form method="POST" enctype="multipart/form-data" action="/file/upload">
文件：<input type="file" name="tiggerFile" />
<input type="submit" value="上传" />
</form>
</body>
</html>
