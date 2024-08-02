document.addEventListener("DOMContentLoaded", function() {
        document.getElementById("employeeForm").addEventListener("submit", function(event) {
            event.preventDefault();
            addEmployee();
        });
    });

    function addEmployee() {
        var name = document.getElementById("name").value.trim();
        var age = document.getElementById("age").value.trim();
        var department = document.getElementById("department").value.trim();
        
        if (name === "" || age === "" || department === "") {
            alert("Please fill out all fields.");
            return;
        }

        if (!/^[a-zA-Z\s]+$/.test(name)) {
            alert("Name must contain only letters and spaces.");
            return;
        }

        age = parseInt(age);
        if (isNaN(age) || age <= 0 || age > 120) {
            alert("Please enter a valid age between 1 and 120.");
            return;
        }

        if (!/^[a-zA-Z\s]+$/.test(department)) {
            alert("Department must contain only letters and spaces.");
            return;
        }

        var table = document.getElementById("employeeTable").getElementsByTagName('tbody')[0];
        var rows = table.getElementsByTagName('tr');
        for (var i = 0; i < rows.length; i++) {
            var cells = rows[i].getElementsByTagName('td');
            if (cells[0].textContent === name && cells[2].textContent === department) {
                alert("This employee already exists.");
                return;
            }
        }

        var newRow = table.insertRow();
        newRow.insertCell(0).textContent = name;
        newRow.insertCell(1).textContent = age;
        newRow.insertCell(2).textContent = department;

        document.getElementById("employeeForm").reset();
    }

    function showTable() {
        document.getElementById("tableContainer").style.display = "block";
    }

    function hideTable() {
        document.getElementById("tableContainer").style.display = "none";
    }

    function clearTable() {
        var table = document.getElementById("employeeTable").getElementsByTagName('tbody')[0];
        table.innerHTML = "";
    }