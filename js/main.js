/*All images, both user icon and application logo, will redirect to their corresponding pages */
document.getElementById("logo").addEventListener("click", function () {
  window.location.href = "home.html";
});

document.getElementById("user").addEventListener("click", function () {
  window.location.href = "user_profile.html";
});
