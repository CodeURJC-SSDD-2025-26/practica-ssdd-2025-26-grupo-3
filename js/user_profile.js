const editButton = document.getElementById("edit");
const nameInput = document.getElementById("name");
const passwordInput = document.getElementById("password");

editButton.addEventListener("click", () => {
  const isDisabled = nameInput.disabled;

  if (isDisabled) {
    nameInput.disabled = false;
    passwordInput.disabled = false;
    editButton.textContent = "Guardar";
  } else {
    nameInput.disabled = true;
    passwordInput.disabled = true;
    editButton.textContent = "Editar";
  }
});
