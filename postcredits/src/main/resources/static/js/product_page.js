document.querySelectorAll('.stars-generator').forEach(el => {
                const rating = parseFloat(el.dataset.rating);
                let html = '';
                for (let i = 1; i <= 5; i++) {
                    if (i <= rating) {
                        html += '<i class="fas fa-star"></i>'; // Llena
                    } else if (i - 0.5 <= rating) {
                        html += '<i class="fas fa-star-half-alt"></i>'; // Media
                    } else {
                        html += '<i class="far fa-star"></i>'; // Vacía
                    }
                }
                html += `<span class="rating-text ms-1">${rating}/5</span>`;
                el.innerHTML = html;
            });

document.addEventListener('DOMContentLoaded', () => {
    const url = new URL(window.location);
    
    // 1. Comprobamos si el parámetro "success" existe
    if (url.searchParams.has('success')) {
        
        // 2. Programamos que la alerta se cierre sola en 3 segundos
        const alerta = document.querySelector('.alert-success');
        if (alerta) {
            setTimeout(() => {
                const bsAlert = new bootstrap.Alert(alerta);
                bsAlert.close();
            }, 3000);
        }

        // 3. Limpiamos la URL para que no vuelva a mostrar la alerta al recargar
        window.history.replaceState({}, document.title, url.pathname);
    }
    else if(url.searchParams.has('delete')){
        const alerta = document.querySelector('.alert-success');
        if (alerta) {
            setTimeout(() => {
                const bsAlert = new bootstrap.Alert(alerta);
                bsAlert.close();
            }, 3000);
        }
         window.history.replaceState({}, document.title, url.pathname);

    }
});
             
