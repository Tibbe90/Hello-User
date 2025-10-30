let userId = document.getElementById("userId");
userId.value = localStorage.getItem("savedUser");
if (userId == null) {
  userId = "0";
}
let userLabel = document.createElement("label");
let passwordLabel = document.createElement("label");
let resultText = document.createElement("label");
resultText.textContent = localStorage.getItem("resultText") || "";

let userName = document.createElement("input");
let passwordInput = document.createElement("input");
let displayUsrInput = document.getElementById("userInput");
let displayPswrdInput = document.getElementById("passwordInput");
userLabel.textContent = "User: ";
passwordLabel.textContent = "Password: ";
userName.type = "text";
passwordInput.type = "password";

let loginField = document.getElementById("loginField");
let loginBtn = document.getElementById("loginBtn");
let submitBtn = document.getElementById("submitBtn");
let logoutBtn = document.getElementById("logoutBtn");

loginBtn.style.visibility = "hidden";
submitBtn.style.visibility = "hidden";
logoutBtn.style.visibility = "hidden";

if (userId.value == "e1345b8f-82dc-44de-92d4-b822eae259c5") {
  loginBtn.style.visibility = "hidden";
  resultText.textContent = "Logged in";
  localStorage.setItem("resultText", resultText.textContent);
  logoutBtn.style.visibility = "visible";
} else {
  loginBtn.style.visibility = "visible";
}

loginBtn.addEventListener("click", function () {
  loginBtn.style.visibility = "hidden";
  displayUsrInput.appendChild(userLabel);
  displayUsrInput.appendChild(userName);
  displayPswrdInput.appendChild(passwordLabel);
  displayPswrdInput.appendChild(passwordInput);
  displayUsrInput.style.visibility = "visible";
  displayPswrdInput.style.visibility = "visible";
  submitBtn.style.visibility = "visible";
});

submitBtn.addEventListener("click", function () {
  resultText.style.visibility = "visible";
  let user = userName.value;
  let password = passwordInput.value;
  if (user == "admin" && password == "admin") {
    userId.value = "e1345b8f-82dc-44de-92d4-b822eae259c5";
    localStorage.setItem("savedUser", userId.value);
    displayUsrInput.style.visibility = "hidden";
    displayPswrdInput.style.visibility = "hidden";
    submitBtn.style.visibility = "hidden";
    logoutBtn.style.visibility = "visible";
  } else {
    userId.value = "0";
    localStorage.setItem("savedUser", userId.value);
    resultText.textContent = "Login failed";
    localStorage.setItem("resultText", resultText.textContent);
  }
});

logoutBtn.addEventListener("click", function () {
  loginBtn.style.visibility = "visible";
  logoutBtn.style.visibility = "hidden";
  resultText.style.visibility = "hidden";
  localStorage.setItem("resultText", " ");
  userId.value = "0";
  localStorage.setItem("savedUser", userId.value);
});
loginField.appendChild(resultText);
