async function getPrize(){

    fundsToUse = Number(document.getElementById("betPlaced").value);
    // fundsToUse = document.getElementById("betPlaced");
    try{
        console.log(typeof(fundsToUse))
        console.log("packaged respo0nse is" + fundsToUse)
        const url = "http://localhost:8080/v1Part/PcPart"
         let response = await fetch(url,
            {
                headers: {
                  'Content-Type': 'application/json'
                },
                method: "POST",
                body: JSON.stringify({ "funds": fundsToUse })
            }) 
            const data = await response.json();
            let partName = data.partName;
            let partCost = data.msrp;
            let partCategory = data.partCatagory;
            let partTier = data.partTier

            console.log(partName + " = " + partCost + " = " + partCategory);

            document.getElementById("partName").innerText = partName;
            document.getElementById("msrp").innerText = partCost;
            document.getElementById("partCatagory").innerText = partCategory;
            document.getElementById("partTier").innerText = partTier;

    }catch{
        alert("fetch request failed");
        console.log("error in fetch request")

    }

}
    document.getElementById("drawButton").addEventListener("click",getPrize)