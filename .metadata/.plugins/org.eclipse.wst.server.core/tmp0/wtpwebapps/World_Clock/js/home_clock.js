setInterval(showTime, 1000);
function showTime() {
	let time = new Date();

    let dt = time.getDate();
    let month = ["Jan","Feb","March","April","May","June","July","Aug","Sept","Oct","Nov","Dec"];   
    let mont = month[time.getMonth()];

    let yr = time.getFullYear();
   
	let hour = time.getHours();
	let min = time.getMinutes();
	let sec = time.getSeconds();
	am_pm = "AM";

	if (hour > 12) {
		hour -= 12;
		am_pm = "PM";
	}
	if (hour == 0) {
		hour = 12;
		am_pm = "AM";
	}

	hour = hour < 10 ? "0" + hour : hour;
	min = min < 10 ? "0" + min : min;
	sec = sec < 10 ? "0" + sec : sec;

	let currentTime = dt +" "+ mont +" "+ yr + "\n" + hour + ":"
			+ min + ":" + sec + am_pm;

	document.getElementById("clock")
			.innerHTML = currentTime;
}
showTime();
