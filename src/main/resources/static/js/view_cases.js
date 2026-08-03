async function loadCases() {

    const response = await fetch("/api/cases");
    const cases = await response.json();

    const tableBody = document.querySelector("#caseTable tbody");

    tableBody.innerHTML = "";

    cases.forEach(c => {

        const row = document.createElement("tr");

        row.innerHTML = `
            <td>${c.caseId}</td>
            <td>${c.title}</td>
            <td>${c.complainant}</td>
            <td>${c.priority}</td>
            <td>${c.status}</td>

            <td>
                <button onclick="deleteCase('${c.caseId}')">
                    Delete
                </button>
            </td>
        `;

        tableBody.appendChild(row);

    });

}

async function deleteCase(id) {

    const response = await fetch("/api/cases/" + id, {
        method: "DELETE"
    });

    if (response.ok) {
        alert("Case Deleted Successfully!");
        loadCases();
    } else {
        alert("Failed to Delete Case!");
    }

}

loadCases();
