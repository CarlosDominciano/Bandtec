function startTimer(duration, display) {

    var timer = duration, hours, minutes, seconds;

    setInterval(() => {

        hours = parseInt(timer / (60*60), 10);
        minutes = parseInt(timer / 60, 10);
        seconds = parseInt(timer % 60, 10);
        
        if (minutes > 59) {
            minutes = minutes - 60 * hours;
        }

        hours = hours < 10 ? "0" + hours : hours;
        minutes = minutes < 10 ? "0" + minutes : minutes;
        seconds = seconds < 10 ? "0" + seconds : seconds;

        display.textContent = hours + ":" + minutes + ":" + seconds;
        
        if (--timer < 0) {
            timer = duration;
        }
        
    }, 1000);
}

window.onload = function() {

    var duration = 60 * 1;
    var display = document.querySelector("#timer");

    startTimer(duration, display);

}
