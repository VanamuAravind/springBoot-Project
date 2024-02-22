function login(){
    document.getElementById("logini").style.visibility="hidden";
    document.getElementById("loginf").style.visibility="visible";
    document.getElementById("loginf").style.position="relative";
    document.getElementById("logini").style.position="absolute";
    setTimeout(()=>{
        document.getElementById("logini").style.visibility="visible";
        document.getElementById("loginf").style.visibility="hidden";
        document.getElementById("logini").style.position="relative";
        document.getElementById("loginf").style.position="absolute";
    },3000)
}