<%@include  file="../shared/header.jsp" %>
<div class="pull-right">
    <p>
        <a href="${BASE_URL}/accounts/add" class="btn btn-primary"></a>
        <span class="glyphicon glyphicon-plus">Add</span>
        
    </p>
   
</div>
<table  class="table table-striped table-bordered table-hovered">
    <tr>
        <th>  Id</th>
        <th> Name</th>
        <th> Description </th>
        <th> Interest </th>
        <th>Minimum Balance</th>
        <th>Status</th> 
    </tr>
    <c:forEach var="account" items="${requestScope.accounts}">
        <c:set var="bg" value=""/>
        <c:choose>
            <c:when test="${account.status}">
                <c:set var="bg" value="success"/>
            </c:when>
            <c:otherwise>
                <c:set var="bg" value="danger"/>
            </c:otherwise>
        </c:choose>
        <tr class="${bg}">
            <td>${account.id}</td>
            <td>${account.name}</td>
            <td>${account.desription}</td>
            <td>${account.interest}</td>
            <td>${account.minimumBalance}</td>
            <td>
                <c:choose>
                    <c:when test="${account.status}">
                        Active
                    </c:when>
                    <c:otherwise>
                        Inactive
                    </c:otherwise>
                </c:choose>

            </td>
        </tr>
    </c:forEach>
</table>

<%@include file="../shared/footer.jsp" %>
