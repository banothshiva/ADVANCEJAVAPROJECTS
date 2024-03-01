function validateForm()
{
	var proId = document.getElementById("proId").value;
	var proName = document.getElementById("proName").value;
	var proPrice = document.getElementById("proPrice").value;
	var proBrand = document.getElementById("proBrand").value;
	var proMadeIn = document.getElementById("proMadeIn").value;
	if(proId.trim()==="" || proName.trim()==="" || proPrice.trim()==="" || proBrand.trim()==="" || proMadeIn.trim()=== "")
	{
		alert("All Fields Must Be Filled Out");
		return false;
	}
	if(parseFloat(proPrice) < 0)
	{
		alert("Prooduct Price Must Be A Non-Negative Value");
		return false;
	}
	if(proName.length > 50 || proBrand.length > 50)
	{
		alert("Product Name And Product Brand Must Be Less Than 50 Characters");
		return false;
	}
	
	//get the manufacture and expiry dates
	var proMfgDate = document.getElementById("proMfgDate").value;
	var proExpDate = document.getElementById("proExpDate").value;
	
	//convert into date format
	var manufacturingDateObj = new Date(proMfgDate);
	var expiryDateObj = new Date(proExpDate);
	
	//check the validation of dates
	if(manufacturingDateObj > expiryDateObj)
	{
		alert("Manufacturing Date Cannot Be Greater Than Expiry Date");
		return false;
	}
	return true;
}