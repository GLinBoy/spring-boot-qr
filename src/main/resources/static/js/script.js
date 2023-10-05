$(document).ready(function() {
	$('.qr-type-item').click(function(event) {
		event.preventDefault();
		$('.qr-type-item').removeClass('btn-primary').addClass('btn-light');
		$(this).removeClass('btn-light');
		$(this).addClass('btn-primary');
		var spanText = $(this).find('span').text();
		console.log(spanText);
	});
});
