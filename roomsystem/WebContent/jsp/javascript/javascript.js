function pageLoad(page) {
	window.location = page;
}

function formSubmit() {
	if (formSubmit.arguments.length == 1) {
		var form = window.document.getElementsByTagName("form")[0];
		form.action = formSubmit.arguments[0];
		form.submit();
	} else if (formSubmit.arguments.length == 2) {
		var form = window.document.getElementsByTagName("form")[0];
		form.action = formSubmit.arguments[0] + "?index="
				+ formSubmit.arguments[1];
		form.submit();
	} else if (formSubmit.arguments.length == 3) {
		var form = window.document.getElementsByTagName("form")[0];
		form.action = formSubmit.arguments[0] + "?refer="
				+ formSubmit.arguments[2];
		form.submit();
	}
}

function disableDoubleClick() {
	window.document.getElementsByTagName("button"). disabled = "disabled";
	document.getElementsByTagName("submit"). disabled = "disabled";
}

function loginManageSetUserInputFormLoad() {
	var checkbox = window.document.getElementById("if_password");
	if (checkbox.checked == false) {
		window.document.getElementById("password"). disabled = "disabled";
		window.document.getElementById("new_password"). disabled = "disabled";
		window.document.getElementById("password_confirm"). disabled = "disabled";
	}else{
		window.document.getElementById("password"). disabled = false;
		window.document.getElementById("new_password"). disabled = false;
		window.document.getElementById("password_confirm"). disabled = false;
	}
}

function loginManageSetUserInputCheckBoxClicked() {
	var checkbox = window.document.getElementById("if_password");
	if (checkbox.checked == false) {
		window.document.getElementById("password"). disabled = "disabled";
		window.document.getElementById("new_password"). disabled = "disabled";
		window.document.getElementById("password_confirm"). disabled = "disabled";
		window.document.getElementById("password"). value = "";
		window.document.getElementById("new_password"). value = "";
		window.document.getElementById("password_confirm"). value = "";
	}else{
		window.document.getElementById("password"). disabled = false;
		window.document.getElementById("new_password"). disabled = false;
		window.document.getElementById("password_confirm"). disabled = false;
	}
}

function total_calculate(total_charge, amount) {
	var total_charge = Number('0');
	var zero = document.getElementById('0'). value;
	var one = document.getElementById('1'). value;
	var two = document.getElementById('2'). value;
	var three = document.getElementById('3'). value;
	var four = document.getElementById('4'). value;
	var five = document.getElementById('5'). value;
	if (zero!="" && !isNaN(zero)) {
		total_charge = total_charge + parseInt(document.getElementById('0'). value);
	}
	if (one!="" && !isNaN(one)) {
		total_charge = total_charge + parseInt(document.getElementById('1'). value);
	}
	if (two!="" && !isNaN(two)) {
		total_charge = total_charge + parseInt(document.getElementById('2'). value);
	}
	if (three!="" && !isNaN(three)) {
		total_charge = total_charge + parseInt(document.getElementById('3'). value);
	}
	if (four!="" && !isNaN(four)) {
		total_charge = total_charge + parseInt(document.getElementById('4'). value);
	}
	if (five!="" && !isNaN(five)) {
		total_charge = total_charge + parseInt(document.getElementById('5'). value);
	}
	document.getElementById('6'). value = total_charge;
	
}