document.addEventListener("DOMContentLoaded", function () {
  /*Sign-in and Sign-up buttons*/
  document
    .getElementById("create-account-button")
    .addEventListener("click", function () {
      window.location.href = "sign_up.html";
    });

  document
    .getElementById("sign-in-button")
    .addEventListener("click", function () {
      window.location.href = "sign_in.html";
    });

  /*All images, both user icon and application logo, will redirect to their corresponding pages */
  document.getElementById("logo").addEventListener("click", function () {
    window.location.href = "home.html";
  });

  document.getElementById("user").addEventListener("click", function () {
    window.location.href = "user_profile.html";
  });
});
