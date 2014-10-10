"use strict";

var currMusicNo = 0;

var musicList = [
	"Kalimba.mp3", "Kalimba2.mp3", "Kalimba3.mp3"
];

var imageList = [
     "musicimg1.jpg", "musicimg2.jpg", "musicimg3.jpg"
];

var musicInfo = [];


document.getElementById('nextBtn').onclick = function(event) {
	document.getElementById('audio').src = musicList[++currMusicNo];
	document.getElementById('image').src = imageList[currMusicNo];
	console.log(musicList[currMusicNo]);
	console.log(imageList[currMusicNo]);
};

document.getElementById('prevBtn').onclick = function(event) {
	document.getElementById('audio').src = musicList[--currMusicNo];
	document.getElementById('image').src = imageList[currMusicNo];
	console.log(musicList[currMusicNo]);
	console.log(imageList[currMusicNo]);
}

document.getElementById('m1').onclick = function(event) {
		$('#music').css('display', '');
		document.getElementById('audio').src = musicList[0];
		document.getElementById('image').src = imageList[0];
		currMusicNo=0;
		console.log(musicList[0]);
		console.log(imageList[0]);
};

document.getElementById('m2').onclick = function(event) {
	$('#music').css('display', '');
	document.getElementById('audio').src = musicList[1];
	document.getElementById('image').src = imageList[1];
	currMusicNo=1;
	console.log(musicList[1]);
	console.log(imageList[1]);
};

document.getElementById('m3').onclick = function(event) {
	$('#music').css('display', '');
	document.getElementById('audio').src = musicList[2];
	document.getElementById('image').src = imageList[2];
	currMusicNo=2;
	console.log(musicList[2]);
	console.log(imageList[2]);
};

/*
function aa(){
for(var i=0 ; i<List.length ; i++) {
	$('<li>')
	.appendTo(list)
	.append($('<a>')
			.attr('bno', new String(i))
			.attr('href', '#')
			.click()
			.html(List[i].title));
	}
}

aa();
*/
/*
document.getElementById('nextBtn').onclick = function(event) {
	var musicName = musicList[++currMusicNo];
	var imageName = imageList[currMusicNo];
	console.log(musicName);
	console.log(imageName);
	document.getElementById('audio').src = musicName;
	document.getElementById('image').src = imageName;
};

document.getElementById('prevBtn').onclick = function(event) {
	var musicName = musicList[--currMusicNo];
	var imageName = imageList[currMusicNo];
	console.log(musicName);
	console.log(imageName);
	document.getElementById('audio').src = musicName;
	document.getElementById('image').src = imageName;
}
*/