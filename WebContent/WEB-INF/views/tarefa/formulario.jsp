<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
	<body>
		<h3>Adicionar tarefas</h3>
		
		<form action="adicionaTarefa" method="post">
		
			<form:errors path="tarefa.descricao" cssStyle="color:red" /> <br />
			Descrição: <br />
			<textarea name="descricao" rows="5" cols="100"></textarea> <br />
			
			<input type="submit" value="Adicionar" />
		</form>
	</body>
</html>