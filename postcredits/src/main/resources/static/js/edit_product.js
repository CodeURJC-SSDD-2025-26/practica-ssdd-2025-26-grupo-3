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
let hayCambios = false;

document.addEventListener('DOMContentLoaded', () => {
    const formulario = document.getElementById('form-producto');
    
    if (formulario) {
        // Detectar si el usuario escribe algo
        formulario.addEventListener('input', () => {
            hayCambios = true;
        });

        // Si pulsa el botón de enviar, desactivamos la alerta
        formulario.addEventListener('submit', () => {
            if (!formulario.checkValidity()) {
                event.preventDefault();
                event.stopPropagation();
                formulario.classList.add('was-validated');
                return; // Salimos de la función, no bloqueamos el botón
            }

            // 2. Si es válido, procedemos al guardado
            hayCambios = false;
            formulario.classList.add('was-validated');
            const boton = formulario.querySelector('button[type="submit"]');
            if (boton) {
                boton.disabled = true;
                boton.innerHTML = '<span class="spinner-border spinner-border-sm" role="status" aria-hidden="true"></span> Saving edition...';
            }
        });
    }
});

// Función que llama tu botón Cancel en el HTML
window.desactivarAviso = function() {
    hayCambios = false;
};

// Evento de salida (Versión ultra-compatible)
window.onbeforeunload = function(e) {
    if (hayCambios) {
        // El estándar moderno pide preventDefault y retornar un string vacío
        e.preventDefault();
        e.returnValue = ''; 
        return '';
    }
};



