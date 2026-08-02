console.log("login.js loaded");
document.getElementById("loginForm").addEventListener("submit", async function (e) {

    e.preventDefault();

    const loginData = {
        username: document.getElementById("username").value,
        password: document.getElementById("password").value
    };

    const response = await fetch("/api/users/login", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(loginData)
    });

    if (response.ok) {
        const user = await response.json();

        if (user) {
            alert("Login Successful!");

            window.location.href = "dashboard.html";
        } else {
            alert("Invalid Username or Password!");
        }

    } else {
        alert("Login Failed!");
    }

});
