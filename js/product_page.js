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
             
    