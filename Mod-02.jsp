<!-- A metodologia JSP (Java Server Pages) é caracterizado pela implementação de conteúdo da página dinâmica ao lado do servidor. 
Dessa forma - o navegador web inclue dinamicamente o conteúdo nas páginas HTML antes que elas sejam enviadas para um navegador solicitante.

Já o Angula é um framework que utiliza HTML e TypeScript para criar a interface com o usuário, ou seja, o front-end em aplicações web, 
desktop e dispositivos móveis. Essa linguagem permite aos desenvolvedores web fazer uso da linguagem de marcação HTML para definir associações de dados, 
validações, além de response handlers para lidar com as ações do usuário em um formato declarativo que também contribui para essa mesma aceleração. -->

<!-- Exemplo de código JSP --/>

<% out.println("Ola Mundo"); %>

<!-- Exemplo de código Angular -->

<!--

<!doctype html>
<html ng-app>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.7/angular.min.js"></script>

<script src="todo.js">
</script>
<title>Insert title here</title>
</head>
<body>
	<div ng-controller="hello">
		Hello {{name}}
		<hr />
		<label>Name</label>
<input ng-model="typeName" placeHolder="type your name please" /> <br />
			 Hi {{typeName}}, <br />
			<br/>
		<br/>
		<label>Quantity of product</label>
		 <input type="number"	  ng-model="qt"	required="required" /> 
			<label>Inform Price</label>
			 <input	type="number" ng-model="price" required="required" /> 
			Total {{qt *price | currency}}
	</div>
</body>
</html>

-->

