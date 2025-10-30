let userId = localStorage.getItem("savedUser");
if (Number(userId) == null) {
  userId = 0;
}
let userLabel = document.createElement("label");
userLabel.textContent = "User: ";
let passwordLabel = document.createElement("label");
passwordLabel.textContent = "Password: ";
let failedText = document.createElement("label");
failedText.textContent = "Login Failed";
let successText = document.createElement("label");
successText.textContent = "Login Successful";
let userName = document.createElement("input");
userName.type = "text";
let passwordInput = document.createElement("input");
passwordInput.type = "password";

let loginField = document.getElementById("loginField");
let displayUsrInput = document.getElementById("userInput");
let displayPswrdInput = document.getElementById("passwordInput");
let userIdCheck = document.getElementById("userId")

let loginBtn = document.getElementById("loginBtn");
let submitBtn = document.getElementById("submitBtn");
submitBtn.style.visibility = "hidden";
let logoutBtn = document.getElementById("logoutBtn")
logoutBtn.style.visibility = "hidden"

loginBtn.addEventListener("click", function () {
  loginBtn.style.visibility = "hidden";
  failedText.style.visibility = "hidden";
  displayUsrInput.style.visibility = "visible";
  displayPswrdInput.style.visibility = "visible";
  displayUsrInput.appendChild(userLabel);
  displayUsrInput.appendChild(userName);
  displayPswrdInput.appendChild(passwordLabel);
  displayPswrdInput.appendChild(passwordInput);
  submitBtn.style.visibility = "visible";
});

  submitBtn.addEventListener("click", function () {
    let user = userName.value;
    let password = passwordInput.value;
    if (user == "admin" && password == "admin") {
      userId = "e1345b8f-82dc-44de-92d4-b822eae259c5";
      localStorage.setItem("savedUser", userId);
      loginField.appendChild(successText);
      displayUsrInput.style.visibility = "hidden";
      displayPswrdInput.style.visibility = "hidden";
      submitBtn.style.visibility = "hidden";
      logoutBtn.style.visibility = "visible";
      
    } else {
        userId = 0;
        loginField.appendChild(failedText);
    }
    userIdCheck = userId
    console.log(userIdCheck);
  });

  logoutBtn.addEventListener('click', function() {
    loginBtn.style.visibility = "visible"
    logoutBtn.style.visibility = "hidden"
    successText.style.visibility = "hidden"
  })