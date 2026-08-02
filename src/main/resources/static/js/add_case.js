document.getElementById("caseForm").addEventListener("submit", async function (e) {

    e.preventDefault();

    // Read all input values
    const caseId = document.getElementById("caseId").value.trim();
    const title = document.getElementById("title").value.trim();
    const complainant = document.getElementById("complainant").value.trim();
    const phone = document.getElementById("phone").value.trim();
    const priority = document.getElementById("priority").value;
    const status = document.getElementById("status").value;
    const description = document.getElementById("description").value.trim();

    // Validation
    if (caseId === "") {
        alert("Please enter Case ID");
        return;
    }

    if (title === "") {
        alert("Please enter Case Title");
        return;
    }

    if (complainant === "") {
        alert("Please enter Complainant Name");
        return;
    }

    if (phone === "") {
        alert("Please enter Phone Number");
        return;
    }

    if (!/^[0-9]{10}$/.test(phone)) {
        alert("Phone number must contain exactly 10 digits.");
        return;
    }

    if (description === "") {
        alert("Please enter Description");
        return;
    }

    // Create object
    const caseData = {
        caseId: caseId,
        title: title,
        complainant: complainant,
        phone: phone,
        priority: priority,
        status: status,
        description: description
    };

    try {

        const response = await fetch("/api/cases", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(caseData)
        });

        if (response.ok) {
            alert("Case Saved Successfully!");
            document.getElementById("caseForm").reset();
        } else {
            alert("Failed to save case.");
        }

    } catch (error) {
        console.error(error);
        alert("Unable to connect to the server.");
    }

});
