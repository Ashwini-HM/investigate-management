let currentCaseId = "";

async function loadCase() {

    currentCaseId = document.getElementById("searchId").value.trim();

    if (currentCaseId === "") {
        alert("Please enter Case ID");
        return;
    }

    const response = await fetch("/api/cases/" + currentCaseId);

    if (!response.ok) {
        alert("Case not found!");
        return;
    }

    const c = await response.json();

    document.getElementById("title").value = c.title;
    document.getElementById("complainant").value = c.complainant;
    document.getElementById("phone").value = c.phone;
    document.getElementById("priority").value = c.priority;
    document.getElementById("status").value = c.status;
    document.getElementById("description").value = c.description;
}

async function updateCase() {

    const title = document.getElementById("title").value.trim();
    const complainant = document.getElementById("complainant").value.trim();
    const phone = document.getElementById("phone").value.trim();
    const priority = document.getElementById("priority").value;
    const status = document.getElementById("status").value;
    const description = document.getElementById("description").value.trim();

    // Validation
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

    const updatedCase = {

        caseId: currentCaseId,
        title: title,
        complainant: complainant,
        phone: phone,
        priority: priority,
        status: status,
        description: description

    };

    const response = await fetch("/api/cases/" + currentCaseId, {

        method: "PUT",

        headers: {
            "Content-Type": "application/json"
        },

        body: JSON.stringify(updatedCase)

    });

    if (response.ok) {
        alert("Case Updated Successfully!");
    } else {
        alert("Failed to Update Case!");
    }
}
