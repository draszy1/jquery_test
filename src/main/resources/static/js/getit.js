/**
 * Created by draszy1 on 23.10.2016.
 */
$("#gong").on('click', function (e) {
    e.preventDefault();
    $.get("greeting", null, function(data) {
        $("#content").html(data.text);
        $("#content").hide().fadeIn("slow");
    })
})
