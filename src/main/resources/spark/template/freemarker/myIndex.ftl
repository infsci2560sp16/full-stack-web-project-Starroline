<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>${title}</title>
	<link rel="stylesheet" href="stylesheets/styles.css">
	<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
	<script type="text/javascript" src="js/away.js"></script>
	<script type="text/javascript" src="js/search.js"></script>
</head>

<body>

	<div id="header">

		<h5>Good ${timePeriod} ${username}! Welcome to MovieClub!</h5>

		<#if dayOfWeek=="Friday"||dayOfWeek=="Saturday"||dayOfWeek=="Sunday">
			<h5>Enjoy yourself at MovieClub!</h5>
		<#else>
			<h5>You can find some fun here!</h5>
		</#if>
					

		<h1>MovieClub</h1>
		
		<div class="center">

			<div id="banner">

				<div class="banner-container">
					<input class="main-search__input" id="search-box" placeholder="Search..." value="">
					<input class="main-search__button" id="search-button" type="button" value="Search" onclick="search()">
		
	 				<a href="register.html" class="account" id="signup" role="button">Sign up</a>
	 				<a href="login.html" class="account" id="login" role="button">Log in</a>		
	 			</div>

			</div>

		</div>

	</div>

	<div class="nav">

		<h2>Categories</h2>

		<ul>
		  <li><a href="categorylist.html">Action/Adventure</a></li>
		  <li><a href="categorylist.html">Comedy</a></li>
		  <li><a href="categorylist.html">Suspense</a></li>
		  <li><a href="categorylist.html">Animation</a></li>
		  <li><a href="categorylist.html">Drama</a></li>
		  <li><a href="categorylist.html">Romance</a></li>
		  <li><a href="categorylist.html">Musicals</a></li>
		</ul>

		<br>

		<h2>Areas</h2>

		<ul>
		  <li><a href="categorylist.html">North American</a></li>
		  <li><a href="categorylist.html">South American</a></li>
		  <li><a href="categorylist.html">Asian</a></li>
		  <li><a href="categorylist.html">Australian</a></li>
		  <li><a href="categorylist.html">Europea</a></li>
		  <li><a href="categorylist.html">African</a></li>
		</ul>
	</div>

	<div id="section">
	
	<br>

		<div class="sliderBox">
			<h2>Movie</h2>
			<div class="slider">
			   	<ul class="list">
			    <li><a href="single.html"><img src="images/m1.jpg" width="140" height="90" alt="Forrest Gump" title="Forrest Gump"></a><br>Forrest Gump</li>
			    <li><a href="single.html"><img src="images/m2.jpg" width="140" height="90" alt="Inception" title="Inception"></a><br>Inception</li>
			    <li><a href="single.html"><img src="images/m3.jpg" width="140" height="90" alt="Lemon" title="Lemon"></a><br>Lemon</li>
			    <li><a href="single.html"><img src="images/m4.jpg" width="140" height="90" alt="The Shawshank Redemption" title="The Shawshank Redemption"></a><br>The Shawshank Redemption</li>
			    <li><a href="single.html"><img src="images/m1.jpg" width="140" height="90" alt="Forrest Gump" title="Forrest Gump"></a><br>Forrest Gump</li>
			    <li><a href="single.html"><img src="images/m2.jpg" width="140" height="90" alt="Inception" title="Inception"></a><br>Inception</li>
			    <li><a href="single.html"><img src="images/m3.jpg" width="140" height="90" alt="Lemon" title="Lemon"></a><br>Lemon</li>
			    <li><a href="single.html"><img src="images/m4.jpg" width="140" height="90" alt="The Shawshank Redemption" title="The Shawshank Redemption"></a><br>The Shawshank Redemption</li>
			    <li><a href="single.html"><img src="images/m1.jpg" width="140" height="90" alt="Forrest Gump" title="Forrest Gump"></a><br>Forrest Gump</li>
			    <li><a href="single.html"><img src="images/m2.jpg" width="140" height="90" alt="Inception" title="Inception"></a><br>Inception</li>
			    <li><a href="single.html"><img src="images/m3.jpg" width="140" height="90" alt="Lemon" title="Lemon"></a><br>Lemon</li>
			    </ul>
			</div>

			<ul class="list status">
			    <li>1</li>
			    <li>2</li>
			    <li>3</li>
			</ul>
		   
		    <a href="javascript:;" class="dIcon next">Next</a> <a href="javascript:;" class="dIcon prev">Prev</a> 
		</div>


		<br><br>

		<h2>Popular Movies</h2>
		<div class="img">
		  <a target="_blank" href="images/p2306653420.jpg">
		    <img src="images/p2306653420.jpg" alt="Kongfu Panda" width="300" height="200">
		  </a>
		  <div class="desc"><a href="single.html">Kongfu Panda</a></div>
		</div>

		<div class="img">
		  <a target="_blank" href="images/p2306653420.jpg">
		    <img src="images/p2306653420.jpg" alt="Kongfu Panda" width="300" height="200">
		  </a>
		  <div class="desc"><a href="single.html">Kongfu Panda</a></div>
		</div>

		<div class="img">
		  <a target="_blank" href="images/p2306653420.jpg">
		    <img src="images/p2306653420.jpg" alt="Kongfu Panda" width="300" height="200">
		  </a>
		  <div class="desc"><a href="single.html">Kongfu Panda</a></div>
		</div>

		<div class="img">
		  <a target="_blank" href="images/p2306653420.jpg">
		    <img src="images/p2306653420.jpg" alt="Kongfu Panda" width="300" height="200">
		  </a>
		  <div class="desc"><a href="single.html">Kongfu Panda</a></div>
		</div>

	</div>


	<div id="footer">
	University of Pittsburgh ©pig7
	</div>
	
</body>
</html>
