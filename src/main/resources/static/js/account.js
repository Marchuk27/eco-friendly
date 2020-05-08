let username = null;
let accountInfo = null;

window.addEventListener("load", e => {
    fetch("/user+info/")
        .then(response => response.json())
        .then(response => {
            accountInfo = response;
            console.log(accountInfo);
            document.getElementById("surname").innerHTML=accountInfo.lastName;
            document.getElementById("name").innerHTML=accountInfo.firstName;
            document.getElementById("fathername").innerHTML=accountInfo.middleName;
            document.getElementsByClassName("date-of-birth__value")[0].innerHTML=accountInfo.dateOfBirth;
            document.getElementsByClassName("email__value")[0].innerHTML=accountInfo.email;
        });
});

function sendForm(formData) {
    fetch("/lk/tracker", {
        method: "POST",
        headers: {
            "Content-Type": 'multipart/form-data'
        },
        body: formData
    })
        .then(response => console.log('Сообщение отправлено методом fetch'))
        .catch(error => console.error(error))
}