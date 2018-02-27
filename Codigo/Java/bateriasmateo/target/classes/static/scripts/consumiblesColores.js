$(document).ready(function() {
    $('.btn').hover(function() {
            $(this).html('Found');
        }, function() {
            $(this).html('Lost'); 
        });
});