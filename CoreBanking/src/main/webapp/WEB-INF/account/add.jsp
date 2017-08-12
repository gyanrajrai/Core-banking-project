<%@include file="../shared/header.jsp" %>
<script src="https://cdn.ckeditor.com/4.7.0/standard/ckeditor.js"></script>

<div class="header">
    <h1>Account Add</h1>
</div>
<form action="" method="POST" name="">
    <div class="form-group">
        <label> Account Name:</label>
        <input type="text" name="accountName" class="form-control" required="required"/>


    </div>
    <div class="form-group">
        <label> Account Description:</label>
        <textarea name="accountDescription" id="editor" class="form-control" required="required"/>


    </div>
    <div class="form-group">
        <label> Account Interest</label>
        <input type="text" name="interest" class="form-control" required="required"/>
    </div>
    <div class="form-group">
        <label> Account Min Balance</label>
        <input type="text" name="minimumBalance" class="form-control" required="required"/>
    </div>
    <div class="checkbox">
        <label> Account Status</label>
        <label> <input type="checkbox" name="status" class="" required="required"/>

        </label>
    </div>
    <button type="submit" class="btn btn-success">Save</button>
    <button 
    <a href="${BASE_URL}/accounts" class="btn btn-danger">Back</a>



</form>
<script>
    CKEDITOR.replace('editor');
</script>


<%@include file="../shared/footer.jsp" %>
