<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"></script>
</head>
</head>
<body class="container">

	<h1>Form</h1>
	<jsp:include page="menu.jsp" />
	<hr />


	<form action="./saveProduct" method="post">
	<div class="col-5">
		<div class="card">
			<div class="card-header">Product Form</div>
			<div class="card-body">
				
					<div class="form-group">
						<label>Product Name</label> 
						<input type="text" name="name"
							class="form-control" />
					</div>
					<div class="form-group">
						<label>Price</label> 
						<input type="text" name="price"
							class="form-control" />
					</div>

					<div class="form-group">
						<label>Description</label>
						<textarea class="form-control" name="description"></textarea>
					</div>

					<div class="form-group text-center mt-2">
						<button class="btn btn-primary">Save</button>
						<button class="btn btn-warning" type="reset">Reset</button>
					</div>


				</div>
			</div>
		</div>
	</form>

</body>
</html>