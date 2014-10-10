"use strict";


var currMusicNo = 0;

var List = [
	{music:"Kalimba.mp3", image:"musicimg1.jpg", title: "제목1" },
	{music:"Kalimba2.mp3", image:"musicimg2.jpg", title: "제목2" },
	{music:"Kalimba3.mp3", image:"musicimg3.jpg", title: "제목3" },
	
];

function aa(){
	for(var i=0 ; i<List.length ; i++) {
		$('<li>')
		.appendTo(list)
		.append($('<a>')
				.attr('bno', new String(i))
				.attr('href', '#')
				.click(b)
				.html(List[i].title));
		console.log(List[i]);
		}
	
	}

aa();

document.getElementById('nextBtn').onclick = function(event) {
	document.getElementById('audio').src = musicList[0].music;
	document.getElementById('image').src = imageList[0].image;
	console.log(musicList[0]);
	console.log(imageList[0]);
};

document.getElementById('prevBtn').onclick = function(event) {
	document.getElementById('audio').src = musicList[--currMusicNo];
	document.getElementById('image').src = imageList[currMusicNo];
	console.log(musicList[currMusicNo]);
	console.log(imageList[currMusicNo]);
}

function b(event) {
	event.preventDefault();

	var board = List[$(this).attr('bno')];
	$('#audio').css(board.music);
	$('#image').css(board.image);
	console.log(board);

}


/*
document.getElementById('bno').onclick = function(event) {
		$('#music').css('display', '');
		document.getElementById('audio').src = List[0].music;
		document.getElementById('image').src = List[0].image;
		currMusicNo=0;
		console.log(List[0].music);
		console.log(List[0].image);
};

document.getElementById('m2').onclick = function(event) {
	$('#music').css('display', '');
	document.getElementById('audio').src = List[1].music;
	document.getElementById('image').src = List[1].image;
	currMusicNo=1;
	console.log(List[1].music);
	console.log(List[1].image);
};

document.getElementById('m3').onclick = function(event) {
	$('#music').css('display', '');
	document.getElementById('audio').src = List[2].music;
	document.getElementById('image').src = List[2].image;
	currMusicNo=2;
	console.log(List[2].music);
	console.log(List[2].image);
};

*/





//수정전

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