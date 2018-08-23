"use strict";
var app = app || {};
app = {
		init : x =>{	
			console.log("step1");
			app.session.context(x);
			app.onCreate(x);
		},
		onCreate : ()=>{
			console.log("step3");
			app.setContentView();
			$('#login').click(()=>{
				alert('Login Page');
				location.href = app.x()+"/move/login/member/login";
			});
			$('#login_btn').click(()=>{
				alert('Login Succes!!!');
				location.href = app.x()+"/move/retrieve/member/retrieve";
			});
			$('#logout').click(()=>{
				alert('logout...');
				location.href = app.x();
			});
			$('#join').click(()=>{
				alert('Add');
				location.href = app.x()+"/move/join/member/add";
			});
			$('#join_bth').click(()=>{
				alert('Add Succes');
				location.href = app.x();
			});
		},
		setContentView : ()=>{
			console.log("step4 : "+ app.j());
		}
};
app.session = {
		context : x=>{
			console.log("step2 : "+x);
			sessionStorage.setItem("context",x);
			sessionStorage.setItem("css",x+"/resources/css");
			sessionStorage.setItem("img",x+"/resources/img");
			sessionStorage.setItem("js",x+"/resources/js");
		},
		path : x=>{
			return sessionStorage.getItem(x);
		}
};
app.x = ()=>{
	return app.session.path('context');
};
app.j = ()=>{
	return app.session.path('js');
};
app.c = ()=>{
	return app.session.path('css');
};
app.i = ()=>{
	return app.session.path('img');
};