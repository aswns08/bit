"use strict";

function bit(value) {
	var elements = null;
	
	if(value instanceof Element) {
		element = [value];	
	} else if(value.charAt(0) == '<') {
		element = createElement(value.replace(/<|>/g, ''));
	} else {
		element = document.querySelectorAll(value);
	}
	
	element.text = function(value) {
		for(var i = 0 ; i < this.length ; i++) {
			this[i].textContent = value;
		}
		return this;
	};
	
	element.html = function(value) {
		for(var i = 0 ; i < this.length ; i++) {
			this[i].innerHTML = valeu;
		}
		return this;
	};
	
	element.append = function(child) {
		this.appendchild(child);
		return this;
	};
	
	element.appendTo = function(parent) {
		parent.appendchild(this);
		return this;
	};
	
	element.attr = function(name, value) {
		this.setAttribute(name, value);
		return this;
	};
	
	element.click = function(listener) {
		if(listener) {
			this.onclick = listener ;
		} else {
			var event = MouseEvent('click', {
				'view': window,
				'bubbles': true,
				'cancelable': true
			});
			this.dispatchEvent(event);
		}
		return this;
	};
	
	element.val = function(value) {
		this.value = value ;
		return this;
	};
	
	element.css = function(name, value) {
		this.style[name] = value ;
		return this;
	};
	
	return element;
}

var $ = bit;

bit.toYYYYMMDD = function(date) {
	return date.getFullYear() + '-' +
	(date.getMonth() + 1) + '-' +
	date.getDate();
};
