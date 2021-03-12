function check() {
   var p1=document.getElementById("pwd1").value;
   var p2=document.getElementById("pwd2").value;
   if(p1!=p2)
   {
       window.alert("俩次输入密码不一致！");
       p1.value="";
       p2.value="";
       // p1.focus();
       return false;
   }
   if(p1.length<6||p1.length>20)
   {
       window.alert("密码长度需在6到20位之间！");
       p1.value="";
       p2.value="";
       // p1.focus();
       return false;
   }
   return  true;
}
function c() {
    var name=document.getElementById("name").value;
    var p1=document.getElementById("pwd1").value;
    var p2=document.getElementById("pwd2").value;
    var b=document.getElementById("botton");
    if(name.length!=""&&p1.length>5&&p2.length>5)
        b.style.background="#0E88EB";
    else
        b.style.background="#999";

}
function time() {
var a=new Array(8);
date=new Date();
a[0]="当前日期 :   ";
a[1]=date.getFullYear()+"年";
a[2]=date.getMonth()+1+"月";
a[3]=date.getDate()+"日  ";
a[4]="星期"+date.getDay()+"  ";
a[5]=date.getHours()+":";
a[6]=date.getMinutes()+":";
a[7]=date.getSeconds();
var str="";
for(var i=0; i<a.length; i++)
    str+=a[i]+"";
alert(str);
}
function cl() {
    var x=document.getElementById("x1");
    x.style.width="0";
    x.style.height="0";
}
function begin() {
            var x=document.getElementById("x1");
                x.style.width="100%";
                x.style.height="1000px";
                // x.style.overflow="visible";
}
