/*
 To enable mono-page.
 */
$(document).ready(function () {
    $(":button").click(function () {
        $.ajax(
                {
                    url: "index",
                    success: function (controllerResponse) {
                        $("#frag").html(controllerResponse);
                    }
                }
        );
    }
    );
}
);