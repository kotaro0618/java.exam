console.log("伊藤晃太朗");

let firstName="Kotaro";
let lastName="Ito";
console.log(firstName+" "+lastName);

let total=1600;
let tax=total*0.1;
let totaltax=total+tax;
console.log("小計");
console.log(total);
console.log("消費税");
console.log(tax);
console.log("合計金額");
console.log(totaltax);

let testScore=80;
if(0<=testScore&&testScore<=79){
    console.log("追試です");
}else if(80<=testScore&&testScore<=100){
    console.log("合格です");
}else{
    console.log("存在しない点数です");
}

let total2=0;
for(let i=1;i<=100;i++){
    total2+=i;
}
console.log(total2);

function add(a,b){
    return a+b;
}
function sub(a,b){
    return a-b;
}
function multi(a,b){
    return a*b;
}
function div(a,b){
    return a/b;
}
console.log("5+3="+add(5,3));
console.log("5-3="+sub(5,3));
console.log("5*3="+multi(5,3));
console.log("5/3="+div(5,3));
