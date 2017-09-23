$(function() {
    $("button").click(function() {
        var params = {};
        params.email = $("input[name=email]").val();
        params.password = $("input[name=password]").val();

        $.ajax({
            url: "user_login.action",
            method: "post",
            data: params,
            success: function(data) {
                try {
                    var responseValue = JSON.parse(data);
                    $("#message").html(responseValue.message);
                } catch(e) {
                    location.href = "/coffee-1.0/index.html";
                }

            }
        });
    });
});
