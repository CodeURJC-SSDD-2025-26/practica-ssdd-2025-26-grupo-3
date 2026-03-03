const toggleButton = document.getElementById("themeToggle");
const html = document.documentElement;

/* ===== CARGAR TEMA GUARDADO ===== */
const savedTheme = localStorage.getItem("theme");

if (savedTheme) {
    html.setAttribute("data-bs-theme", savedTheme);
}

toggleButton.addEventListener("click", () => {
    const currentTheme = html.getAttribute("data-bs-theme");
    const newTheme = currentTheme === "light" ? "dark" : "light";
    html.setAttribute("data-bs-theme", newTheme);
    localStorage.setItem("theme", newTheme);
});

