var swiper = new Swiper('.main-banner .swiper-container', {
  spaceBetween: 0,
  speed: 600,
  parallax: true,
  loop: true,
  autoplay: {
    delay: 3000,
    disableOnInteraction: false,
  },
  pagination: {
    el: '.main-banner .swiper-pagination',
    clickable: true,
  },
  navigation: {
    nextEl: '.main-banner .swiper-button-next',
    prevEl: '.main-banner .swiper-button-prev',
  },
});

var swiper = new Swiper('.chapters .swiper-container', {
  spaceBetween: 0,
  slidesPerView: 5,
  spaceBetween: 20,
  speed: 600,
  parallax: true,
  loop: true,
  autoplay: {
    delay: 3000,
    disableOnInteraction: false,
  },
  pagination: {
    el: '.chapters .swiper-pagination',
    clickable: true,
  },
  navigation: {
    nextEl: '.chapters .swiper-button-next',
    prevEl: '.chapters .swiper-button-prev',
  },
   breakpoints: {
      1000: {
        slidesPerView: 3,
      },
      768: {
        slidesPerView: 1.2,
        spaceBetween: 30,
      }
    }
});

function readyFunctions(){

	$(function() {
	    $('marquee').mouseover(function() {
	        $(this).attr('scrollamount',0);
	    }).mouseout(function() {
	         $(this).attr('scrollamount',5);
	    });
	});

	// Next Slider 
	var slideIndex = 1;
	showSlides(slideIndex);

	function plusSlides(n) {
	  showSlides(slideIndex += n);
	}

	function currentSlide(n) {
	  showSlides(slideIndex = n);
	}

	function showSlides(n) {
	  var i;
	  var slides = document.getElementsByClassName("mySlides");
	  // var dots = document.getElementsByClassName("next-dot");
	  if (n > slides.length) {slideIndex = 1}    
	  if (n < 1) {slideIndex = slides.length}
	  for (i = 0; i < slides.length; i++) {
	      // slides[i].removeClass = "active";  
	      $(slides[i]).removeClass("active");  
	  }
	  // for (i = 0; i < dots.length; i++) {
	  //     dots[i].className = dots[i].className.replace(" active", "");
	  // }
	  $(slides[slideIndex-1]).addClass("active");  
	  // dots[slideIndex-1].className += " active";
	}

	
	// $('.login-reg').click(function(e){
	// 	e.preventDefault();
	// 	$('body').addClass('login-open');
	// });
	// $('.signup-reg-btn').click(function(e){
	// 	e.preventDefault();
	// 	$('body').addClass('signup-open');
	// 	$('.tabcontent').removeClass('active');
	// 	$('.tablinks').removeClass('active');
	// 	$('.tabcontent#signup').addClass('active');
	// 	$('.tablinks.signup').addClass('active');
	// });
	// $('.login-reg-btn').click(function(e){
	// 	e.preventDefault();
	// 	$('body').addClass('login-open');
	// 	$('.tabcontent').removeClass('active');
	// 	$('.tablinks').removeClass('active');
	// 	$('.tabcontent#login').addClass('active');
	// 	$('.tablinks.login').addClass('active');
	// });
	$('.reg-close').click(function(e){
		e.preventDefault();
		$('body').removeClass('signup-open');
		$('body').removeClass('login-open');
		$('.tablinks').removeClass('active');
	});

	$('.reg-overlay').click(function(e){
		e.preventDefault();
		$('body').removeClass('signup-open');
		$('body').removeClass('login-open');
	});


	// Add smooth scrolling to all links
	  $("a").on('click', function(event) {

	    // Make sure this.hash has a value before overriding default behavior
	    if (this.hash !== "") {
	      // Prevent default anchor click behavior
	      event.preventDefault();

	      // Store hash
	      var hash = this.hash;

	      // Using jQuery's animate() method to add smooth page scroll
	      // The optional number (800) specifies the number of milliseconds it takes to scroll to the specified area
	      $('html, body').animate({
	        scrollTop: $(hash).offset().top
	      }, 800, function(){

	        // Add hash (#) to URL when done scrolling (default click behavior)
	        window.location.hash = hash;
	      });
	    } // End if
	  });

}

function menuHover(){
    if($(window).width() > 768){
        $('.menu-item.parent').hover(function(e) {
            e.stopPropagation();
            $('body').addClass('menu-hover');
            $(this).addClass('item-active');
        }, function(e) {
            e.stopPropagation();
            $('body').removeClass('menu-hover');
            $(this).removeClass('item-active');
        });
    }else{
    	$('.menu-item.parent > a').click(function(b){
    		b.preventDefault();
    		$(this).parent().toggleClass('active');
    	});
    }
}

function openTab(evt, cityName) {
  // Declare all variables
  var i, tabcontent, tablinks;

  // Get all elements with class="tabcontent" and hide them
  tabcontent = document.getElementsByClassName("tabcontent");
  for (i = 0; i < tabcontent.length; i++) {
    tabcontent[i].style.display = "none";
  }

  // Get all elements with class="tablinks" and remove the class "active"
  tablinks = document.getElementsByClassName("tablinks");
  for (i = 0; i < tablinks.length; i++) {
    tablinks[i].className = tablinks[i].className.replace(" active", "");
  }

  // Show the current tab, and add an "active" class to the button that opened the tab
  document.getElementById(cityName).style.display = "block";
  evt.currentTarget.className += " active";
} 

// function hpAtf(){
// 	wHeight = $(window).height();
// 	wWidth = $(window).width();
// 	$('.banner').css('height', wHeight);
// }

function ajaxFunc(){
	var main_url = $('#ml_site_url').val();
	// console.log(main_url);
	
	$('#loginForm').submit(function(b){

		b.preventDefault();
		
		var data = {action: 'formValidation'};
		data = $(this).serialize() + '&' + $.param(data);
		
		$.ajax({
		    url: main_url + '/modules/ajax-calls.php',
		    type: "POST",
		    data: data,
		    success: function(data){
		    	var dataResp = JSON.parse(data);
		    	$('.login-message').html(' ');
		    	$('.login-message').html(dataResp.message);

		    	if(dataResp.response_type === 'success'){
		    		setTimeout(function(){
		    			window.location.href = main_url + '/panel.php';
		    		}, 500);
		    	}else{

		    	}
		        
		    }
		});
	});

	$('#signup-from').submit(function(b){

		b.preventDefault();
		
		var formData = new FormData(this);
 		formData.append("action", "validationSignup"); 
		// var data = {action: 'validationSignup'};
		// data = $(this).serialize() + '&' + $.param(data);
		
		// console.log('asd');
		$.ajax({
		    url: main_url + '/modules/ajax-calls.php',
		    type: "POST",
		    data: formData,
		    cache: false,
		    processData: false,
		    contentType: false,
		    success: function(dataResp){
		    	
		    	
		    	var dataResp = JSON.parse(dataResp);
		    	// console.log(dataResp); return;
		    	$('.signup-message').html(' ');
		    	$('.signup-message').html(dataResp.message);

		    	if(dataResp.response_type === 'email-verification'){
		    		$('.reg-code').slideDown();
		    		return;
		    	}

		    	if(dataResp.response_type === 'success'){
		    		setTimeout(function(){
		    			window.location.href = main_url + '/signin.php';
		    		}, 500);
		    	}		        
		    }
		});
	});

	$('#verify-btn').click(function(b){
		b.preventDefault();
		var code = $('#reg-code').val();
		$.ajax({
			url: main_url + '/modules/ajax-calls.php',
			type: "POST",
			data: {action: 'verify-code', code : code},
			success: function(dataResp){

				var dataResp = JSON.parse(dataResp);
		    	
		    	$('.signup-message').html(' ');
		    	$('.signup-message').html(dataResp.message);

				if(dataResp.response_type === 'success'){
					$('#user-verified').val('yes');
					$('#signup-from').trigger('submit');
				}
			}
		});
	});


	$('.logout-btn').click(function(b){
		b.preventDefault();

		$.ajax({
			url: main_url + '/modules/ajax-calls.php',
			type: "POST",
			data: {action: 'logout'},
			success: function(response){
				if(response){
					window.location.href = main_url + '/signin.php';	
				}
			}
		});
	});

	$('#addSurahForm').submit(function(b){

		b.preventDefault();
		
		var data = {action: 'addSurahForm'};
		data = $(this).serialize() + '&' + $.param(data);
		
		$.ajax({
		    url: main_url + '/modules/ajax-calls.php',
		    type: "POST",
		    data: data,
		    success: function(dataResp){
		    	

		    	$('.surah-message').html(' ');
		    	$('.surah-message').html(dataResp);
		        
		    }
		});
	});

	$('.del-ayaat').click(function(b){
		b.preventDefault();
		var ayaatNo = $(this).attr('ayyat-id');
		var surahNo = $(this).attr('surah-num');

		$.ajax({
			url: main_url + '/modules/ajax-calls.php',
			type: "POST",
			data: {
				action: 'deleteAyaat',
				ayaatNo: ayaatNo,
				surahNo: surahNo
			},
			success: function(response){
				var responseData = JSON.parse(response);

				$('.notification').html(' ').html(responseData.message).fadeIn();
				setTimeout(function(){
					$('.notification').hide();
				},5000);

				if(responseData.response_type === 'success'){
					$('.id-'+responseData.id).slideUp();
				}
			}
		});
	});

	$('.del-question').click(function(b){
		b.preventDefault();
		var qID = $(this).attr('question-id');
		var surahNo = $(this).attr('surah-no');

		$.ajax({
			url: main_url + '/modules/ajax-calls.php',
			type: "POST",
			data: {
				action: 'deleteQuestion',
				qID: qID,
				surahNo: surahNo
			},
			success: function(response){
				var responseData = JSON.parse(response);
				// console.log(responseData); return;

				$('.notification').html(' ').html(responseData.message).fadeIn();
				setTimeout(function(){
					$('.notification').hide();
				},5000);

				if(responseData.response_type === 'success'){
					$('.tr-'+responseData.id).slideUp();
				}
			}
		});
	});

	// Search Script
	var searchRequest = null;
	var minlength = 3;
	$('#search-field').keyup(function(){
		var that = this,
        value = $(this).val();
        // console.log(that);

		 if (value.length >= minlength ) {
		 	 if (searchRequest != null) {
                searchRequest.abort();
            }
            searchRequest = $.ajax({
                type: "POST",
                url: main_url + '/modules/ajax-calls.php',
                data: {
                	action : 'search',
                    'search_keyword' : value
                },
                dataType: "html",
                success: function(response){
                	// console.log(response);
                	// responseData = JSON.parse(response);
                	$('#search-result').html(' ');
                	$('#search-result').html(response);
                    //we need to check if the value is the same
                    // if (value==$(that).val()) {
                    // }
                }
            });
		 }else{
		 	$('#search-result').html(' ');
		 }
	});

	// Select Test Topic
	$( document ).on( "click", ".select-topic", function(s) {
		// s.preventDefault();
		// console.log('selected');
		// if($(this).hasClass('go-on')){
		// 	console.log('')
		// }
		userID = $(this).attr('user-id');
		surahNo = $(this).attr('surah-no');

		$.ajax({
			url: main_url + '/modules/ajax-calls.php',
			type: "POST",
			data: {
				action: 'selectSurah',
				userID: userID,
				surahNo: surahNo
			},
			success: function(response){
				var responseData = JSON.parse(response);
				 // console.log(responseData); return;

				$('.notification').html(' ').html(responseData.message).fadeIn();
				setTimeout(function(){
					$('.notification').hide();
				},5000);

				if(response){
					console.log('asdas');
					window.location.href = main_url + '/test-list.php';	
				}

				// if(responseData.response_type === 'success'){
				// 	$('.tr-'+responseData.id).slideUp();
				// }
			}
		});

	});

	// Reqest Test
	$('#request-test').submit(function(b){

		b.preventDefault();

		if ($("#request-test input:checkbox:checked").length > 0){
			// console.log('anycehck');
		}
		else {
			$('.notification').html(' ').html('Please select at least one surah and try again').fadeIn();
			setTimeout(function(){
				$('.notification').hide();
			},5000);
		}
	
		var data = {action: 'requestTest'};
		data = $(this).serialize() + '&' + $.param(data);

		// console.log(data); return;
		
		$.ajax({
		    url: main_url + '/modules/ajax-calls.php',
		    type: "POST",
		    data: data,
		    success: function(dataResp){
		    	  // console.log(dataResp);return;
		    	  var dataResp = JSON.parse(dataResp);
		    	$('.notification').html(' ').html(dataResp.message).fadeIn();
				setTimeout(function(){
					$('.notification').hide();
				},5000);

				if(dataResp.response_type === 'success'){
					$('#req-btn').css('display', 'none');
					$('.test-btn-holder').html(dataResp.btn);
					// console.log(dataResp.time);
				}
		        
		    }
		});
	});
	// Start Test
	$('.test-question-btn').click(function(b){

		b.preventDefault();
		
		var answer = $('.test-question.active .ans-opt:checked').val();

		// console.log(answer); return;
		if(answer === undefined){
			$('.notification').html(' ').html('Please select any option first').fadeIn();
			setTimeout(function(){
				$('.notification').hide();
			},5000);
			return;
		}

		var question_id = $(this).data('current_question_id');
		var question_num = $(this).data('current_question_num');
		var current_user_id = $(this).data('current_user_id');
		var test_id = $(this).data('test_id');
		var total_question = $(this).data('total_questions');
		var question_ids = $(this).data('question_ids');
		var data = {
					action: 'addQuestionDetail',
					answer : answer,
					question_id : question_id,
					question_num : question_num,
					current_user_id : current_user_id,
					test_id : test_id,
					total_question : total_question,
					question_ids : question_ids 
					};
	// console.log(test_id); return;
		$.ajax({
		    url: main_url + '/modules/ajax-calls.php',
		    type: "POST",
		    data: data,
		    success: function(dataResp){
				var dataResp = JSON.parse(dataResp);
						    		
		    	
	 			// console.log(question_num);return;
		    		$('.notification').html(' ').html(dataResp.msg).fadeIn();
				setTimeout(function(){
					$('.notification').hide();
				},5000);
		        
		        if(dataResp.status === 'success'){
		        	question_num++;
		        	if(question_num === total_question+1){
						$('.test-question').removeClass('active');
						$('#mtest-panel').addClass('test-completed');
						$('#mtest-panel .question-note span b').html('Thank you');
			        	$('.test-question.myslide-final').addClass('active');
			        	$('#rem-time div > span').css('color', '#e1e1e1');
		        	}else{
		        		$('.test-question').removeClass('active');
		        		$('.test-question.myslide-'+question_num).addClass('active');
		        	}
		        	

		        
		        }
		    }
		});
	});


}

$(document).ready(function(){
	readyFunctions();
	menuHover();
	ajaxFunc();
	// hpAtf();
});

$(window).resize(function(){
	menuHover();
	// hpAtf();
});
// Read a page's GET URL variables and return them as an associative array.
function getUrlVars()
{
    var vars = [], hash;
    var hashes = window.location.href.slice(window.location.href.indexOf('?') + 1).split('&');
    for(var i = 0; i < hashes.length; i++)
    {
        hash = hashes[i].split('=');
        vars.push(hash[0]);
        vars[hash[0]] = hash[1];
    }
    return vars;
}




var check = function() {
  if (document.getElementById('password').value ==
    document.getElementById('confirmpass').value) {
    document.getElementById('message').style.color = 'green';
    document.getElementById('message').innerHTML = 'matching';
  } else {
    document.getElementById('message').style.color = 'red';
    document.getElementById('message').innerHTML = 'not matching';
  }
}