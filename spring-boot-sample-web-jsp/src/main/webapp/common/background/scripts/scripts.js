$(function () {
    navChange();
})

function navChange() {
    $(".nav-t").click(function () {
        if ($(this).next(".nav2").css("display") == "none") {
            $(this).addClass("nav-on").next(".nav2").slideDown();
        } else {
            $(this).removeClass("nav-on").next(".nav2").slideUp();
        }
    })
    $(".nav-a").click(function () {
        $(".nav-a").removeClass("nav-on");
        $(this).addClass("nav-on");
    })
}