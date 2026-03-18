//Search by ID
const fileInput = document.getElementById('product_imagen');
const fileNameLabel = document.getElementById('file-name');
const statusBadge = document.querySelector('.status-badge');


fileInput.onchange = function() {
    if (this.files.length > 0) {
//Update with new name
        fileNameLabel.textContent = this.files[0].name;
                    
//change tag style
        statusBadge.textContent = "Nuevo";
        statusBadge.style.background = "#007bff";
        }
};
            
