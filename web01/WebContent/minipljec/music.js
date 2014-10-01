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
};

document.getElementById('prevBtn').onclick = function(event) {
	document.getElementById('audio').src = musicList[--currMusicNo];
	document.getElementById('image').src = imageList[currMusicNo];
}

document.getElementById('m1').onclick = function(event) {
		$('#index').css('display', 'none');
		$('#music').css('display', '');	

};/*

function displaym(){
	$('#mbar').css('display','')
}


$('#btnClose').click(function(event) {
	$('#msg1').css('display', 'none');
});

document.getElementById('image1').onmousemove = function(event) {
		$('#image1').css('display', 'none');
		$('#adText').css('display', '');	
};







//수정전


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