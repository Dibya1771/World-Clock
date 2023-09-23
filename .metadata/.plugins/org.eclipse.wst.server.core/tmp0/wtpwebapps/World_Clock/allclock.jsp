<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>  
<% if(session.getAttribute("name")==null) {
response.sendRedirect("signin.jsp"); } %> 

<htmL>
  <head>
    <title>All clock</title>
    <link rel="stylesheet" href="css/allclock.css" />
  </head>
  <body>
    <nav class="navbar">
      <h2>Current Local Times Around The World</h2>
      <ul>
        <li><a href="index.jsp"><< Back to home</a></li>
        <li>
          <span><a href="logout">Logout</a></span>
        </li>
      </ul>
    </nav>
    <div id="country">
      <button class="btn1">Click Any Continent Name >></button>

      <a href="#Asia"><button class="btn">Asia</button></a>
      <a href="#Africa"><button class="btn">Africa</button></a>
      <a href="#North"><button class="btn">North America</button></a>
      <a href="#South"><button class="btn">South America</button></a>
      <a href="#Antarctica"><button class="btn">Antarctica</button></a>
      <a href="#Europe"><button class="btn">Europe</button></a>
      <a href="#Australia"><button class="btn">Australia</button></a>

      <button class="btn1"><< Click Any Continent Name</button>
    </div>

    <div class="container">
      <section id="Asia">
        <h4>Asia Time</h4>

        <!-- 1 -->
        <div class="timebox">
          <h1>India</h1>
          <p id="indiatime"></p>
        </div>
        <!-- 2 -->
        <div class="timebox">
          <h1>Dubai</h1>
          <p id="dubaitime"></p>
        </div>
        <!-- 3 -->
        <div class="timebox">
          <h1>Bangkok</h1>
          <p id="bangkoktime"></p>
        </div>
        <!-- 4 -->
        <div class="timebox">
          <h1>Singapore</h1>
          <p id="singaporetime"></p>
        </div>
        <!-- 5 -->
        <div class="timebox">
          <h1>Tokyo</h1>
          <p id="tokyotime"></p>
        </div>
        <!-- 6 -->
        <div class="timebox">
          <h1>Chagos</h1>
          <p id="chagostime"></p>
        </div>
        <!-- 7 -->
        <div class="timebox">
          <h1>Hong_Kong</h1>
          <p id="kongtime"></p>
        </div>
      </section>

      <section id="Africa">
        <h4>Africa Time</h4>

        <div class="timebox">
          <h1>Sao_Tome</h1>
          <p id="sao_tometime"></p>
        </div>
        <div class="timebox">
          <h1>Algiers</h1>
          <p id="algierstime"></p>
        </div>
        <div class="timebox">
          <h1>Accra</h1>
          <p id="accratime"></p>
        </div>
        <div class="timebox">
          <h1>Cairo</h1>
          <p id="cairotime"></p>
        </div>
        <div class="timebox">
          <h1>Bissau</h1>
          <p id="bissautime"></p>
        </div>
        <div class="timebox">
          <h1>Nairobi</h1>
          <p id="nairobitime"></p>
        </div>
        <div class="timebox">
          <h1>Juba</h1>
          <p id="jubatime"></p>
        </div>
      </section>

      <section id="North">
        <h4>North America Time</h4>

        <!-- 1 -->
        <div class="timebox">
          <h1>Goose_Bay</h1>
          <p id="baytime"></p>
        </div>
        <!-- 2 -->
        <div class="timebox">
          <h1>Belize</h1>
          <p id="belizetime"></p>
        </div>
        <!-- 3 -->
        <div class="timebox">
          <h1>New_York</h1>
          <p id="yorktime"></p>
        </div>
        <!-- 4 -->
        <div class="timebox">
          <h1>Mexico_City</h1>
          <p id="mexicotime"></p>
        </div>
        <!-- 5 -->
        <div class="timebox">
          <h1>Phoenix</h1>
          <p id="phoenixtime"></p>
        </div>
        <!-- 6 -->
        <div class="timebox">
          <h1>Merida</h1>
          <p id="meridatime"></p>
        </div>
        <!-- 7 -->
        <div class="timebox">
          <h1>Chicago</h1>
          <p id="chicagotime"></p>
        </div>
      </section>

      <section id="South">
        <h4>South America Time</h4>

        <!-- 1 -->
        <div class="timebox">
          <h1>Buenos_Aires</h1>
          <p id="buenostime"></p>
        </div>
        <!-- 2 -->
        <div class="timebox">
          <h1>Argentina/Salta</h1>
          <p id="saltatime"></p>
        </div>
        <!-- 3 -->
        <div class="timebox">
          <h1>La_Paz</h1>
          <p id="laaztime"></p>
        </div>
        <!-- 4 -->
        <div class="timebox">
          <h1>Maceio</h1>
          <p id="maceiotime"></p>
        </div>
        <!-- 5 -->
        <div class="timebox">
          <h1>Manaus</h1>
          <p id="manaustime"></p>
        </div>
        <!-- 6 -->
        <div class="timebox">
          <h1>Campo_Grande</h1>
          <p id="campotime"></p>
        </div>
        <!-- 7 -->
        <div class="timebox">
          <h1>Sao_Paulo</h1>
          <p id="saotime"></p>
        </div>
      </section>

      <section id="Antarctica">
        <h4>Antarctica Time</h4>

        <!-- 1 -->
        <div class="timebox">
          <h1>Casey</h1>
          <p id="caseytime"></p>
        </div>
        <!-- 2 -->
        <div class="timebox">
          <h1>Davis</h1>
          <p id="davistime"></p>
        </div>
        <!-- 3 -->
        <div class="timebox">
          <h1>Macquarie</h1>
          <p id="macquarietime"></p>
        </div>
        <!-- 4 -->
        <div class="timebox">
          <h1>Mawson</h1>
          <p id="mawsonetime"></p>
        </div>
        <!-- 5 -->
        <div class="timebox">
          <h1>Syowa</h1>
          <p id="syowatime"></p>
        </div>
        <!-- 6 -->
        <div class="timebox">
          <h1>Troll</h1>
          <p id="trolltime"></p>
        </div>
        <!-- 7 -->
        <div class="timebox">
          <h1>Vostok</h1>
          <p id="vostoktime"></p>
        </div>
      </section>

      <section id="Europe">
        <h4>Europe Time</h4>

        <!-- 1 -->
        <div class="timebox">
          <h1>Paris</h1>
          <p id="paristime"></p>
        </div>
        <!-- 2 -->
        <div class="timebox">
          <h1>London</h1>
          <p id="londontime"></p>
        </div>
        <!-- 3 -->
        <div class="timebox">
          <h1>Athens</h1>
          <p id="athenstime"></p>
        </div>
        <!-- 4 -->
        <div class="timebox">
          <h1>Sofia</h1>
          <p id="sofiatime"></p>
        </div>
        <!-- 5 -->
        <div class="timebox">
          <h1>Berlin</h1>
          <p id="berlintime"></p>
        </div>
        <!-- 6 -->
        <div class="timebox">
          <h1>Tallinn</h1>
          <p id="tallinntime"></p>
        </div>
        <!-- 7 -->
        <div class="timebox">
          <h1>Moscow</h1>
          <p id="moscowtime"></p>
        </div>
      </section>

      <section id="Australia">
        <h4>Australia Time</h4>

        <!-- 1 -->
        <div class="timebox">
          <h1>Sydney</h1>
          <p id="sydneytime"></p>
        </div>
        <!-- 2 -->
        <div class="timebox">
          <h1>Lord_Howe</h1>
          <p id="lordHowetime"></p>
        </div>
        <!-- 3 -->
        <div class="timebox">
          <h1>Hobart</h1>
          <p id="hobarttime"></p>
        </div>
        <!-- 4 -->
        <div class="timebox">
          <h1>Broken_Hill</h1>
          <p id="broken_Hilltime"></p>
        </div>
        <!-- 5 -->
        <div class="timebox">
          <h1>Lindeman</h1>
          <p id="lindemantime"></p>
        </div>
        <!-- 6 -->
        <div class="timebox">
          <h1>Eucla</h1>
          <p id="Euclatime"></p>
        </div>
        <!-- 7 -->
        <div class="timebox">
          <h1>Darwin</h1>
          <p id="darwintime"></p>
        </div>
      </section>
    </div>

    <div id="country">
      <button class="btn2">Click Any Continent Name >></button>

      <a href="#Asia"><button class="btn2">Asia</button></a>
      <a href="#Africa"><button class="btn2">Africa</button></a>
      <a href="#North"><button class="btn2">North America</button></a>
      <a href="#South"><button class="btn2">South America</button></a>
      <a href="#Antarctica"><button class="btn2">Antarctica</button></a>
      <a href="#Europe"><button class="btn2">Europe</button></a>
      <a href="#Australia"><button class="btn2">Australia</button></a>

      <button class="btn2"><< Click Any Continent Name</button>
    </div>

    <script src="js/allclock.js"></script>
  </body>
</htmL>
