function showMessage() {
  const confirmation = document.getElementById("confirmation");
  confirmation.classList.remove("hidden");
  return false; // prevent actual form submission
}
