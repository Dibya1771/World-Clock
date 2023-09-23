
// ----------------------------------------------------------- Asia ---------------------------------------------------------------
            //1- India
            var getIndiaTime = function(){
                document.getElementById('indiatime').innerText = new Date().toLocaleString("en-US",
                {timeZone: "Asia/Kolkata" , hourCycle:'h12'})
    
                // document.getElementById('indiatime').innerText =new Date().toLocaleString("en-US",
                // {timeZone: "Europe/London",timeStyle :"medium", hourCycle:'h24'})
            }
            getIndiaTime();
            setInterval(getIndiaTime,1000);
    
            //2- Dubai
            var getDubaiTime = function(){
                document.getElementById('dubaitime').innerText = new Date().toLocaleString("en-US",{timeZone: "Asia/Dubai", hourCycle:'h12'})  
            }
            getDubaiTime();
            setInterval(getDubaiTime,1000);
    
             //3- Bangkok
             var getBangkokTime = function(){
                document.getElementById('bangkoktime').innerText = new Date().toLocaleString("en-US",{timeZone: "Asia/Bangkok", hourCycle:'h12'})  
            }
            getBangkokTime();
            setInterval(getBangkokTime,1000);
    
            //4- Singapore
            var getSingaporeTime = function(){
                document.getElementById('singaporetime').innerText = new Date().toLocaleString("en-US",{timeZone: "Asia/Singapore", hourCycle:'h12'})  
            }
            getSingaporeTime();
            setInterval(getSingaporeTime,1000);
    
             //5- Tokyo
             var getTokyoTime = function(){
                document.getElementById('tokyotime').innerText = new Date().toLocaleString("en-US",{timeZone: "Asia/Tokyo", hourCycle:'h12'})  
            }
            getTokyoTime();
            setInterval(getTokyoTime,1000);
    
            //6- Chagos
            var getChagosTime = function(){
                document.getElementById('chagostime').innerText = new Date().toLocaleString("en-US",{timeZone: "Indian/Chagos", hourCycle:'h12'})  
            }
            getChagosTime();
            setInterval(getChagosTime,1000);
    
            //10- Hong_Kong
            var getHong_KongTime = function(){
                document.getElementById('kongtime').innerText = new Date().toLocaleString("en-US",{timeZone: "Asia/Hong_Kong", hourCycle:'h12'})  
            }
            getHong_KongTime();
            setInterval(getHong_KongTime,1000);         
    
    // -------------------------------------------------------- Africa -----------------------------------------------------
          //1- Sao_Tome
          var getSao_TomeTime = function(){
                document.getElementById('sao_tometime').innerText = new Date().toLocaleString("en-US",{timeZone: "Africa/Sao_Tome",hourCycle:'h12'})  
            }
            getSao_TomeTime();
            setInterval(getSao_TomeTime,1000);
    
            //2- Algiers
          var getAlgiersTime = function(){
                document.getElementById('algierstime').innerText = new Date().toLocaleString("en-US",{timeZone: "Africa/Algiers",hourCycle:'h12'})  
            }
            getAlgiersTime();
            setInterval(getAlgiersTime,1000);
    
            //4- Accra
          var getAccraTime = function(){
                document.getElementById('accratime').innerText = new Date().toLocaleString("en-US",{timeZone: "Africa/Accra",hourCycle:'h12'})  
            }
            getAccraTime();
            setInterval(getAccraTime,1000);
    
             //3- Cairo
          var getCairoTime = function(){
                document.getElementById('cairotime').innerText = new Date().toLocaleString("en-US",{timeZone: "Africa/Cairo",hourCycle:'h12'})  
            }
            getCairoTime();
            setInterval(getCairoTime,1000);
    
            //5- Bissau
          var getBissauTime = function(){
                document.getElementById('bissautime').innerText = new Date().toLocaleString("en-US",{timeZone: "Africa/Bissau",hourCycle:'h12'})  
            }
            getBissauTime();
            setInterval(getBissauTime,1000);
    
            //6- Nairobi
          var getNairobiTime = function(){
                document.getElementById('nairobitime').innerText = new Date().toLocaleString("en-US",{timeZone: "Africa/Nairobi",hourCycle:'h12'})  
            }
            getNairobiTime();
            setInterval(getNairobiTime,1000);
    
            //7- Juba
          var getJubaTime = function(){
                document.getElementById('jubatime').innerText = new Date().toLocaleString("en-US",{timeZone: "Africa/Juba",hourCycle:'h12'})  
            }
            getJubaTime();
            setInterval(getJubaTime,1000);    
    
    // -------------------------------------------------------- North America -------------------------------------------------------------------
            //1- Goose_Bay
            var getGoose_BayTime = function(){
                document.getElementById('baytime').innerText = new Date().toLocaleString("en-US",{timeZone: "America/Goose_Bay",hourCycle:'h12'})  
            }
            getGoose_BayTime();
            setInterval(getGoose_BayTime,1000);
    
            //2- Belize
            var getBelizeTime = function(){
                document.getElementById('belizetime').innerText = new Date().toLocaleString("en-US",{timeZone: "America/Belize",hourCycle:'h12'})   
            }
            getBelizeTime();
            setInterval(getBelizeTime,1000);
    
            //3- New_York
            var getNew_YorkTime = function(){
                var dd = document.getElementById('yorktime').innerText = new Date().toLocaleString("en-US",{timeZone: "America/New_York", hourCycle:'h12'})   
            }
            getNew_YorkTime();
            setInterval(getNew_YorkTime,1000);
    
            //4- Mexico_City
            var getMexico_CityTime = function(){
                var dd = document.getElementById('mexicotime').innerText = new Date().toLocaleString("en-US",{timeZone: "America/Mexico_City", hourCycle:'h12'})   
            }
            getMexico_CityTime();
            setInterval(getMexico_CityTime,1000);
    
             //5- Phoenix
             var getPhoenixTime = function(){
                var dd = document.getElementById('phoenixtime').innerText = new Date().toLocaleString("en-US",{timeZone: "America/Phoenix", hourCycle:'h12'})   
            }
            getPhoenixTime();
            setInterval(getPhoenixTime,1000);
    
             //6- Merida
             var getMeridaTime = function(){
                var dd = document.getElementById('meridatime').innerText = new Date().toLocaleString("en-US",{timeZone: "America/Merida", hourCycle:'h12'})   
            }
            getMeridaTime();
            setInterval(getMeridaTime,1000);
    
             //7- Chicago
             var getChicagoTime = function(){
                var dd = document.getElementById('chicagotime').innerText = new Date().toLocaleString("en-US",{timeZone: "America/Chicago", hourCycle:'h12'})   
            }
            getChicagoTime();
            setInterval(getChicagoTime,1000);
    
    // ------------------------------------------------------ South America ---------------------------------------------------------------
            //1- Argentina/Buenos_Aires
            var getBuenos_AiresTime = function(){
                document.getElementById('buenostime').innerText = new Date().toLocaleString("en-US",{timeZone: "America/Argentina/Buenos_Aires",hourCycle:'h12'})  
            }
            getBuenos_AiresTime();
            setInterval(getBuenos_AiresTime,1000);
    
            //2- Argentina/Salta
            var getSaltaTime = function(){
                document.getElementById('saltatime').innerText = new Date().toLocaleString("en-US",{timeZone: "America/Argentina/Salta",hourCycle:'h12'})   
            }
            getSaltaTime();
            setInterval(getSaltaTime,1000);
    
            //3- La_Paz
            var getLa_PazTime = function(){
                var dd = document.getElementById('laaztime').innerText = new Date().toLocaleString("en-US",{timeZone: "America/La_Paz", hourCycle:'h12'})   
            }
            getLa_PazTime();
            setInterval(getLa_PazTime,1000);
    
            //4- Maceio
            var getMaceioTime = function(){
                var dd = document.getElementById('maceiotime').innerText = new Date().toLocaleString("en-US",{timeZone: "America/Maceio", hourCycle:'h12'})   
            }
            getMaceioTime();
            setInterval(getMaceioTime,1000);
    
             //5- Manaus
             var getManausTime = function(){
                var dd = document.getElementById('manaustime').innerText = new Date().toLocaleString("en-US",{timeZone: "America/Manaus", hourCycle:'h12'})   
            }
            getManausTime();
            setInterval(getManausTime,1000);
    
             //6- Campo_Grande
             var getCampo_GrandeTime = function(){
                var dd = document.getElementById('campotime').innerText = new Date().toLocaleString("en-US",{timeZone: "America/Campo_Grande", hourCycle:'h12'})   
            }
            getCampo_GrandeTime();
            setInterval(getCampo_GrandeTime,1000);
    
             //7- Sao_Paulo
             var getSao_PauloTime = function(){
                var dd = document.getElementById('saotime').innerText = new Date().toLocaleString("en-US",{timeZone: "America/Sao_Paulo", hourCycle:'h12'})   
            }
            getSao_PauloTime();
            setInterval(getSao_PauloTime,1000);
            
    // ------------------------------------------------------------ Antarctica ------------------------------------------------------------
            //1- Casey
            var getCaseyTime = function(){
                document.getElementById('caseytime').innerText = new Date().toLocaleString("en-US",{timeZone: "Antarctica/Casey",hourCycle:'h12'})  
            }
            getCaseyTime();
            setInterval(getCaseyTime,1000);
    
            //2- Davis
            var getDavisTime = function(){
                document.getElementById('davistime').innerText = new Date().toLocaleString("en-US",{timeZone: "Antarctica/Davis",hourCycle:'h12'})   
            }
            getDavisTime();
            setInterval(getDavisTime,1000);
    
            //3- Macquarie
            var getMacquarieTime = function(){
                var dd = document.getElementById('macquarietime').innerText = new Date().toLocaleString("en-US",{timeZone: "Antarctica/Macquarie", hourCycle:'h12'})   
            }
            getMacquarieTime();
            setInterval(getMacquarieTime,1000);
    
            //4- Mawson
            var getMawsonTime = function(){
                var dd = document.getElementById('mawsonetime').innerText = new Date().toLocaleString("en-US",{timeZone: "Antarctica/Mawson", hourCycle:'h12'})   
            }
            getMawsonTime();
            setInterval(getMawsonTime,1000);
    
             //5- Syowa
             var getSyowaTime = function(){
                var dd = document.getElementById('syowatime').innerText = new Date().toLocaleString("en-US",{timeZone: "Antarctica/Syowa", hourCycle:'h12'})   
            }
            getSyowaTime();
            setInterval(getSyowaTime,1000);
    
             //6- Troll
             var getTrollTime = function(){
                var dd = document.getElementById('trolltime').innerText = new Date().toLocaleString("en-US",{timeZone: "Antarctica/Troll", hourCycle:'h12'})   
            }
            getTrollTime();
            setInterval(getTrollTime,1000);
    
             //7- Vostok
             var getVostokTime = function(){
                var dd = document.getElementById('vostoktime').innerText = new Date().toLocaleString("en-US",{timeZone: "Antarctica/Vostok", hourCycle:'h12'})   
            }
            getVostokTime();
            setInterval(getVostokTime,1000);
    
    // ------------------------------------------------------------ Europe-----------------------------------------------------------
            //1- Paris
            var getParisTime = function(){
                document.getElementById('paristime').innerText = new Date().toLocaleString("en-US",{timeZone: "Europe/Paris",hourCycle:'h12'})  
            }
            getParisTime();
            setInterval(getParisTime,1000);
    
            //2- London
            var getLondonTime = function(){
                document.getElementById('londontime').innerText = new Date().toLocaleString("en-US",{timeZone: "Europe/London",hourCycle:'h12'})   
            }
            getLondonTime();
            setInterval(getLondonTime,1000);
    
            //3- Athens
            var getAthensTime = function(){
                var dd = document.getElementById('athenstime').innerText = new Date().toLocaleString("en-US",{timeZone: "Europe/Athens", hourCycle:'h12'})   
            }
            getAthensTime();
            setInterval(getAthensTime,1000);
    
            //4- Sofia
            var getSofiaTime = function(){
                var dd = document.getElementById('sofiatime').innerText = new Date().toLocaleString("en-US",{timeZone: "Europe/Sofia", hourCycle:'h12'})   
            }
            getSofiaTime();
            setInterval(getSofiaTime,1000);
    
             //5- Berlin
             var getBerlinTime = function(){
                var dd = document.getElementById('berlintime').innerText = new Date().toLocaleString("en-US",{timeZone: "Europe/Berlin", hourCycle:'h12'})   
            }
            getBerlinTime();
            setInterval(getBerlinTime,1000);
    
             //6- Tallinn
             var getTallinnTime = function(){
                var dd = document.getElementById('tallinntime').innerText = new Date().toLocaleString("en-US",{timeZone: "Europe/Tallinn", hourCycle:'h12'})   
            }
            getTallinnTime();
            setInterval(getTallinnTime,1000);
    
             //7- Moscow
             var getMoscowTime = function(){
                var dd = document.getElementById('moscowtime').innerText = new Date().toLocaleString("en-US",{timeZone: "Europe/Moscow", hourCycle:'h12'})   
            }
            getMoscowTime();
            setInterval(getMoscowTime,1000);
    
     // -------------------------------------------------------- Australia -------------------------------------------------------------------
            //1- Sydney
            var getSydneyTime = function(){
                document.getElementById('sydneytime').innerText = new Date().toLocaleString("en-US",{timeZone: "Australia/Sydney",hourCycle:'h12'})  
            }
            getSydneyTime();
            setInterval(getSydneyTime,1000);
    
            //2- Lord_Howe
            var getLord_HoweTime = function(){
                document.getElementById('lordHowetime').innerText = new Date().toLocaleString("en-US",{timeZone: "Australia/Lord_Howe",hourCycle:'h12'})   
            }
            getLord_HoweTime();
            setInterval(getLord_HoweTime,1000);
    
            //3- Hobart
            var getHobartTime = function(){
                var dd = document.getElementById('hobarttime').innerText = new Date().toLocaleString("en-US",{timeZone: "Australia/Hobart", hourCycle:'h12'})   
            }
            getHobartTime();
            setInterval(getHobartTime,1000);
    
            //4- Broken_Hill
            var getBroken_HillTime = function(){
                var dd = document.getElementById('broken_Hilltime').innerText = new Date().toLocaleString("en-US",{timeZone: "Australia/Broken_Hill", hourCycle:'h12'})   
            }
            getBroken_HillTime();
            setInterval(getBroken_HillTime,1000);
    
             //5- Lindeman
             var getLindemanTime = function(){
                var dd = document.getElementById('lindemantime').innerText = new Date().toLocaleString("en-US",{timeZone: "Australia/Lindeman", hourCycle:'h12'})   
            }
            getLindemanTime();
            setInterval(getLindemanTime,1000);
    
             //6- Eucla
             var getEuclaTime = function(){
                var dd = document.getElementById('Euclatime').innerText = new Date().toLocaleString("en-US",{timeZone: "Australia/Eucla", hourCycle:'h12'})   
            }
            getEuclaTime();
            setInterval(getEuclaTime,1000);
    
             //7- Darwin
             var getDarwinTime = function(){
                var dd = document.getElementById('darwintime').innerText = new Date().toLocaleString("en-US",{timeZone: "Australia/Darwin", hourCycle:'h12'})   
            }
            getDarwinTime();
            getDarwinTime(getDarwinTime,1000);
