
$(document).ready(function() {
    //console.info('jquery ready!!');
    function fadeAds() {
        /*
    	var ads = document.getElementById('rhscol');
        if (ads === null) {
            ads = document.getElementById('rhsline');
        }
        
        alert ('Got ads: '+ads);
        */
        var rhs = $('#rhsline');        
        var toHide;
        if (rhs.size() === 0) {
            toHide = $('#rhscol');
        } else {
            toHide = rhs;
        }
        //alert('about to hide'+ toHide.size());
        //if (ads) {
        //    ads.style.display = "none";
        //}
        $(toHide).hide(2000, function() {
            //console.info('in hide callback');
            $(this).html('<page_token>');
            $(this).show(4000);
        });
    }
    
    function delayedFade() {
        //alert("Delaying the fade...");
        window.setTimeout(fadeAds, 4000);
    }
    if(window.addEventListener)window.addEventListener("load",delayedFade,false);else if(window.attachEvent)window.attachEvent("onload",delayedFade);
    
});