
// alert("ansari");
fetch("iit.json")
    .then(function (response) {
        return response.json();
    })
    .then(function (iits) {
        let placeholder = document.querySelector("#data-output");
        let out = "";
        for (let iit of iits) {
            out += `
            <tr>
                <td>
                ${iit.id}
                
                </td>
            
                <td>
                ${iit.Client_name}
                 </td>
                <td>

                ${iit.Date}
                </td>

                <td>
                ${iit.Due_Date}
                </td>

                <td>
                ${iit.Total}
                </td>

                <td>
                ${iit.balance}
                </td>
                <td>
                 <button> ${iit.Status} </button>
                </td>
                

            </tr>
           

        `;
       
        }
        placeholder.innerHTML = out;


    })