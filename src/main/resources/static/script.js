function alternarTelas() {
            var login = document.getElementById("card-login");
            var cadastro = document.getElementById("card-cadastro");

            if (login.style.display === "none") {
                login.style.display = "block";
                cadastro.style.display = "none";
            } else {
                login.style.display = "none";
                cadastro.style.display = "block";
            }
        }