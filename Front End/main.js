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

function retriveFullAddress(){
    line1 = document.getElementById("addressLine1").value;
    line2 = document.getElementById("addressLine2").value;
    line3 = document.getElementById("addressLine3").value;
    line4 = document.getElementById("addressLine4").value;
    Postcode = document.getElementById("addressPostcode").value;
    addressparts = [line1,line2,line3,line4]
    completedAddress = ""

    for(i = 0; i < 5;i++){
        if(addressparts[i] == null){
            continue
        }
        else{
        completedAddress += " " + addressparts[i];
        }
    }
    console.log(completedAddress)
    return completedAddress
}



async function orderPrize(){
    forename = document.getElementById("customerForename").value
    surname = document.getElementById("customerSurname").value
    age = document.getElementById("customerAge").value
    address = retriveFullAddress()
    mobile = document.getElementById("customerMobile").value

    prizeName = document.getElementById("partName").innerText
    prizeValue = document.getElementById("msrp").innerText
    prizeType = document.getElementById("partCatagory").innerText
    prizeTier = document.getElementById("partTier").innerText
    

console.log(forename);
console.log(surname);
console.log(age);
console.log(address);
console.log(mobile);

console.log(prizeName);
console.log(prizeValue);
console.log(prizeType);
console.log(prizeTier);

//     forename = document.getElementById("customerForename").value
//     Surname = document.getElementById("customerSurname").value
//     Age = document.getElementById("customerAge").value
//     Address = retriveFullAddress()
//     mobile = document.getElementById("customerMobile").value
//     prizeName = document.getElementById("partName").value
//     prizeValue = document.getElementById("msrp").value
//     prizeType = document.getElementById("partCatagory").value
//     prizeTier = document.getElementById("partTier").value

//     console.log(document.getElementById("customerForename").value);
// console.log(document.getElementById("customerSurname").value);
// console.log(document.getElementById("customerAge").value);
// console.log(retriveFullAddress())
// console.log(document.getElementById("customerMobile").value);
// console.log(document.getElementById("partName").value);
// console.log(document.getElementById("msrp").value);
// console.log(document.getElementById("partCatagory").value);
// console.log(document.getElementById("partTier").value);



    
    try{
        const url = "http://localhost:8080/v1Customer/PlaceOrder"
         let response = await fetch(url,
            {
                headers: {
                  'Content-Type': 'application/json'
                },
                method: "POST",
                body: JSON.stringify({
                 "forename": forename,
                 "age": Age,
                 "surname": Surname,
                "fullAddress": Address,
                "mobileNumber": mobile,
                "partOrdered":{
                    "partName": prizeName,
                    "msrp": prizeValue,
                    "partCatagory": prizeType,
                    "partTier": prizeTier
                }
            })
            }) 
            console.log("order made and stored on central text file for project")

    }catch{
        alert("fetch request failed");
        console.log("error in fetch request")

    }

}
document.getElementById("orderButton").addEventListener("click",orderPrize)

