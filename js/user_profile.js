const editButton = document.getElementById("edit-button");
const nameInput = document.getElementById("name");
const passwordInput = document.getElementById("password");
const backButton = document.getElementById("back-button");
const userImg = document.getElementById("user-img");
const fileInput = document.getElementById("file-input");

/*Back button functional*/
backButton.addEventListener("click", function () {
  window.history.back();
});

/*Enables editing*/
editButton.addEventListener("click", function () {
  const isDisabled = nameInput.disabled;

  if (isDisabled) {
    nameInput.disabled = false;
    passwordInput.disabled = false;
    editButton.textContent = "Guardar";
    backButton.style.display = "none";

    userImg.classList.add("editing");
    userImg.style.cursor = "pointer";
    userImg.addEventListener("click", openFileSelector);
  } else {
    nameInput.disabled = true;
    passwordInput.disabled = true;
    editButton.textContent = "Editar";
    backButton.style.display = "block";

    userImg.classList.remove("editing");
    userImg.style.cursor = "default";
    userImg.removeEventListener("click", openFileSelector);
  }
});

/*Enables image selection*/
function openFileSelector() {
  fileInput.click();
}

fileInput.addEventListener("change", function () {
  const file = this.files[0];
  if (file) {
    const reader = new FileReader();
    reader.onload = function (e) {
      userImg.style.backgroundImage = `url('${e.target.result}')`;
    };
    reader.readAsDataURL(file);
  }
});
