/*
 To enable mono-page.
 */
$(document).ready(function () {
    $(":button").click(function () {
        $.ajax(
                {
                    url: "index",
                    success: function (resp) {
                        $("#frag").replaceWith(resp);
                        console.log("Something loaded.", resp);
                    },
                    error: function (error) {
                        console.log("Failed to load", error);
                    }
                }
        );
    }
    );
}
);

function moveForm() {
    alert("Not yet implemented!");
}